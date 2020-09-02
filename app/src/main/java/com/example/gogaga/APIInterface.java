package com.example.gogaga;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    public interface ApiInterface {
        @GET("getdata.php")
        Call<ArrayList<Author>> getImgData();
    }

}
