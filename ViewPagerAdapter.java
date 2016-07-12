package com.example.nichetech.tabviewviewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nichetech on 12/7/16.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        String name=mFragmentTitleList.get(position);

        if(name.equalsIgnoreCase("english"))
        {
            return  new English();
        }
        else if(name.equalsIgnoreCase("gujarati"))
        {
            return  new Gujarati();
        }
        else if(name.equalsIgnoreCase("hindi"))
        {
            return  new Hindi();
        }
        else if(name.equalsIgnoreCase("marathi"))
        {
            return  new Marathi();
        }
        return mFragmentList.get(position);

    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void  addFragmentAndTitle(Fragment fragment, String title)
    {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String name=mFragmentTitleList.get(position);

        if(name.equalsIgnoreCase("english"))
        {

            return  name;

        }
        return name;

    }
}
