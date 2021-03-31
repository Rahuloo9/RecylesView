package com.rahul009.recycleviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rahul009.recycleviewdemo.Adepter.RecipeAdapter;
import com.rahul009.recycleviewdemo.models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.recyleview);

        ArrayList<RecipeModel> list=new ArrayList<>();

        list.add(new RecipeModel(R.drawable.food1,"bugger"));
        list.add(new RecipeModel(R.drawable.food2,"bugger"));
        list.add(new RecipeModel(R.drawable.food3,"bugger"));
        list.add(new RecipeModel(R.drawable.food4,"bugger"));
        list.add(new RecipeModel(R.drawable.food5,"bugger"));
        list.add(new RecipeModel(R.drawable.food6,"bugger"));
        list.add(new RecipeModel(R.drawable.food7,"bugger"));
        list.add(new RecipeModel(R.drawable.food8,"bugger"));
        list.add(new RecipeModel(R.drawable.food9,"bugger"));
        list.add(new RecipeModel(R.drawable.food10,"bugger"));
        list.add(new RecipeModel(R.drawable.food11,"bugger"));
        list.add(new RecipeModel(R.drawable.food12,"bugger"));
        list.add(new RecipeModel(R.drawable.food13,"bugger"));

        RecipeAdapter adapter=new RecipeAdapter(list,this);

        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
      recyclerView.setLayoutManager(linearLayoutManager);

    }
}