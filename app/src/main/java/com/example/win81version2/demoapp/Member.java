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
 * Created by Win 8.1 Version 2 on 22/11/2017.
 */

public class Member extends AppCompatActivity {
    private Button btnBan, btnKhoa;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.item_member);
        Init();
        btnBan.setOnClickListener(new View.OnClickListener() {
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
//                    }
//
//                });
//                thread.start();
                Intent intent = new Intent(Member.this, Ban.class);
                startActivity(intent);
//                Member.this.finish();
            }
        });
        btnKhoa.setOnClickListener(new View.OnClickListener() {
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
//                        Member.this.finish();
//                    }
//
//                });
//                thread.start();
                Intent intent = new Intent(Member.this, Khoa.class);
                startActivity(intent);
            }
        });
    }

    private void Init() {
        btnBan = findViewById(R.id.ban);
        btnKhoa = findViewById(R.id.khoa);
    }
}
