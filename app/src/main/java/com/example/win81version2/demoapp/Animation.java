package com.example.win81version2.demoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
/**
 * Created by Win 8.1 Version 2 on 12/11/2017.
 */

public class Animation {
    public static class firstScreen extends AppCompatActivity implements View.OnClickListener{
        Button btn;
        ImageView img;

        @Override
        public void onClick(View view) {
            switch( view.getId() ){
                case R.id.button:{
                    android.view.animation.Animation animation = AnimationUtils.loadAnimation(this, R.anim.anim_soccer);
                    img.startAnimation(animation);
//                    Intent intent = new Intent(Animation.firstScreen.this,MainActivity.class);
//                    Animation.firstScreen.this.finish();
//                    startActivity(intent);

                    Thread thread = new Thread(new Runnable(){
                        @Override
                        public void run() {
                            try {
                                Thread.sleep(3000);
                            }catch (InterruptedException e){
                                e.printStackTrace();
                            }
                            Intent intent = new Intent(Animation.firstScreen.this,MainActivity.class);
 //                           Animation.firstScreen.this.finish();
                            startActivity(intent);
//                            MainActivity m = null;
//                            MenuItem item = null;
//                            m.onNavigationItemSelected(item);

                        }

                    });
                    thread.start();
                }
                break;
            }

        }
        void Init(){
            btn = findViewById(R.id.button);
            img = findViewById(R.id.imageView2);
            btn.setOnClickListener(this);
//            Thread thread = new Thread(new Runnable(){
//                @Override
//                public void run() {
//                    try {
//                        Thread.sleep(5000);
//                    }catch (InterruptedException e){
//                        e.printStackTrace();
//                    }
//                    Intent intent = new Intent(Animation.firstScreen.this,Recycler.class);
//                    Animation.firstScreen.this.finish();
//                    startActivity(intent);
//
//                }
//
//            });
//            thread.start();
        }
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.screen_first);
            Init();
//            Show();



        }

//        private void Show() {
//            Thread thread = new Thread(new Runnable(){
//                @Override
//                public void run() {
//                    try {
//                        Thread.sleep(5000);
//                    }catch (InterruptedException e){
//                        e.printStackTrace();
//                    }
//                    Intent intent = new Intent(Animation.firstScreen.this,Main2Activity.class);
//                    startActivity(intent);
//                }
//
//            });
//            thread.start();
//        }
//
    }
}
