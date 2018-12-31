package com.aviharez.labs.navdrawkelas.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.aviharez.labs.navdrawkelas.BookingFragment;
import com.aviharez.labs.navdrawkelas.OrderFragment;

public class HistoryPagerAdapter extends FragmentStatePagerAdapter {

    private int number_tabs;

    public HistoryPagerAdapter(FragmentManager fm, int number_tabs) {
        super(fm);
        this.number_tabs = number_tabs;
    }

    //mengembalikan fragment yang terkait dengan posisi tertentu
    @Override
    public Fragment getItem(int position){
        switch (position){
            case 0:
                return new BookingFragment();
            case 1:
                return new OrderFragment();
            default:
                return null;
        }
    }

    //mengembalikan jumlah tampilan yang tersedia
    @Override
    public int getCount(){
        return number_tabs;
    }

}
