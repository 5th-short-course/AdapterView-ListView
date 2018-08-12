package com.example.rathana.adapterview_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class GridViewActivity extends AppCompatActivity {

    private GridView gridView;
    private CustomGridAdapter adapter;
    private List<Fruit> fruits=new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        gridView=findViewById(R.id.gridView);
        //create adapter object
        adapter=new CustomGridAdapter(fruits);
        //set adapter to AdapterView
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent =new Intent(GridViewActivity.this,DetailActivity.class);
                intent.putExtra("data",fruits.get(position).getName());
                startActivity(intent);
            }
        });
        //get data
        updateFruits();
    }
    private void updateFruits() {
        for(int i=0 ;i<50;i++){
            this.fruits.add(new Fruit("grape "+i,R.drawable.grape));
        }
        adapter.setFruits(this.fruits);
    }
}
