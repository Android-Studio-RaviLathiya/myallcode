package com.lathiya.allinonecode.Extra;

public class OTPSend {

//    Otp send
//
//    Android studio > tool > firebase > authentication > email and password >connect your app to firebase and Add firebase Authentication yo your app click OR add project firebase
//
//    XML file
//    Only pin and otp mate
//    {
////    pinview
//        implementation 'com.chaos.view:pinview:1.4.3'
//
//            <com.chaos.view.PinView
//        android:id="@+id/enterpin"
//        style="@style/PinWidget.PinView"
//        android:layout_width="wrap_content"
//        android:layout_height="wrap_content"
//        android:layout_gravity="center"
//        android:layout_marginTop="20dp"
//        android:layout_marginBottom="20dp"
//        android:cursorVisible="true"
//        android:inputType="number"
//        android:itemBackground="@color/appcolor"
//        app:hideLineWhenFilled="true"
//        app:itemCount="6"
//        app:itemHeight="40dp"
//        app:itemRadius="05dp"
//        app:itemWidth="40dp"
//        app:lineColor="@color/black" />
//    }
//
//    Main xml code
//    <?xml version="1.0" encoding="utf-8"?>
//<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
//    xmlns:app="http://schemas.android.com/apk/res-auto"
//    xmlns:tools="http://schemas.android.com/tools"
//    android:layout_width="match_parent"
//    android:layout_height="match_parent"
//    android:background="@color/appcolor"
//    android:orientation="vertical"
//    tools:context=".Activity.OtpSendActivity">
//
//    <LinearLayout
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:layout_marginTop="40dp"
//    android:gravity="center"
//    android:orientation="horizontal">
//
//        <TextView
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:text="Tai"
//    android:textSize="30dp"
//    app:fontFamily="@font/aclonica" />
//
//        <TextView
//    android:id="@+id/text"
//    android:layout_width="12dp"
//    android:layout_height="wrap_content"
//    android:text="l"
//    android:textColor="#FB0B0B"
//    android:textSize="50dp"
//    app:fontFamily="@font/aclonica" />
//
//        <TextView
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_marginLeft="02dp"
//    android:text="or"
//    android:textSize="30dp"
//    app:fontFamily="@font/aclonica" />
//
//
//    </LinearLayout>
//
//
//    <androidx.cardview.widget.CardView
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:layout_centerInParent="true"
//    android:layout_marginLeft="20dp"
//    android:layout_marginRight="20dp"
//    app:cardCornerRadius="04dp">
//
//        <LinearLayout
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:transitionName="box"
//    android:background="@drawable/logobox"
//    android:orientation="vertical">
//
//            <LinearLayout
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:layout_marginTop="20dp"
//    android:layout_gravity="center"
//    android:gravity="center"
//    android:orientation="horizontal">
//
//                <TextView
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_gravity="center"
//    android:text="Welcome"
//    android:textColor="@color/black"
//    android:textSize="20dp" />
//
//                <TextView
//    android:id="@+id/uname"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_gravity="center"
//    android:layout_marginLeft="03dp"
//    android:text="Welcome"
//    android:textColor="@color/black"
//    android:textSize="20dp" />
//
//
//            </LinearLayout>
//
//            <TextView
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_gravity="center"
//    android:layout_marginTop="10dp"
//    android:text="@string/otp" />
//
//            <TextView
//    android:id="@+id/mobilenumber"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_gravity="center"
//    android:layout_marginTop="10dp"
//    android:text="1234567890"
//    android:textColor="@color/black"
//    android:textSize="20dp" />
//            <TextView
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_gravity="center"
//    android:id="@+id/time"
//    android:text="123123"
//    android:layout_marginTop="10dp"/>
//
//            <ProgressBar
//    android:id="@+id/progressbar"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_centerHorizontal="true"
//    android:layout_gravity="center"
//    android:layout_marginTop="05dp"
//    android:visibility="gone" />
//
//            <com.chaos.view.PinView
//    android:id="@+id/enterpin"
//    style="@style/PinWidget.PinView"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_gravity="center"
//    android:layout_marginTop="20dp"
//    android:layout_marginBottom="20dp"
//    android:cursorVisible="true"
//    android:inputType="number"
//    android:itemBackground="@color/appcolor"
//    app:hideLineWhenFilled="true"
//    app:itemCount="6"
//    app:itemHeight="40dp"
//    app:itemRadius="05dp"
//    app:itemWidth="40dp"
//    app:lineColor="@color/black" />
//
//
//            <com.google.android.material.floatingactionbutton.FloatingActionButton
//    android:id="@+id/ok"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:transitionName="ok"
//    android:layout_gravity="center"
//    android:layout_alignParentBottom="true"
//    android:layout_margin="20dp"
//    android:src="@drawable/yellow_right" />
//
//        </LinearLayout>
//    </androidx.cardview.widget.CardView>
//
//</RelativeLayout>
//
//
//    Java code 4 step code
//    TextView text;
//    Animation bottomanim;
//    FloatingActionButton  ok;
//    PinView enterpin;
//    private String mVerificationId;
//    private FirebaseAuth mAuth;
//    ProgressBar progressbar;
//    TextView mobilenumber, uname;
//    TextView time;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_otp_send);
//
//        ok = findViewById(R.id.ok);
//        enterpin = findViewById(R.id.enterpin);
//        progressbar = findViewById(R.id.progressbar);
//        mobilenumber = findViewById(R.id.mobilenumber);
//        uname = findViewById(R.id.uname);
//        time = findViewById(R.id.time);
//        mAuth = FirebaseAuth.getInstance();
//        sendverificationcode(MyPrefrence.getuphone());
//
//        mobilenumber.setText(MyPrefrence.getuphone());
//        uname.setText(MyPrefrence.getuname());
//
//        new CountDownTimer(60000, 1000) {
//
//            public void onTick(long millisUntilFinished) {
//                time.setText("00:" + millisUntilFinished / 1000);
//            }
//
//            public void onFinish() {
//                time.setText("Time Finish!");
//            }
//        }.start();
//
//        ok.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                MyPrefrence.setulogin(true);
//                String code = enterpin.getText().toString().trim();
//
//                if (code.isEmpty() || code.length() < 6) {
//                    Toast toast = Toast.makeText(OtpSendActivity.this,"Enter Code",Toast.LENGTH_SHORT);
//                    toast.setGravity(Gravity.CENTER,0,0);
//                    toast.show();
//                    enterpin.requestFocus();
//                    return;
//                }
//                verifycode(code);
//            }
//        });
//
////Animation
//        text = findViewById(R.id.text);
//        bottomanim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
//        text.setAnimation(bottomanim);
////status colour
//        if (android.os.Build.VERSION.SDK_INT >= 21) {
//            Window window = this.getWindow();
//            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
//            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//            window.setStatusBarColor(this.getResources().getColor(R.color.appcolor));
//        }
//
//    }
//
//    Step 1
//    private void sendverificationcode(String getuphone) {
//
//        PhoneAuthProvider.getInstance().verifyPhoneNumber(
//
//                "+91" + MyPrefrence.getuphone(),        // Phone number to verify
//                40,                 // Timeout duration
//                TimeUnit.SECONDS,   // Unit of timeout
//                TaskExecutors.MAIN_THREAD,               // Activity (for callback binding)
//                mCallbacks);        // OnVerificationStateChangedCallbacks
//    }
//
//    step 2
//
//    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
//        @Override
//        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
//            String code = phoneAuthCredential.getSmsCode();
//            if (code != null) {
//                enterpin.setText(code);
//                verifycode(code);
//            }
//        }
//
//        @Override
//        public void onVerificationFailed(FirebaseException e) {
//            Toast.makeText(OtpSendActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
//        }
//
//        @Override
//        public void onCodeSent(String s, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
//            super.onCodeSent(s, forceResendingToken);
//            mVerificationId = s;
//
//        }
//    };
//
//    step 3
//    private void verifycode(String code) {
//        try {
//            PhoneAuthCredential credential = PhoneAuthProvider.getCredential(mVerificationId, code);
//            signInWithPhoneAuthCredential(credential);
//
//        } catch (Exception e) {
//            Toast toast = Toast.makeText(this, "Verification Code is wrong", Toast.LENGTH_SHORT);
//            toast.setGravity(Gravity.CENTER, 0, 0);
//            toast.show();
//
//        }
//    }
//
//
//    step 4
//
//    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
//        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
//
//        mAuth.signInWithCredential(credential)
//                .addOnCompleteListener(OtpSendActivity.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//
//
//                        if (task.isSuccessful()) {
//                            Intent intent = new Intent(OtpSendActivity.this, WelcomeActivity.class);
//                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
//                            startActivity(intent);
//
//                        } else {
//
//                            Toast.makeText(OtpSendActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
//
//
//                            //verification unsuccessful.. display an error message
//
////                            String message = "Somthing is wrong, we will fix it soon...";
////
////                            if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
////                                message = "Invalid code entered...";
////                            }
////
////                            Snackbar snackbar = Snackbar.make(findViewById(R.id.parent), message, Snackbar.LENGTH_LONG);
////                            snackbar.setAction("Dismiss", new View.OnClickListener() {
////                                @Override
////                                public void onClick(View v) {
////
////                                }
////                            });
////                            snackbar.show();
////                        }
//                        }         }                });    }}
//
//
//    jo error aave SHAH-1
//        firebase ma finger na hoi aetle error aave
//
//        firebase > setting > addfinger
//
//        finger lava ni kai said thin to
//        android studio > right said Gradie [close ni niche singup and eni niche gradie] > task >signinReort click > and finger key creat  Logcat [niche ni said]
//
//        copy addfinger and pase firebase setting
//
//
//
//

        }
