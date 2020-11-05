package com.lathiya.allinonecode.RecycleView;

public class TopLoader {

//    Loader top
//
//    LINK - https://guides.codepath.com/android/implementing-pull-to-refresh-guide#step-3-setup-swiperefreshlayout
//
//    /*swip layout refresh*/
//    implementation 'androidx.swiperefreshlayout:swiperefreshlayout:1.0.0'
//
//
//    allprojects {
//        repositories {
//            // requires Gradle v4.1+
//
//            google()
//        }
//    }
//
//
//<androidx.swiperefreshlayout.widget.SwipeRefreshLayout
//    xmlns:android="http://schemas.android.com/apk/res/android"
//    android:id="@+id/swipeContainer"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent">
//
//  <androidx.recyclerview.widget.RecyclerView
//    android:id="@+id/rvItems"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:layout_alignParentLeft="true"
//    android:layout_alignParentTop="true" />
//
//</androidx.swiperefreshlayout.widget.SwipeRefreshLayout>
//
//    ADEPTER ADD
//    /* Within the RecyclerView.Adapter class */
//
//// Clean all elements of the recycler
//
//    public void clear() {
//        items.clear();
//        notifyDataSetChanged();
//    }
//
//// Add a list of items -- change to type used
//
//    public void addAll(List<Tweet> list) {
//        items.addAll(list);
//        notifyDataSetChanged();
//    }
//
//
//
//    MAIN ACTIVITY
//    private SwipeRefreshLayout swipeContainer;
//
//
//    swipeContainer = (SwipeRefreshLayout) findViewById(R.id.swipeContainer);
//
//
//    TWO TIME CALL KRAVA NI
//  swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//        @Override
//        public void onRefresh() {
//            // Your code to refresh the list here.
//            // Make sure you call swipeContainer.setRefreshing(false)
//            // once the network request has completed successfully.
////                fetchTimelineAsync(0);
//            endless();
//
//        }
//    });
//    endless();
//
//swipeContainer.setColorSchemeResources(android.R.color.holo_blue_bright,
//    android.R.color.holo_green_light,
//    android.R.color.holo_orange_light,
//    android.R.color.holo_red_light);
//
//    METHOD
//    private void endless() {
//
//        loadmoreItems.clear();
//        loadmoreItems.add(new LoadmoreItem("asdc", "23-0489234738975348957435"));
//        loadmoreItems.add(new LoadmoreItem("a", "23-0489234738975348957435"));
//        loadmoreItems.add(new LoadmoreItem("adscec", "23-0489234738975348957435"));
//        loadmoreItems.add(new LoadmoreItem("a", "23-0489234738975348957435"));
//
//
//
//        swipeContainer.setRefreshing(false);
//
//
//    }
//

}
