package com.agustiawan.webviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager.LayoutParams.*
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity : AppCompatActivity() {
//  inisialisasi
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//  membuat tampilan full screen
    window.setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN)
    webView = findViewById(R.id.wv)
    webView.webViewClient = WebViewClient()
    webView.loadUrl("https:kai.id")
    val webSettings = webView.settings
//  aktifkan javascriptnya
    webSettings.javaScriptEnabled = true
//  dipake untuk load komponen dari web spt bootstrap
     webSettings.domStorageEnabled = true
    }

    override fun onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack()
        }else{
            super.onBackPressed()
        }

    }
}