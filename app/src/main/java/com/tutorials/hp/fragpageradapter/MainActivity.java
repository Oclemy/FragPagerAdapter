package com.tutorials.hp.fragpageradapter;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
- Our MainActivity.
- Derives from AppcompatActivity and implements TabLayout.onTabSelectedListener interface.
- Inflated from activity_main.xml.
- We create fragment instances here and add them to our fragments collection, then set the adapter to viewpager.
- When tab is selected, we set the current fragment to our ViewPager.
- Methods: onCreate(),addPages(),onTabSelected(),onTabUnselected(),onTabReselcted()
 */
public class MainActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{

    //DECLARATIONS.
    private TabLayout tab;
    private ViewPager vp;

    /*
    WHEN ACTIVITY IS CREATED.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vp= (ViewPager) findViewById(R.id.viewpager);
        addPages(vp);

        tab= (TabLayout) findViewById(R.id.tabs);
        tab.setTabGravity(TabLayout.GRAVITY_FILL);
        tab.setupWithViewPager(vp);
        tab.addOnTabSelectedListener(this);
    }
    /*
    ADD Fragment Pages TO MyPagerAdapter.
    Set adapter to viewpage.
     */
    private void addPages(ViewPager viewPager)
    {
        MyPagerAdapter myPagerAdapter=new MyPagerAdapter(getSupportFragmentManager());
        myPagerAdapter.addPage(InterPlanetary.newInstance());
        myPagerAdapter.addPage(InterStellar.newInstance());
        myPagerAdapter.addPage(InterGalactic.newInstance());

        vp.setAdapter(myPagerAdapter);
    }

    /*
    WHEN TAB IS SELECTED.
     */
    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        vp.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
