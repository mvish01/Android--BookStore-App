package com.example.bookstore_app;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("/bookletapp/public/api/test_api/get-all-books")
    Call<model_V> get_V_BookList();
}
