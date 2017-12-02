package com.example.win81version2.demoapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

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

public class GdhFragment9 extends Fragment{
//    private View rootView;
    private DatabaseReference mData;
    private List<Face> listBcn;
    private ImageView imgAnh;

    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image,container,false);
        Init();
        imgAnh = view.findViewById(R.id.imgProfile);
        mData = FirebaseDatabase.getInstance().getReference();
        loadData();
        return view;
    }

    private void loadData() {
        mData.child("GocDimHang").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Face face = dataSnapshot.getValue(Face.class);
                listBcn.add(face);
                if(listBcn.size()==9){
                    Face k = listBcn.get(8);
                    Uri uri = Uri.parse(k.getNameImage());
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
//        Init();
        super.onStart();
    }

    private void Init() {
        listBcn = new ArrayList<>();
    }

    String [] name = new String[] {
            "one", "two", "three", "four"
    };

}
