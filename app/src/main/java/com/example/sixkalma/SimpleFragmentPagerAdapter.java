package com.example.sixkalma;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
   public SimpleFragmentPagerAdapter(@NonNull FragmentManager fm) {
      super(fm);
   }

   @NonNull
   @Override
   public Fragment getItem(int position) {
      if (position == 0) {
         return new FirstKalmaFragment();
      } else if (position == 1){
         return new SecondKalmaFragment();
      } else if (position == 2){
         return new ThirdKalmaFragment();
      } else if (position == 3){
         return new ForthKalmaFragment();
      } else if (position == 4){
         return new FifthKalmaFragment();
      } else {
         return new SixthKalmaFragment();
      }
   }

   @Override
   public int getCount() {
      return 6;
   }
}
