package com.lathiya.allinonecode.Ads;

public class GoogleAds {

//    Google ads
//
//    WEB SITE – Google admob
//
//    APPS > ADD APP(ADD YOUR APP )> COPY  ID
//
//    THIS COPY ID IS PEST
//    ADD MENIFICE
//<meta-data
//    android:name="com.google.android.gms.ads.APPLICATION_ID"
//    android:value="ca-app-pub-7528823107761126~3266963101" />
//
//    DEPENDENCY
//    implementation 'com.google.android.gms:play-services-ads:19.3.0'
//
//
//    BANNER ADS
//
//    XML CODE
//
//<com.google.android.gms.ads.AdView xmlns:ads="http://schemas.android.com/apk/res-auto"
//    android:id="@+id/adView"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:layout_alignParentBottom="true"
//    android:layout_centerHorizontal="true"
//    android:visibility="gone"
//    ads:adSize="BANNER"
//    ads:adUnitId="ca-app-pub-3940256099942544/6300978111">
//
//</com.google.android.gms.ads.AdView>
//
//
//    JAVA CODE
//
//    private AdView mAdView;
//    com.google.android.gms.ads.InterstitialAd mInterstitialAd;
//
//    ONCREAT METHOD
//
//    AdRequest adRequest = new AdRequest.Builder().build();
//mAdView.loadAd(adRequest);
//
//
//
//    VIDEO ADS
//
//implements RewardedVideoAdListener
//
//
//    RewardedVideoAd rewardedVideoAd;
//    Button Watchearncoin;
//    AlertDialog dialog;
//
//
//    ONCREAT METHOD
//    watchearncoin = findViewById(R.id.watchearncoin);
//
//watchearncoin.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//            if (rewardedVideoAd.isLoaded()) {
//                rewardedVideoAd.show();
//            }
//        }
//    });
//
//
//MobileAds.initialize(this, "ca-app-pub-3940256099942544/5224354917");
//    rewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
//rewardedVideoAd.setRewardedVideoAdListener(this);
//    loadRewardedVideoAd();
//
//
//    METHOD start
//
//
//    public void loadRewardedVideoAd() {
//        rewardedVideoAd.loadAd(("ca-app-pub-3940256099942544/5224354917"),
//                new AdRequest.Builder().build());
//    }
//
//    @Override
//    public void onRewardedVideoAdLoaded() {
//    }
//
//    @Override
//    public void onRewardedVideoAdOpened() {
//    }
//
//    @Override
//    public void onRewardedVideoStarted() {
//    }
//
//    @Override
//    public void onRewardedVideoAdClosed() {
//        loadRewardedVideoAd();
//        dialog.dismiss();
//    }
//
//    @Override
//    public void onRewarded(RewardItem rewardItem) {
//    }
//
//    @Override
//    public void onRewardedVideoAdLeftApplication() {
//    }
//
//    @Override
//    public void onRewardedVideoAdFailedToLoad(int i) {
//    }
//
//    @Override
//    public void onRewardedVideoCompleted() {
//    }
//
//    @Override
//    protected void onResume() {
//        rewardedVideoAd.resume(this);
//        super.onResume();
//    }
//
//    @Override
//    protected void onPause() {
//        rewardedVideoAd.pause(this);
//        super.onPause();
//    }
//
//    @Override
//    protected void onDestroy() {
//        rewardedVideoAd.destroy(this);
//        super.onDestroy();
//    }
//

}
