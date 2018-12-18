package com.wakatech.invatarejuridica;

import com.wakatech.invatarejuridica.helper.Auth;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SpecialistClient {
    @FormUrlEncoded
    @POST("ci/API/send_email")
    Call<Auth> askQuestion(@Field("email") String intrebare,
                           @Field("categoria") String categoria,
                           @Field("mesaj") String mesaj,
                           @Field("token") String token);
}
