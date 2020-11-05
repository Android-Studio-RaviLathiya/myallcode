package com.lathiya.allinonecode.Extra;

public class MusicAndSoud {

//    Sound
//    Res > right click > new > folder > raw (create raw folder)
//    Pest music
//    JAVA ACTIVITY
//    MediaPlayer timefinish;
//
//    timefinish = MediaPlayer.create(this, R.raw.coin);
//
//timefinish.stop();
//        timefinish.start();
//
//
//
//    BACKGROUNG MUSIC ON AND OFF
//    JAVA CLASS ADD
//
//    public class SoundService extends Service {
//        MediaPlayer player;
//
//        @Override
//        public IBinder onBind(Intent intent) {
//            return null;
//        }
//
//        public void onCreate() {
//            player = MediaPlayer.create(this, R.raw.backmusic); //select music file
//            player.setLooping(true); //set looping
//        }
//
//        public int onStartCommand(Intent intent, int flags, int startId) {
//            player.start();
//            return Service.START_NOT_STICKY;
//        }
//
//        public void onDestroy() {
//            player.stop();
//            player.release();
//            stopSelf();
//            super.onDestroy();
//        }
//
//    }
//
//    MANIFIST
//            service
//    android:name=".Util.SoundService"
//    android:enabled="true" />
//
//
//
//    JAVA ACTIVITY ANY WERE
//    START MUSIC
//    startService(new Intent(QuestionScreenActivity.this, SoundService.class));
//
//
//    STOP MUSIC
//
//    stopService(new Intent(MainActivity.this, SoundService.class));
//



}
