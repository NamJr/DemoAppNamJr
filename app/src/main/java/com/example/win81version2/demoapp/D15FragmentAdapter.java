package com.example.win81version2.demoapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Win 8.1 Version 2 on 11/11/2017.
 */

public class D15FragmentAdapter extends FragmentPagerAdapter {
    String [] name = new String[]{
            "first","second","third","fourth"
    };
    public D15FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch ( position){
            case 0:{
                return new D15Fragment1();
            }
            case 1:{
                return new D15Fragment2();
            }
            case 2:{
                return new D15Fragment3();
            }
            case 3:{
                return new D15Fragment4();
            }
            case 4:{
                return new D15Fragment5();
            }
            case 5:{
                return new D15Fragment6();
            }
            case 6:{
                return new D15Fragment7();
            }
            case 7:{
                return new D15Fragment8();
            }
            case 8:{
                return new D15Fragment9();
            }
            case 9:{
                return new D15Fragment10();
            }
            case 10:{
                return new D15Fragment11();
            }
            case 11:{
                return new D15Fragment12();
            }
            case 12:{
                return new D15Fragment13();
            }
            case 13:{
                return new D15Fragment14();
            }
            case 14:{
                return new D15Fragment15();
            }
            case 15:{
                return new D15Fragment16();
            }
            case 16:{
                return new D15Fragment17();
            }
            case 17:{
                return new D15Fragment18();
            }
            case 18:{
                return new D15Fragment19();
            }
            case 19:{
                return new D15Fragment20();
            }
            case 20:{
                return new D15Fragment21();
            }
            case 21:{
                return new D15Fragment22();
            }
            case 22:{
                return new D15Fragment23();
            }
            default:{
                return null;
            }
        }
    }

    @Override
    public int getCount() {
        return 23;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return name[position];
    }
}
