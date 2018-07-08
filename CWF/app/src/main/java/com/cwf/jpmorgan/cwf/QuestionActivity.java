package com.cwf.jpmorgan.cwf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class QuestionActivity extends AppCompatActivity{




    DatabaseReference mDatabase=FirebaseDatabase.getInstance().getReference("Survey/");;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_question);
       // ListView listView1;
        final int qid=1;
        EditText Ans1=(EditText)findViewById(R.id.ans1);
        EditText Ans2= (EditText)findViewById(R.id.ans2);
        EditText Ans3=(EditText)findViewById(R.id.ans3);
        EditText Ans4=(EditText)findViewById(R.id.ans4);
        EditText Ans5= (EditText)findViewById(R.id.ans5);

        Log.i("abc","abcd");



        Ans1=(EditText)findViewById(R.id.ans1);
        Ans2=(EditText)findViewById(R.id.ans2);
        Ans3=(EditText)findViewById(R.id.ans3);
        Ans4=(EditText)findViewById(R.id.ans4);
        Ans5=(EditText)findViewById(R.id.ans5);
        Log.i("abc","abcd1");
        Button submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Ans1=(EditText)findViewById(R.id.ans1);
                EditText Ans2=(EditText)findViewById(R.id.ans2);
                EditText Ans3=(EditText)findViewById(R.id.ans3);
                EditText Ans4=(EditText)findViewById(R.id.ans4);
                EditText Ans5=(EditText)findViewById(R.id.ans5);

                // DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("Questionaire" );
                //String userId = mDatabase.push().getKey();
                 //   mDatabase.child(userId.replace(".",",")).child(mDatabase.push().getKey()).setValue(m1);
                String id=mDatabase.push().getKey();
                Log.i("abc",id);
                Survey m1=new Survey();
                DatabaseReference mDatabase=FirebaseDatabase.getInstance().getReference("Surveyss");

                    m1.Surveyenter(Ans1.getText().toString(), String.valueOf(qid), Ans2.getText().toString());
                    mDatabase.child(mDatabase.push().getKey()).setValue(m1);
                m1.Surveyenter(Ans1.getText().toString(), String.valueOf(qid), Ans3.getText().toString());
                mDatabase.child(mDatabase.push().getKey()).setValue(m1);
                m1.Surveyenter(Ans1.getText().toString(), String.valueOf(qid), Ans4.getText().toString());
                mDatabase.child(mDatabase.push().getKey()).setValue(m1);
                m1.Surveyenter(Ans1.getText().toString(), String.valueOf(qid), Ans5.getText().toString());
                mDatabase.child(mDatabase.push().getKey()).setValue(m1);
                Ans1.setText("");
                Ans2.setText("");
                Ans3.setText("");
                Ans4.setText("");
                Ans5.setText("");
                Toast.makeText(QuestionActivity.this,"DATA UPLOADED",Toast.LENGTH_LONG).show();
            }
        });






    }



}
