package com.lathiya.allinonecode.SQLLIte;

public class OldLoginActivity {

//    Koi pn application ma login page ni jarur joi to uses krvu & new account mate uses thay and login page ma email j chale m gothvelu che biju koi mukvu hoi login page ma to email change to mobile phone
//
//
//    Login activity typing
//    SQLiteDatabase db;
//    String uri;
//
//
//
//    db = openOrCreateDatabase("ndg.db", MODE_PRIVATE, null);
//db.execSQL("create table if not exists user(id integer primary key autoincrement,img text,fn text,ln text,mob text,email text,pass text,dob text,gender text)");
//
//
//    typing start  VALIDATION>
//            Toast.makeText(LoginActivity.this, "Password Reuired", Toast.LENGTH_SHORT).show();
//} else {
//
//
//        Cursor c = db.rawQuery("select * from user where email='" + uname + "' and pass='" + upass + "'", null);
//
//        if (c != null) {
//
//        if (c.moveToNext()) {
//
//
//        Log.e("db123", "onClick: " + c.getString(0));
//        String uid = c.getString(0);
//        Intent intent = new Intent(LoginActivity.this, WelcomeActivity.class);
//        intent.putExtra("uid", uid);
//        startActivity(intent);
//
//
//
//
//
//        Toast.makeText(LoginActivity.this, "Login", Toast.LENGTH_SHORT).show();
//        } else {
//        Toast.makeText(LoginActivity.this, "invalid", Toast.LENGTH_SHORT).show();
//        }
//        Login invalid and valid mate uses thay che
//
//
//
//
//
//        Creat New Account typing in validation
//
//        SQLiteDatabase db;
//
//
//        db = openOrCreateDatabase("ndg.db", MODE_PRIVATE, null);
//
//
//        start typing   VALIDATION>
//        Toast.makeText(CreatAccActivity.this, "Gender Reuired", Toast.LENGTH_SHORT).show();
//        } else {
//        Cursor c = db.rawQuery("select * from user where email='" + et_email  + "'", null);
//
//        if (c != null) {
//        if (c.moveToNext()) {
//
//        Toast.makeText(CreatAccActivity.this, "Alredy", Toast.LENGTH_SHORT).show();
//        } else {
//        db.execSQL("INSERT INTO user(img,fn,ln,mob,email,pass,dob,gender) values('" + filePath + "','" + fn + "','" + ln + "','" + ph + "','" + mail + "','" + pass + "','" + date + "','" + gender + "')"); }
//
//
//        Jo log padava na hoi to
//
//        Log.d("Fistname", fn);
//        Log.d("Lastname", ln);
//        Log.d("phone", ph);
//        Log.d("Email", mail);
//        Log.d("Password", pass);
//        Log.d("Birthdate", date);
//        Log.d("Note", not);
//        Log.d("gender", gender);
//
//
//
//        Toast.makeText(CreatAccActivity.this, "New Account Success Fully", Toast.LENGTH_SHORT).show();
//
//        Intent intent = new Intent(CreatAccActivity.this, LoginActivity.class);
//        startActivity(intent);
//



        }
