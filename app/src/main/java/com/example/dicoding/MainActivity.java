package com.example.dicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvFood;
    private ArrayList<Food>list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFood = findViewById(R.id.rv_food);
        rvFood.setHasFixedSize(true);

        list.addAll(FoodData.getListData());
        showRecyclerList();


        findViewById(R.id.profilenav).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), about.class));
            }
        });
    }


    private void showSelectedFood(Food food) {
        Toast.makeText(this, "Kamu memilih " + food.getName(), Toast.LENGTH_SHORT).show();
    }

    private void showRecyclerList() {
        rvFood.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(list);
        rvFood.setAdapter(listFoodAdapter);

        listFoodAdapter.setOnItemClickCallback(new ListFoodAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Food food) {
                Intent moveIntent1 = new Intent(MainActivity.this, DetailActivity.class);
                moveIntent1.putExtra(DetailActivity.ITEM_EXTRA, food);
                startActivity(moveIntent1);
            }
        });
    }
}