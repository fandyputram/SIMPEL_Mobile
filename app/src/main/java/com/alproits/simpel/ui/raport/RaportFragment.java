package com.alproits.simpel.ui.raport;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.alproits.simpel.R;

public class RaportFragment extends Fragment {

    private RaportViewModel raportViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        raportViewModel =
                ViewModelProviders.of(this).get(RaportViewModel.class);
        View root = inflater.inflate(R.layout.fragment_raport, container, false);
//        final TextView textView = root.findViewById(R.id.text_slideshow);
//        raportViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}