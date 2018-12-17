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
    @POST("ci/API/profil")
    Call<ProfileInfo> getProfile(@Field("token") String token,@Field("email") String email);

    @POST("/signup")
    Call<String> sendData(@Body IntrebareFactory intrebare);
}