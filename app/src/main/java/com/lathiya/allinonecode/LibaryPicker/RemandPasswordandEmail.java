package com.lathiya.allinonecode.LibaryPicker;

public class RemandPasswordandEmail {

//    MyPrefrence
//
//    Chek box  email mate or password save mate remember
//
//    Emaul ni jagiya pr phone number pn lai sakay
//
//
//
//    New java claas Myprefrence
//
//    public class MyPrefrence extends Application {
//
//        public static SharedPreferences sharedPreferences;
//        public static SharedPreferences.Editor editor;
//
//
//        @Override
//        public void onCreate() {
//            super.onCreate();
//            sharedPreferences = getSharedPreferences("mycon", MODE_PRIVATE);
//            editor = sharedPreferences.edit();
//        }
//
//        public static void setbtn(boolean btn) {
//            editor.putBoolean("btn", btn).commit();
//        }
//
//        public static boolean getbtn() {
//            return sharedPreferences.getBoolean("btn", false);
//
//        }
//
//        public static void setLogin(boolean login){
//            editor.putBoolean("login",login).commit();
//        }
//        public static boolean getLogin(){
//            return sharedPreferences.getBoolean("login",false);
//
//        }
//
//        public static void setemail(String email) {
//            editor.putString("email", email).commit();
//        }
//
//        public static String getemail() {
//            return sharedPreferences.getString("email", "");
//        }
//
//        public static void setpass(String pass) {
//            editor.putString("pass", pass).commit();
//        }
//
//        public static String getpass() {
//            return sharedPreferences.getString("pass", "");
//
//        }
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//    Login Activity typing
//
//cb_remember.setChecked(MyPrefrence.getbtn());
//
//if (MyPrefrence.getbtn()){
//        et_email.setText(MyPrefrence.getemail());
//        et_pass.setText(MyPrefrence.getpass());
//    }
//
//
//
//
//cb_remember.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//        @Override
//        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//            if (isChecked) {
//                MyPrefrence.setbtn(true);
//                Toast.makeText(LoginActivity.this, "check", Toast.LENGTH_SHORT).show();
//            } else {
//                MyPrefrence.setbtn(false);
//                Toast.makeText(LoginActivity.this, "Not check", Toast.LENGTH_SHORT).show();
//            }
//        }
//    });
//
//
//
//
//
//    Niche ni said login by=tn ma typing krvu
//
//
//
//if (c.moveToNext()) {
//        MyPrefrence.setLogin(true);
//        if (MyPrefrence.getbtn()){
//            MyPrefrence.setemail(uname);
//            MyPrefrence.setpass(upass);
//        }
//
//
//
//        Toast.makeText(LoginActivity.this, "Login", Toast.LENGTH_SHORT).show();
//    } else {
//        MyPrefrence.setLogin(false);
//        Toast.makeText(LoginActivity.this, "invalid", Toast.LENGTH_SHORT).show();
//    }
//
//
//
//
//
//
//
//
//
//    Aa check btn ni uper lkhva nu
//    Jo login ma chek thay and na pn thay pn user ekvar login kre aetle direct welcome page aavu joi ae
//
//if (MyPrefrence.getLogin()){
//
//        Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
//        startActivity(intent);
//        finish();
//
//    }
//
//    and jiya pn logout no opeson hoi tiyaaa inten vali method ni upper typing krvu
//
//MyPrefrence.setLogin(false);
//    Inten inten = new………..

}
