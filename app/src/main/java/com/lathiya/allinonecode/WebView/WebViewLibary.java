package com.lathiya.allinonecode.WebView;

public class WebViewLibary {

//    Using advancedwebview using library
//
//    Like this library
//    https://github.com/delight-im/Android-AdvancedWebView
//
//    dependency
//    allprojects {
//        repositories {
//            maven { url "https://jitpack.io" }
//        }
//    }
//
//    dependencies {
//        compile 'com.github.delight-im:Android-AdvancedWebView:v3.0.0'
//    }
//
//
//    Xml
//
//            <im.delight.android.webview.AdvancedWebView
//    android:id="@+id/webview"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent" />
//
//
//    java file
//    public class MyActivity extends Activity implements AdvancedWebView.Listener {
//
//        private AdvancedWebView mWebView;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_my);
//
//            mWebView = (AdvancedWebView) findViewById(R.id.webview);
//            mWebView.setListener(this, this);
//            mWebView.loadUrl("http://www.example.org/");
//
//            // ...
//        }
//
//        @SuppressLint("NewApi")
//        @Override
//        protected void onResume() {
//            super.onResume();
//            mWebView.onResume();
//            // ...
//        }
//
//        @SuppressLint("NewApi")
//        @Override
//        protected void onPause() {
//            mWebView.onPause();
//            // ...
//            super.onPause();
//        }
//
//        @Override
//        protected void onDestroy() {
//            mWebView.onDestroy();
//            // ...
//            super.onDestroy();
//        }
//
//        @Override
//        protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
//            super.onActivityResult(requestCode, resultCode, intent);
//            mWebView.onActivityResult(requestCode, resultCode, intent);
//            // ...
//        }
//
//        @Override
//        public void onBackPressed() {
//            if (!mWebView.onBackPressed()) { return; }
//            // ...
//            super.onBackPressed();
//        }
//
//        @Override
//        public void onPageStarted(String url, Bitmap favicon) { }
//
//        @Override
//        public void onPageFinished(String url) { }
//
//        @Override
//        public void onPageError(int errorCode, String description, String failingUrl) { }
//
//        @Override
//        public void onDownloadRequested(String url, String suggestedFilename, String mimeType, long contentLength, String contentDisposition, String userAgent) { }
//
//        @Override
//        public void onExternalPageRequest(String url) { }
//
//    }
//
//
//    Java ma fragment activity hoi to
//
//    public class MyFragment extends Fragment implements AdvancedWebView.Listener {
//
//        private AdvancedWebView mWebView;
//
//        public MyFragment() { }
//
//        @Override
//        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//            View rootView = inflater.inflate(R.layout.fragment_my, container, false);
//
//            mWebView = (AdvancedWebView) rootView.findViewById(R.id.webview);
//            mWebView.setListener(this, this);
//            mWebView.loadUrl("http://www.example.org/");
//
//            // ...
//
//            return rootView;
//        }
//
//        @SuppressLint("NewApi")
//        @Override
//        public void onResume() {
//            super.onResume();
//            mWebView.onResume();
//            // ...
//        }
//
//        @SuppressLint("NewApi")
//        @Override
//        public void onPause() {
//            mWebView.onPause();
//            // ...
//            super.onPause();
//        }
//
//        @Override
//        public void onDestroy() {
//            mWebView.onDestroy();
//            // ...
//            super.onDestroy();
//        }
//
//        @Override
//        public void onActivityResult(int requestCode, int resultCode, Intent intent) {
//            super.onActivityResult(requestCode, resultCode, intent);
//            mWebView.onActivityResult(requestCode, resultCode, intent);
//            // ...
//        }
//
//        @Override
//        public void onPageStarted(String url, Bitmap favicon) { }
//
//        @Override
//        public void onPageFinished(String url) { }
//
//        @Override
//        public void onPageError(int errorCode, String description, String failingUrl) { }
//
//        @Override
//        public void onDownloadRequested(String url, String suggestedFilename, String mimeType, long contentLength, String contentDisposition, String userAgent) { }
//
//        @Override
//        public void onExternalPageRequest(String url) { }
//
//    }
//
//
//
//    Ondowunload method ma edit krvu  doeunlod mate
//
//    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
//
//    request.setMimeType(mimeType);
//    //------------------------COOKIE!!------------------------
//    String cookies = CookieManager.getInstance().getCookie(url);
//    request.addRequestHeader("cookie", cookies);
//    //------------------------COOKIE!!------------------------
//    request.addRequestHeader("User-Agent", userAgent);
//    request.setDescription("Downloading file...");
//    request.setTitle(URLUtil.guessFileName(url, contentDisposition, mimeType));
//    request.allowScanningByMediaScanner();
//    request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(url, contentDisposition, mimeType));
//    DownloadManager dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
//    dm.enqueue(request);
//    Toast.makeText(getApplicationContext(), "Downloading File", Toast.LENGTH_LONG).show();
//}
//
//
//    Onpage erro ni method ma type krvu whatsapp and facebook social media mate
//
//        Log.d("TAG", "onDownloadStart: " +mWebView);
//
//
//        if (mWebView.getUrl().toString().contains("https://api.whatsapp.com/send")) {
//        Uri uri = Uri.parse(mWebView.getUrl().toString());
//        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
//        intent.setPackage("com.whatsapp");
//        startActivity(intent);
//        finish();
//        }
//
//

        }
