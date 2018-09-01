package com.wakatech.invatarejuridica;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class LeaderboardsAdapter extends BaseAdapter {
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
        View v = View.inflate(context,R.layout.leaderboards_item,null);
        TextView pos = v.findViewById(R.id.leaderboards_position);
        TextView name = v.findViewById(R.id.leaderboards_name);
        TextView score = v.findViewById(R.id.leaderboards_score);

        pos.setText(1+position+"");
        name.setText(items.get(position).getName());
        score.setText(items.get(position).getScore()+"");

        return v;
    }









}
