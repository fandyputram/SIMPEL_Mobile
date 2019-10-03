package com.alproits.simpel.teacher.rapot;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.alproits.simpel.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RapotFragment extends Fragment {


    public RapotFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_guru_rapot, container, false);
        Button buttonRapot = root.findViewById(R.id.btn_detil_rapot);
        buttonRapot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetilRapotFragment detilRapotFragment = new DetilRapotFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment,detilRapotFragment,detilRapotFragment.getTag())
                        .commit();
            }
        });
        // Inflate the layout for this fragment
        return root;
    }

}
