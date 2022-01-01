package com.example.recyclerview;

public class RecyclerViewItem {
    private int imageResource;
    private String title;
    private String description;
    private String ingredients;
    private String method;

    public RecyclerViewItem(int imageResource, String title, String description, String ingredients, String method) {
        this.imageResource = imageResource;
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.method = method;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getMethod() {
        return method;
    }

}
