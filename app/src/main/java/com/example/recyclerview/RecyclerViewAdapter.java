package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {
    private ArrayList<RecyclerViewItem> recipesArrayList;
    Context context;

    @NonNull
    @Override
    public RecyclerViewAdapter.RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item, parent, false);
        RecyclerViewViewHolder recyclerViewViewHolder = new RecyclerViewViewHolder(view);
        return recyclerViewViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder recyclerViewViewHolder, int position) {
        RecyclerViewItem recyclerViewItem = recipesArrayList.get(position);

        recyclerViewViewHolder.pizzaImageView.setImageResource(recyclerViewItem.getImageResource());
        recyclerViewViewHolder.titleTextView.setText(recyclerViewItem.getTitle());
        recyclerViewViewHolder.descriptionTextView.setText(recyclerViewItem.getDescription());
       /* recyclerViewViewHolder.ingredientsTextView.setText(recyclerViewItem.getIngredients());
        recyclerViewViewHolder.methodTextView.setText(recyclerViewItem.getMethod());*/
    }

    @Override
    public int getItemCount() {
        return recipesArrayList.size();
    }

    class RecyclerViewViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public ImageView pizzaImageView;
        public TextView titleTextView;
        public TextView descriptionTextView;
        /*public TextView ingredientsTextView;
        public TextView methodTextView;*/

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            pizzaImageView = itemView.findViewById(R.id.pizzaImageView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            /*ingredientsTextView = itemView.findViewById(R.id.ingredientsTextView);
            methodTextView = itemView.findViewById(R.id.methodTextView);*/
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            RecyclerViewItem recipe = recipesArrayList.get(position);

            Intent intent = new Intent(context, PizzaRecipe.class);
            intent.putExtra("imageResource", recipe.getImageResource());
            intent.putExtra("title", recipe.getTitle());
            intent.putExtra("description", recipe.getDescription());
            intent.putExtra("ingredients", recipe.getIngredients());
            intent.putExtra("method", recipe.getMethod());
            context.startActivity(intent);
        }
    }

    public RecyclerViewAdapter(ArrayList<RecyclerViewItem> RecipesArrayList, Context context) {
        this.recipesArrayList = RecipesArrayList;
        this.context = context;
    }
}
