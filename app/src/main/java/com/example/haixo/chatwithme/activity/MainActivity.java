package com.example.haixo.chatwithme.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.haixo.chatwithme.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] user_names = getResources().getStringArray(R.array.user_names); //lay du lieu tu array
        ListView listFriend = (ListView)findViewById(R.id.friend_list); //danh sach ban
        Integer[] avatars = {
                R.drawable.avatar,
                R.drawable.avatar,
                R.drawable.avatar,
                R.drawable.avatar,
        };
        CustomizeListAdapter adapter = new CustomizeListAdapter(this, user_names, avatars);
        listFriend.setAdapter(adapter); //set addapter cho listview
    }
}
