package com.wakatech.invatarejuridica;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface PlayClient {
    @FormUrlEncoded
    @POST("/postscore")
    Call<String> postScore(@Field("score")ArrayList<Integer> list);
}
