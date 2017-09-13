package com.example.user.sep_13;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void PB2(View view){

        Toast toast = Toast.makeText(getApplicationContext(), "This is after clicked in PB2", Toast.LENGTH_SHORT);
        toast.show();

        EditText aa = (EditText) findViewById((R.id.editText));
        aa.getText();

        TextView bb = (TextView) findViewById(R.id.textView);
        bb.setText(aa.getText());
    }

}
