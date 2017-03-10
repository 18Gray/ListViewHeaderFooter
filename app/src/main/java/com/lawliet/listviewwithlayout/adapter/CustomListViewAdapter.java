package com.lawliet.listviewwithlayout.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.lawliet.listviewwithlayout.R;
import com.lawliet.listviewwithlayout.bean.ItemAdapterBean;

import java.util.ArrayList;


/**
 * Created by lutao on 2016/1/8.
 */
public class CustomListViewAdapter extends BaseAdapter
{
    Context context;
    ArrayList<ItemAdapterBean> itemAdapterBeanArrayList;
    ViewHolderNormalListView viewHolderNormalListView;
    ViewHolderHeaderView viewHolderHeaderView;

    public CustomListViewAdapter(Context c, ArrayList<ItemAdapterBean> iab)
    {
        this.context = c;
        this.itemAdapterBeanArrayList = iab;
    }


    @Override
    public int getCount()
    {
        return itemAdapterBeanArrayList.size();
    }


    @Override
    public Object getItem(int position)
    {
        return itemAdapterBeanArrayList.get(position);
    }


    @Override
    public long getItemId(int position)
    {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if(position == 0)
        {
            viewHolderHeaderView = new ViewHolderHeaderView();
            if(convertView == null)
            {
                convertView = LayoutInflater.from(context).inflate(R.layout.headerview, null);
                convertView.setTag(viewHolderHeaderView);
            }
            else
            {
                viewHolderHeaderView = (ViewHolderHeaderView) convertView.getTag();
            }
            viewHolderHeaderView.tv_headerview = (TextView) convertView.findViewById(R.id.tv_headerview);
            viewHolderHeaderView.tv_headerview.setText("customListView");
        }
        else if(position > 0)
        {
            viewHolderNormalListView = new ViewHolderNormalListView();
            if(convertView == null)
            {
                convertView = LayoutInflater.from(context).inflate(R.layout.item_normallistview, null);
                convertView.setTag(viewHolderNormalListView);
            }
            else
            {
                viewHolderNormalListView = (ViewHolderNormalListView) convertView.getTag();
            }
            viewHolderNormalListView.iv_item_normallistview = (ImageView) convertView.findViewById(R.id.iv_item_normallistview);
            viewHolderNormalListView.tv_item_normallistview = (TextView) convertView.findViewById(R.id.tv_item_normallistview);
            viewHolderNormalListView.iv_item_normallistview.setImageResource(itemAdapterBeanArrayList.get(position).icon);
            viewHolderNormalListView.tv_item_normallistview.setText("item" + Integer.toString(position));
        }

        return convertView;
    }


    public class ViewHolderNormalListView
    {
        public ImageView iv_item_normallistview;
        public TextView tv_item_normallistview;
    }

    public class ViewHolderHeaderView
    {
        public TextView tv_headerview;
    }


}
