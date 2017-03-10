package com.lawliet.listviewwithlayout.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.lawliet.listviewwithlayout.R;
import com.lawliet.listviewwithlayout.adapter.CustomListViewAdapter;
import com.lawliet.listviewwithlayout.adapter.NormalListViewAdapter;
import com.lawliet.listviewwithlayout.bean.ItemAdapterBean;
import com.lawliet.listviewwithlayout.common.DataUtils;

import java.util.ArrayList;

/**
 * Created by lutao on 2016/1/8.
 */
public class UseAdapterActivity extends Activity
{
    Context context;
    ListView lv_addheaderview;
    CustomListViewAdapter customListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addheaderview);
        context = this;
        lv_addheaderview = (ListView) findViewById(R.id.lv_addheaderview);
        customListViewAdapter = new CustomListViewAdapter(context, DataUtils.getData());
        lv_addheaderview.setAdapter(customListViewAdapter);
    }
}
