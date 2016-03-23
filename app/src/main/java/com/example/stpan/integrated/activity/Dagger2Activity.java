package com.example.stpan.integrated.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.stpan.integrated.dagger2.component.DaggerTestComponent;
import com.example.stpan.integrated.dagger2.component.TestComponent;
import com.example.stpan.integrated.dagger2.entity.People;
import com.example.stpan.integrated.dagger2.entity.Student;
import com.example.stpan.integrated.dagger2.module.Dagger2ActivityModule;
import com.example.stpan.integrated.dagger2.presenter.Dagger2ActivityPresenter;

import javax.inject.Inject;

/**
 * 功能：
 * 创建时间:2016/3/21 21:46
 * 作者:pst
 */
public class Dagger2Activity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    @Inject Student student;
    @Inject People people;
    @Inject Dagger2ActivityPresenter dagger2ActivityPresenter;
    @Inject Dagger2ActivityPresenter dagger2ActivityPresenter1;
    @Inject Dagger2ActivityPresenter dagger2ActivityPresenter2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        TestComponent testComponent = DaggerTestComponent.builder().dagger2ActivityModule(new Dagger2ActivityModule(this)).build();
        testComponent.inject(this);

        System.out.println(student.getName());
        System.out.println(people.getStatus());
        System.out.println(dagger2ActivityPresenter==dagger2ActivityPresenter1);
        System.out.println(dagger2ActivityPresenter2==dagger2ActivityPresenter1);
    }
}
