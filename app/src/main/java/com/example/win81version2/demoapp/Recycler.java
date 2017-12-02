package com.example.win81version2.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Win 8.1 Version 2 on 12/11/2017.
 */

public class Recycler extends AppCompatActivity {
    private RecyclerView rcl;
    private List<Face> listRV;
    private FaceAdapter adapter;
    private DatabaseReference mData;

    void Init(){
        rcl = findViewById(R.id.recyle);
        listRV = new ArrayList<>();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_recycle);
        mData = FirebaseDatabase.getInstance().getReference();
        Init();
//        upData();
        loadData();
        next();
    }

    private void next() {
        rcl.addOnItemTouchListener(new RecyclerItemClickListener(Recycler.this, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(Recycler.this, BG2015Details.class);
                startActivity(intent);
            }
        }));
    }


    private void upData() {
        Face face = new Face("a");
        Face face1 = new Face("a");
        mData.child("BigGame1").push().setValue(face);
        mData.child("BigGame1").push().setValue(face1);
    }

    private void loadData() {
            mData.child("BigGame1").addChildEventListener(new ChildEventListener() {
                @Override
                public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                    Face face = dataSnapshot.getValue(Face.class);
                    listRV.add(face);
                    adapter = new FaceAdapter(Recycler.this,listRV);
                    rcl.setAdapter(adapter);
                    rcl.setLayoutManager(new GridLayoutManager(Recycler.this,3));
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
}
