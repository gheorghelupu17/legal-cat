package com.wakatech.invatarejuridica;

import com.wakatech.invatarejuridica.helper.Auth;
import com.wakatech.invatarejuridica.helper.UserSignUp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface LoginClient {

    @POST("API/submit_login")
    Call<Auth> logInUser(@Body Auth auth);

    @POST("/signup")
    Call<UserSignUp> signUpUser(@Body UserSignUp userSignUp);
}
