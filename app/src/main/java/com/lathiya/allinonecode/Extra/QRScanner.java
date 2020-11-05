package com.lathiya.allinonecode.Extra;

public class QRScanner {

//    Qr creat and scenner
//
//    /*QR Creat*/
//    implementation 'androidmads.library.qrgenearator:QRGenearator:1.0.3'
//    implementation 'com.google.zxing:core:3.3.2'
//
//
//<uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
//
//
//    Main Activity
//
//    <?xml version="1.0" encoding="utf-8"?>
//<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    xmlns:app="http://schemas.android.com/apk/res-auto"
//    xmlns:tools="http://schemas.android.com/tools"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent"
//    android:orientation="vertical"
//    tools:context=".MainActivity">
//
//    <EditText
//    android:id="@+id/first_name"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:hint="First Name"
//    android:inputType="text" />
//
//    <EditText
//    android:id="@+id/last_name"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:hint="Last Name" />
//
//    <EditText
//    android:id="@+id/email"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:hint="Email"
//    android:inputType="textEmailAddress" />
//
//    <EditText
//    android:id="@+id/phone_number"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:hint="Phone Number"
//    android:inputType="phone" />
//
//    <EditText
//    android:id="@+id/address"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:hint="address"
//    android:inputType="text" />
//
//    <Button
//    android:id="@+id/generate_qr_btn"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_gravity="center_horizontal"
//    android:layout_marginTop="10dp"
//    android:text="Generate QR Code" />
//
//    <ImageView
//    android:id="@+id/image_view"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_gravity="center_horizontal"
//    android:layout_marginTop="5dp"
//    android:visibility="gone" />
//
//</LinearLayout>
//
//
//
//    JAVA ACTIVITY
//
//
//    EditText first_name, last_name, email, phone_number, address;
//    Button generate_qr_btn;
//    ImageView image_view;
//    String name, semail, phonenumber, saddress;
//
//
//    first_name = findViewById(R.id.first_name);
//    last_name = findViewById(R.id.last_name);
//    email = findViewById(R.id.email);
//    phone_number = findViewById(R.id.phone_number);
//    address = findViewById(R.id.address);
//    generate_qr_btn = findViewById(R.id.generate_qr_btn);
//    image_view = findViewById(R.id.image_view);
//
//
// 
//        generate_qr_btn.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//            name = "Name: " + first_name.getText().toString() + " " + last_name.getText().toString();
//            semail = "Email: " + email.getText().toString();
//            phonenumber = "Phone: " + phone_number.getText().toString();
//            saddress = "Address: " + address.getText().toString();
//
//
//            StringBuilder textToSend = new StringBuilder();
//            textToSend.append(name + " \n " + semail + " \n " + phonenumber + " \n " + saddress);
//
//            String hi = "" + textToSend;
//
//            QRGEncoder qrgEncoder = new QRGEncoder(hi, null, QRGContents.Type.TEXT, 500);
//            try {
//
//                Bitmap bitmap = qrgEncoder.encodeAsBitmap();
//                // Setting Bitmap to ImageView
//                image_view.setImageBitmap(bitmap);
//
//                image_view.setVisibility(View.VISIBLE);
//
//            } catch (WriterException e) {
//                e.printStackTrace();
//
//
//            }
//
//        }
//    });
//
//
//
////QR SCNNER
//    implementation 'me.dm7.barcodescanner:zxing:1.9'
//    implementation 'com.google.android.gms:play-services-auth:18.1.0'
//
//<uses-permission android:name="android.permission.CAMERA"/>
//
//
//    MAIN ACTIVITY
//    public static  TextView text_s;
//    Button btn_scennr;
//
//    text_s = findViewById(R.id.text_s);
//    btn_scennr = findViewById(R.id.btn_scennr);
//
//
//
//btn_scennr.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//            startActivity(new Intent(MainActivity.this,ScennerActivity.class));
//
//        }
//    });
//
//
//    SNNER ACTIVITY
//    public class ScennerActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler {
//
//
//        ZXingScannerView scannerView;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_scenner);
//            scannerView = new ZXingScannerView(this);
//            setContentView(scannerView);
//        }
//
//
//        @Override
//        public void handleResult(Result result) {
//            MainActivity.text_s.setText(result.getText());
//            onBackPressed();
//        }
//
//
//        @Override
//        protected void onPause() {
//            super.onPause();
//
//            scannerView.stopCamera();
//        }
//
//        @Override
//        protected void onPostResume() {
//            super.onPostResume();
//
//            scannerView.setResultHandler(this);
//            scannerView.startCamera();
//        }
//    }
//

}
