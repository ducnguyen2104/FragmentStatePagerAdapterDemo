package com.example.ducnguyenvan.pageradaptersdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab1 extends Fragment {

    public Tab1() {

    }

    public static Tab1 newInstance() {
        Tab1 fragment = new Tab1();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("On create", "Tab1");
    }

    @Override
    public void onDestroyView() {
        Log.i("On destroy view","Tab1");
        super.onDestroyView();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);
        Log.i("OnCreateView","Tab1");
        return rootView;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("onDestroy","Tab1");
    }
}
