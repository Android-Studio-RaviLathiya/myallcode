package com.lathiya.allinonecode.Firebase.RealtimeDatabase;

public class DataAddFirebase {

//    Add Data Post singup
//
//
//    Xml file
//<EditText
//    android:id="@+id/name"
//    android:layout_width="0dp"
//    android:layout_height="wrap_content"
//    android:layout_marginLeft="16dp"
//    android:layout_marginTop="16dp"
//    android:layout_marginRight="16dp"
//    android:hint="Name"
//    app:layout_constraintLeft_toLeftOf="parent"
//    app:layout_constraintRight_toRightOf="parent"
//    app:layout_constraintTop_toTopOf="parent" />
//
//<EditText
//    android:id="@+id/mobilenumber"
//    android:layout_width="0dp"
//    android:layout_height="wrap_content"
//    android:layout_marginStart="16dp"
//    android:layout_marginTop="16dp"
//    android:layout_marginEnd="16dp"
//    android:ems="10"
//    android:hint="Mobile"
//    android:inputType="textPersonName"
//    app:layout_constraintEnd_toEndOf="parent"
//    app:layout_constraintStart_toStartOf="parent"
//    app:layout_constraintTop_toBottomOf="@+id/name" />
//
//<EditText
//    android:id="@+id/password"
//    android:layout_width="0dp"
//    android:layout_height="wrap_content"
//    android:layout_marginStart="16dp"
//    android:layout_marginTop="16dp"
//    android:layout_marginEnd="16dp"
//    android:ems="10"
//    android:hint="Password"
//    android:inputType="textPersonName"
//    app:layout_constraintEnd_toEndOf="parent"
//    app:layout_constraintStart_toStartOf="parent"
//    app:layout_constraintTop_toBottomOf="@+id/mobilenumber" />
//
//<Button
//    android:id="@+id/save"
//    android:layout_width="0dp"
//    android:layout_height="wrap_content"
//    android:layout_marginStart="16dp"
//    android:layout_marginTop="16dp"
//    android:layout_marginEnd="16dp"
//    android:background="@color/colorPrimary"
//    android:text="save"
//    android:textColor="@color/white"
//    app:layout_constraintEnd_toEndOf="parent"
//    app:layout_constraintStart_toStartOf="parent"
//    app:layout_constraintTop_toBottomOf="@+id/password" />
//
//
//
//    JAVA FIEL
//
//    private EditText name, mobilenumber, password;
//    private Button save;
//    private DatabaseReference Post;
//
//
//    name = findViewById(R.id.name);
//    mobilenumber = findViewById(R.id.mobilenumber);
//    password = findViewById(R.id.password);
//    save = findViewById(R.id.save);
//
//    Post = FirebaseDatabase.getInstance().getReference().child("singupuser");
//
//save.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View view) {
//            save();
//        }
//    });
//
//
//
//
//    private void save() {
//
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("Name", name.getText().toString());     //creat your object
//        map.put("Mobile Number", mobilenumber.getText().toString());
//        map.put("Password", password.getText().toString());
//
//        Post.push()
//                .setValue(map)
//                .addOnCompleteListener(new OnCompleteListener<Void>() {
//                    @Override
//                    public void onComplete(@NonNull Task<Void> task) {
//
//                        Toast.makeText(SplashActivity.this, "Success", Toast.LENGTH_SHORT).show();
//
//                    }
//                }).addOnFailureListener(new OnFailureListener() {
//            @Override
//            public void onFailure(@NonNull Exception e) {
//                Toast.makeText(SplashActivity.this, "Try Again ", Toast.LENGTH_SHORT).show();
//            }
//        });
//

    }
