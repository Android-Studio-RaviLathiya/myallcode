package com.lathiya.allinonecode.Extra;

public class TwoPressBack {

//    Two time paress and back button
//
//
//    boolean staus = false;
//
//    @Override
//    public void onBackPressed() {
//        if (staus) {
//            super.onBackPressed();
//        } else {
//            Toast.makeText(this, "Again back", Toast.LENGTH_SHORT).show();
//            staus = true;
//        }
//
//    }
//
//
//    ALL ACTIVITY FINISH AND LEVE TO APP
//ActivityCompat.finishAffinity(MainActivity.this);
//
//
//
//    EXTRA DIALOG
//    Snackbar snackbar = Snackbar.make(findViewById(android.R.id.content), "Please press again to exit", Snackbar.LENGTH_LONG);
//snackbar.show();
//    staus = true;
//
//
//
//    DIALOG ONBACKPRESS
//
//    @Override
//    public void onBackPressed() {
//        new AlertDialog.Builder(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Exit")
//                .setMessage("Are you sure?")
//                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                        Intent intent = new Intent(Intent.ACTION_MAIN);
//                        intent.addCategory(Intent.CATEGORY_HOME);
//                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                        startActivity(intent);
//                        finish();
//                    }
//                }).setNegativeButton("no", null).show();
//    }
//

}
