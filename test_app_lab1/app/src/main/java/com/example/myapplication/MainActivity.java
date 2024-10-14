package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

    }

    public void textHide(View view) {
        TextView text1 = (TextView) findViewById(R.id.textView);
        TextView text2 = (TextView) findViewById(R.id.textView2);
        int vis = text1.getVisibility();
        if (vis == 0) {
            text1.setVisibility(View.INVISIBLE);
            text2.setVisibility(View.INVISIBLE);
        } else if (vis == 4) {
            text1.setVisibility(View.VISIBLE);
            text2.setVisibility(View.VISIBLE);
        }


    }
    public void imageShow(View view) {
        ImageView image = (ImageView) findViewById(R.id.imageView);
        int vis = image.getVisibility();
        if (vis == 0) {
            image.setVisibility(View.INVISIBLE);
        } else if (vis == 4) {
            image.setVisibility(View.VISIBLE);
        }
    }
}