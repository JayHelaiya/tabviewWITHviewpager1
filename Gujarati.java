package com.example.nichetech.tabviewviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by nichetech on 12/7/16.
 */
public class Gujarati extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.gujarati_frag,container,false);

        TextView textView=(TextView) view.findViewById(R.id.gujaratiFrag);
        Log.e("English Frag =",textView.getText().toString());
        return  view;
    }
}
