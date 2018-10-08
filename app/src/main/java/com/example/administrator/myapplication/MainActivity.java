package com.example.administrator.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    @Override
    public void onClick(View v) {

        Log.i("click", "onClick: abc");

        EditText input = (EditText) findViewById(R.id.editText);
        String str = input.getText().toString();

        TextView text = (TextView) findViewById(R.id.text1);
        text.setText("Hello "+str);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickabc(View view){
        Log.i("click abc", "clickabc: ");
    }
}
