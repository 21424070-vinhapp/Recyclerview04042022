package com.example.recyclerview04042022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRvFood;
    FoodAdapter mFoodAdapter;
    ArrayList<FoodModel> mFoodModel;
    boolean mIsLoading;
    boolean mIsLastPage;
    int mTotalPage=10;
    int mCurrentPage=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRvFood=findViewById(R.id.recyclerViewFood);

        mFoodModel= (ArrayList<FoodModel>) FoodModel.getMock();

        mFoodAdapter=new FoodAdapter(mFoodModel);

        mFoodAdapter.addLoading();

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

        mRvFood.addOnScrollListener(new PaginationScrollListener((LinearLayoutManager) mRvFood.getLayoutManager()) {
            @Override
            public boolean isLastPage() {
                return mIsLastPage;
            }

            @Override
            public boolean isLoading() {
                return mIsLoading;
            }

            @Override
            public void loadMore() {
                mIsLoading=true;
                mCurrentPage++;
                loadNextPage();
            }
        });


    }
    private void loadNextPage(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mFoodAdapter.removeLoading();
                int position=mFoodModel.size()-1;
                mFoodModel.addAll(FoodModel.getMock());
                mFoodAdapter.notifyItemRangeChanged(position,mFoodModel.size());
                mIsLoading=false;

                if(mCurrentPage < mTotalPage)
                {
                    mFoodAdapter.addLoading();
                }
                else
                {
                    mIsLastPage=true;
                }
            }
        },1500);
    }
}