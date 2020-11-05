package com.lathiya.allinonecode.Notification;

public class Notification {

//    Notification
//
//    Java App class create
//
//    public class App extends Application {
//        public static final String CHANNEL_1_ID = "channel1";
//        public static final String CHANNEL_2_ID = "channel2";
//        @Override
//        public void onCreate() {
//            super.onCreate();
//            createNotificationChannels();
//        }
//        private void createNotificationChannels() {
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
//                NotificationChannel channel1 = new NotificationChannel(
//                        CHANNEL_1_ID,
//                        "Channel 1",
//                        NotificationManager.IMPORTANCE_HIGH
//                );
//
//                channel1.setDescription("This is Channel 1");
//                NotificationChannel channel2 = new NotificationChannel(
//                        CHANNEL_2_ID,
//                        "Channel 2",
//                        NotificationManager.IMPORTANCE_LOW
//                );
//                channel2.setDescription("This is Channel 2");
//                NotificationManager manager = getSystemService(NotificationManager.class);
//                manager.createNotificationChannel(channel1);
//                manager.createNotificationChannel(channel2);
//            }
//        }
//    }
//
//
//    MANIFIST ADD CLASS
//    android:name=".App"
//
//
//    MAIN ACTIVITY XML
//    <?xml version="1.0" encoding="utf-8"?>
//<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    xmlns:app="http://schemas.android.com/apk/res-auto"
//    xmlns:tools="http://schemas.android.com/tools"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent"
//    android:orientation="vertical"
//    android:padding="16dp"
//    tools:context=".MainActivity">
//
//    <EditText
//    android:id="@+id/edit_text_title"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:hint="Title" />
//
//    <EditText
//    android:id="@+id/edit_text_message"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:hint="Message" />
//
//    <Button
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:onClick="sendOnChannel1"
//    android:text="Send on Channel 1" />
//
//    <Button
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:onClick="sendOnChannel2"
//    android:text="Send on Channel 2" />
//</LinearLayout>
//
//
//    MAIN ACTIVITY JAVA
//
//    public class MainActivity extends AppCompatActivity {
//
//        private NotificationManagerCompat notificationManager;
//        private EditText editTextTitle;
//        private EditText editTextMessage;
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_main);
//
//            notificationManager = NotificationManagerCompat.from(this);
//            editTextTitle = findViewById(R.id.edit_text_title);
//            editTextMessage = findViewById(R.id.edit_text_message);
//        }
//
//        /*SHOW NOTIFICATION */
//        public void sendOnChannel1(View v) {
//            String title = editTextTitle.getText().toString();
//            String message = editTextMessage.getText().toString();
//
//            Notification notification = new NotificationCompat.Builder(this, CHANNEL_1_ID)
//                    .setSmallIcon(R.drawable.abc)
//                    .setContentTitle(title)
//                    .setContentText(message)
//                    .setPriority(NotificationCompat.PRIORITY_HIGH)
//                    .setCategory(NotificationCompat.CATEGORY_MESSAGE)
//                    .build();
//            notificationManager.notify(1, notification);
//        }
//
//        /*DON'T SHOW NOTIFICATION */
//
//        public void sendOnChannel2(View v) {
//            String title = editTextTitle.getText().toString();
//            String message = editTextMessage.getText().toString();
//            Notification notification = new NotificationCompat.Builder(this, CHANNEL_2_ID)
//                    .setSmallIcon(R.drawable.abc)
//                    .setContentTitle(title)
//                    .setContentText(message)
//                    .setPriority(NotificationCompat.PRIORITY_LOW)
//                    .build();
//            notificationManager.notify(2, notification);
//        }
//    }
//

}
