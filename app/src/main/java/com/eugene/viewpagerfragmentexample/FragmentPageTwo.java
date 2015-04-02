package com.eugene.viewpagerfragmentexample;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentPageTwo extends Fragment {
    private View v;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_main, container, false);
        findViewsById();
        return v;
    }

    TextView txText;

    private void findViewsById() {
        txText = (TextView) v.findViewById(R.id.txtText);
        txText.setText(getResources().getString(R.string.fragment_two));
    }
}