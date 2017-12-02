package com.example.win81version2.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

/**
 * Created by Win 8.1 Version 2 on 23/11/2017.
 */

public class OtherActivity extends AppCompatActivity{

    Button btnMr2015,btnMr2016,btnBg2017,btnSn2015,btnSn2016,btnGdh,btnKhac;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.item_other);
        Init();
        btnMr2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Thread thread = new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        try {
//                            Thread.sleep(0);
//                        } catch ( InterruptedException e){
//                            e.printStackTrace();
//                        }
//
//                        Gallery.this.finish();
//                    }
//
//                });
//                thread.start();
                Intent intent = new Intent(OtherActivity.this, MrMs2015.class);
                startActivity(intent);
            }
        });
        btnMr2016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OtherActivity.this, MrMs2016.class);
                startActivity(intent);
            }
        });
//        btnBg2017.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(OtherActivity.this, BigGame2017.class);
//                startActivity(intent);
//            }
//        });
//        btnSn2015.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(OtherActivity.this, SinhNhat2015.class);
//                startActivity(intent);
//            }
//        });
//        btnSn2016.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(OtherActivity.this, SinhNhat2016.class);
//                startActivity(intent);
//            }
//        });
//        btnGdh.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(OtherActivity.this, GocDimHang.class);
//                startActivity(intent);
//            }
//        });
    }

    private void Init() {
        btnMr2015 = findViewById(R.id.mr2015);
        btnMr2016 = findViewById(R.id.mr2016);
//        btnBg2017 = findViewById(R.id.bg2017);
//        btnSn2015 = findViewById(R.id.sn2015);
//        btnSn2016 = findViewById(R.id.sn2016);
//        btnGdh = findViewById(R.id.gdh);
//        btnKhac = findViewById(R.id.khac);
    }
}
