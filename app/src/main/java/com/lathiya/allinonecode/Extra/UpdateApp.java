package com.lathiya.allinonecode.Extra;

public class UpdateApp {

//    Update App Dailog
//
//            LINK = https://developer.android.com/guide/playcore/in-app-updates
//    YOUTUBE = https://www.youtube.com/watch?v=jErHVk6x2jY
//
//    /*Update app dialog show*/
//    implementation'com.google.android.play:core:1.8.0'
//
//    private int REQUESRCODE = 1300;
//
//
//
//    /*UPDATE DIALOG OPEN*/
//    AppUpdateManager appUpdateManager = AppUpdateManagerFactory.create(MainActivity.this);
//    com.google.android.play.core.tasks.Task<AppUpdateInfo> appUpdateInfoTask = appUpdateManager.getAppUpdateInfo();
//appUpdateInfoTask.addOnSuccessListener(new OnSuccessListener<AppUpdateInfo>() {
//        @Override
//        public void onSuccess(AppUpdateInfo result) {
//
//            if (result.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE
//                    && result.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE)){
//                try {
//                    appUpdateManager.startUpdateFlowForResult(result,AppUpdateType.IMMEDIATE,MainActivity.this,REQUESRCODE);
//                } catch (IntentSender.SendIntentException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        }
//    });
//
//
//    /*ok result*/
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//
//        if (requestCode == REQUESRCODE){
//
//            Toast.makeText(this, "Start Dowunload", Toast.LENGTH_SHORT).show();
//
//            if (resultCode != RESULT_OK){
//                Log.e("Update",""+REQUESRCODE);
//            }
//        }
//
//
//
//    }
//

}
