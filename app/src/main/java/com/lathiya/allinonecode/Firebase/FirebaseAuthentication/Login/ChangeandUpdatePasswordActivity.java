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
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ChangeandUpdatePasswordActivity extends AppCompatActivity {

    EditText et_email, et_oldpassword, et_newpassword;
    Button btn_update;
     FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changeand_update_password);


        btn_update = findViewById(R.id.btn_update);
        et_email = findViewById(R.id.et_email);
        et_oldpassword = findViewById(R.id.et_oldpassword);
        et_newpassword = findViewById(R.id.et_newpassword);

        et_email.setText(myprefrence.getemail());
        et_oldpassword.setText(myprefrence.getpassword());



        btn_update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = et_email.getText().toString();
                String oldpassword = et_oldpassword.getText().toString();
                final String newpassword = et_newpassword.getText().toString();

                final FirebaseUser user = firebaseAuth.getCurrentUser();

                AuthCredential authCredential = EmailAuthProvider.getCredential(email, oldpassword);
                user.reauthenticate(authCredential)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {

                                user.updatePassword(newpassword)
                                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                                            @Override
                                            public void onSuccess(Void aVoid) {
                                                onBackPressed();
                                                Toast.makeText(ChangeandUpdatePasswordActivity.this, "Password Updated", Toast.LENGTH_SHORT).show();

                                            }
                                        }).addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Toast.makeText(ChangeandUpdatePasswordActivity.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();


                                    }
                                });


                            }
                        }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(ChangeandUpdatePasswordActivity.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });


            }
        });


    }
}
