package com.example.graphics;


import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new CustomDrawingView(this));
    }
}


