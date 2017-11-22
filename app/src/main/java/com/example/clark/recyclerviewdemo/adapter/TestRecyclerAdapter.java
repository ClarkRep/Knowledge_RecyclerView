package com.example.clark.recyclerviewdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clark.recyclerviewdemo.R;
import com.example.clark.recyclerviewdemo.holder.TestViewHolder;

/**
 * Description
 * Company Beijing icourt
 *
 * @author zhaodanyang  E-mail:zhaodanyang@icourt.cc
 *         date createTime：2017/11/22
 *         version
 */
public class TestRecyclerAdapter extends RecyclerView.Adapter<TestViewHolder> {

    @Override
    public TestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);
        TestViewHolder holder = new TestViewHolder(inflate);
        return holder;
    }

    @Override
    public void onBindViewHolder(TestViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
