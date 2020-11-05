package com.lathiya.allinonecode.Ads;

public class VungleAds {

//    Vungle
//
//    VUNGLE APPS WEBSITE
//    https://vungle.com/
//
//    DEPENDENCY
//    PROJECY======
//    buildscript {
//        repositories {
//            jcenter()
//        }
//    }
//
//*BANNE MA ADD KARVA NO CODE*
//    APP=====
//    buildscript {
//        repositories {
//            jcenter()
//        }
//    }
//
//// Vungle SDK
//    implementation 'com.vungle:publisher-sdk-android:6.7.0'
//
//    implementation 'androidx.core:core:1.3.0'
//    implementation 'androidx.localbroadcastmanager:localbroadcastmanager:1.0.0'
//
//// When appcompat is being used, core and localbroadcastmanager are the dependencies
//// that is getting included
//// implementation 'androidx.appcompat:appcompat:1.1.0'
//
//// Recommended for SDK to be able to get Android Advertising ID
//    implementation 'com.google.android.gms:play-services-basement:17.3.0'
//    implementation 'com.google.android.gms:play-services-ads-identifier:17.0.0'
//
//
//    XML FILE CODE
//
//    /*vungle*/
//    VungleBanner vungleBanner;
//    LinearLayout vungle_banner_container;
//
//    ON CREAT ACTIVITY METHOD
//    vrugle = findViewById(R.id.vrugle);
//
//
//<Button
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:id="@+id/vrugle"
//    android:text="vungle_banner_container" />
//
//<LinearLayout
//    android:id="@+id/vungle_banner_container"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:layout_alignParentBottom="true"
//    android:orientation="vertical"
//    android:visibility="visible" />
//
//    JAVA FILE CODE
//Vungle.init("5f2b95b39a3a9c000116118d", getApplicationContext(), new InitCallback() {
//        @Override
//        public void onSuccess() {
//            Toast.makeText(AdsScreen.this, "Vungle SDK initialized successfully", Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        public void onError(VungleException exception) {
//            Toast.makeText(AdsScreen.this, exception.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
//        }
//
//        @Override
//        public void onAutoCacheAdAvailable(String placementId) {
//
//        }
//    });
//        vrugle.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//
//            Banners.loadBanner("BANNER-7645461", AdConfig.AdSize.BANNER, new LoadAdCallback() {
//                @Override
//                public void onAdLoad(String id) {
//                    if (Banners.canPlayAd("BANNER-7645461", AdConfig.AdSize.BANNER)) {
//
//                        vungleBanner = Banners.getBanner("BANNER-7645461", AdConfig.AdSize.BANNER, null);
//                        vungle_banner_container.removeAllViews();
//                        vungle_banner_container.addView(vungleBanner);
//
//                        Toast.makeText(AdsScreen.this, "Vrung", Toast.LENGTH_SHORT).show();
//                    }
//                }
//
//                @Override
//                public void onError(String id, VungleException exception) {
////                Toast.makeText(AdsScreen.this, exception.toString(), Toast.LENGTH_SHORT).show();
////                Log.e("ads", "" + exception.toString());
//                }
//            });
//
//        }
//    });
//

}
