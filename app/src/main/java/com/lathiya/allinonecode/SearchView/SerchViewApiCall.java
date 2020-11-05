package com.lathiya.allinonecode.SearchView;

public class SerchViewApiCall {


//    Searchview api call
//
//
//            Adapter
//    public List<DataModel.data> restorent = new ArrayList<DataModel.data>();
//    public Activity mContext;
//    ArrayList<DataModel.data> templist;
//
//
//    public RestorentAdapter(List<DataModel.data> restorent, Activity mContext) {
//        this.restorent = restorent;
//        this.mContext = mContext;
//        templist = new ArrayList<>();
//        templist.addAll(restorent);
//    }
//
//
//    creat method in adapter
//
//    public void filter(String newText) {
//
//        newText = newText.toLowerCase(Locale.getDefault());
//
//        restorent.clear();
//        if (newText.length() == 0) {
//
//            restorent.addAll(templist);
//
//        } else {
//            for (DataModel.data item : templist) {
//
//                if (item.restaurant_name.toLowerCase(Locale.getDefault()).contains(newText)) {
//                    restorent.add(item);
//                }
//            }
//
//        }
//        notifyDataSetChanged();
//
//    }
//
//
//    xml Activity in change
//<androidx.appcompat.widget.SearchView
//    android:id="@+id/sv"
//    android:layout_width="match_parent"
//    android:layout_height="50dp" />
//
//    Java activity
//    SearchView sv;
//    sv = findViewById(R.id.sv);
//
//
//sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//        @Override
//        public boolean onQueryTextSubmit(String query)   {
//            return false;
//        }
//
//        @Override
//        public boolean onQueryTextChange(String newText) {
//            restorentAdapter.filter(newText);
//            rv.invalidate();
//            return false;
//        }
//    });
//
//    java activity method
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.search,menu);
//
//        MenuItem search=menu.findItem(R.id.search);
//        SearchView sv= (SearchView) search.getActionView();
//
//        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//                restorentAdapter.filter(newText);
//                rv.invalidate();
//                return false;
//            }
//        });
//
//        return super.onCreateOptionsMenu(menu);
//
//    }
//
//    Api call in to
//    restorentAdapter = new RestorentAdapter(response.body().data,testActivity.this);
//rv.setAdapter(restorentAdapter);
//
//
//
//    Creat menu
//    <?xml version="1.0" encoding="utf-8"?>
//<menu xmlns:android="http://schemas.android.com/apk/res/android"
//    xmlns:app="http://schemas.android.com/apk/res-auto">
//    <item
//    android:id="@+id/search"
//    app:actionViewClass="androidx.appcompat.widget.SearchView"
//    android:icon="@drawable/abc_vector_test"
//    android:title="search"
//    app:showAsAction="always" />
//
//</menu>


}
