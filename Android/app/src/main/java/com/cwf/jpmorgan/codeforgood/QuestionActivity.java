package com.cwf.jpmorgan.codeforgood;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class QuestionActivity extends AppCompatActivity{


   // private DatabaseReference mDatabase;
  //  private EditText []answers;




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

        Button submit=(Button)findViewById(R.id.Submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String userId = mDatabase.push().getKey();
               // DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("Questionaire"+userId );
                //mDatabase.child(userId.replace(".",",")).child(mDatabase.push().getKey()).setValue(m1);

            }
        });






    }



}
