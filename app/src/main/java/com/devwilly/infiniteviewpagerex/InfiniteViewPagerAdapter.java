package com.devwilly.infiniteviewpagerex;

import com.devwilly.infiniteviewpagerex.ui.InfiniteViewPager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Willy on 2017/3/16.
 */

public class InfiniteViewPagerAdapter extends PagerAdapter {

    private Context mContext;
    private List<Integer> mImageList = new ArrayList<>();

    public InfiniteViewPagerAdapter(Context context, List<Integer> imageList) {
        this.mContext = context;
        this.mImageList = imageList;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        final int virtualPosition = position % getRealCount();

        ImageView img = new ImageView(mContext);
        img.setImageResource(mImageList.get(virtualPosition));
        container.addView(img);

        return img;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
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
        return view == object;
    }
}
