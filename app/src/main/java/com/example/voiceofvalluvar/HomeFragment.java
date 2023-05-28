package com.example.voiceofvalluvar;

import android.media.metrics.Event;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class HomeFragment extends Fragment {
    public HomeFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_page, container, false);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.homePageRV);
        ArrayList<EventObjectModel> data = new ArrayList<>();
        data.add(new EventObjectModel("திருவள்ளுவர் கழகம் தென்காசி", "tenkasi , India ", new Date(1687960800), new Date(1687924800)));
        data.add(new EventObjectModel("திருவள்ளுவர் கழகம் தென்காசி", "tenkasi , India ", new Date(1687960800), new Date(1687924800)));
        data.add(new EventObjectModel("திருவள்ளுவர் கழகம் தென்காசி", "tenkasi , India ", new Date(1687960800), new Date(1687924800)));
        data.add(new EventObjectModel("திருவள்ளுவர் கழகம் தென்காசி", "tenkasi , India ", new Date(1687960800), new Date(1687924800)));
        data.add(new EventObjectModel("திருவள்ளுவர் கழகம் தென்காசி", "tenkasi , India ", new Date(1687960800), new Date(1687924800)));
        data.add(new EventObjectModel("திருவள்ளுவர் கழகம் தென்காசி", "tenkasi , India ", new Date(1687960800), new Date(1687924800)));

        EventsAdapter mAdapter = new EventsAdapter(this.getContext(), data);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        return view;
    }
}
