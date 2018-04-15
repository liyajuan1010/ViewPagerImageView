package com.example.dell.viewpagerimagebutton;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.dell.viewpagerimagebutton.fragment.BagsFragment;
import com.example.dell.viewpagerimagebutton.fragment.ClothesFragment;
import com.example.dell.viewpagerimagebutton.fragment.MeFragment;
import com.example.dell.viewpagerimagebutton.fragment.ShoeFragment;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener,View.OnClickListener{
    private ViewPager mViewPager;
    private ImageView ivClothes,ivBags,ivShoes,ivMe;
    private List<Fragment> mFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        init();
    }

    private void initView() {
        mViewPager=(ViewPager)findViewById(R.id.view_pager);
        ivClothes=(ImageView)findViewById(R.id.iv_clothes);
        ivBags=(ImageView)findViewById(R.id.iv_bags);
        ivShoes=(ImageView)findViewById(R.id.iv_shoe);
        ivMe=(ImageView)findViewById(R.id.iv_me);
    }

    private void init() {
        mFragment=new ArrayList<>();
        mFragment.add(new ClothesFragment());
        mFragment.add(new BagsFragment());
        mFragment.add(new ShoeFragment());
        mFragment.add(new MeFragment());

        mViewPager.setAdapter(new MyViewPagerFragmentAdapter(getSupportFragmentManager()));
        mViewPager.addOnPageChangeListener(this);
        
        ivClothes.setOnClickListener(this);
        ivBags.setOnClickListener(this);
        ivShoes.setOnClickListener(this);
        ivMe.setOnClickListener(this);

        //设置默认第四个处于激活状态
        setDefaultSelected();
    }

    private void setDefaultSelected() {
        ivMe.setSelected(true);
        mViewPager.setCurrentItem(3);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    //设置滚动时按钮变颜色
    @Override
    public void onPageSelected(int position) {
        //让按钮先变为默认状态，滑动后再变色
        resetImageViewSelected();
        switch (position){
            case 0:
                ivClothes.setSelected(true);
//                mViewPager.setCurrentItem(0);
                break;
            case 1:
                ivBags.setSelected(true);
//                mViewPager.setCurrentItem(1);
                break;
            case 2:
                ivShoes.setSelected(true);
//                mViewPager.setCurrentItem(2);
                break;
            case 3:
                ivMe.setSelected(true);
//                mViewPager.setCurrentItem(3);
                break;
        }
    }

    private void resetImageViewSelected() {
        ivClothes.setSelected(false);
        ivBags.setSelected(false);
        ivShoes.setSelected(false);
        ivMe.setSelected(false);
    }

    @Override
    public void onClick(View view) {
     switch (view.getId()){
         case R.id.iv_clothes:
             mViewPager.setCurrentItem(0);
             break;
         case R.id.iv_bags:
             mViewPager.setCurrentItem(1);
             break;
         case R.id.iv_shoe:
             mViewPager.setCurrentItem(2);
             break;
         case R.id.iv_me:
             mViewPager.setCurrentItem(3);
             break;
     }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


    public class MyViewPagerFragmentAdapter extends FragmentPagerAdapter {

        public MyViewPagerFragmentAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragment.get(position);
        }

        @Override
        public int getCount() {
            return mFragment.size();
        }
    }
}
