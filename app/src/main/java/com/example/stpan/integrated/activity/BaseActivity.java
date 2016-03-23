package com.example.stpan.integrated.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 功能：
 * 创建时间:2016/3/22 21:19
 * 作者:pst
 */
public class BaseActivity extends AppCompatActivity {
    private static final String TAG = "BaseActivity";
    protected Toolbar toolbar;
    protected TextView textViewTitle;
    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        initToolbar();
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        initToolbar();
    }

    protected void initToolbar() {
        View view = findViewById(R.id.toolbar);
        if (view!=null){
            toolbar = (Toolbar) view;
            setSupportActionBar(toolbar);
            textViewTitle = (TextView) view.findViewById(R.id.toolbar_title);
            if (textViewTitle!=null){
                getSupportActionBar().setDisplayShowTitleEnabled(false);
            }
        }
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        if (textViewTitle!=null){
            textViewTitle.setText(title);
        }
    }
}
