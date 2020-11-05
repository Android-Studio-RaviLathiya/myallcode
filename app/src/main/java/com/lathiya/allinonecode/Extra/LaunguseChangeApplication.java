package com.lathiya.allinonecode.Extra;

public class LaunguseChangeApplication {

//    package com.residency.myresidency;
//
//import androidx.appcompat.app.ActionBar;
//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.app.Activity;
//import android.content.DialogInterface;
//import android.content.SharedPreferences;
//import android.content.res.Configuration;
//import android.os.Bundle;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import java.util.Locale;
//
//    public class MainActivity extends AppCompatActivity {
//
//        Button btn;
//        String lang;
//        TextView name;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
////         lang = MyPrefrence.getLanguage();
//            Toast.makeText(this, "onCreate  "+lang, Toast.LENGTH_SHORT).show();
//            loadLocal();
//            btn = findViewById(R.id.btn);
//            name = findViewById(R.id.name);
////        setLocate(lang);
//
//
////        ActionBar actionBar = getSupportActionBar();
////        actionBar.setTitle(getResources().getString(R.string.app_name));
//
//            btn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//
//                    showchangelaunguse();
//                }
//            });
//        }
//
//        private void showchangelaunguse() {
//
//            final String[] listItems = {"English", "हिंदी", "ગુજરતી"};
//
//            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//            builder.setTitle("Choose Language...");
//            builder.setSingleChoiceItems(listItems, -1, new DialogInterface.OnClickListener() {
//                @Override
//                public void onClick(DialogInterface dialog, int i) {
//
//
//                    if (i == 0) {
//                        setLocate("en");
//                        recreate();
//                    } else if (i == 1) {
//                        setLocate("hi");
//                        recreate();
//                    } else if (i == 2) {
//                        setLocate("gu");
//                        recreate();
//                    }
//                    dialog.dismiss();
//                }
//            });
//
//            AlertDialog alertDialog = builder.create();
//            alertDialog.show();
//
//        }
//
//        private void setLocate(String lang) {
//
//            Toast.makeText(this, "FU"+lang, Toast.LENGTH_SHORT).show();
//
//            Locale locale = new Locale(lang);
//            Locale.setDefault(locale);
//            Configuration conf = new Configuration();
//            conf.locale = locale;
//            getBaseContext().getResources().updateConfiguration(conf, getBaseContext().getResources().getDisplayMetrics());
//            Toast.makeText(this, "NAME "+name, Toast.LENGTH_SHORT).show();
//
//
////        MyPrefrence.setLanguage(lang);
//            SharedPreferences.Editor editor = getSharedPreferences("Settings", MODE_PRIVATE).edit();
//            editor.putString("My_Lang", lang);
//            editor.apply();
//
//
//
//        }
//
//        public void loadLocal() {
//
//            SharedPreferences prefs = getSharedPreferences("Settings", Activity.MODE_PRIVATE);
//            String language = prefs.getString("My_Lang", "");
//            setLocate(language);
//
//        }
//    }
//


}
