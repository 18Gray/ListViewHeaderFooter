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
public class NormalListViewAdapter extends BaseAdapter
{
    Context context;
    ArrayList<ItemAdapterBean> itemAdapterBeanArrayList;
    ViewHolderNormalListView viewHolderNormalListView;

    public NormalListViewAdapter(Context c, ArrayList<ItemAdapterBean> iab)
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
        if(convertView == null)
        {
            viewHolderNormalListView = new ViewHolderNormalListView();
            convertView = LayoutInflater.from(context).inflate(R.layout.item_normallistview, null);
            viewHolderNormalListView.iv_item_normallistview = (ImageView) convertView.findViewById(R.id.iv_item_normallistview);
            viewHolderNormalListView.tv_item_normallistview = (TextView) convertView.findViewById(R.id.tv_item_normallistview);
            convertView.setTag(viewHolderNormalListView);
        }
        else
        {
            viewHolderNormalListView = (ViewHolderNormalListView) convertView.getTag();
        }

        viewHolderNormalListView.iv_item_normallistview.setImageResource(itemAdapterBeanArrayList.get(position).icon);
        viewHolderNormalListView.tv_item_normallistview.setText("item" + Integer.toString(position));
        return convertView;
    }


    public class ViewHolderNormalListView
    {
        public ImageView iv_item_normallistview;
        public TextView tv_item_normallistview;
    }


}
