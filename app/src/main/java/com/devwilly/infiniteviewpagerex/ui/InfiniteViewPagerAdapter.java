package com.devwilly.infiniteviewpagerex.ui;

import android.support.v4.view.PagerAdapter;
import android.view.View;


/**
 * Created by Willy on 2017/3/16.
 */

public class InfiniteViewPagerAdapter extends PagerAdapter {

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
}
