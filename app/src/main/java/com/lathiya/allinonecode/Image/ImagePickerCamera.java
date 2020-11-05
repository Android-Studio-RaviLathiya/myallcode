package com.lathiya.allinonecode.Image;

public class ImagePickerCamera {

//    XML typing
//<ImageView
//    android:id="@+id/pro"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent"
//    android:layout_marginTop="20dp"/>
//
//
//
//    Add this to your project's build.gradle
//
//    allprojects {
//        repositories {
//            maven { url "https://jitpack.io" }
//        }
//    }
//
//    And add this to your module's build.gradle
//
//    dependencies {
//        implementation 'com.github.maayyaannkk:ImagePicker:1.0.4'
//    }
//
//
//
//
//    Usage
//    For full example, please refer to app module
//            <uses-permission android:name="android.per mission.WRITE_EXTERNAL_STORAGE" />
//
//    No need to request for write external storage permission, library will do that.
//
//    Start image picker activity
//    The simplest way to start is setup options and start the activity
//
//    Niche nu bdhu picker button ma seton click kri ne copy kri devi
//
//    Intent intent = new Intent(this, ImageSelectActivity.class);
//intent.putExtra(ImageSelectActivity.FLAG_COMPRESS, false);//default is true
//intent.putExtra(ImageSelectActivity.FLAG_CAMERA, true);//default is true
//intent.putExtra(ImageSelectActivity.FLAG_GALLERY, true);//default is true
//    startActivityForResult(intent, 1213);
//
//    aa method che so hamesa bahar aave
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == 1213 && resultCode == Activity.RESULT_OK) {
//            String filePath = data.getStringExtra(ImageSelectActivity.RESULT_FILE_PATH);
//
//
//            Bitmap selectedImage = BitmapFactory.decodeFile(filePath);
//            imageView.setImageBitmap(selectedImage);
//        }
//    }
//
//    Application is not run
//    Mani fis add  this method    tools:replace="android:allowBackup,icon,theme,label"
//
//
//
//<application
//    android:allowBackup="true"
//    android:icon="@mipmap/ic_launcher"
//    android:label="@string/app_name"
//    android:roundIcon="@mipmap/ic_launcher_round"
//    android:supportsRtl="true"
//    tools:replace="android:allowBackup,icon,theme,label"
//    android:theme="@style/AppTheme">
//
//
//    CIRCULE MA IMG
//    compile 'de.hdodenhof:circleimageview:2.1.0'
//    XML CODE
//<de.hdodenhof.circleimageview.CircleImageView android:id="@+id/img_profile" android:layout_width="100dp" android:layout_height="100dp" android:layout_gravity="center_horizontal" android:src="@drawable/profile" app:civ_border_width="5dp" app:civ_border_color="#FFFFFF" android:layout_alignParentBottom="true" android:layout_centerHorizontal="true" />

}
