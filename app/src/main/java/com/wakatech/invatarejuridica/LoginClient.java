package com.wakatech.invatarejuridica;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginClient {

    @FormUrlEncoded
    @POST("/login")
    Call<String> logInUser(@Field("username") String username,
                           @Field("password") String password);

    @FormUrlEncoded
    @POST("/signup")
    Call<String> signUpUser(@Field("username") String username,
                            @Field("password") String password);
}
