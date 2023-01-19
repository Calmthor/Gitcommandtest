package com.example.mytest;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class myAdapter extends ArrayAdapter<myItem> {
    private int resourceId;

    public myAdapter(Context context, int textViewResourceId, List<myItem> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }//实现构造器的构造方法（初始化数据ID）；

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        myItem myItems = getItem(position);
        View view;
        ViewHolder viewHolder = new ViewHolder();
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
            viewHolder.fruitImage = (ImageView) view.findViewById(R.id.myImage);
            viewHolder.fruitName = (TextView) view.findViewById(R.id.itemTv);
        }//如果没有布局，则加载；
        else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }//如果存在则直接传递给View;
        viewHolder.fruitImage.setImageResource(myItems.getImageId());
        viewHolder.fruitName.setText(myItems.getName());
        return view;
    }
}

class ViewHolder {
    ImageView fruitImage;
    TextView fruitName;
}//用来缓存控件；
