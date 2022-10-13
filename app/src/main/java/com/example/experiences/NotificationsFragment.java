package com.example.experiences;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.app.Fragment;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class NotificationsFragment extends Fragment {

    ListView listView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View x = inflater.inflate(R.layout.notification_fragment, container, false);
        listView = x.findViewById(R.id.lvn);
        NotificationsFragmentInitialization();
        return x;
    }

    protected void NotificationsFragmentInitialization() {
        String[] userOptions = {"Notifications", "Study Abroad Meeting this Thursday", "Internship Opportunities!", "Professor Sommner posted Research Sign-ups",
                "New clinicals sign-ups posted", "notification","notification","notification","notification","notification", "notification","notification","notification","notification","notification"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(), R.layout.list_view_item, userOptions);
        listView.setAdapter(arrayAdapter);
    }
}
