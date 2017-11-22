package com.example.clark.recyclerviewdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.clark.recyclerviewdemo.adapter.TestRecyclerAdapter;

/**
 * Description
 * Company Beijing icourt
 *
 * @author zhaodanyang  E-mail:zhaodanyang@icourt.cc
 *         date createTime：2017/11/22
 *         version
 */
public class ClipToPaddingFragment extends Fragment {

    public static ClipToPaddingFragment newInstance() {
        ClipToPaddingFragment clipToPaddingFragment = new ClipToPaddingFragment();
        return clipToPaddingFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_clip_to_padding, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(new TestRecyclerAdapter());
    }
}
