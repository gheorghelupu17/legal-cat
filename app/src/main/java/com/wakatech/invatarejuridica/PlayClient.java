package com.wakatech.invatarejuridica;


import com.wakatech.invatarejuridica.networking.ProfileInfo;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface PlayClient {

    @FormUrlEncoded
    @POST("/nivel_terminat")
    Call<Boolean> postScore(@Field("nume") String nume,
                            @Field("email") String token,
                            @Field("scoala") String password,
                            @Field("intrebari")String intrebari);

    @FormUrlEncoded
    @GET("/get_score")
    Call<ProfileInfo> getScore(@Field("nume") String nume,
                               @Field("email") String token,
                               @Field("scoala") String password);
}
