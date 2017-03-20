package com.devwilly.infiniteviewpagerex;

import com.devwilly.infiniteviewpagerex.ui.InfiniteViewPager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InfiniteViewPager viewPager = (InfiniteViewPager) findViewById(R.id.infinite_viewpager);

        int pic1 = R.drawable.pic1;
        int pic2 = R.drawable.pic2;
        int pic3 = R.drawable.pic3;

        List<Integer> imageList = new ArrayList<>();
        imageList.add(pic1);
        imageList.add(pic2);
        imageList.add(pic3);

        InfiniteViewPagerAdapter adapter = new InfiniteViewPagerAdapter(this, imageList);

        viewPager.setOffscreenPageLimit(2);
        viewPager.setPageTransformer(false, new ViewPagerScaleTransformer());
        viewPager.setAdapter(adapter);


    }
}
