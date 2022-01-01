package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaRecipe extends AppCompatActivity {
    ImageView pizzaImageView;
    TextView titleTextView;
    TextView ingredientsTextView;
    TextView descriptionTextView;
    TextView methodTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_recipe);

        pizzaImageView = findViewById(R.id.pizzaImageView);
        titleTextView = findViewById(R.id.titleTextView);
        descriptionTextView = findViewById(R.id.descriptionTextView);
        ingredientsTextView = findViewById(R.id.ingredientsTextView);
        methodTextView = findViewById(R.id.methodTextView);

        Intent intent = new Intent();
        //            pizzaImageView.setImageResource(intent.getIntExtra("imageResource")));
        titleTextView.setText(intent.getStringExtra("title"));
        descriptionTextView.setText(intent.getStringExtra("description"));
        ingredientsTextView.setText(intent.getStringExtra("ingredients"));
        methodTextView.setText(intent.getStringExtra("method"));
    }
}