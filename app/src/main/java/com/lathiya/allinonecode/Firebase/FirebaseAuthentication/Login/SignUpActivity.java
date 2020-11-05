package com.lathiya.allinonecode.Firebase.FirebaseAuthentication.Login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.firebasefunction.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class SignUpActivity extends AppCompatActivity {


    Button btn_signup;
    EditText et_email, et_password;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_sign_up);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        btn_signup = findViewById(R.id.btn_signup);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Email = et_email.getText().toString();
                String Password = et_password.getText().toString();
                firebaseAuth = FirebaseAuth.getInstance();


                if (Email.isEmpty()) {
                    et_email.setError("Enter Email");
                    et_email.requestFocus();

                } else if (Password.isEmpty()) {
                    et_password.setError("enter Password");    //note = password size 6 word
                    et_password.requestFocus();

                } else if (Password.length() < 6) {

                    et_password.setError("MIM 6 Word");
                } else {

                    firebaseAuth.createUserWithEmailAndPassword(Email, Password)
                            .addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    Toast.makeText(SignUpActivity.this, "" + task.toString(), Toast.LENGTH_SHORT).show();

                                    if (!task.isSuccessful()) {
                                        Toast.makeText(SignUpActivity.this, "Singup Fail", Toast.LENGTH_SHORT).show();

                                    } else {

                                        onBackPressed();
                                    }
                                }
                            }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(SignUpActivity.this, "Fail" + e.toString(), Toast.LENGTH_SHORT).show();
                            Log.e("LOGS", "" + e);

                        }
                    });


                }

            }
        });


    }
}
