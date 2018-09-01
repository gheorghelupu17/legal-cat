package com.wakatech.invatarejuridica;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface LeadersClient {

    @GET("/users")
    Call<List<Leader>> getAllLeaders();
}
