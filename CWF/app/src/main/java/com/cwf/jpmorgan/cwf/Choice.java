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

public class Choice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
        Button ViewDetailsButton=(Button)findViewById(R.id.ViewDetailsButton);
        Button AddSchoolButton  =(Button)findViewById(R.id.AddSchoolButton);
        Button Submit=(Button)findViewById(R.id.Submit);
        EditText schoolID=(EditText)findViewById(R.id.etSchoolid);
        SchoolDetails schoolDetails=new SchoolDetails(schoolID.getText().toString());
        ViewDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                                    Intent i = new Intent(MainActivity.this,QuestionActivity.class);
                                    //i.putExtra("loginEmail",email.getText().toString());
                                    startActivity(i);

                            }
                        });
            }
        });
    }
}
