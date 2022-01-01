package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerViewItem> recyclerViewItems = new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.pizza_with_homemade_sauce,
                getString(R.string.homemade_title),
                getString(R.string.homemade_description),
                getString(R.string.homemade_ingredients),
                getString(R.string.homemade_method)));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.sourdough_pizza,
                getString(R.string.sourdough_title),
                getString(R.string.sourdough_description),
                getString(R.string.sourdough_ingredients),
                getString(R.string.sourdough_method)));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.no_yeast_pizza_dough,
                getString(R.string.no_yeast_title),
                getString(R.string.no_yeast_description),
                getString(R.string.no_yeast_ingredients),
                getString(R.string.no_yeast_method)));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_satisfied_24, "Happy", "Life is fun!", "happy life", "I´m happy"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_dissatisfied_24, "Sad", "Life is sad!", "sadly life",  "I`m sad"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_baseline_sentiment_very_satisfied_24, "Beautiful", "Life is beautiful!", "beautiful life", "I´m beautiful"));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(recyclerViewItems, this);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    /*public void showRecipe(View view) {
        startActivity(new Intent(MainActivity.this, PizzaRecipe.class));
    }*/
}