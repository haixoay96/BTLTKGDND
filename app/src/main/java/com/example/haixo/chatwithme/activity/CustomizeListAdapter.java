package com.example.haixo.chatwithme.activity;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.haixo.chatwithme.R;

/**
 * Created by cant on 30/10/2016.
 */

class CustomizeListAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] itemname;
    private final Integer[] imgid;
    /* Ham khoi tao */
   CustomizeListAdapter(Activity context, String[] itemname, Integer[] imgid){
       super(context, R.layout.element, itemname);
       this.itemname = itemname;
       this.imgid = imgid;
       this.context = context;
   }
    @Override
    public View getView(int positon, View view, ViewGroup parent){
        LayoutInflater inflater = ((Activity)context).getLayoutInflater();

        View rowView = inflater.inflate(R.layout.element, null, true);
        TextView name = (TextView)rowView.findViewById(R.id.user_name);
        ImageView avatar = (ImageView)rowView.findViewById(R.id.user_avatar);
        name.setText(itemname[positon]);
        avatar.setImageResource(imgid[positon]);
        return rowView;
    }
}
