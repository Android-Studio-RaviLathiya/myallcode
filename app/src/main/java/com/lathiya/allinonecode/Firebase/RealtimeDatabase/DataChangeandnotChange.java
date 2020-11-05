package com.lathiya.allinonecode.Firebase.RealtimeDatabase;

public class DataChangeandnotChange {
//
//    Firebase data show & change & not change
//
//    XML FILE
//
//<Button
//    android:id="@+id/read"
//    android:layout_width="0dp"
//    android:layout_height="wrap_content"
//    android:layout_marginStart="16dp"
//    android:layout_marginTop="16dp"
//    android:layout_marginEnd="16dp"
//    android:background="@color/colorPrimary"
//    android:text="Read"
//    android:textColor="@color/white"
//    app:layout_constraintEnd_toEndOf="parent"
//    app:layout_constraintStart_toStartOf="parent"
//    app:layout_constraintTop_toBottomOf="@+id/save" />
//
//<TextView
//    android:id="@+id/text"
//    android:layout_width="0dp"
//    android:layout_height="wrap_content"
//    android:layout_marginStart="16dp"
//    android:layout_marginTop="16dp"
//    android:layout_marginEnd="16dp"
//    android:text=""
//    android:textColor="@color/colorPrimary"
//    android:textSize="16sp"
//    app:layout_constraintEnd_toEndOf="parent"
//    app:layout_constraintStart_toStartOf="parent"
//    app:layout_constraintTop_toBottomOf="@+id/read" />
//
//
//    JAVA FILE
//
//    private TextView text;
//    private Button read;
//    private DatabaseReference Post;
//
//
//
//
//    read = findViewById(R.id.read);
//    text = findViewById(R.id.text);
//    Post = FirebaseDatabase.getInstance().getReference().child("singupuser");
//
//
//read.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
////                 readOneTime();    //data not change one time show
//            readRealTime();    //data change this time
//        }
//    });
//
//
//    private void readOneTime() {
//        Post.child("-Ln9F3Km8HlwqS0oaD9Q")    //enter key show data
//                .addListenerForSingleValueEvent(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//
//                        String oneuserdetail = "Name :" + dataSnapshot.child("Name").getValue(String.class) + "\n" +
//                                "Mobile Number :" + dataSnapshot.child("Mobile Number").getValue(String.class) + "\n" +
//                                "Password :" + dataSnapshot.child("Password").getValue(String.class);
//
//                        text.setText(oneuserdetail);
//
//
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError databaseError) {
//
//                    }
//                });
//
//    }
//
//    private void readRealTime() {
//
//
//        Post.child("-MJjmr8ruN0KDb1J95gG")  //enter ket show data
//                .addValueEventListener(new ValueEventListener() {
//                    @Override
//                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
//
//                        String oneuserdetail = "Name :" + dataSnapshot.child("Name").getValue(String.class) + "\n" +
//                                "Mobile Number :" + dataSnapshot.child("Mobile Number").getValue(String.class) + "\n" +
//                                "Password :" + dataSnapshot.child("Password").getValue(String.class);
//
//                        text.setText(oneuserdetail);
//
//                    }
//
//                    @Override
//                    public void onCancelled(@NonNull DatabaseError databaseError) {
//
//                    }
//                });
//
//    }



}
