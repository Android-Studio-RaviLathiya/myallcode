package com.lathiya.allinonecode.Image;

public class UplodingImageBitMap {

//    Photo uplod api
//
//    allprojects {
//        repositories {
//            maven { url "https://jitpack.io" }
//        }
//    }
//
//    dependencies {
//        implementation 'com.github.maayyaannkk:ImagePicker:1.0.4'
//    }
//<uses-permission android:name="android.per mission.WRITE_EXTERNAL_STORAGE" />
//
//
//    XML FILE CODE
//
//<de.hdodenhof.circleimageview.CircleImageView android:id="@+id/img_profile" android:layout_width="100dp" android:layout_height="100dp" android:layout_gravity="center_horizontal" android:src="@drawable/profile" app:civ_border_width="5dp" app:civ_border_color="#FFFFFF" android:layout_alignParentBottom="true" android:layout_centerHorizontal="true" />
//
//    JAVA CODE
//
//    BitmapFactory.Options options = new BitmapFactory.Options();
//    String imageString;
//    int PHOTO_CODE = 12321;
//
//
//
//
//            img_view.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//            Intent intent = new Intent(UpdateActiovity.this, ImageSelectActivity.class);
//            intent.putExtra(ImageSelectActivity.FLAG_COMPRESS, false);//default is true
//            intent.putExtra(ImageSelectActivity.FLAG_CAMERA, false);//default is true
//            intent.putExtra(ImageSelectActivity.FLAG_GALLERY, true);//default is true
//            startActivityForResult(intent, PHOTO_CODE);
//
//
//            //                Intent intent = new Intent();
//            //                intent.setType("image/*");
//            //                intent.setAction(Intent.ACTION_GET_CONTENT);
//            //                startActivityForResult(intent, PHOTO_CODE);
//
//
//            /*sd card permistin*/
//            //                ActivityCompat.requestPermissions(UpdateActiovity.this,
//            //                        new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},
//            //                        1);
//
//
//        }
//    });
//
//
//    OK RESUL CODE
//
//    /*OK RESULT PHOTO_CODE CAMERA */
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if (requestCode == PHOTO_CODE && resultCode == Activity.RESULT_OK) {
//
////            String filePath = data.getStringExtra(ImageSelectActivity.RESULT_FILE_PATH);
//
//
//            String filePath = data.getStringExtra(ImageSelectActivity.RESULT_FILE_PATH);
//
//            Uri uri = Uri.parse(filePath);
//
////            Uri selectedImageUri = data.getData();
//            img_view.setImageURI(uri);
//
//
//            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
//            Bitmap bm = BitmapFactory.decodeFile(file 	Path);
//            bm.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
//            byte[] imagebytes = byteArrayOutputStream.toByteArray();
//            imageString = Base64.encodeToString(imagebytes, Base64.DEFAULT);
//
//        }
//
//    }

}
