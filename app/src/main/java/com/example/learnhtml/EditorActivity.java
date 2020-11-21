package com.example.learnhtml;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import in.nashapp.androidsummernote.Summernote;

public class EditorActivity extends AppCompatActivity {

    ImageView iv_backEditor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

         iv_backEditor = findViewById(R.id.iv_backEditor);
        iv_backEditor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        WebView myWebView = (WebView) findViewById(R.id.webviewEditor);
        String contentAsset ="https://html5-editor.net";
        myWebView.loadUrl(contentAsset);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.setWebViewClient(new WebViewClient());
    }


}