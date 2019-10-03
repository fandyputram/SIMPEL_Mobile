package com.alproits.simpel.teacher.rapot;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.alproits.simpel.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetilRapotFragment extends Fragment {


    public DetilRapotFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_detil_rapot, container, false);

        // Inflate the layout for this fragment
        return root;
    }
}
