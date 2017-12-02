package com.example.win81version2.demoapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Win 8.1 Version 2 on 11/11/2017.
 */

public class D16Fragment23 extends Fragment{
//    private View rootView;
    private DatabaseReference mData;
    private List<KhoaD13> listBcn;
    private TextView txtTen,txtDob,txtCv,txtHt,txtMt,txtTeam;
    private ImageView imgAnh;

    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentd,container,false);
//        rootView = inflater.inflate(R.layout.fragment1, container,
//                false);
        Init();
        txtTen = view.findViewById(R.id.bcnName);
        txtDob = view.findViewById(R.id.bcnDob);
        txtCv = view.findViewById(R.id.bcnCv);
        txtHt = view.findViewById(R.id.bcnHt);
        txtMt = view.findViewById(R.id.bcnMt);
        txtTeam = view.findViewById(R.id.bcnTeam);
        imgAnh = view.findViewById(R.id.imgProfile);
        mData = FirebaseDatabase.getInstance().getReference();
        loadData();
        return view;
    }

    private void loadData() {
        mData.child("D16").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                KhoaD13 khoaD13 = dataSnapshot.getValue(KhoaD13.class);
                listBcn.add(khoaD13);
                if(listBcn.size()==23){
                    KhoaD13 k = listBcn.get(22);
                    Uri uri = Uri.parse(k.getLink());
                    txtTen.setText(k.getName());
                    txtCv.setText(k.getChucVu());
                    txtTeam.setText(k.getTeam());
                    txtDob.setText(k.getDob());
                    txtHt.setText(k.getHometown());
                    txtMt.setText(k.getMoTa());
                    Picasso.with(getActivity()).load(uri).into(imgAnh);
                }
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


    @Override
    public void onStart() {
        Init();
        super.onStart();
    }

    private void Init() {
        listBcn = new ArrayList<>();

//        image = getActivity().findViewById(R.id.imageView);
//        Picasso.with(getActivity()).load("https://i.imgur.com/yev1WwI.png")
//                .into(image);
//

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                String link = "http://www.itptit.com";
//                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
// //               getActivity().startActivity(intent);
//                startActivity(intent);
//            }
//        });
    }

    String [] name = new String[] {
            "one", "two", "three", "four"
    };

}
