package com.wakatech.invatarejuridica;

import com.wakatech.invatarejuridica.helper.UserSignUp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LoginClient {

    @FormUrlEncoded
    @POST("/login")
    Call<String> logInUser(@Field("username") String username,
                           @Field("password") String password);


    @POST("/signup")
    Call<UserSignUp> signUpUser(@Body UserSignUp userSignUp);
}
