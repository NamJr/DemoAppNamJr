package com.example.win81version2.demoapp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import me.relex.circleindicator.CircleIndicator;

public class BskDetails extends AppCompatActivity {
    CircleIndicator indicator;
    ViewPager pager;
    BskFragmentAdapter fragmentAdapter;
//    TableLayout tableLayout;
    void Init(){
        indicator = findViewById(R.id.indi);
        pager = findViewById(R.id.viewpager);
        fragmentAdapter = new BskFragmentAdapter( getSupportFragmentManager());
        pager.setAdapter(fragmentAdapter);
        indicator.setViewPager(pager);
        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
  //              Toast.makeText(BcnDetails.this, ""+position, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.bcn_details);
        Init();
    }
}
