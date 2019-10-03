package com.alproits.simpel.teacher.laporan;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.alproits.simpel.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class LaporanFragment extends Fragment {

    private LaporanViewModel laporanViewModel;


    public LaporanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        laporanViewModel = ViewModelProviders.of(this).get(LaporanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_guru_laporan, container, false);
        // Inflate the layout for this fragment
        return root;
    }

}
