package com.example.bookstore_app;

import static java.sql.Types.NULL;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static String api = "https://staging.bookletguy.com";

    RecyclerView recyclerView;
    model_V list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

//        RecipeAdapter adapter = new RecipeAdapter(list, this);
//        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

//        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true);
//        recyclerView.setLayoutManager(layoutManager1);


        RetrofitInstance.getInstance().apiInterface.get_V_BookList().enqueue(new Callback<model_V>() {
            @Override
            public void onResponse(Call<model_V> call, Response<model_V> response) {
                list = response.body();
                for(int i = 0; i < list.getBooks().size(); i++){
                    Log.i("api =>", list.getBooks().get(i).getBook_name());
                }
//                if(list.getMessage() == "success"){
                    recyclerView.setAdapter(new RecipeAdapter(MainActivity.this, list.getBooks()));
//                }
            }

            @Override
            public void onFailure(Call<model_V> call, Throwable t) {
                Log.e("api", "onFailure: " + t.getLocalizedMessage() );
            }
        });

    }
}