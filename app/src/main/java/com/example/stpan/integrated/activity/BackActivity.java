package com.example.stpan.integrated.activity;

import android.view.MenuItem;

/**
 * 功能：
 * 创建时间:2016/3/22 21:26
 * 作者:pst
 */
public class BackActivity extends BaseActivity {

    @Override
    protected void initToolbar() {
        super.initToolbar();
        if (toolbar!=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            toolbar.setNavigationIcon(R.mipmap.ic_arrow_back_white_18dp);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
