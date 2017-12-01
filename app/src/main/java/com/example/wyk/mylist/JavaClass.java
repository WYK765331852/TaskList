package com.example.wyk.mylist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chen on 2017/11/14.
 */


@SuppressLint("ValidFragment")
public class JavaClass extends Fragment {
    private List<Fragment> fragmentList = new ArrayList<>();
    private String[] tabTitle = {"WiFi认证", "账户", "监控"};
    private Context mContext;
    private Toolbar mToolbar;
    private final int type = 1;
    private ViewPager viewPager;
    private ListViewPagerAdapter viewPagerAdapter;

    public JavaClass(Context context) {
        this.mContext = context;
        int text = 2;
        if (text == 1) {
            ListFragment listFragment = new ListFragment();
        }
        if (text == 2) {

        } else {

        }
        for (int i=0;i<6;i++){

        }
        int array = tabTitle.length;


    }
    private android.support.v7.widget.Toolbar.OnMenuItemClickListener onMenuItemClickListener = new android.support.v7.widget.Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            Toast.makeText(mContext, "aaa", Toast.LENGTH_SHORT).show();
            return true;
        }
    };

}
