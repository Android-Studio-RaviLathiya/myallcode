package com.lathiya.allinonecode.Extra;

public class ListView {

//    List view and add btn
//    XML FILE
//    <?xml version="1.0" encoding="utf-8"?>
//<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    xmlns:app="http://schemas.android.com/apk/res-auto"
//    xmlns:tools="http://schemas.android.com/tools"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent"
//    tools:context=".MainActivity"
//    android:orientation="vertical">
//
//    <RelativeLayout
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:orientation="horizontal">
//
//        <TextView
//    android:id="@+id/day"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_alignParentEnd="true"
//    android:layout_marginRight="05dp"
//    android:text="Hello World!"
//    android:textSize="20dp"/>
//
//        <DigitalClock
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_marginLeft="05dp"
//    android:textSize="20dp"/>
//    </RelativeLayout>
//
//    <EditText
//    android:id="@+id/edittext"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content" />
//
//    <Button
//    android:id="@+id/btn"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_gravity="center"
//    android:text="ADD" />
//
//    <ListView
//    android:id="@+id/lv"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content" />
//
//
//</LinearLayout>
//
//
//    CATE_ACTIVITY FILE WITH XML
//    <?xml version="1.0" encoding="utf-8"?>
//<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:orientation="vertical">
//
//    <TextView
//    android:id="@+id/tv"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:text="qwertrfg"
//    android:textSize="25dp"
//    android:textStyle="bold"/>
//
//    <ImageView
//    android:id="@+id/delet"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_alignParentRight="true"
//    android:src="@drawable/ic_delete_forever_black_24dp"
//    android:padding="10dp"
//    android:text="dalet" />
//</RelativeLayout>
//
//    CATEADEPTER JAVA
//package com.example.mynotebook;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//
//    public class CateAdepter extends BaseAdapter {
//
//        ArrayList<CateItem> cateItems;
//        Context context;
//        LayoutInflater layoutInflater;
//
//        public CateAdepter(ArrayList<CateItem> cateItems, Context context) {
//            this.cateItems = cateItems;
//            this.context = context;
//            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        }
//
//        @Override
//        public int getCount() {
//            return cateItems.size();
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return position;
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            View view = layoutInflater.inflate(R.layout.cate_item, parent, false);
//
//            TextView tv = view.findViewById(R.id.tv);
//            ImageView delet = view.findViewById(R.id.delet);
//            tv.setText(cateItems.get(position).getName());
//
//            delet.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                }
//            });
//
//            return view;
//        }
//    }
//
//
//    CATEITEM JAVA FILE
//
//package com.example.mynotebook;
//
//    public class CateItem {
//
//
//        public  String id,name;
//
//        public String getId() {
//            return id;
//        }
//
//        public void setId(String id) {
//            this.id = id;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public CateItem(String id, String name) {
//            this.id = id;
//            this.name = name;
//        }
//    }
//
//
//
//    MAIN ACTIVITY JAVA FILE
//
//package com.example.mynotebook;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.ListView;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//
//    public class MainActivity extends AppCompatActivity {
//
//        TextView day;
//        ListView lv;
//        Button btn;
//        EditText edittext;
//        String ed;
//        SQLiteDatabase db;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//
//            day = findViewById(R.id.day);
//            lv = findViewById(R.id.lv);
//            btn = findViewById(R.id.btn);
//            edittext = findViewById(R.id.edittext);
//
//            db = openOrCreateDatabase("note.db", MODE_PRIVATE, null);
//            db.execSQL("create table if not exists user(id integer primary key autoincrement,name text)");
//
//            String currentDateTimeString = java.text.DateFormat.getDateInstance(DateFormat.FULL).format(new Date());
//            day.setText(currentDateTimeString);
//
//            btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    ed = edittext.getText().toString();
//
//                    if (!ed.equals("")) {
//                        db.execSQL("insert into user(name) values('" + ed + "')");
//
//                        mydata();
//
//                    } else {
//                        Toast.makeText(MainActivity.this, "Add Note", Toast.LENGTH_SHORT).show();
//                    }
//
//
//                }
//
//
//            });
//
//        }
//
//        ArrayList<CateItem> cateItems = new ArrayList<>();
//
//        private void mydata() {
//            cateItems.clear();
//            Cursor c = db.rawQuery("select * from user", null);
//
//            if (c != null) {
//                while (c.moveToNext()) {
//
//                    CateItem cateItem = new CateItem(c.getString(0), c.getString(1));
//                    cateItems.add(cateItem);
//                }
//                CateAdepter cateAdepter = new CateAdepter(cateItems, this);
//                lv.setAdapter(cateAdepter);
//            }
//        }
//    }
//

}
