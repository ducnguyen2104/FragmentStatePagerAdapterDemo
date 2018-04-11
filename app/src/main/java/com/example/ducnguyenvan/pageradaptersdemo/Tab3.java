package com.example.ducnguyenvan.pageradaptersdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Tab3 extends Fragment {

    public Tab3() {

    }

    public static Tab3 newInstance() {
        Tab3 framgent = new Tab3();
        return framgent;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("On create", "Tab3");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3, container, false);
        Log.i("On create view","Tab3");
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("On destroy view","Tab3");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("On destroy", "Tab3");
    }
}
