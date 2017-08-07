package com.example.ivan.retrofit2exp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by ivan on 8/7/17.
 */

public interface UmoriliApi {

    @GET("/api/get")
    Call<List<PostModel>> getData(@Query("name") String recourceName, @Query("num") int count);
}
