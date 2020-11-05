package com.lathiya.allinonecode.LibaryPicker;

public class FileandDocumentPicker {

//    File lava mate document
//
//
//    Installation
//    For your convenience, it is available on jCenter, So just add this in your app dependencies:
//    compile 'lib.kashif:folderpicker:2.4'
//
//
//    Usage
//    To pick folder
//    Just start FolderPicker activity from your app
//    Intent intent = new Intent(this, FolderPicker.class);
//    startActivityForResult(intent, FOLDERPICKER_CODE);
//    If the user selects folder/file, the name of folder/file will be returned to you on onActivityResult method with the variable name 'data'.
//
//    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
//        if (requestCode == FOLDERPICKER_CODE && resultCode == Activity.RESULT_OK) {
//
//            String folderLocation = intent.getExtras().getString("data");
//            Log.i( "folderLocation", folderLocation );
//
//        }
//    }
//
//
//
//
//
//
//
//    Options
//    Cusstomization options can be passed as extras to FolderPicker activity.
//            //To show a custom title
//            intent.putExtra("title", "Select file to upload");
//
//    //To begin from a selected folder instead of sd card's root folder. Example : Pictures directory
//       intent.putExtra("location", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
//
//    //To pick files
//       intent.putExtra("pickFiles", true);
//
//
//
//
//
//
//    Demo
//   btn_submit.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//
//
//            Intent intent = new Intent(HelloActivity.this, FolderPicker.class);
//            intent.putExtra("title", "Select file to upload");
//            startActivityForResult(intent, Integer.parseInt("1233"));
//            intent.putExtra("pickFiles", true);
//            intent.putExtra("location", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
//
//
//
//        }
//    });
//
//}
//
//    This is method ok result
//
//@Override
//protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
//        super.onActivityResult(requestCode, resultCode, intent);
//        if (requestCode == 1233) ;
//        if (requestCode == Activity.RESULT_OK) ;
//
//        String folderLocation = intent.getExtras().getString("data");
//        Log.i("folderLocation", folderLocation);
//
//
//        }
//        }
//

        }
