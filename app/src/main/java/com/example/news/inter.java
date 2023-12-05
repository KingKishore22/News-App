package com.example.news;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface inter {
    @GET("top-headlines")
    Call<newstitles> getInform(@Query("country")String country, @Query("apikey")String apikey,@Query("category")String category);
    @GET("top-headlines")
    Call<newstitles> getInformg(@Query("country")String country, @Query("apikey")String apikey,@Query("category")String category);
    @GET("top-headlines")
    Call<newstitles> getInforms(@Query("country")String country, @Query("apikey")String apikey,@Query("category")String category);
    @GET("top-headlines")
    Call<newstitles> getInforme(@Query("country")String country, @Query("apikey")String apikey,@Query("category")String category);
}

