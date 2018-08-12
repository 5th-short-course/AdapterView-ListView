package com.example.rathana.adapterview_demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomGridAdapter extends BaseAdapter{

    List<Fruit> fruits;
    public CustomGridAdapter(List<Fruit> fruits) {
        this.fruits = fruits;
    }

    public void setFruits(List<Fruit> fruits) {
        this.fruits.addAll(fruits);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return this.fruits.size();
    }

    @Override
    public Object getItem(int position) {
        return this.fruits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //inflate
        View view= null;
        if(convertView==null){
            view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.grid_item_layout,parent,false);
        }
        else
            view=convertView;

        ///bind data
        ImageView thumb=view.findViewById(R.id.thumb);
        TextView fruitName=view.findViewById(R.id.fruitName);
        Fruit fruit=this.fruits.get(position);
        thumb.setImageResource(fruit.getThumb());
        fruitName.setText(fruit.getName());

        return view;
    }
}
