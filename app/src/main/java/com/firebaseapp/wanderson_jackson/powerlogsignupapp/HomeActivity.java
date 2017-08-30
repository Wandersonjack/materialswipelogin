package com.firebaseapp.wanderson_jackson.powerlogsignupapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TableLayout;

import com.firebaseapp.wanderson_jackson.powerlogsignupapp.fragments.BoatFragment;
import com.firebaseapp.wanderson_jackson.powerlogsignupapp.fragments.BusFragment;
import com.firebaseapp.wanderson_jackson.powerlogsignupapp.fragments.CarFragment;
import com.firebaseapp.wanderson_jackson.powerlogsignupapp.fragments.LoginFragment;
import com.firebaseapp.wanderson_jackson.powerlogsignupapp.fragments.SignUpFragment;

import java.util.ArrayList;
import java.util.List;

import devlight.io.library.ntb.NavigationTabBar;

public class HomeActivity extends AppCompatActivity {
    private ViewPager vp;
    private TabLayout tabs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_home);
        toolbar.setTitle("Home");
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorWhite));
        setSupportActionBar(toolbar);

        vp = (ViewPager) findViewById(R.id.viewpager_home);
        setupViewPager(vp);


        tabs = (TabLayout) findViewById(R.id.tabs_home);
        tabs.setupWithViewPager(vp);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }




    public void setupViewPager(ViewPager viewPager){
        Adapter adapter = new  Adapter(getSupportFragmentManager());
        adapter.addFragment( new CarFragment(), "Abc");
        adapter.addFragment(new BusFragment(), "Numbers");
        adapter.addFragment(new BoatFragment(), "Words");
        viewPager.setAdapter(adapter);

    }

    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public Adapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }

    }

}
