package com.lathiya.allinonecode.Extra;

public class Upi {

//    Upi
//
//            Dependencise
//    implementation 'com.wangsun.upi.payment:upi-payment:0.0.5'
//    implementation 'org.jetbrains:annotations-java5:15.0'
//
//
//    xml  file
//
//<EditText
//    android:id="@+id/amount"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:hint="enter amount"/>
//<Button
//    android:id="@+id/button_pay"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_gravity="center"
//    android:text="Pay with UPI" />
//
//
//    Java file
//1 step add
//    public class MainActivity extends AppCompatActivity implements UpiPayment.OnUpiPaymentListener
//
//2 step
//
//    private Button payButton;
//    EditText amount;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        payButton = findViewById(R.id.button_pay);
//        amount = findViewById(R.id.amount);
//
//
//        payButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                pay();
//            }
//        });
//
//    }
//
//    private void pay() {
//
//        String amounts = amount.getText().toString();
//
//        ArrayList<String> existingApps = UpiPayment.getExistingUpiApps(this);
//
//        PaymentDetail payment = new PaymentDetail("hirensutariya1@oksbi", "Hiren Sutariya",
//                "", "", "Mall", "" + amounts + ".00" );
//
//
//        new UpiPayment(this)
//                .setPaymentDetail(payment)
//                .setUpiApps(UpiPayment.getUPI_APPS())
//                .setCallBackListener(new UpiPayment.OnUpiPaymentListener() {
//                    @Override
//                    public void onSuccess(@NotNull TransactionDetails data) {
//                        Toast.makeText(MainActivity.this, "transaction pending: " + data.toString(), Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onSubmitted(@NotNull TransactionDetails data) {
//                        Toast.makeText(MainActivity.this, "transaction pending: " + data, Toast.LENGTH_LONG).show();
//                    }
//
//                    @Override
//                    public void onError(@NotNull String message) {
//                        Toast.makeText(MainActivity.this, "transaction pending: " + message, Toast.LENGTH_LONG).show();
//                    }
//                }).pay();
//
//
//    }
//

}
