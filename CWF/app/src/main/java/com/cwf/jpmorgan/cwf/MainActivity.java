package com.cwf.jpmorgan.cwf;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class MainActivity extends AppCompatActivity {


    private FirebaseAuth firebaseAuth;
    private EditText email;
    private EditText password;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button login = findViewById(R.id.bLogin);


        firebaseAuth = FirebaseAuth.getInstance();
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                email = (EditText)findViewById(R.id.etEmail);
                password=(EditText)findViewById(R.id.etPassword);
                firebaseAuth = FirebaseAuth.getInstance();
                final ProgressDialog progressDialog = ProgressDialog.show(MainActivity.this,"Please Wait ...","Processing ...",true);

                (firebaseAuth.signInWithEmailAndPassword(email.getText().toString(),password.getText().toString()))
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressDialog.dismiss();
                                if(task.isSuccessful())
                                {
                                    Toast.makeText(MainActivity.this,"Logged in " ,Toast.LENGTH_LONG).show();
                                    Log.i("login","success");
                                    Intent i = new Intent(MainActivity.this,Choice.class);
                                    //i.putExtra("loginEmail",email.getText().toString());
                                    startActivity(i);

                                }
                                else
                                {
                                    Log.e("Error",task.getException().toString());
                                    Toast.makeText(MainActivity.this,task.getException().getMessage(),Toast.LENGTH_LONG).show();
                                    Log.i("login","fail");
                                }
                            }
                        });
            }
        });
    }
}
