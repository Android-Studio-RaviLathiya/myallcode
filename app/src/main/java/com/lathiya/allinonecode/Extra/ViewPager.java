package com.lathiya.allinonecode.Extra;

public class ViewPager {

//    View pager
//    View pager banava mate pela 5 file banava ni
//2 file  xml & 3 file java
//    Xml item and Activity file & jama item Adepter and Activity file
//
//    View pager ma 2 type ni library uses thay che Glide and ek Gson
//    Glide library ae net pr thin photo lava mate thay che
//
//    repositories {
//        mavenCentral()
//        google()
//    }
//    implementation 'com.github.bumptech.glide:glide:4.11.0'
//
//    Gsone library myprefrence ma arrylist ne stor krava mate thay che
//    implementation 'com.google.code.gson:gson:2.8.6'
//
//
//    upper ni library add kri ne uses krvu
//
//
//1 file xml in Activity (sudhara vadhara krva hoi to Activity file ma krva)
//
//<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:orientation="vertical">
//
//    <androidx.viewpager.widget.ViewPager
//    android:id="@+id/vp"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent" />
//
//</RelativeLayout>
//
//            2 file item file in xml
//
//<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent">
//
//    <ImageView
//    android:id="@+id/iv"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent" />
//
//</RelativeLayout>
//
//
//            3 file item file in java
//
//    public String id;
//    public String path;
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getPath() {
//        return path;
//    }
//
//    public void setPath(String path) {
//        this.path = path;
//    }
//
//    public ListItem(String id, String path) {
//        this.id = id;
//        this.path = path;
//    }
//}
//
//
//4 file Adepter file in Java
//public class ViewpagerAdepter extends PagerAdapter {
//
//    context context;
//    ArrayList<ListItem> listItems;
//    ImageView iv;
//
//    public ViewpagerAdepter(Context context, ArrayList<ListItem> listItems) {
//        this.context = context;
//        this.listItems = listItems;
//    }
//
//
//
//    @Override
//    public int getCount() {
//        return listItems.size();
//    }
//
//    @Override
//    public void destroyItem(ViewGroup collection, int position, Object view) {
//        collection.removeView((View) view);
//    }
//
//    @Override
//    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
//        return view == object;
//    }
//
//    @NonNull
//    @Override
//    public Object instantiateItem(@NonNull ViewGroup collection, int position) {
//        LayoutInflater inflater = LayoutInflater.from(context);
//        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.viewpager_item, collection, false);
//        collection.addView(layout);
//        final String album = listItems.get(position).getPath();
//
//        iv = layout.findViewById(R.id.iv);
//
//        Glide.with(context).load(album).into(iv);
//
//        return layout;
//    }
//}
//
//
//5 file Activity file in java
//
//        ViewPager vp;
//        int data;
//        ArrayList<ListItem> listItems = new ArrayList<>();
//
//@Override
//protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.viewpage_activity);
//        vp = findViewById(R.id.vp);
//
//        Bundle bundle = getIntent().getExtras();
//
//        if (bundle != null) {
//
//        data = bundle.getInt("pos");
//
//        }
//
//
//        ViewpagerAdepter viewpagerAdepter = new ViewpagerAdepter(ViewpagerActivity.this, MyPrefrence.getlist());
//        vp.setAdapter(viewpagerAdepter);
//        vp.setCurrentItem(data);
//        }
//        }
//
//        View pager banava mate recycle View na adepter ma pn sudhara krva pde means k path tiya thin start thay che so adeptem sudharva krva mate and inten no cord pn uses thay che    regular adepter changes
//
//        Glide name ni libry che ae uses krvii ae photo net pn lava ma help kre
//
//
//        Glide.with(context).load(list.get(position).getPath()).into(holder.img);
//        holder.img.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View v) {
//
//        Intent intent = new Intent(context, ViewpagerActivity.class);
////                intent.putExtra("data", list.get(position).getPath());
//        MyPrefrence.setlist(list);
//        intent.putExtra("pos",position);
//        context.startActivity(intent);
//
//        }
//        });
//
//
//
//        My manifests class ni andr permis aapvi net and class ni
//
//        <uses-permission android:name="android.permission.INTERNET"/>
//
//        android:name=".MyPrefrence"
//
//
//
//        MYPREFRENCE ni andr arrlist add krva nu
//
//public class MyPefrence extends Application {
//
//    public static SharedPreferences sharedPreferences;
//    public static SharedPreferences.Editor editor;
//
//    @Override
//    public void onCreate() {
//        super.onCreate();
//        sharedPreferences = getSharedPreferences("my", MODE_PRIVATE);
//        editor = sharedPreferences.edit();
//    }
//
//
//    public static void setlist(ArrayList<ListItem> listItems) {
//        Gson gson = new Gson();
//        String data = gson.toJson(listItems);
//        editor.putString("list", data).commit();
//    }
//
//    public static ArrayList<ListItem> getlist() {
//        Gson gson = new Gson();
//        String data = sharedPreferences.getString("list", null);
//        ArrayList<ListItem> list = gson.fromJson(data,  new TypeToken<List<ListItem>>() {
//        }.getType());
//        return list;
//    }
//
//
//}
//
//
//
//    View pager animation krvu hoi to search view pager animation

}
