package com.example.learnhtml.contentactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learnhtml.MainActivity;
import com.example.learnhtml.R;

public class ContentActivity2 extends AppCompatActivity {
    ImageView iv_back2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content2);
        iv_back2= findViewById(R.id.iv_back2);

        iv_back2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
        WebView myWebView = (WebView) findViewById(R.id.webview2);
    }
}