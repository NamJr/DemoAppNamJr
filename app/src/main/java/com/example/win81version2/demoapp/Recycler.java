package com.example.win81version2.demoapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Win 8.1 Version 2 on 12/11/2017.
 */

public class Recycler extends AppCompatActivity {
    private RecyclerView rcl;
    private List<Face> listRV;
    private FaceAdapter adapter;


    void Init(){
        rcl = findViewById(R.id.recyle);
        listRV = new ArrayList<>();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        Init();
        nhap();
        adapter = new FaceAdapter(this,listRV);
        rcl.setAdapter(adapter);
        rcl.setLayoutManager(new GridLayoutManager(this,3));
    }
    void nhap() {

        listRV.add(new Face(R.drawable.ic_1, "1"));
        listRV.add(new Face(R.drawable.ic_2, "2"));
        listRV.add(new Face(R.drawable.ic_1, "3"));
        listRV.add(new Face(R.drawable.ic_1, "4"));
        listRV.add(new Face(R.drawable.ic_1, "5"));
        listRV.add(new Face(R.drawable.ic_1, "6"));
        listRV.add(new Face(R.drawable.ic_1, "7"));
        listRV.add(new Face(R.drawable.ic_1, "8"));
        listRV.add(new Face(R.drawable.ic_1, "9"));
        listRV.add(new Face(R.drawable.ic_1, "10"));
        listRV.add(new Face(R.drawable.ic_1, "11"));
        listRV.add(new Face(R.drawable.ic_1, "12"));
        listRV.add(new Face(R.drawable.ic_1, "13"));
        listRV.add(new Face(R.drawable.ic_1, "14"));
        listRV.add(new Face(R.drawable.ic_1, "15"));
        listRV.add(new Face(R.drawable.ic_1, "16"));
        listRV.add(new Face(R.drawable.ic_1, "17"));
        listRV.add(new Face(R.drawable.ic_1, "18"));
        listRV.add(new Face(R.drawable.ic_1, "19"));
        listRV.add(new Face(R.drawable.ic_1, "20"));
        listRV.add(new Face(R.drawable.ic_1, "21"));
        listRV.add(new Face(R.drawable.ic_1, "22"));
        listRV.add(new Face(R.drawable.ic_1, "23"));
        listRV.add(new Face(R.drawable.ic_1, "24"));
        listRV.add(new Face(R.drawable.ic_1, "25"));
        listRV.add(new Face(R.drawable.ic_1, "26"));
        listRV.add(new Face(R.drawable.ic_1, "27"));
        listRV.add(new Face(R.drawable.ic_1, "28"));
        listRV.add(new Face(R.drawable.ic_1, "29"));


    }
}
