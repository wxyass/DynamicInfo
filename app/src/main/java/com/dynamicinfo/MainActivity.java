package com.dynamicinfo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.dynamicinfo.fragment.LoginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 一开始就加载登录界面
        changeFragment(new LoginFragment(), "loginFragment");
    }

    /**
     * 替换fragment
     *
     * @param fragment
     * @param tag
     */
    public  void changeFragment(Fragment fragment, String tag) {
        // 获取管理者
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();

        beginTransaction.replace(R.id.frameLayout, fragment, tag);

        beginTransaction.commit();
    }
}
