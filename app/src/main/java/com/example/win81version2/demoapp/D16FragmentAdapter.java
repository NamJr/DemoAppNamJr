package com.example.win81version2.demoapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Win 8.1 Version 2 on 11/11/2017.
 */

public class D16FragmentAdapter extends FragmentPagerAdapter {
    String [] name = new String[]{
            "first","second","third","fourth"
    };
    public D16FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch ( position){
            case 0:{
                return new D16Fragment1();
            }
            case 1:{
                return new D16Fragment2();
            }
            case 2:{
                return new D16Fragment3();
            }
            case 3:{
                return new D16Fragment4();
            }
            case 4:{
                return new D16Fragment5();
            }
            case 5:{
                return new D16Fragment6();
            }
            case 6:{
                return new D16Fragment7();
            }
            case 7:{
                return new D16Fragment8();
            }
            case 8:{
                return new D16Fragment9();
            }
            case 9:{
                return new D16Fragment10();
            }
            case 10:{
                return new D16Fragment11();
            }
            case 11:{
                return new D16Fragment12();
            }
            case 12:{
                return new D16Fragment13();
            }
            case 13:{
                return new D16Fragment14();
            }
            case 14:{
                return new D16Fragment15();
            }
            case 15:{
                return new D16Fragment16();
            }
            case 16:{
                return new D16Fragment17();
            }
            case 17:{
                return new D16Fragment18();
            }
            case 18:{
                return new D16Fragment19();
            }
            case 19:{
                return new D16Fragment20();
            }
            case 20:{
                return new D16Fragment21();
            }
            case 21:{
                return new D16Fragment22();
            }
            case 22:{
                return new D16Fragment23();
            }
            case 23:{
                return new D16Fragment24();
            }
            case 24:{
                return new D16Fragment25();
            }
            case 25:{
                return new D16Fragment26();
            }
            case 26:{
                return new D16Fragment27();
            }
            case 27:{
                return new D16Fragment28();
            }
            case 28:{
                return new D16Fragment29();
            }
            case 29:{
                return new D16Fragment30();
            }
            default:{
                return null;
            }
        }
    }

    @Override
    public int getCount() {
        return 30;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return name[position];
    }
}
