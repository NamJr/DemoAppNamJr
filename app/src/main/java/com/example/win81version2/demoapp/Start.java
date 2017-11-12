package com.example.win81version2.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * Created by Win 8.1 Version 2 on 12/11/2017.
 */

public class Start extends AppCompatActivity {
    private ImageView img;
    public void initComponent(){
        img = findViewById(R.id.logo);
        android.view.animation.Animation animation = AnimationUtils.loadAnimation(Start.this, R.anim.anim_start);
        img.startAnimation(animation);
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(4000);
                } catch ( InterruptedException e){
                    e.printStackTrace();
                }
                Intent intent = new Intent(Start.this,Animation.firstScreen.class);
                startActivity(intent);
                Start.this.finish();
            }

        });
        thread.start();

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_start);
        initComponent();
    }
}
