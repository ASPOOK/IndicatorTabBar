package com.andy.indicatortabbar;

import java.util.ArrayList;
import java.util.List;

import com.andy.widgets.IndicatorTabBar;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Menu;

/**
 * test Activity
 * 
 * @author Andy
 * @since 2015-05-12
 */
public class MainActivity extends FragmentActivity {

	private IndicatorTabBar mIndicatorTabBar;
	private List<String> tabNames;
	private ViewPager mViewPager;
	private int maxColumn = 5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tabNames = new ArrayList<String>();
		tabNames.add("�Ϻ�");
		tabNames.add("����");
		tabNames.add("����");
		tabNames.add("����");
		tabNames.add("����");
		tabNames.add("����");
		tabNames.add("�Ͼ�");
		tabNames.add("�人");
		tabNames.add("����");
		tabNames.add("ʯ��ׯ");
		tabNames.add("����");
		tabNames.add("����");
		tabNames.add("��ͷ");
		tabNames.add("����");

		mViewPager = (ViewPager) findViewById(R.id.viewpager);
		mViewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

		mIndicatorTabBar = (IndicatorTabBar) findViewById(R.id.tab_indicator);
		mIndicatorTabBar.setMaxColumn(maxColumn);
		// set some attrs by code,you can also set up in the layout file.
		//mIndicatorTabBar.setUnderLineColor(Color.BLACK);
		//mIndicatorTabBar.setUnderLineHeight(10);
		//mIndicatorTabBar.setTextColor(Color.BLUE);
		//mIndicatorTabBar.setTextSelectedColor(Color.BLACK);
		//mIndicatorTabBar.setTextSize(50);
		
		// not nessary
		mIndicatorTabBar.setViewPager(mViewPager);
		mIndicatorTabBar.initView(tabNames);
		//mIndicatorTabBar.initView(tabNames, maxColumn);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	class ViewPagerAdapter extends FragmentPagerAdapter {

		public ViewPagerAdapter(FragmentManager fm) {
			super(fm);
			// TODO Auto-generated constructor stub
		}

		@Override
		public Fragment getItem(int position) {
			// TODO Auto-generated method stub
			return TestFragment.newInstance(tabNames.get(position));
		}

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return tabNames.size();
		}

	}

}
