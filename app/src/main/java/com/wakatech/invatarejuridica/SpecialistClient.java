package com.wakatech.invatarejuridica;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SpecialistClient {
    @FormUrlEncoded
    @POST("/intreaba")
    Call<String> askQuestion(@Field("intrebare") String intrebare);
}
