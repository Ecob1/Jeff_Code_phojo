package com.example.jeffcodelogin.phojo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.jeffcodelogin.R;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(getBaseContext(), "TEST TOAST MESSAGE", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main_page);
    }
}