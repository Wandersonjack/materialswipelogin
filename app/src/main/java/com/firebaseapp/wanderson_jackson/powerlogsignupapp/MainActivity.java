package com.firebaseapp.wanderson_jackson.powerlogsignupapp;

import android.content.res.ColorStateList;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.firebaseapp.wanderson_jackson.powerlogsignupapp.fragments.LoginFragment;
import com.firebaseapp.wanderson_jackson.powerlogsignupapp.fragments.SignUpFragment;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private TabLayout tabs;
    private ViewPager pager;

    private int [] tabsIcon ={
            R.drawable.ic_account_circle,
            R.drawable.ic_email

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(pager);

        tabs = (TabLayout) findViewById(R.id.tabs);
        //tabs.setTabTextColors(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));
        tabs.setupWithViewPager(pager);
        setupTabsIcons();

    }

    public void setupTabsIcons(){
        tabs.getTabAt(0).setIcon(tabsIcon[0]);
        tabs.getTabAt(1).setIcon(tabsIcon[1]);
    }


    public void setupViewPager(ViewPager viewPager){
        Adapter adapter = new Adapter(getSupportFragmentManager());
        adapter.addFragment( new LoginFragment(), "Login");

        adapter.addFragment(new SignUpFragment(), "Criar conta");
        viewPager.setAdapter(adapter);

    }

    static class Adapter extends FragmentPagerAdapter{
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
