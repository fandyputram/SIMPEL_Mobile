package com.alproits.simpel.teacher.kelas;


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
public class KelasFragment extends Fragment {

    private KelasViewModel kelasViewModel;


    public KelasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        kelasViewModel = ViewModelProviders.of(this).get(KelasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_guru_kelas, container, false) ;
        // Inflate the layout for this fragment
        return root;
    }


}
