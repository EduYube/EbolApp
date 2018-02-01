package com.eyubero.ebolapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    private ListView mListView;
    private List<String> mNewsList;

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment by a View
        View fragmentView = inflater.inflate(R.layout.fragment_news, container, false);
        mListView = fragmentView.findViewById(R.id.lv_news);

//        Para crear la lista, Java implementa Array list
        mNewsList = new ArrayList<String>();
        mNewsList.add("My first item");
        mNewsList.add("More");
        mNewsList.add("More");
        mNewsList.add("More");
        mNewsList.add("More");
        mNewsList.add("More");
        mNewsList.add("More");
        mNewsList.add("More");
        mNewsList.add("More");
        mNewsList.add("More");
        mNewsList.add("More");
        mNewsList.add("More");
        mNewsList.add("More");
        mNewsList.add("More");
        mNewsList.add("More");
        mNewsList.add("More");

        return fragmentView;
    }

}
