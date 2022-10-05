package com.example.experiences;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MoreFragment extends Fragment {

    ListView listView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.more_fragment, container, false);
        listView = (ListView) v.findViewById(R.id.lv);
        moreFragmentInitialization();
        return v;
    }

    protected void moreFragmentInitialization() {
        String[] userOptions = {"Profile Settings", "Notification Settings", "App Updates"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), R.layout.list_view_item, userOptions);
        listView.setAdapter(arrayAdapter);
    }
}
