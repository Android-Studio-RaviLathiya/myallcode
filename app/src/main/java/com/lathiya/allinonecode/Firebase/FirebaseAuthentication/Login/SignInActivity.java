package com.lathiya.allinonecode.Firebase.FirebaseAuthentication.Login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.firebasefunction.MainActivity;
import com.firebase.firebasefunction.R;
import com.firebase.firebasefunction.myprefrence;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignInActivity extends AppCompatActivity {


    Button btn_login, btn_signup, btn_forget;
    EditText et_email, et_password;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);
        btn_signup = findViewById(R.id.btn_signup);
        btn_forget = findViewById(R.id.btn_forget);


        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignInActivity.this, SignUpActivity.class));
            }
        });


        btn_forget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String Email = et_email.getText().toString();

                if (Email.isEmpty()) {

                    et_email.setError("Enter email");
                } else {

                    startActivity(new Intent(SignInActivity.this, ForgotPasswordActivity.class));
                }


            }
        });


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String Email = et_email.getText().toString();
                final String Password = et_password.getText().toString();
                firebaseAuth = FirebaseAuth.getInstance();


                if (Email.isEmpty()) {
                    et_email.setError("Enter Email");
                    et_email.requestFocus();

                } else if (Password.isEmpty()) {
                    et_password.setError("enter Password");
                    et_password.requestFocus();

                } else {

                    firebaseAuth.signInWithEmailAndPassword(Email, Password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (!task.isSuccessful()) {

                                Toast.makeText(SignInActivity.this, "Login Fail", Toast.LENGTH_SHORT).show();

                            } else {

                                myprefrence.setemail(Email);
                                myprefrence.setpassword(Password);
                                Toast.makeText(SignInActivity.this, "Login Sucess Full", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(SignInActivity.this, MainActivity.class));

                            }


                        }
                    });


                }


            }
        });


    }
}
