package com.wakatech.invatarejuridica;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface LeadersClient {

    @FormUrlEncoded
    @POST("ci/API/lideri")
    Call<List<Leader>> getAllLeaders(@Field("token")String token);
}
