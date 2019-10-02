package com.alproits.simpel.ui.laporan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.alproits.simpel.R;

public class LaporanFragment extends Fragment {

    private LaporanViewModel laporanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        laporanViewModel =
                ViewModelProviders.of(this).get(LaporanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_laporan, container, false);
        CardView cardviewOpenDetailLaporan = (CardView) root.findViewById(R.id.cardKelahi);
        cardviewOpenDetailLaporan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DetailLaporanFragment detailLaporanFragment = new DetailLaporanFragment();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.nav_host_fragment,detailLaporanFragment,detailLaporanFragment.getTag())
                        .commit();
            }
        });
        return root;
    }
}