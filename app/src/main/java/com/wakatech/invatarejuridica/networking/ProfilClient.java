package com.wakatech.invatarejuridica.networking;

import com.wakatech.invatarejuridica.helper.IntrebareFactory;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ProfilClient {
    @FormUrlEncoded
    @GET("profil")
    Call<ProfileInfo> getProfile(@Field("nume") String nume,
                                 @Field("email") String token,
                                 @Field("scoala") String password);

    @POST("/signup")
    Call<String> sendData(@Body IntrebareFactory intrebare);
}