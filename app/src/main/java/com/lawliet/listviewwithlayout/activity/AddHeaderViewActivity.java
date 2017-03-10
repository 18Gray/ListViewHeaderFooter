package com.lawliet.listviewwithlayout.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.lawliet.listviewwithlayout.R;
import com.lawliet.listviewwithlayout.adapter.NormalListViewAdapter;
import com.lawliet.listviewwithlayout.bean.ItemAdapterBean;
import com.lawliet.listviewwithlayout.common.DataUtils;

import java.util.ArrayList;

/**
 * Created by lutao on 2016/1/8.
 */
public class AddHeaderViewActivity extends Activity
{
    Context context;
    ListView lv_addheaderview;
    NormalListViewAdapter normalListViewAdapter;
    View headerView;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addheaderview);
        context = this;
        lv_addheaderview = (ListView) findViewById(R.id.lv_addheaderview);
        headerView = LayoutInflater.from(context).inflate(R.layout.headerview, null);

        normalListViewAdapter = new NormalListViewAdapter(context, DataUtils.getData());
        lv_addheaderview.addHeaderView(headerView);
        lv_addheaderview.setAdapter(normalListViewAdapter);
    }


}
