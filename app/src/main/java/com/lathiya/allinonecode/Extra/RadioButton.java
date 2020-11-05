package com.lathiya.allinonecode.Extra;

public class RadioButton {

//    Radio Button
//    Xml Code
//
//<RadioGroup
//    android:id="@+id/radioGroup"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:orientation="vertical">
//
//    <RadioButton
//    android:id="@+id/paypal"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:text="Paypal"
//    android:textSize="20dp" />
//
//
//    <EditText
//    android:id="@+id/et_paypal"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:hint="Email"
//    android:inputType="textEmailAddress"
//    android:visibility="gone" />
//
//
//    <RadioButton
//    android:id="@+id/googlepay"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:textSize="20dp" />
//
//    <EditText
//    android:id="@+id/et_googlepay"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:hint="Mobile Number"
//    android:inputType="number"
//
//    android:visibility="gone" />
//
//    <RadioButton
//    android:id="@+id/phonepay"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:textSize="20dp" />
//
//    <EditText
//    android:id="@+id/et_phonepay"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:hint="Mobile Number"
//    android:inputType="number"
//
//    android:visibility="gone" />
//
//    <RadioButton
//    android:id="@+id/paytm"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:textSize="20dp" />
//
//    <EditText
//    android:id="@+id/et_paytm"
//    android:layout_width="match_parent"
//    android:layout_height="wrap_content"
//    android:hint="Mobile Number"
//    android:inputType="number"
//
//    android:visibility="gone" />
//</RadioGroup>
//
//
//
//    Java code
//    RadioButton paypal, googlepay, phonepay, paytm;
//    EditText et_paypal, et_googlepay, et_phonepay, et_paytm;
//    private RadioGroup radioGroup;
//
//
//    ONCREAT METHOD
//
//    paypal = findViewById(R.id.paypal);
//    googlepay = findViewById(R.id.googlepay);
//    phonepay = findViewById(R.id.phonepay);
//    paytm = findViewById(R.id.paytm);
//
//    et_paypal = findViewById(R.id.et_paypal);
//    et_googlepay = findViewById(R.id.et_googlepay);
//    et_phonepay = findViewById(R.id.et_phonepay);
//    et_paytm = findViewById(R.id.et_paytm);
//    radioGroup = findViewById(R.id.radioGroup);
//
//
//radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//        @Override
//        public void onCheckedChanged(RadioGroup group, int checkedId) {
//
//            if (paypal.isClickable()) {
//
//                et_paypal.setVisibility(View.VISIBLE);
//                et_googlepay.setVisibility(View.GONE);
//                et_phonepay.setVisibility(View.GONE);
//                et_paytm.setVisibility(View.GONE);
//
//            }
//            if (googlepay.isChecked()) {
//
//                et_googlepay.setVisibility(View.VISIBLE);
//                et_paypal.setVisibility(View.GONE);
//                et_phonepay.setVisibility(View.GONE);
//                et_paytm.setVisibility(View.GONE);
//
//
//            }
//            if (phonepay.isChecked()) {
//
//                et_phonepay.setVisibility(View.VISIBLE);
//                et_paypal.setVisibility(View.GONE);
//                et_googlepay.setVisibility(View.GONE);
//                et_paytm.setVisibility(View.GONE);
//
//            }
//            if (paytm.isChecked()) {
//
//                et_paytm.setVisibility(View.VISIBLE);
//                et_phonepay.setVisibility(View.GONE);
//                et_paypal.setVisibility(View.GONE);
//                et_googlepay.setVisibility(View.GONE);
//
//            }
//
//        }
//    });
//
//
//    EXTRA DISUNG
//
//    BOX 1
//<selector xmlns:android="http://schemas.android.com/apk/res/android" >
//    <item
//    android:drawable="@drawable/b"
//    android:state_checked="true"
//    android:state_pressed="true" />
//    <item
//    android:drawable="@drawable/a"
//    android:state_pressed="true" />
//    <item
//    android:drawable="@drawable/a"
//    android:state_checked="true" />
//    <item
//    android:drawable="@drawable/b" />
//</selector>
//
//    BOX A
//
//    <?xml version="1.0" encoding="utf-8"?>
//<shape
//    xmlns:android="http://schemas.android.com/apk/res/android"
//    android:shape="rectangle" >
//    <corners
//    android:radius="5dp" />
//    <solid
//    android:color="#fff" />
//    <stroke
//    android:width="2dp"
//    android:color="@color/black" />
//</shape>
//
//    BOX 2
//    <?xml version="1.0" encoding="utf-8"?>
//<shape
//    xmlns:android="http://schemas.android.com/apk/res/android"
//    android:shape="rectangle" >
//    <corners
//    android:radius="5dp" />
//    <solid
//    android:color="#fff" />
//
//</shape>
//

}
