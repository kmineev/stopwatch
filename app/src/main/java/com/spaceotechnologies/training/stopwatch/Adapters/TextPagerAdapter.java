package com.spaceotechnologies.training.stopwatch.adapters;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;

import com.spaceotechnologies.training.stopwatch.R;
import com.spaceotechnologies.training.stopwatch.fragments.RootStopwatchFragment;
import com.spaceotechnologies.training.stopwatch.fragments.RootTimerFragment;

/**
 * Created by Kostez on 01.08.2016.
 */
public class TextPagerAdapter extends android.support.v13.app.FragmentPagerAdapter {

    public static final int STOPWATCH_NUMBER = 0;
    public static final int TIMER_NUMBER = 1;
    public static final int STOPWATCH_FRAGMENT_POSITION = 0;
    public static final int TIMER_FRAGMENT_POSITION = 0;
    private final int COUNT = 2;

    private String tabTitles[];
    private Context context;

    public TextPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.tabTitles = context.getResources().getStringArray(R.array.titles_tabs);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case STOPWATCH_NUMBER:
                return new RootStopwatchFragment();
            case TIMER_NUMBER:
                return new RootTimerFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
