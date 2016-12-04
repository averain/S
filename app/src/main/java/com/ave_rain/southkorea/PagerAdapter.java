package com.ave_rain.southkorea;

/**
 * Created by AVE-RAIN on 2016-04-10.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {


    public PagerAdapter(android.support.v4.app.FragmentManager supportFragmentManager) {
        super(supportFragmentManager);
    }


    @Override
    public Fragment getItem(int arg0) {
        //TODO Auto-generated method stub
        switch (arg0){
            case 0:

                return new FragmentOne();
            case 1:
                return new FragmentTwo();
            case 2:
                return new FragmentThree();
            case 3:
                return new FragmentFour();
            case 4:
                return new FragmentFive();
            case 5:
                return new FragmentSix();
            case 6:
                return new FragmentSeven();
            case 7:
            return new FragmentEight();
            case 8:
            return new FragmentNine();
            case 9:
            return new FragmentTen();
            case 10:
                return new FragmentEleven();
            case 11:
                return new FragmentTwelve();
            case 12:
                return new FragmentThirteen();
            case 13:
                return new FragmentFourteen();
            case 14:
                return new FragmentFifteen();
            case 15:
                return new FragmentSixteen();
            case 16:
                return new FragmentSeventeen();
            case 17:
                return new FragmentEighteen();
            case 18:
                return new FragmentNineteen();
            case 19:
                return new FragmentTwenty();
            case 20:
                return new FragmentTwentyOne();
            case 21:
                return new FragmentTwentyTwo();
            case 22:
                return new FragmentTwentyThree();
            case 23:

            default:
                break;
        }
        return null;
    }
    @Override
    public int getCount() {
        //TODO Auto-generated method stub
        return 23;


    }
}