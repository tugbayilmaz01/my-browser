package com.example.mybrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webview = null;
        webview.setWebViewClient(new WebViewClient());
        View btnGo = null;
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BreakIterator txtAddress = null;
                webview.loadUrl("http://"+ txtAddress.getText());
            }
            
            
        });

        if (getIntent() != null && getIntent().getData()!= null){
            BreakIterator txtAddress = null;
            txtAddress.setText (getIntent().getData().toString());
            webview.loadUrl(getIntent().getData().toString());
        }

    }
    @Override
    public boolean onCreateOptionsMenu (Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
}