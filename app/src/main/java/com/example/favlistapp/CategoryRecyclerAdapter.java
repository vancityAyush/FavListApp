package com.example.favlistapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CategoryRecyclerAdapter extends RecyclerView.Adapter<CategoryViewHolder> {


    //String [] categories = {"Hobbies", "Sports", "Games", "Electronic Gadgets", "Foods", "Countries","Dates","Memories","Movies", "Animes", "TV Shows", "Apps"};

    private ArrayList<Category> categories;

    public CategoryRecyclerAdapter(ArrayList<Category> categories) {
        this.categories = categories;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.category_viewholder, parent, false);
        CategoryViewHolder categoryViewHolder = new CategoryViewHolder(view);
        return categoryViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {

        holder.getTxtCategoryNumber().setText(Integer.toString(position+1));
        holder.getTxtCategoryName().setText(categories.get(position).getName()) ;

    }

    @Override
    public int getItemCount() {
        return categories.size();
    }
    public void addCategory(Category category){
        categories.add(category);
         notifyItemInserted(categories.size()-1);

    }

}
