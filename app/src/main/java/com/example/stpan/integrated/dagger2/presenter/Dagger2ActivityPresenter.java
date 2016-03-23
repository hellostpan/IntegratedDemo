package com.example.stpan.integrated.dagger2.presenter;

import com.example.stpan.integrated.activity.Dagger2Activity;
import com.example.stpan.integrated.activity.MainActivity;
import com.example.stpan.integrated.dagger2.entity.People;
import com.example.stpan.integrated.dagger2.entity.Student;

/**
 * 功能：
 * 创建时间:2016/3/15 : 16:03
 * 作者:pst
 */
public class Dagger2ActivityPresenter {
    private Dagger2Activity dagger2Activity;
    private Student student;
    private People people;

    public Dagger2ActivityPresenter(Dagger2Activity dagger2Activity, Student student, People people) {
        this.dagger2Activity = dagger2Activity;
        this.student = student;
        this.people = people;
    }

    public String getIds(){
        return student.getId()+" : "+people.getId();
    }
}
