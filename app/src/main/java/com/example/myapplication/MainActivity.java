 package com.example.myapplication;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

 public class MainActivity extends AppCompatActivity {
private TextView textview;
     private ActionBarDrawerToggle maAction_toolbar;
     public  static final String NAME=  "Harsh";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // Intent intent = new Intent( packageContext: this, MainActivity2.class);
      //  startActivity(intent);
        textview = findViewById(R.id.textView);
        Button button = findViewById(R.id.button);
        FrameLayout frameLayout = findViewById(R.id.frame_layout);
        textview.setText("text display");
        DrawerLayout mDrawer_layout = findViewById(R.id.drawer_layout);
        NavigationView mNav_view = findViewById(R.id.nav_view);
        Toolbar mToolbar = findViewById(R.id.tool_bar);

        setSupportActionBar(mToolbar);
        maAction_toolbar =new ActionBarDrawerToggle(MainActivity.this, mDrawer_layout,mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        mDrawer_layout.addDrawerListener(maAction_toolbar);
        maAction_toolbar.syncState();
        //fragments
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new Fragment1()).commit();
        //button functionality
        button.setOnClickListener(view -> {
                    Intent intent = new Intent(  this, MainActivity2.class);
                    intent.putExtra("NAME",  textview.getText().toString());
                     startActivity(intent);
                } );
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}