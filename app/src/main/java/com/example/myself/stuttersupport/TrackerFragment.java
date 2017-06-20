package com.example.myself.stuttersupport;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;

public class TrackerFragment extends Fragment {
    private TrackerDbHelper trackerDbHelper;

    public static final TrackerFragment newInstance(TrackerDbHelper tdbh){
        TrackerFragment f = new TrackerFragment();
        f.trackerDbHelper = tdbh;
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = (View) inflater.inflate(R.layout.fragment_tracker_menu,
                container, false);
        return rootView;
    }
}
