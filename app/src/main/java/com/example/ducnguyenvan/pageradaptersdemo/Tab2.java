package com.example.ducnguyenvan.pageradaptersdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab2 extends Fragment {
    public Tab2() {

    }

    public static Tab2 newInstance() {
        Tab2 fragment = new Tab2();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("On create", "Tab2");
    }

    @Override
    public void onDestroyView() {
        Log.i("On destroy view","Tab2");
        super.onDestroyView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2, container, false);
        Log.i("OnCreateView","Tab2");
        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("On destroy", "Tab2");
    }
}
