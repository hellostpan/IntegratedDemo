package com.example.stpan.integrated.service.retrofit;

import android.content.Context;

import com.example.stpan.integrated.activity.R;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by stpan on 2016/3/20.
 */
public class RetrofitService {
    private Context context;

    public RetrofitService(Context context) {
        this.context = context;
    }

    private Retrofit getRetrofit() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();
        return new Retrofit.Builder()
                .baseUrl(context.getResources().getString(R.string.path))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();
    }

    public PeopleService getPeopleService(){
        return getRetrofit().create(PeopleService.class);
    }
}
