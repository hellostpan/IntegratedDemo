package com.example.stpan.integrated.dagger2.component;

import com.example.stpan.integrated.activity.Dagger2Activity;
import com.example.stpan.integrated.activity.MainActivity;
import com.example.stpan.integrated.dagger2.module.Dagger2ActivityModule;

import javax.inject.Singleton;
import dagger.Component;

/**
 * 功能：
 * 创建时间:2016/3/15 : 15:15
 * 作者:pst
 */
@Singleton
@Component(modules = {Dagger2ActivityModule.class})
public interface TestComponent {
    Dagger2Activity inject(Dagger2Activity dagger2Activity);
}
