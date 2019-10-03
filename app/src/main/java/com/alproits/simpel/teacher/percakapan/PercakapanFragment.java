package com.alproits.simpel.teacher.percakapan;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.alproits.simpel.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PercakapanFragment extends Fragment {


    public PercakapanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_guru_percakapan, container, false);
    }

}
