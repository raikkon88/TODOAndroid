package org.udg.pds.todoandroid.activity;

import android.app.Activity;
import android.app.Person;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.udg.pds.todoandroid.R;

public class PersonalActivity extends AppCompatActivity {

    

    private Button btnSend;
    private EditText etText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        btnSend = (Button) findViewById(R.id.btn_send);
        etText = (EditText) findViewById(R.id.et_editable);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etText.getText() != null){
                    String shit = etText.getText().toString();
                    Intent i = new Intent();
                    i.putExtra(NavDrawerActivity.RESULT_DATA, shit);
                    setResult(Activity.RESULT_OK, i);
                    finish();
                }
            }
        });

    }

}
