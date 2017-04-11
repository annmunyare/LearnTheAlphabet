package com.example.nyambura.learnthealphabet;

/**
 * Created by nyambura on 3/16/17.
 */

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.nyambura.learnthealphabet.R;

/**
 * Created by nyambura on 3/16/17.
 */

public class AlphabetAdapter extends BaseAdapter {
    public AlphabetAdapter() {
        super();
    }

    @Override
    public int getCount() {
        return mLetters.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {
            // get layout from xml file
            gridView = inflater.inflate(R.layout.alphabet_grid_item, null);


            // pull views
            TextView letterView = (TextView) gridView
                    .findViewById(R.id.grid_item_letter);

            // set values into views
            letterView.setText(mLetters[position]);
            letterView.setTypeface(mTypeface);// using dummy data for now
        } else {
            gridView = (View) convertView;
        }
        return gridView;
    }

    private Context mContext;
    private String[] mLetters;
    private Typeface mTypeface;

    public AlphabetAdapter (Context context, String[] letters, Typeface typeface){
        this.mContext = context;
        this.mLetters = letters;
        this.mTypeface = typeface;
    }


}
