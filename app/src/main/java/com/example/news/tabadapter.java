package com.example.news;
import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
public class tabadapter extends FragmentPagerAdapter {
        Context context;
        int count;
        public tabadapter(@NonNull FragmentManager fm, Context context, int count) {
            super(fm);
            this.context = context;
            this.count = count;
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
              case 0:
                    general g=new general();
                    return g;
                case 1:
                    sports s=new sports();
                    return s;
               case 2:
                    science sci=new science();
                    return sci;
                case 3:
                    entertainment ent=new entertainment();
                    return ent;
            }
            return null;
        }

        @Override
        public int getCount() {
            return count;
        }
    }
