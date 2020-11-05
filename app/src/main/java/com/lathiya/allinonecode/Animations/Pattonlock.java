package com.lathiya.allinonecode.Animations;

public class Pattonlock {


//    Pattone Lock
//    Website - https://github.com/aritraroy/PatternLockView
//    Step 1
//    implementation'com.andrognito.patternlockview:patternlockview:1.0.0'
//
//    step 2
//    XML File Typing
//
//    <?xml version="1.0" encoding="utf-8"?>
//<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent"
//    android:orientation="vertical"
//    android:background="#1B1515">
//
//
//    <DigitalClock
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:layout_marginTop="30dp"
//    android:gravity="center"
//    android:textSize="50dp"
//    android:textColor="#fff"/>
//
//
//    <TextView
//    android:id="@+id/text"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:gravity="center"
//    android:layout_gravity="center"
//    android:layout_marginTop="30dp"
//    android:text="Welcome "
//    android:textColor="#FFFFFF"
//    android:textSize="30dp" />
//
//    <com.andrognito.patternlockview.PatternLockView
//    android:id="@+id/pattern_lock_view"
//    android:layout_gravity="center"
//    android:layout_marginTop="40dp"
//    android:layout_width="350dp"
//    android:layout_height="400dp"/>
//</LinearLayout>
//
//
//
//    Step 3
//    JAVA File Typing
//
//package com.example.btnanimation;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.Toast;
//
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.andrognito.patternlockview.PatternLockView;
//import com.andrognito.patternlockview.listener.PatternLockViewListener;
//import com.andrognito.patternlockview.utils.PatternLockUtils;
//
//import java.util.List;
//
//    public class Digital extends AppCompatActivity implements PatternLockViewListener {
//
//        PatternLockView patternLockView;
//
//        @Override
//        protected void onCreate(@Nullable Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.digital);
//            patternLockView = findViewById(R.id.pattern_lock_view);
//            patternLockView.addPatternLockListener(this);
//        }
//
//        @Override
//        public void onStarted() {
//
//        }
//
//        @Override
//        public void onProgress(List<PatternLockView.Dot> progressPattern) {
//
//        }
//
//        @Override
//        public void onComplete(List<PatternLockView.Dot> pattern) {
//
//
//            if (PatternLockUtils.patternToString(patternLockView, pattern).equalsIgnoreCase("0123")) {
//                patternLockView.setViewMode(PatternLockView.PatternViewMode.CORRECT);
//                Toast.makeText(this, "Pattone correct", Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(Digital.this,MainActivity.class));
//
//            } else {
//                patternLockView.setViewMode(PatternLockView.PatternViewMode.WRONG);
//                Toast.makeText(this, "Pattone not correct", Toast.LENGTH_SHORT).show();
//
//
//            }
//
//        }
//
//        @Override
//        public void onCleared() {
//
//
//        }
//    }
//
//


}
