package com.cwf.jpmorgan.cwf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class QuestionActivity extends AppCompatActivity{








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_question);
       // ListView listView1;


        EditText Ans1=(EditText)findViewById(R.id.ans1);
        EditText Ans2=(EditText)findViewById(R.id.ans2);
        EditText Ans3=(EditText)findViewById(R.id.ans3);
        EditText Ans4=(EditText)findViewById(R.id.ans4);
        EditText Ans5=(EditText)findViewById(R.id.ans5);

        Button submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("Questionaire" );
                //String userId = mDatabase.push().getKey();
                 //   mDatabase.child(userId.replace(".",",")).child(mDatabase.push().getKey()).setValue(m1);
                DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference();
                mDatabase.child("Questionaire").push().setValue(1);
            }
        });






    }



}
