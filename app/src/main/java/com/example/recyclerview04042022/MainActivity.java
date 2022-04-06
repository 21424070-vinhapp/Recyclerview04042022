package com.example.recyclerview04042022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<FoodModel> dataMock= (ArrayList<FoodModel>) FoodModel.getMock();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm");
        Log.d("BBB",dataMock.get(0).getTimeOpen()+"");
        Log.d("BBB",simpleDateFormat.format(dataMock.get(0).getTimeOpen())+"");

    }
}