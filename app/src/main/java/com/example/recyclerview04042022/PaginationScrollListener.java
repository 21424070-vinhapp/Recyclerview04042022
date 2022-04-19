package com.example.recyclerview04042022;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class PaginationScrollListener extends RecyclerView.OnScrollListener {
    private LinearLayoutManager linearLayoutManager;

    public PaginationScrollListener(LinearLayoutManager linearLayoutManager)
    {
        this.linearLayoutManager=linearLayoutManager;
    }
    @Override
    public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        if(isLoading() || isLastPage())
        {
            return;
        }

        int fisrtVisiblePosition=linearLayoutManager.findFirstVisibleItemPosition();
        int totalItem=linearLayoutManager.getItemCount();
        int visibleItem=linearLayoutManager.getChildCount();


        if(fisrtVisiblePosition >= 0 && (visibleItem + fisrtVisiblePosition) >= totalItem)
        {
            loadMore();
        }
    }

    public abstract boolean isLastPage();
    public abstract boolean isLoading();
    public abstract void loadMore();
}
