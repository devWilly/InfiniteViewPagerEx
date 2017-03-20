package com.devwilly.infiniteviewpagerex;

import android.support.v4.view.ViewPager;
import android.view.View;


/**
 * Created by Willy on 2017/3/18.
 */

public class ViewPagerScaleTransformer implements ViewPager.PageTransformer {

    private static final float MAX_SCALE = 0.9f;

    @Override
    public void transformPage(View page, float position) {

        if (position < -1 || position > 1) {
            page.setScaleX(MAX_SCALE);
            page.setScaleY(MAX_SCALE);
        } else {
            float scaleFactory = Math.max(MAX_SCALE, 1 - Math.abs(position));

            page.setScaleX(scaleFactory);
            page.setScaleY(scaleFactory);
        }
    }
}
