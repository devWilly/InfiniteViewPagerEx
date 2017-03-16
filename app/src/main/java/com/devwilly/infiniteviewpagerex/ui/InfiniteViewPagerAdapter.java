package com.devwilly.infiniteviewpagerex.ui;

import com.devwilly.infiniteviewpagerex.MainActivity;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Willy on 2017/3/16.
 */

public class InfiniteViewPagerAdapter extends PagerAdapter {

    private List<Integer> mImageList = new ArrayList<>();

    public InfiniteViewPagerAdapter(Context context, List<Integer> imageList) {
        this.mImageList = imageList;
    }

    @Override
    public int getCount() {

        if (getRealCount() == 0) {
            return 0;
        }

        /**
         * return max value as {@link InfiniteViewPager} page count
         */
        return Integer.MAX_VALUE;
    }

    public int getRealCount() {
        return mImageList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
