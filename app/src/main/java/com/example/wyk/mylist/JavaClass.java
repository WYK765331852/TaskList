package com.example.wyk.mylist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.app.Fragment;
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

    public JavaClass(Context context) {
        this.mContext = context;
        int text = 2;
        if (text == type){

        }
    }

}
