package com.wakatech.invatarejuridica;


import com.wakatech.invatarejuridica.helper.Auth;
import com.wakatech.invatarejuridica.networking.ProfileInfo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PlayClient {

    @FormUrlEncoded
    @POST("ci/API/finish_level")
    Call<Auth> postScore(@Field("email") String email,
                         @Field("token") String token,
                         @Field("intrebari") String intrebari);

    @FormUrlEncoded
    @POST("ci/API/play")
    Call<Leader> getScore(@Field("email") String email,
                               @Field("token") String token);
}
