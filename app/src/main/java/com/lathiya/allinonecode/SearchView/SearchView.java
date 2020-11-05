package com.lathiya.allinonecode.SearchView;

public class SearchView {

//    Search view
//
//    XML file
//<androidx.appcompat.widget.SearchView
//    android:id="@+id/sv"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:queryHint="Search Here"
//    android:iconifiedByDefault="false"
//    android:layout_alignParentTop="true"
//    android:layout_marginTop="5dp" />
//
//    JAVA file
//sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//        @Override
//        public boolean onQueryTextSubmit(String query)   {
//            return false;
//        }
//
//        @Override
//        public boolean onQueryTextChange(String newText) {
//            addContectAdepter.filter(newText);
//            rv.invalidate();
//            return false;
//        }
//    });
//
//    Note – method bahar lkhva ni che
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
//                addContectAdepter.filter(newText);
//                rv.invalidate();
//                return false;
//            }
//        });
//
//        return super.onCreateOptionsMenu(menu);
//
//        Menu creat
//
//<?xml version="1.0" encoding="utf-8"?>
//<menu xmlns:android="http://schemas.android.com/apk/res/android"
//        xmlns:app="http://schemas.android.com/apk/res-auto">
//    <item
//        android:id="@+id/search"
//        app:actionViewClass="androidx.appcompat.widget.SearchView"
//        android:icon="@drawable/delete"
//        android:title="search"
//        app:showAsAction="always" />
//
//</menu
//
//
//                Adepter
//        Adepter ma new arrlist banava nu and old arrlist hoi te add krva NU
//
//        ArrayList<CityItem> templist;
//
//        templist = new ArrayList<>();
//        templist.addAll(cityItems);
//
//
//        last ma
//        public void filter(String newText) {
//
//            newText = newText.toLowerCase(Locale.getDefault());
//
//            addContectItems.clear();
//            if (newText.length() == 0) {
//
//                addContectItems.addAll(searchview);
//
//            } else {
//                for (AddContectItem item : searchview) {
//
//                    if (item.getFname().toLowerCase(Locale.getDefault()).contains(newText)) {
//                        addContectItems.add(item);
//                    }
//                }
//
//            }
//            notifyDataSetChanged();
//
//        }
//
//        EX
//package com.example.nnewsapplication.CityList;
//
//import android.app.Activity;
//import android.content.Context;
//import android.content.Intent;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.example.nnewsapplication.MainActivity;
//import com.example.nnewsapplication.R;
//
//import java.util.ArrayList;
//import java.util.Locale;
//
//import static android.media.CamcorderProfile.get;
//
//        public class CityAdepter extends RecyclerView.Adapter<CityAdepter.MYHOLDER>{
//            ArrayList<CityItem> cityItems;
//            ArrayList<CityItem> templist;
//            Context context;
//
//            public CityAdepter(ArrayList<CityItem> cityItems, Context context) {
//                this.cityItems = cityItems;
//                this.context = context;
//                templist = new ArrayList<>();
//                templist.addAll(cityItems);
//            }
//
//            @NonNull
//            @Override
//            public MYHOLDER onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//                View view = LayoutInflater.from(context).inflate(R.layout.city_item,parent,false);
//                return new MYHOLDER(view);
//            }
//
//            @Override
//            public void onBindViewHolder(@NonNull MYHOLDER holder, final int position) {
//                holder.tv.setText(cityItems.get(position).getCityname());
//                holder.tv.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                        Intent intent = new Intent(context, MainActivity.class);
//                        intent.putExtra("data",cityItems.get(position).getCityname());
//                        context.startActivity(intent);
//                        ((Activity)context).finish();
//                        Toast.makeText(context, "" + cityItems.get(position).getCityname(), Toast.LENGTH_SHORT).show();
//
//                    }
//
//
//                });
//
//            }
//
//            @Override
//            public int getItemCount() {
//                return cityItems.size();
//            }
//
//            public class MYHOLDER extends RecyclerView.ViewHolder {
//                TextView tv;
//                public MYHOLDER(@NonNull View itemView) {
//                    super(itemView);
//
//                    tv = itemView.findViewById(R.id.tv);
//                }
//            }
//
//            public void filter(String newText) {
//
//                newText = newText.toLowerCase(Locale.getDefault());
//
//                addContectItems.clear();
//                if (newText.length() == 0) {
//
//                    addContectItems.addAll(searchview);
//
//                } else {
//                    for (AddContectItem item : searchview) {
//
//                        if (item.getFname().toLowerCase(Locale.getDefault()).contains(newText)) {
//                            addContectItems.add(item);
//                        }
//                    }
//
//                }
//                notifyDataSetChanged();
//
//            }
//
//        }
//

    }
