package com.cwf.jpmorgan.cwf;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class Report extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);
        Button Submit=(Button)findViewById(R.id.submitreport);
        final EditText benchchair=(EditText)findViewById(R.id.etbenchchair);
        final EditText washroom=(EditText)findViewById(R.id.etwashroom);
        final RadioGroup rad1=(RadioGroup)findViewById(R.id.radio1);
        final RadioGroup rad2=(RadioGroup)findViewById(R.id.radio2);
        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                benchchair.setText("");
                washroom.setText("");
                rad1.clearCheck();
                rad2.clearCheck();

            }
        });
    }
}
