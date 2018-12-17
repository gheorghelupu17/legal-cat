package com.wakatech.invatarejuridica;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class LeaderboardsAdapter extends BaseAdapter {
    private static final int MODE_PRIVATE = 0;
    private List<Leader> items;
    private Context context;

    public LeaderboardsAdapter(Context context,List<Leader> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        SharedPreferences sharedPref = context.getSharedPreferences("login_info",MODE_PRIVATE);
        String emailLeader = sharedPref.getString("username", null);
        View v = View.inflate(context,R.layout.leaderboards_item,null);
        TextView pos = v.findViewById(R.id.leaderboards_position);
        TextView name = v.findViewById(R.id.leaderboards_name);
        TextView score = v.findViewById(R.id.leaderboards_score);

        Leader actual_leader = items.get(position);
        if (actual_leader.email.equals(emailLeader))
            v.setBackgroundColor(Color.BLUE);

        pos.setText(1+position+"");
        name.setText(actual_leader.getName());
        score.setText(actual_leader.getScore()+"");

        return v;
    }









}
