package com.example.stpan.integrated.dagger2.module;

import com.example.stpan.integrated.activity.Dagger2Activity;
import com.example.stpan.integrated.activity.MainActivity;
import com.example.stpan.integrated.dagger2.entity.People;
import com.example.stpan.integrated.dagger2.entity.Student;
import com.example.stpan.integrated.dagger2.presenter.Dagger2ActivityPresenter;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 功能：
 * 创建时间:2016/3/15 : 15:55
 * 作者:pst
 */
@Module
public class Dagger2ActivityModule {
    Dagger2Activity dagger2Activity;

    public Dagger2ActivityModule(Dagger2Activity dagger2Activity) {
        this.dagger2Activity = dagger2Activity;
    }

    @Provides
    Dagger2Activity provideDagger2Activity() {
        return dagger2Activity;
    }

    @Provides
    Student provideStudent() {
        return new Student("1","2","3");
    }

    @Provides
    People providePeople() {
        return new People("4","5","6");
    }

    @Singleton
    @Provides
    Dagger2ActivityPresenter mainActivityPresenter(Dagger2Activity dagger2Activity, Student student, People people){
        return  new Dagger2ActivityPresenter(dagger2Activity,student,people);
    }
}
