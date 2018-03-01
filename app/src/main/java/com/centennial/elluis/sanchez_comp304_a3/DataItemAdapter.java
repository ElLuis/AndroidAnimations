package com.centennial.elluis.sanchez_comp304_a3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by luisq on 3/1/2018.
 */


public class DataItemAdapter extends ArrayAdapter<String> {
    List<String> mStringItems;
    LayoutInflater mInflater;
    public DataItemAdapter(@NonNull Context context, @NonNull List<String> objects) {
        super(context, R.layout.list_item, objects);

        mStringItems = objects;
        mInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = mInflater.inflate(R.layout.list_item,parent,false);
        }

        TextView taskReferenceTV = convertView.findViewById(R.id.itemTextView);

        String item = mStringItems.get(position);
        taskReferenceTV.setText(item);

        return convertView;
    }
}
