package com.example.haixo.chatwithme.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.haixo.chatwithme.Data.User;
import com.example.haixo.chatwithme.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by haixo on 10/30/2016.
 */

public class AdapterListUser extends RecyclerView.Adapter<AdapterListUser.MyViewHolder> {
    private ArrayList<User> userArrayList;
    public class MyViewHolder extends RecyclerView.ViewHolder {
        private CircleImageView avatar;
        private TextView name;
        public MyViewHolder(View itemView) {
            super(itemView);
            avatar = (CircleImageView) itemView.findViewById(R.id.avatar);
            name = (TextView) itemView.findViewById(R.id.name);
        }
    }
    public AdapterListUser(ArrayList<User> userArrayList){
        this.userArrayList = userArrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycleview_user, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText(userArrayList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return userArrayList.size();
    }


}
