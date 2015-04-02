package com.eugene.viewpagerfragmentexample;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;

import com.astuetz.PagerSlidingTabStrip;


public class MainActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewsById();
        setPagerAdapter();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    DrawerLayout drawer;
    RelativeLayout black_navigation_drawer;

    Toolbar toolbar;
    ViewPager viewPager;
    PagerAdapter pagerAdapter;
    PagerSlidingTabStrip pagerSlidingTabStrip;

    private void findViewsById() {
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        black_navigation_drawer = (RelativeLayout) findViewById(R.id.black_navigation_drawer);
        black_navigation_drawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.closeDrawer(Gravity.START);
            }
        });
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        toolbar.setTitleTextAppearance(this, 4);
        toolbar.setNavigationIcon(getResources().getDrawable(R.mipmap.ic_menu_white));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawer.openDrawer(Gravity.START);
            }
        });
        /*
        *ViewPager & Tab Implementation
         */
        viewPager = (ViewPager) findViewById(R.id.pager);
        pagerAdapter = new PagerAdapter(this, getSupportFragmentManager());
        pagerSlidingTabStrip = (PagerSlidingTabStrip) findViewById(R.id.tabs);
        pagerSlidingTabStrip.setTypeface(Typeface.DEFAULT, 4);
    }


    private void setPagerAdapter() {
        viewPager.setAdapter(pagerAdapter);
        pagerSlidingTabStrip.setViewPager(viewPager);
    }
}