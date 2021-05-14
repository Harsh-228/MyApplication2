 package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {
public  static final String TAG=  "MainActivity";
private TextView mtextview;
private Button button;
     public  static final String NAME=  "Harsh";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Intent intent = new Intent( packageContext: this, MainActivity2.class);
      //  startActivity(intent);
        mtextview= findViewById(R.id.textView);
        button = findViewById(R.id.button);
        mtextview.setText("text display");
        button.setOnClickListener(view -> {
                    Intent intent = new Intent(  this, MainActivity2.class);
                    intent.putExtra(NAME,  mtextview.getText().toString());
                     startActivity(intent);
                } );
        //    Log.e(TAG, "onCreate: " + mtextview.getText().toString());
        //    Toast.makeText(this, "Button pressed", Toast.LENGTH_LONG ).show();        });
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}