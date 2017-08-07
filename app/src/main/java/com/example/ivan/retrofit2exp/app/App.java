package com.example.ivan.retrofit2exp.app;

import android.app.Application;

import com.example.ivan.retrofit2exp.UmoriliApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ivan on 8/7/17.
 */

public class App extends Application {

    private static UmoriliApi umoriliApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();
        retrofit = new Retrofit.Builder()
                .baseUrl("http://umori.li/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        umoriliApi = retrofit.create(UmoriliApi.class);
    }

    public static UmoriliApi getApi(){
        return umoriliApi;
    }
}
