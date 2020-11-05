package com.lathiya.allinonecode.Extra;

public class Dowuload {

//    package best.hd.tamilsong.tamilvideosong;
//
//import android.app.DownloadManager;
//import android.content.Context;
//import android.content.Intent;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.graphics.Color;
//import android.net.Uri;
//import android.os.Build;
//import android.os.Bundle;
//import android.os.Environment;
//import android.os.Handler;
//import android.os.StrictMode;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.LinearLayout;
//import android.widget.ProgressBar;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.Nullable;
//import androidx.annotation.RequiresApi;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.app.ActivityCompat;
//import androidx.core.content.ContextCompat;
//import androidx.core.content.FileProvider;
//
//import com.devbrackets.android.exomedia.listener.OnPreparedListener;
//import com.devbrackets.android.exomedia.ui.widget.VideoView;
//import com.downloader.Error;
//import com.downloader.OnCancelListener;
//import com.downloader.OnDownloadListener;
//import com.downloader.OnPauseListener;
//import com.downloader.OnProgressListener;
//import com.downloader.OnStartOrResumeListener;
//import com.downloader.PRDownloader;
//import com.downloader.Progress;
//import com.facebook.ads.InterstitialAd;
//import com.startapp.sdk.adsbase.StartAppAd;
//
//import java.io.File;
//import java.util.Locale;
//import java.util.Random;
//
//import best.hd.tamilsong.tamilvideosong.Utils.PreferenceManager;
//
//    public class VideoPlayActivity extends AppCompatActivity {
//
//        Button down, share;
//        TextView textViewProgressOne;
//        ProgressBar progressBarOne;
//        LinearLayout ll;
//
//        private VideoView videoView;
//        private InterstitialAd interstitialAd;
//
//        public static String getProgressDisplayLine(long currentBytes, long totalBytes) {
//            return getBytesToMBString(currentBytes) + "/" + getBytesToMBString(totalBytes);
//        }
//
//        private static String getBytesToMBString(long bytes) {
//            return String.format(Locale.ENGLISH, "%.2fMb", bytes / (1024.00 * 1024.00));
//        }
//
//        @Override
//        protected void onCreate(@Nullable Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.song_play_activity);
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//            setupVideoView();
//            down = findViewById(R.id.down);
//            share = findViewById(R.id.share);
//            ll = findViewById(R.id.ll);
//            setfbInter();
//
//            if (!(ContextCompat.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0 || ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.WRITE_EXTERNAL_STORAGE"))) {
//                ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 0);
//            }
//
//            textViewProgressOne = findViewById(R.id.textViewProgressOne);
//            progressBarOne = findViewById(R.id.progressBarOne);
//
//            down.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//
//                    Download(PreferenceManager.Getydlink(), "d");
//                }
//            });
//            share.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//
//                    Download(PreferenceManager.Getydlink(), "s");
//                }
//            });
//
//            Log.d("tikvideo", "onCreate: " + PreferenceManager.Getydlink());
//        }
//
//        private void setupVideoView() {
//            // Make sure to use the correct VideoView import
//            videoView = findViewById(R.id.video_view);
//            videoView.setOnPreparedListener(new OnPreparedListener() {
//                @Override
//                public void onPrepared() {
//                    videoView.start();
//                    showAdWithDelay();
//                }
//
//
//            });
//
//
//            //For now we just picked an arbitrary item to play
//            videoView.setVideoURI(Uri.parse(PreferenceManager.Getydlink()));
//        }
//
//        public void Download(String url, final String type) {
//
//            StrictMode.ThreadPolicy policy =
//                    new StrictMode.ThreadPolicy.Builder().permitAll().build();
//            StrictMode.setThreadPolicy(policy);
//
//
//            ll.setVisibility(View.VISIBLE);
//            Toast.makeText(this, "Download Start.....", Toast.LENGTH_SHORT).show();
//
//            progressBarOne.setIndeterminate(true);
//            progressBarOne.getIndeterminateDrawable().setColorFilter(
//                    Color.BLUE, android.graphics.PorterDuff.Mode.SRC_IN);
//
//
//            final File myDirectory = new File(Environment.getExternalStorageDirectory(), getApplicationContext().getString(R.string.app_name));
//
//            if (!myDirectory.exists()) {
//                myDirectory.mkdirs();
//            }
//
//            File file = new File(url);
//            final String strFileName = System.currentTimeMillis() + ".mp4";
//
//            int downloadId = PRDownloader.download(url, myDirectory.getAbsolutePath(), strFileName)
//                    .build()
//                    .setOnStartOrResumeListener(new OnStartOrResumeListener() {
//                        @Override
//                        public void onStartOrResume() {
//                            progressBarOne.setIndeterminate(false);
//                        }
//                    })
//                    .setOnPauseListener(new OnPauseListener() {
//                        @Override
//                        public void onPause() {
//
//                        }
//                    })
//                    .setOnCancelListener(new OnCancelListener() {
//                        @Override
//                        public void onCancel() {
//
//                            progressBarOne.setProgress(0);
//                            textViewProgressOne.setText("");
//                            progressBarOne.setIndeterminate(false);
//
//                        }
//                    })
//                    .setOnProgressListener(new OnProgressListener() {
//                        @Override
//                        public void onProgress(Progress progress) {
//                            long progressPercent = progress.currentBytes * 100 / progress.totalBytes;
//                            progressBarOne.setProgress((int) progressPercent);
//                            textViewProgressOne.setText(getProgressDisplayLine(progress.currentBytes, progress.totalBytes));
//                            progressBarOne.setIndeterminate(false);
//
//                        }
//                    })
//                    .start(new OnDownloadListener() {
//
//                        @RequiresApi(api = Build.VERSION_CODES.Q)
//                        @Override
//                        public void onDownloadComplete() {
//
//
//                            String path = myDirectory.getAbsolutePath() + "/" + strFileName;
//                            File file1 = new File(path);
//
//                            String filePath = file1.getPath();
//                            Bitmap bitmap = BitmapFactory.decodeFile(filePath);
//
//                            if (type.equals("d")) {
//                                Toast.makeText(getApplicationContext(), "Download Folder " + getString(R.string.app_name), Toast.LENGTH_SHORT).show();
//
//
//                                return;
//
//                            }
//                            if (type.equals("s")) {
//                                Toast.makeText(getApplicationContext(), "Download Folder " + getString(R.string.app_name), Toast.LENGTH_SHORT).show();
//                                Intent shareIntent = new Intent();
//                                shareIntent.setAction(Intent.ACTION_SEND);
//                                shareIntent.setType("video/mp4");
////        Uri uriShare = Uri.fromFile(new File(downUrl));
//                                Uri uriShare = FileProvider.getUriForFile(VideoPlayActivity.this, BuildConfig.APPLICATION_ID + ".provider", new File(path));
//                                //outfile is the path of the image stored in the gallery
//                                shareIntent.putExtra(Intent.EXTRA_STREAM, uriShare);
//                                startActivity(Intent.createChooser(shareIntent, ""));
//                                return;
//
//                            }
//
//
////                        Toast.makeText(getApplicationContext(), "Wallpaper Set", Toast.LENGTH_SHORT).show();
//                            Log.d("my", myDirectory + strFileName);
//                        }
//
//
//                        @Override
//                        public void onError(Error error) {
//                            ll.setVisibility(View.GONE);
//                            textViewProgressOne.setText("");
//                            progressBarOne.setProgress(0);
//                            progressBarOne.setIndeterminate(false);
//                            Toast.makeText(getApplicationContext(), "error", Toast.LENGTH_SHORT).show();
//
//                            downManager(PreferenceManager.Getydlink());
//                        }
//                    });
//        }
//
//        private void downManager(String durl) {
//            final String strFileName = System.currentTimeMillis() + ".mp4";
//
//            final File myDirectory = new File(Environment.getExternalStorageDirectory(), getApplicationContext().getString(R.string.app_name));
//
//            if (!myDirectory.exists()) {
//                myDirectory.mkdirs();
//            }
//            Uri source = Uri.parse(durl);
//            // Make a new request pointing to the .apk url
//            DownloadManager.Request request = new DownloadManager.Request(source);
//            // appears the same in Notification bar while downloading
//            request.setDescription("Download Start......");
//            request.setTitle(strFileName);
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
//                request.allowScanningByMediaScanner();
//                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//            }
//            // save the file in the "Downloads" folder of SDCARD
//            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, strFileName);
//            // get download service and enqueue file
//            DownloadManager manager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
//            manager.enqueue(request);
//        }
//
//        private void showAdWithDelay() {
//
//            String[] list = {"g", "f", "s"};
//            Random r = new Random();
//
//            final String adtype = list[r.nextInt(list.length)];
//
//            Log.d("adtype", "showAdWithDelay: " + adtype);
//            Log.d("adtype", "showAdWithDelay: " + PreferenceManager.GetAdditional());
//
//            if (PreferenceManager.GetAdditional().equalsIgnoreCase("1")) {
//
//                new Handler().postDelayed(new Runnable() {
//                    public void run() {
//                        // Check if interstitialAd has been loaded successfully
//
//                        if (adtype.equalsIgnoreCase("g")) {
//                            googleadsshow();
//                        }
//                        if (adtype.equalsIgnoreCase("f")) {
//                            if (interstitialAd == null || !interstitialAd.isAdLoaded()) {
//                                StartAppAd.showAd(getApplicationContext());
//                                return;
//                            }
//                            // Check if ad is already expired or invalidated, and do not show ad if that is the case. You will not get paid to show an invalidated ad.
//                            if (interstitialAd.isAdInvalidated()) {
//                                StartAppAd.showAd(getApplicationContext());
//                                return;
//                            }
//                            // Show the ad
//                            interstitialAd.show();
//                        }
//                        if (adtype.equalsIgnoreCase("s")) {
//                            StartAppAd.showAd(getApplicationContext());
//                        }
//
//
//                    }
//                }, 200); // Show the ad after 15 minutes
//
//
//                return;
//            }
//
//            if (!PreferenceManager.setLoadAds(this)) {
//                return;
//            }
//            new Handler().postDelayed(new Runnable() {
//                public void run() {
//                    // Check if interstitialAd has been loaded successfully
//                    if (adtype.equalsIgnoreCase("g")) {
//                        googleadsshow();
//                    }
//                    if (adtype.equalsIgnoreCase("f")) {
//                        if (interstitialAd == null || !interstitialAd.isAdLoaded()) {
//                            StartAppAd.showAd(getApplicationContext());
//                            return;
//                        }
//                        // Check if ad is already expired or invalidated, and do not show ad if that is the case. You will not get paid to show an invalidated ad.
//                        if (interstitialAd.isAdInvalidated()) {
//                            StartAppAd.showAd(getApplicationContext());
//                            return;
//                        }
//                        // Show the ad
//                        interstitialAd.show();
//                    }
//                    if (adtype.equalsIgnoreCase("s")) {
//                        StartAppAd.showAd(getApplicationContext());
//                    }
//
//                }
//            }, 200); // Show the ad after 15 minutes
//        }
//
//        public void googleadsinti() {
////        com.google.android.gms.ads.InterstitialAd mInterstitialAd;
//
//        }
//
//        public void googleadsshow() {
//
//            StartAppAd.showAd(getApplicationContext());
//
//        }
//
//        private void setfbInter() {
//            interstitialAd = new InterstitialAd(this, getString(R.string.interstitial_placement));
//            // load the ad
//            interstitialAd.loadAd();
//
//            googleadsinti();
//        }
//    }

}
