package com.example.david.androidintro1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String  EXTRA_MESSAGE = "com.example.androidintro1.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("MainActivity", "onCreate");

    }


    public void sendMessage(View view)  {
//        Log.d("MainActivity", "Knappen är tryckt!!!");
//
        EditText editText = findViewById(R.id.editText);
        String message = editText.getText().toString();
//
//        TextView helloText = findViewById(R.id.hello_txt);
//        helloText.setText(message);

        Intent intent = new Intent(this, DisplayMessageActivity.class);

        intent.putExtra(EXTRA_MESSAGE , message);

        startActivity(intent);

    }



}
