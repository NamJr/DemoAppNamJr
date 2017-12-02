package com.example.win81version2.demoapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
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
 * Created by Win 8.1 Version 2 on 22/11/2017.
 */

public class BtcActivity extends AppCompatActivity{
    private DatabaseReference mData;
    private TextView tenLuan,tenCuc;
    private TextView cvLuan,cvCuc;
    private ImageView imgLuan,imgCuc;
    private List<BanChuNhiem> listBcn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.item_btc);
        Init();
        mData = FirebaseDatabase.getInstance().getReference();
//        upData();
        loadData();
        next();

    }

    private void next() {
        imgLuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BtcActivity.this, BtcDetails.class);
                startActivity(intent);
            }
        });
    }

    private void Init() {
        listBcn = new ArrayList<>();
        tenLuan = findViewById(R.id.tenCn);
        tenCuc = findViewById(R.id.tenCuc);
        cvLuan = findViewById(R.id.chucVuCn);
        cvCuc = findViewById(R.id.chucVuCuc);
        imgLuan = findViewById(R.id.anhCn);
        imgCuc = findViewById(R.id.anhCuc);
    }

    private void loadData() {
        mData.child("BanTaiChinh").addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                BanChuNhiem banChuNhiem = dataSnapshot.getValue( BanChuNhiem.class );
                listBcn.add(banChuNhiem);
                for(int i = 0;i<listBcn.size();i++){
                    Uri uri = Uri.parse(listBcn.get(i).getLink());
                    String ten = listBcn.get(i).getName();
                    String cv = listBcn.get(i).getChucVu();
                    switch (i){
                        case 0:{
                            tenLuan.setText(ten);
                            cvLuan.setText(cv);
                            Picasso.with(BtcActivity.this).load(uri).into(imgLuan);
                            break;
                        }case 1:{
                            tenCuc.setText(ten);
                            cvCuc.setText(cv);
                            Picasso.with(BtcActivity.this).load(uri).into(imgCuc);
                            break;
                        }
                    }
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
    private void upData() {
        BanChuNhiem banChuNhiem = new BanChuNhiem("Tạ Tài Linh","20","Hưng Yên","https://i.imgur.com/T4gyOvs.jpg","Trưởng ban","Đẹp trai, ghita hay");
        BanChuNhiem banChuNhiem1 = new BanChuNhiem("Vũ Thùy Dung","20","Thanh Hóa","https://i.imgur.com/AeIKFJN.jpg","Phó ban","Master Web + English");
        mData.child("BanTaiChinh").push().setValue(banChuNhiem);
        mData.child("BanTaiChinh").push().setValue(banChuNhiem1);
    }
}
