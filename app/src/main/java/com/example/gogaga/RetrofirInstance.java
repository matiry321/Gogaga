package com.example.gogaga;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofirInstance {


        private static Retrofit retrofit=null;
        private static final String BASE_URL = "https://uniqueandrocode.000webhostapp.com/hiren/retrofit/";
        public static Retrofit getRetrofitInstance(){
            if (retrofit == null) {
                retrofit = new Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            }
            return retrofit;

        }
    }


