package com.eyubero.ebolapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    private ListView mListView;
    private List<String> mNewsList = new ArrayList<>();

    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment by a View
        View fragmentView = inflater.inflate(R.layout.fragment_news, container, false);

        mListView = fragmentView.findViewById(R.id.lv_news);

//        we need an ArrayList if we will want to create an List
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

        // we need an apadter for show our list correctly
        MyAdpater mAdapter = new MyAdpater();
        mListView.setAdapter(mAdapter);

        return fragmentView;
    }

    public class MyAdpater extends BaseAdapter {

        public MyAdpater() {
            super();
        }

        @Override
        public int getCount() {
            return mNewsList.size();
        }

        @Override
        public Object getItem(int position) {
            return mNewsList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View rowView = getActivity().getLayoutInflater().inflate(R.layout.row,null);

            TextView textView = rowView.findViewById(R.id.tv_row);
            textView.setText(mNewsList.get(position));

            ImageView imageView = rowView.findViewById(R.id.im_picasso);
            Picasso.with(getActivity()).load("https://res.cloudinary.com/teepublic/image/private/s--9WFhgDqI--/t_Preview/b_rgb:191919,c_lpad,f_jpg,h_630,q_90,w_1200/v1493034870/production/designs/1513847_1.jpg").into(imageView);

            return rowView;
        }
    }

}
