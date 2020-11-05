//package com.lathiya.allinonecode.Firebase.MessageService;
//
//import android.util.Log;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.core.app.NotificationCompat;
//import androidx.core.app.NotificationManagerCompat;
//
//import com.firebase.firebasefunction.R;
//import com.google.android.gms.tasks.OnCompleteListener;
//import com.google.firebase.messaging.FirebaseMessaging;
//import com.google.firebase.messaging.FirebaseMessagingService;
//import com.google.firebase.messaging.RemoteMessage;
//
//
//
//public class MyMessageService extends FirebaseMessagingService {
//
//    @Override
//    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
//        super.onMessageReceived(remoteMessage);
//        shownotification(remoteMessage.getNotification().getTitle(),remoteMessage.getNotification().getBody());
//    }
//
//    public void shownotification(String title,String message){
//
//        NotificationCompat.Builder builder = new NotificationCompat.Builder(this,"MyNotification")
//                .setContentTitle(title)
//                .setSmallIcon(R.drawable.ic_insert_emoticon_black_24dp)
//                .setAutoCancel(true)
//                .setContentText(message);
//
//                NotificationManagerCompat manager = NotificationManagerCompat.from(this);
//                manager.notify(999,builder.build());
//
//
//    }
//
//
//
//}
