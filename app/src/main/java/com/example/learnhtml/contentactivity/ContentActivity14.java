package com.example.learnhtml.contentactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.learnhtml.MainActivity;
import com.example.learnhtml.R;

public class ContentActivity14 extends AppCompatActivity {
    ImageView iv_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content14);
        iv_back= findViewById(R.id.iv_back14);

        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        });
        WebView myWebView = findViewById(R.id.webview14);
        String contentAsset ="file:///android_asset/HTML_Input_Types.html";
        myWebView.loadUrl(contentAsset);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
    }
}