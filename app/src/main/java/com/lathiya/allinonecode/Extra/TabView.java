package com.lathiya.allinonecode.Extra;

public class TabView {

//    Fragment
//    Fragment bana mate most impotans Values in to Styles and typing 2 line
//            <item name="windowNoTitle">true</item>
//<item name="windowActionBar">false</item>
//
//
//    Ex this line typing
//
//<resources>
//
//    <!-- Base application theme. -->
//    <style name="AppTheme" parent="Theme.AppCompat.Light.NoActionBar">
//        <!-- Customize your theme here. -->
//        <item name="windowNoTitle">true</item>
//        <item name="windowActionBar">false</item>
//        <item name="colorPrimary">@color/colorPrimary</item>
//        <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
//        <item name="colorAccent">@color/colorAccent</item>
//    </style>
//
//</resources>
//
//            1- xml file
//    <?xml version="1.0" encoding="utf-8"?>
//<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    xmlns:app="http://schemas.android.com/apk/res-auto"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent">
//
//
//<!--    <androidx.appcompat.widget.Toolbar-->
//<!--        android:id="@+id/toolbar"-->
//<!--        android:layout_width="match_parent"-->
//<!--        android:layout_height="?attr/actionBarSize"-->
//<!--        android:background="?attr/colorPrimary"-->
//<!--        app:layout_scrollFlags="scroll|enterAlways"-->
//<!--        app:popupTheme="@style/ThemeOverlay.AppCompat.Light" />-->
//
//
//    <androidx.viewpager.widget.ViewPager
//    android:id="@+id/viewpager"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    app:layout_behavior="@string/appbar_scrolling_view_behavior" />
//
//
//<com.google.android.material.appbar.AppBarLayout
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:layout_alignParentBottom="true"
//    android:layout_marginLeft="30dp"
//    android:layout_marginRight="30dp"
//    android:layout_marginBottom="10dp"
//            >
//
//    <com.google.android.material.tabs.TabLayout
//    android:id="@+id/tabs"
//    android:layout_width="match_parent"
//    android:layout_height="55dp"
//    app:tabGravity="fill"
//    app:tabMode="fixed" />
//</com.google.android.material.appbar.AppBarLayout>
//
//
//    	</RelativeLayout>
//
//
//            2-java file
//
//    public class MainActivity extends AppCompatActivity {
//
//        private Toolbar toolbar;
//        private TabLayout tabLayout;
//        private ViewPager viewPager;
//
//        private int[] tabIcons = {
//                R.drawable.cat,
//                R.drawable.boy,
//                R.drawable.clown,
//                R.drawable.mail
//        };
//
//
//        private void setupTabIcons() {
//            tabLayout.getTabAt(0).setIcon(tabIcons[0]);
//            tabLayout.getTabAt(1).setIcon(tabIcons[1]);
//            tabLayout.getTabAt(2).setIcon(tabIcons[2]);
//            tabLayout.getTabAt(3).setIcon(tabIcons[3]);
//        }
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//
////        toolbar = (Toolbar) findViewById(R.id.toolbar);
////        setSupportActionBar(toolbar);
//
////        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//            viewPager = (ViewPager) findViewById(R.id.viewpager);
//            setupViewPager(viewPager);
//
//            tabLayout = (TabLayout) findViewById(R.id.tabs);
//            tabLayout.setupWithViewPager(viewPager);
//            setupTabIcons();
//        }
//
//        private void setupViewPager(ViewPager viewPager) {
//            ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
//            adapter.addFragment(new AnimalFragment(), "Animal");
//            adapter.addFragment(new Babyfragment(), "Baby");
//            adapter.addFragment(new funnyfragment(), "Funny");
//            adapter.addFragment(new messagefragment(), "Message");
//            viewPager.setAdapter(adapter);
//        }
//
//
//
//        class ViewPagerAdapter extends FragmentPagerAdapter {
//            private final List<Fragment> mFragmentList = new ArrayList<>();
//            private final List<String> mFragmentTitleList = new ArrayList<>();
//
//            public ViewPagerAdapter(FragmentManager manager) {
//                super(manager);
//            }
//
//            @Override
//            public Fragment getItem(int position) {
//                return mFragmentList.get(position);
//            }
//
//            @Override
//            public int getCount() {
//                return mFragmentList.size();
//            }
//
//            public void addFragment(Fragment fragment, String title) {
//                mFragmentList.add(fragment);
//                mFragmentTitleList.add(title);
//            }
//
//            @Override
//            public CharSequence getPageTitle(int position) {
//                return mFragmentTitleList.get(position);
//            }
//        }
//    }
//
//
//    Note – jetla fragment banava na hoi ne aetli Activity and aetla j java na class bane
//
//
//1-	Java File mate
//
//    public class funnyfragment extends Fragment {
//
//        @Override
//        public void onCreate(@Nullable Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//        }
//
//        public funnyfragment() {
//        }
//
//        @Nullable
//        @Override
//        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//            View view = inflater.inflate(R.layout.fragment_funny, container, false);
//
//
//            return view;
//        }
//    }
//
//
//2 – XML file ma ae typing krva nu show krava nu hoi desing me to recyle view lidhelu che
//
//    <?xml version="1.0" encoding="utf-8"?>
//<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent">
//
//    <androidx.recyclerview.widget.RecyclerView
//    android:layout_width="match_parent"
//    android:layout_height="match_parent">
//
//
//    </androidx.recyclerview.widget.RecyclerView>
//</RelativeLayout>
//

}
