package com.cwf.jpmorgan.cwf;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class QuestionActivity extends AppCompatActivity{




    DatabaseReference mDatabase=FirebaseDatabase.getInstance().getReference("Survey/");;



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
                EditText Ans1=(EditText)findViewById(R.id.ans1);
                EditText Ans2=(EditText)findViewById(R.id.ans2);
                EditText Ans3=(EditText)findViewById(R.id.ans3);
                EditText Ans4=(EditText)findViewById(R.id.ans4);
                EditText Ans5=(EditText)findViewById(R.id.ans5);

                // DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference("Questionaire" );
                //String userId = mDatabase.push().getKey();
                 //   mDatabase.child(userId.replace(".",",")).child(mDatabase.push().getKey()).setValue(m1);
                String id=mDatabase.push().getKey();
                Log.i("abc","afkja");

                DatabaseReference mDatabase=FirebaseDatabase.getInstance().getReference("Survey/"+id);

                Survey m1=new Survey(Ans1.toString(),"1","abc");
                Log.i("fjafn","aesk");
                Log.i("egns",mDatabase.toString());
                mDatabase.child(mDatabase.push().getKey()).setValue(m1);
                Log.i("ejfnaw","afkjan");

            }
        });






    }



}
