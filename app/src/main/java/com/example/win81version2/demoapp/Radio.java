package com.example.win81version2.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Win 8.1 Version 2 on 25/11/2017.
 */

public class Radio extends AppCompatActivity {

    Button btnSend,btnCheck,btnPast;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.radio_main);
        Init();
        btnCheck.setOnClickListener(new View.OnClickListener() {
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
//                        Radio.this.finish();
//                    }
//
//                });
//                thread.start();
                Intent intent = new Intent(Radio.this, CheckRadio.class);
                startActivity(intent);
            }
        });
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Radio.this, RadioSend.class);
                startActivity(intent);
            }
        });

        btnPast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Radio.this, RadioPast.class);
                startActivity(intent);
            }
        });
    }

    private void Init() {
        btnSend = findViewById(R.id.send);
        btnCheck = findViewById(R.id.check);
        btnPast = findViewById(R.id.past);
    }
}
