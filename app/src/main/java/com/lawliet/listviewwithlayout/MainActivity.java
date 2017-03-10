package com.lawliet.listviewwithlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.lawliet.listviewwithlayout.activity.AddHeaderViewActivity;
import com.lawliet.listviewwithlayout.activity.CustomLinearlayoutActivity;
import com.lawliet.listviewwithlayout.activity.CustomListViewActivity;
import com.lawliet.listviewwithlayout.activity.NormalListViewActivity;
import com.lawliet.listviewwithlayout.activity.SetListViewHeightActivity;
import com.lawliet.listviewwithlayout.activity.UseAdapterActivity;



public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    LinearLayout ll_normalListView, ll_customListView, ll_setListViewHeight, ll_customLinearlayout, ll_useAdapter, ll_addHeaderView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll_normalListView = (LinearLayout) findViewById(R.id.ll_normalListView);
        ll_customListView = (LinearLayout) findViewById(R.id.ll_customListView);
        ll_setListViewHeight = (LinearLayout) findViewById(R.id.ll_setListViewHeight);
        ll_customLinearlayout = (LinearLayout) findViewById(R.id.ll_customLinearlayout);
        ll_useAdapter = (LinearLayout) findViewById(R.id.ll_useAdapter);
        ll_addHeaderView = (LinearLayout) findViewById(R.id.ll_addHeaderView);

        ll_normalListView.setOnClickListener(this);
        ll_customListView.setOnClickListener(this);
        ll_setListViewHeight.setOnClickListener(this);
        ll_customLinearlayout.setOnClickListener(this);
        ll_useAdapter.setOnClickListener(this);
        ll_addHeaderView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.ll_normalListView:
                Intent intent1 = new Intent(MainActivity.this, NormalListViewActivity.class);
                startActivity(intent1);
                break;

            case R.id.ll_customListView:
                Intent intent2 = new Intent(MainActivity.this, CustomListViewActivity.class);
                startActivity(intent2);
                break;

            case R.id.ll_setListViewHeight:
                Intent intent3 = new Intent(MainActivity.this, SetListViewHeightActivity.class);
                startActivity(intent3);
                break;

            case R.id.ll_customLinearlayout:
                Intent intent4 = new Intent(MainActivity.this, CustomLinearlayoutActivity.class);
                startActivity(intent4);
                break;

            case R.id.ll_useAdapter:
                Intent intent5 = new Intent(MainActivity.this, UseAdapterActivity.class);
                startActivity(intent5);
                break;

            case R.id.ll_addHeaderView:
                Intent intent6 = new Intent(MainActivity.this, AddHeaderViewActivity.class);
                startActivity(intent6);
                break;
        }
    }
}
