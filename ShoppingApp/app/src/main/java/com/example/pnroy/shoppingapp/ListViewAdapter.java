package com.example.pnroy.shoppingapp;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import java.util.HashMap;
import java.util.ArrayList;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import static com.example.pnroy.shoppingapp.Constants.Name;
import static com.example.pnroy.shoppingapp.Constants.Price;

/**
 * Created by pnroy on 8/17/15.
 */
public class ListViewAdapter extends BaseAdapter {

    public ArrayList<HashMap<String,String>> list;
    Activity activity;
public ListViewAdapter(Activity activity,ArrayList<HashMap<String,String>>list){
    super();
    this.activity=activity;
    this.list=list;
}

    @Override
    public int getCount(){
        return list.size();
    }

    public Object getItem(int position){
        return list.get(position);

    }

    public long getItemId(int arg0){
        return 0;
    }

    private class ViewHolder{
        TextView txtName;
        TextView txtPrice;
    }
    public View getView(int position, View convertView,ViewGroup parent){
        ViewHolder holder;
        LayoutInflater inflater=activity.getLayoutInflater();
        if(convertView==null) {
            convertView = inflater.inflate(R.layout.column_row, null);
            holder = new ViewHolder();
            holder.txtName = (TextView) convertView.findViewById(R.id.TVName);
            holder.txtPrice = (TextView) convertView.findViewById(R.id.TVPrice);
            convertView.setTag(holder);
        }
        else {
            holder=(ViewHolder) convertView.getTag();
        }

HashMap<String,String> map=list.get(position);
        holder.txtName.setText(map.get(Name));
        holder.txtPrice.setText(map.get(Price));
return convertView;

        }


    }

