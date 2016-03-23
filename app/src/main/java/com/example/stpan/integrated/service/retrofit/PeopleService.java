package com.example.stpan.integrated.service.retrofit;

import com.example.stpan.integrated.entity.ResultEntity;

import java.util.HashMap;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by stpan on 2016/3/20.
 */
public interface PeopleService {
    @GET("user")
    Observable<ResultEntity<HashMap<String,String>>> getUser();

    @FormUrlEncoded
    @POST("user")
    Observable<ResultEntity<HashMap<String,String>>> getUserPost(@Field(value = "name")String name);
}
