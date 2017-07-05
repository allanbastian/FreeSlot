package com.adgvit.freeslots;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class TuesdayFrag extends android.support.v4.app.Fragment {
    private RecyclerView recyclerView;
    private FreeSlotRecycleAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tuesdayfrag, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.tuesday);
        adapter = new FreeSlotRecycleAdapter(getActivity(), getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return rootView;
    }

    private List<FreeSlotItem> getData() {
        List<FreeSlotItem> data = new ArrayList<>();
        String[] names = {"First Last Name", "First Last Name", "First Last Name", "First Last Name", "First Last Name"};
        for(int i = 0; i < names.length; i++) {
            FreeSlotItem current = new FreeSlotItem();
            current.Name = names[i];
            data.add(current);
        }
        return data;
    }
}
