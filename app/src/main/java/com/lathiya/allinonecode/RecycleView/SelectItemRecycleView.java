package com.lathiya.allinonecode.RecycleView;

public class SelectItemRecycleView {
//    Select Item
//    MAIN ACTIVITY
//
//    <?xml version="1.0" encoding="utf-8"?>
//<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    xmlns:tools="http://schemas.android.com/tools"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent">
//
//    <RelativeLayout
//    android:layout_width="match_parent"
//    android:layout_height="50dp"
//    android:background="#fff">
//
//        <ImageView
//    android:id="@+id/selected_item"
//    android:layout_width="wrap_content"
//    android:layout_height="match_parent"
//    android:layout_alignParentEnd="true"
//    android:src="@drawable/abc" />
//
//
//    </RelativeLayout>
//
//
//    <androidx.swiperefreshlayout.widget.SwipeRefreshLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    android:id="@+id/swipeContainer"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent"
//    android:layout_marginTop="50dp">
//
//        <androidx.recyclerview.widget.RecyclerView
//    android:id="@+id/rcView"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:clipToPadding="false"
//    android:paddingTop="16dp"
//    android:paddingBottom="16dp"
//    android:scrollbars="vertical" />
//
//    </androidx.swiperefreshlayout.widget.SwipeRefreshLayout>
//
//    <LinearLayout
//    android:id="@+id/menu"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:layout_alignParentBottom="true"
//    android:orientation="horizontal"
//    android:visibility="gone"
//    android:weightSum="3">
//
//        <Button
//    android:id="@+id/btn1"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_weight="1"
//    android:onClick="selectAll"
//    android:text="Select all" />
//
//        <Button
//    android:id="@+id/btn2"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_weight="1"
//    android:onClick="deselectAll"
//    android:text="Unselect" />
//
//        <Button
//    android:id="@+id/btn3"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_weight="1"
//    android:onClick="doAction"
//    android:text="Action" />
//    </LinearLayout>
//
//</RelativeLayout>
//
//
//
//    ADAPTER
//    public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.RecyclerViewHolder> {
//
//        Context context;
//        LayoutInflater inflater;
//        List<Item> items, selected;
//
//        public class RecyclerViewHolder extends RecyclerView.ViewHolder {
//            TextView tv;
//            ImageView s_ok;
//            CheckBox checkbox;
//            RelativeLayout click;
//
//
//            public RecyclerViewHolder(View itemView) {
//                super(itemView);
//                tv = (TextView) itemView.findViewById(R.id.tv);
//                s_ok = (ImageView) itemView.findViewById(R.id.s_ok);
//                checkbox = (CheckBox) itemView.findViewById(R.id.checkbox);
//                click = (RelativeLayout) itemView.findViewById(R.id.click);
//
//            }
//        }
//
//        public ItemAdapter(Context context) {
//            this.context = context;
//            this.inflater = LayoutInflater.from(context);
//            this.selected = new ArrayList<>();
//            this.items = new ArrayList<>();
//        }
//
//        @Override
//        public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            View v = inflater.inflate(R.layout.selected_item, parent, false);
//
//            RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
//            return viewHolder;
//        }
//
//        @Override
//        public void onBindViewHolder(final RecyclerViewHolder holder, final int position) {
//            final Item item = items.get(position);
//            holder.tv.setText(item.getTitle());
//            holder.tv.setTag(holder);
//
//            if (Myprefrence.getStatus() == true) {
//
//
//                holder.checkbox.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//
//                        if (selected.contains(item)) {
//                            selected.remove(item);
//                            unhighlightView(holder);
//                        } else {
//                            selected.add(item);
//                            highlightView(holder);
//                        }
//                    }
//                });
//
//
//                holder.checkbox.setVisibility(View.VISIBLE);
//            }else {
//
//                holder.click.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                        Toast.makeText(context, ""+items.get(position).getTitle(), Toast.LENGTH_SHORT).show();
//                    }
//                });
//
//                holder.checkbox.setVisibility(View.GONE);
//
//
//            }
//
//
//
//
//            if (selected.contains(item))
//
//                highlightView(holder);
//
//            else
//                unhighlightView(holder);
//
//        }
//
//
//        private void highlightView(RecyclerViewHolder holder) {
//            holder.checkbox.setChecked(true);
//            holder.s_ok.setVisibility(View.VISIBLE);
////        holder.itemView.setBackgroundColor(ContextCompat.getColor(context, R.color.colorPrimary));
//        }
//
//        private void unhighlightView(RecyclerViewHolder holder) {
//            holder.checkbox.setChecked(false);
//            holder.s_ok.setVisibility(View.GONE);
//            holder.itemView.setBackgroundColor(ContextCompat.getColor(context, android.R.color.transparent));
//        }
//
//
//        @Override
//        public int getItemCount() {
//            return items.size();
//        }
//
//        public void addAll(List<Item> items) {
//            clearAll(false);
//            this.items = items;
//            notifyDataSetChanged();
//        }
//
//        public void clearAll(boolean isNotify) {
//            items.clear();
//            selected.clear();
//            if (isNotify) notifyDataSetChanged();
//        }
//
//        public void clearSelected() {
//            selected.clear();
//            notifyDataSetChanged();
//        }
//
//
//        public void selectAll() {
//            selected.clear();
//            selected.addAll(items);
//            notifyDataSetChanged();
//        }
//
//
//        public List<Item> getSelected() {
//
//            return selected;
//        }
//    }
//
//
//    JAVA ITEM
//    public class Item {
//        String title;
//
//        public Item(String title) {
//            this.title = title;
//        }
//
//        public String getTitle() {
//            return title;
//        }
//
//        public void setTitle(String title) {
//            this.title = title;
//        }
//    }
//
//
//    XML ITEM
//    <?xml version="1.0" encoding="utf-8"?>
//<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    android:layout_width="match_parent"
//    android:layout_height="60dp"
//    android:id="@+id/click"
//    android:background="#fff">
//
//
//    <CheckBox
//    android:id="@+id/checkbox"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_alignParentStart="true"
//    android:layout_centerInParent="true"
//    android:visibility="gone" />
//
//    <TextView
//    android:id="@+id/tv"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_centerInParent="true"
//    android:text="Title"
//    android:textColor="#000000"
//    android:textSize="16sp" />
//
//
//    <ImageView
//    android:id="@+id/s_ok"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_alignParentEnd="true"
//    android:layout_centerInParent="true"
//    android:src="@drawable/abc"
//    android:visibility="gone" />
//
//
//    <View
//    android:layout_width="match_parent"
//    android:layout_height="1dp"
//    android:background="#000"
//    android:layout_alignParentBottom="true"/>
//
//</RelativeLayout>
//
//
//
//    MAIN ACTIVITY JAVA
//
//
//    public class SelectedItemActivity extends AppCompatActivity {
//
//        Activity activity = SelectedItemActivity.this;
//        RecyclerView rv;
//        ItemAdapter adapter;
//        ImageView selected_item;
//        LinearLayout menu;
//        int clickcounts = 0;
//        List<Item> items = new ArrayList<>();
//        private SwipeRefreshLayout swipeContainer;
//
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_selected_item);
//
//
//            swipeContainer = (SwipeRefreshLayout) findViewById(R.id.swipeContainer);
//            rv = findViewById(R.id.rcView);
//
//
//            selected_item = findViewById(R.id.selected_item);
//            menu = findViewById(R.id.menu);
//            Myprefrence.setStatus(false);
//
//
//            swipeContainer.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
//                @Override
//                public void onRefresh() {
//                    selectitem();
//
//
//                }
//            });
//            selected_item.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    clickcounts = clickcounts + 1;
//
//
//                    if (clickcounts == 1) {
//
//                        Myprefrence.setStatus(true);
//                        menu.setVisibility(View.VISIBLE);
//                        selectitem();
//
//
//                    } else {
//                        adapter.clearSelected();
//
//                        menu.setVisibility(View.GONE);
//                        Myprefrence.setStatus(false);
//                        selectitem();
//
//
//                        clickcounts = 0;
//                    }
//                }
//            });
//
//            swipeContainer.setColorSchemeResources(android.R.color.holo_blue_bright,
//                    android.R.color.holo_green_light,
//                    android.R.color.holo_orange_light,
//                    android.R.color.holo_red_light);
//
//            selectitem();
//
//
//        }
//
//        private void selectitem() {
//
//
//            LinearLayoutManager lm = new LinearLayoutManager(this);
//            rv.setLayoutManager(lm);
//
//            adapter = new ItemAdapter(SelectedItemActivity.this);
//            rv.setAdapter(adapter);
//
//
//            items.clear();
//            items.add(new Item("Item 1"));
//            items.add(new Item("Item 2"));
//            items.add(new Item("Item 3"));
//            items.add(new Item("Item 4"));
//            items.add(new Item("Item 5"));
//            items.add(new Item("Item 6"));
//            items.add(new Item("Item 7"));
//            items.add(new Item("Item 8"));
//            items.add(new Item("Item 9"));
//            items.add(new Item("Item 10"));
//            items.add(new Item("Item 11"));
//            items.add(new Item("Item 12"));
//            items.add(new Item("Item 13"));
//            items.add(new Item("Item 14"));
//            items.add(new Item("Item 15"));
//            items.add(new Item("Item 16"));
//            items.add(new Item("Item 17"));
//            items.add(new Item("Item 18"));
//            items.add(new Item("Item 19"));
//            items.add(new Item("Item 20"));
//            items.add(new Item("Item 21"));
//            items.add(new Item("Item 22"));
//            items.add(new Item("Item 23"));
//            items.add(new Item("Item 24"));
//            items.add(new Item("Item 25"));
//            items.add(new Item("Item 26"));
//            items.add(new Item("Item 27"));
//            items.add(new Item("Item 28"));
//            items.add(new Item("Item 29"));
//            items.add(new Item("Item 30"));
//
//
//            adapter.addAll(items);
//
//
//
//            swipeContainer.setRefreshing(false);
//
//
//        }
//
//        public void selectAll(View v) {
//            adapter.selectAll();
//
//        }
//
//        public void deselectAll(View v) {
//            adapter.clearSelected();
//        }
//
//        public void doAction(View v) {
//
////        Toast.makeText(activity, String.format("Selected %d items", adapter.getSelected().size()), Toast.LENGTH_SHORT).show();
//            Toast.makeText(activity, String.format("Selected total item %d",adapter.getSelected().size()), Toast.LENGTH_SHORT).show();
//        }
//
//
//    }
//
//
//
//
//


}
