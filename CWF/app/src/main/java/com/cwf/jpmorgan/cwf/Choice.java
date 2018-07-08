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
import android.widget.TextView;
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
       final Button ViewDetailsButton=(Button)findViewById(R.id.ViewDetailsButton);
        final Button AddSchoolButton  =(Button)findViewById(R.id.AddSchoolButton);
        final Button Submit=(Button)findViewById(R.id.Submit);
        final EditText schoolID=(EditText)findViewById(R.id.etSchoolID);
        final TextView tvSchool=(TextView)findViewById(R.id.tvSchool);
        Submit.setVisibility(View.INVISIBLE);
        schoolID.setVisibility(View.INVISIBLE);
        tvSchool.setVisibility(View.INVISIBLE);
        ViewDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                                    Intent i = new Intent(Choice.this,Report.class);
                                    //i.putExtra("loginEmail",email.getText().toString());
                                    startActivity(i);

                            }
                        });
        AddSchoolButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Submit.setVisibility(View.VISIBLE);
                schoolID.setVisibility(View.VISIBLE);

                tvSchool.setVisibility(View.VISIBLE);


                Submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        SchoolDetails schoolDetails=new SchoolDetails(schoolID.getText().toString());
                        Log.i("school id",schoolID.getText().toString());
                        Intent i = new Intent(Choice.this,QuestionActivity.class);
                        //i.putExtra("loginEmail",email.getText().toString());
                        startActivity(i);

                    }
                });




            }
        });


    }



    }

