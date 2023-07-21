package com.darma202102319.login1;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewLanjutanMainActivity extends AppCompatActivity {
    private WebView _webView5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviewlanjutan_main);

        _webView5 = (WebView)  findViewById(R.id.webView5);

        WebViewClient webViewClient = new WebViewClient();
        _webView5.setWebViewClient(webViewClient);

        WebChromeClient webChromeClient = new WebChromeClient();
        _webView5.setWebChromeClient(webChromeClient);

        WebSettings webSettings = _webView5.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);

        WebAppInterface webAppInterface = new WebAppInterface( this, WebViewLanjutanMainActivity.this);
        _webView5.addJavascriptInterface(webAppInterface, "Android");

        String url = "https://stmikpontianak.net/011100862/webview_lanjutan.html";
        _webView5.loadUrl(url);
    }
}
