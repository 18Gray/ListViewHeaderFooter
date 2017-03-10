package com.lawliet.listviewwithlayout.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;

import com.lawliet.listviewwithlayout.R;
import com.lawliet.listviewwithlayout.adapter.NormalListViewAdapter;
import com.lawliet.listviewwithlayout.bean.ItemAdapterBean;
import com.lawliet.listviewwithlayout.common.DataUtils;
import com.lawliet.listviewwithlayout.view.ListViewForScroll;

import java.util.ArrayList;

/**
 * Created by lutao on 2016/1/8.
 */
public class CustomListViewActivity extends Activity
{
    Context context;
    LinearLayout layout_introview;
    TextView tv_intro;

    ScrollView sv_customListView;
    ListViewForScroll lvfs_normallistview;
    NormalListViewAdapter normalListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlistview);
        context = this;
        layout_introview = (LinearLayout) findViewById(R.id.layout_introview);
        tv_intro = (TextView) layout_introview.findViewById(R.id.tv_intro);
        tv_intro.setText("自定义ListView");

        sv_customListView = (ScrollView) findViewById(R.id.sv_customListView);
        lvfs_normallistview = (ListViewForScroll) findViewById(R.id.lvfs_normallistview);
        normalListViewAdapter = new NormalListViewAdapter(context, DataUtils.getData());
        lvfs_normallistview.setAdapter(normalListViewAdapter);
        sv_customListView.smoothScrollTo(0,0);
    }

}
