package com.example.gogaga;

import java.util.ArrayList;


import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {

    interface ApiInterface {
        @GET("getdata.php")
        Call<ArrayList<Author>> getImgData();
    }

}
