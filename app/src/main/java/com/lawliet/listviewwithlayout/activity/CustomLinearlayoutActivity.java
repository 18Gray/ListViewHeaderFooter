package com.lawliet.listviewwithlayout.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.lawliet.listviewwithlayout.R;
import com.lawliet.listviewwithlayout.adapter.NormalListViewAdapter;
import com.lawliet.listviewwithlayout.bean.ItemAdapterBean;
import com.lawliet.listviewwithlayout.common.DataUtils;
import com.lawliet.listviewwithlayout.view.LinearLayoutListView;

import java.util.ArrayList;

import static com.lawliet.listviewwithlayout.R.id.textView;

/**
 * Created by lutao on 2016/1/8.
 */
public class CustomLinearlayoutActivity extends Activity
{
    Context context;
    LinearLayout layout_introview;
    TextView tv_intro;

    LinearLayoutListView lllv_customlinearlayout;
    NormalListViewAdapter normalListViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customlinearlayout);
        context = this;
        layout_introview = (LinearLayout) findViewById(R.id.layout_introview);
        tv_intro = (TextView) layout_introview.findViewById(R.id.tv_intro);
        tv_intro.setText("自定义LinearLayout");

        lllv_customlinearlayout = (LinearLayoutListView) findViewById(R.id.lllv_customlinearlayout);
        normalListViewAdapter = new NormalListViewAdapter(context, DataUtils.getData());
        lllv_customlinearlayout.setAdapter(normalListViewAdapter);
    }
}
