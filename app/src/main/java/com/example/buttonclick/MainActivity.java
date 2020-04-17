package com.example.buttonclick;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private EditText userInput;
        private TextView textview;
    private static final String TAG = "MainActivity";
    private final String TEXT_CONTENTS="TextContents";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: in");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput= (EditText) findViewById(R.id.editText);
        userInput.setText("");
        Button button = (Button) findViewById(R.id.button2);
        textview= (TextView) findViewById(R.id.textView);
        textview.setText("");
        textview.setMovementMethod(new ScrollingMovementMethod());
        View.OnClickListener ourOnClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String result=userInput.getText().toString();
                result=result+"\n";
                textview.append(result);
                userInput.setText("");

            }
        };
        if(button!=null){
        button.setOnClickListener(ourOnClickListener);}
        Log.d(TAG, "onCreate: out");

    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart: in");

        super.onStart();
        Log.d(TAG, "onStart: out");

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: in");
        super.onRestoreInstanceState(savedInstanceState);
       // String savedString=savedInstanceState.getString(TEXT_CONTENTS);
       // textview.setText(savedString);
        textview.setText(savedInstanceState.getString(TEXT_CONTENTS));
        Log.d(TAG, "onRestoreInstanceState: out");
    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: in");
        super.onRestart();
        Log.d(TAG, "onRestart: out");
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: in");
        super.onPause();
        Log.d(TAG, "onPause: out");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        Log.d(TAG, "onSaveInstanceState: in");
        outState.putString(TEXT_CONTENTS, textview.getText().toString());
        super.onSaveInstanceState(outState);
        Log.d(TAG, "onSaveInstanceState: out");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume: in");
        super.onResume();
        Log.d(TAG, "onResume: out");
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: in");
        super.onStop();
        Log.d(TAG, "onStop: out");
    }
}
