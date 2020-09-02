package com.example.gogaga;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity2 extends AppCompatActivity {
    private ArrayList<Author> imageLists = new ArrayList<>();
    private Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        APIInterface.ApiInterface apiInterface = RetrofirInstance.getRetrofitInstance().create(APIInterface.ApiInterface.class);
        Call<ArrayList<Author>> call= apiInterface.getImgData();
        call.enqueue(new Callback<ArrayList<Author>>() {
            @Override
            public void onResponse(Call<ArrayList<Author>> call, Response<ArrayList<Author>> response) {
                Log.d("Hey","it is responding");
                imageLists=response.body();
                RecyclerView recyclerview = findViewById(R.id.recyclerview);
                adapter=new Adapter(imageLists,MainActivity2.this);
                recyclerview.setLayoutManager(new LinearLayoutManager(MainActivity2.this));
                recyclerview.setAdapter(adapter);
            }
            @Override
            public void onFailure(Call<ArrayList<Author>> call, Throwable t) {
                t.printStackTrace();

            }
        });
    }
}