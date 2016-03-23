package com.example.stpan.integrated.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends BackActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        System.out.println("hello world");
        setTitle("STPAN");
    }
}
