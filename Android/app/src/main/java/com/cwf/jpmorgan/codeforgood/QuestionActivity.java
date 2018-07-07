package com.cwf.jpmorgan.codeforgood;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class QuestionActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_question);
        ListView listView1;
        final String[] questions = {"Name of school", "Number of Students", "Number of teachers", "No. of girls", "No. of boys", "Does every classroom have enough benches and chairs?", "Is library available at school", "are students given any scholarshiop", "Any regular health checkup?", "Are mid-day meals provided"};
        listView1 = (ListView) findViewById(R.id.listview);

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, R.id.text, questions);
        listView1.setAdapter(arrayAdapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // Toast.makeText(QuestionActivity.this,questions[position] +  getString(R.string.Add), Toast.LENGTH_SHORT).show();


            }


        });


    }}
