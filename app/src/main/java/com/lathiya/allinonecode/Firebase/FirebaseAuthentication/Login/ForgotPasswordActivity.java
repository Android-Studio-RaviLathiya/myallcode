package com.lathiya.allinonecode.Firebase.FirebaseAuthentication.Login;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.firebasefunction.R;
import com.firebase.firebasefunction.myprefrence;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPasswordActivity extends AppCompatActivity {

    Button btn_fpassword;
    EditText et_email;
    private FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        btn_fpassword = findViewById(R.id.btn_fpassword);
        et_email = findViewById(R.id.et_email);

        btn_fpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firebaseAuth.sendPasswordResetEmail(myprefrence.getemail())
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {


                                if (task.isSuccessful()) {

                                    Toast.makeText(ForgotPasswordActivity.this, "Password send your email", Toast.LENGTH_SHORT).show();

                                } else {
                                    Toast.makeText(ForgotPasswordActivity.this, "" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();


                                }


                            }
                        }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });


            }
        });

    }
}
