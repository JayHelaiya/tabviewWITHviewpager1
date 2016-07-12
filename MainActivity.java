package com.example.nichetech.tabviewviewpager;

import android.app.ActionBar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ViewPagerAdapter viewPagerAdapter;
    TabLayout tabLayout;
    ViewPager  pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Menu bar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        tabLayout=(TabLayout)findViewById(R.id.tabs);
        pager=(ViewPager)findViewById(R.id.viewpager);
        setUpviewPager();
        limitToDisplay();
        tabLayout.setupWithViewPager(pager);


    }
    public void limitToDisplay()
    {
        if (viewPagerAdapter.getCount() > 2) {
            tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        } else {
            tabLayout.setTabMode(TabLayout.MODE_FIXED);
        }
    }

    public void setUpviewPager()
    {

        viewPagerAdapter =new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragmentAndTitle(new English(),"english");
        viewPagerAdapter.addFragmentAndTitle(new Gujarati(),"gujarati");
        viewPagerAdapter.addFragmentAndTitle(new Hindi(),"hindi");
        viewPagerAdapter.addFragmentAndTitle(new Marathi(),"marathi");
        viewPagerAdapter.addFragmentAndTitle(new Marathi(),"marathi");
        viewPagerAdapter.addFragmentAndTitle(new Marathi(),"marathi");
        pager.setAdapter(viewPagerAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case android.R.id.home :
            onBackPressed();
                return true;
            case R.id.english :
                Toast.makeText(getApplicationContext(),"English Language selected",Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.gujarati :
                Toast.makeText(getApplicationContext(),"gujarati Language selected",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.hindi :
                Toast.makeText(getApplicationContext(),"hindi Language selected",Toast.LENGTH_SHORT).show();
                return  true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.memu_main,menu);
        return  true;
    }
}
