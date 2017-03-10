package com.lawliet.listviewwithlayout.common;

import com.lawliet.listviewwithlayout.R;
import com.lawliet.listviewwithlayout.bean.ItemAdapterBean;

import java.util.ArrayList;

/**
 * Created by Razer on 2017/2/19.
 */

public class DataUtils
{
    public static int[] icons = new int[]{
            R.drawable.facebook_blue_circle, R.drawable.github_black_circle, R.drawable.google_red_circle,
            R.drawable.linkedin_blue_circle, R.drawable.pinterest_red_circle, R.drawable.rss_yellow_circle,
            R.drawable.skype_blue_circle, R.drawable.snapchat_yellow_circle, R.drawable.twiter_blue_circle,
            R.drawable.windows_green_circle, R.drawable.youtube_red_circle,
            R.drawable.facebook_blue_circle, R.drawable.github_black_circle, R.drawable.google_red_circle,
            R.drawable.linkedin_blue_circle, R.drawable.pinterest_red_circle, R.drawable.rss_yellow_circle,
            R.drawable.skype_blue_circle, R.drawable.snapchat_yellow_circle, R.drawable.twiter_blue_circle,
            R.drawable.windows_green_circle, R.drawable.youtube_red_circle
    };

    public static ArrayList<ItemAdapterBean> getData()
    {
        ArrayList<ItemAdapterBean> itemAdapterBeanArrayList = new ArrayList<>();
        for(int i = 0;i < icons.length;i++)
        {
            ItemAdapterBean itemAdapterBean = new ItemAdapterBean();
            itemAdapterBean.icon = icons[i];
            itemAdapterBean.text = Integer.toString(i);
            itemAdapterBeanArrayList.add(itemAdapterBean);
        }
        return itemAdapterBeanArrayList;
    }


}
