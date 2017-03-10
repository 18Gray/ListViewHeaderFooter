package com.lawliet.listviewwithlayout.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.lawliet.listviewwithlayout.R;
import com.lawliet.listviewwithlayout.adapter.NormalListViewAdapter;
import com.lawliet.listviewwithlayout.bean.ItemAdapterBean;
import com.lawliet.listviewwithlayout.common.DataUtils;

import java.util.ArrayList;

/**
 * Created by lutao on 2016/1/8.
 */
public class NormalListViewActivity extends Activity
{
    Context context;
    LinearLayout layout_introview;
    TextView tv_intro;

    ListView lv_normallistview;
    NormalListViewAdapter normalListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normallistview);
        context = this;
        layout_introview = (LinearLayout) findViewById(R.id.layout_introview);
        tv_intro = (TextView) layout_introview.findViewById(R.id.tv_intro);
        tv_intro.setText("正常的ListView");

        lv_normallistview = (ListView) findViewById(R.id.lv_normallistview);
        normalListViewAdapter = new NormalListViewAdapter(context, DataUtils.getData());
        lv_normallistview.setAdapter(normalListViewAdapter);
    }




}
