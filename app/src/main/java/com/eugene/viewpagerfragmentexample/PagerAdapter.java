package com.eugene.viewpagerfragmentexample;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class PagerAdapter extends FragmentPagerAdapter {
    Context context;

    public PagerAdapter(Context ctx, FragmentManager fm) {
        super(fm);
        context = ctx;
    }

    private Fragment f = null;

    @Override
    public Fragment getItem(int position) { // Returns Fragment based on position
        switch (position) {
            case 0:
                f = new FragmentPageOne();
                break;
            case 1:
                f = new FragmentPageTwo();
                break;
        }
        return f;
    }

    @Override
    public int getCount() { // Return the number of pages
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) { // Set the tab text
        if (position == 0) {
            return context.getResources().getString(R.string.fragment_one);
        }
        if (position == 1) {
            return context.getResources().getString(R.string.fragment_two);
        }
        return getPageTitle(position);
    }
}
