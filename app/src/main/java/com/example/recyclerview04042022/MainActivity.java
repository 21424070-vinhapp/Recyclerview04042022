package com.example.recyclerview04042022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRvFood;
    FoodAdapter mFoodAdapter;
    ArrayList<FoodModel> mFoodModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRvFood=findViewById(R.id.recyclerViewFood);

        mFoodModel= (ArrayList<FoodModel>) FoodModel.getMock();

        mFoodAdapter=new FoodAdapter(mFoodModel);

        mRvFood.setHasFixedSize(true);

        mRvFood.setAdapter(mFoodAdapter);

        mFoodAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onCLick(int position) {
                //xoa item theo position
                mFoodModel.remove(position);
                //cap nhat ben adapter
                mFoodAdapter.notifyItemRemoved(position);
            }
        });

    }
}