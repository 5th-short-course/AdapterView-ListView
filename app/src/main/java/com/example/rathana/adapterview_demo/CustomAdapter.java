package com.example.rathana.adapterview_demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter{

    private String[] countries;
    public CustomAdapter(String[] coutries){
        this.countries=coutries;
    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int position) {
        return countries[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=null;
        if(convertView==null){
            view= LayoutInflater.from(parent.getContext()).inflate(
                    R.layout.custom_item_adapter_layout,
                    parent,false
            );
        }else {
            view=convertView;
        }

        // TODO: 8/11/2018 bind data
        TextView title=view.findViewById(R.id.title);
        ImageView thumb=view.findViewById(R.id.thumb);
        title.setText(countries[position]);
        thumb.setImageResource(R.drawable.cambodia_flag);

        return view;
    }
}
