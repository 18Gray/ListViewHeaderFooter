package com.lawliet.listviewwithlayout.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;
import android.widget.ScrollView;

/**
 * Created by lutao on 2016/1/8.
 */
public class ListViewForScroll extends ListView
{
    public ListViewForScroll(Context context)
    {
        super(context);
    }

    public ListViewForScroll(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public ListViewForScroll(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    public ListViewForScroll(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
    {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec)
    {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
