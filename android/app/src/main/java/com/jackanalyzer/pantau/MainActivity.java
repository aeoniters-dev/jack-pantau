package com.jackanalyzer.pantau;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Jack Pantau APK V1.0: buka app pantau (GitHub Pages) dalam WebView. Isi app update sendiri (tak perlu APK baru).
public class MainActivity extends Activity {
    private static final String URL = "https://aeoniters-dev.github.io/jack-pantau/";
    private WebView w;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        getWindow().setStatusBarColor(Color.parseColor("#071016"));
        w = new WebView(this);
        w.setBackgroundColor(Color.parseColor("#071016"));
        setContentView(w);
        WebSettings s = w.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);          // simpan sesi log masuk
        s.setCacheMode(WebSettings.LOAD_DEFAULT);
        w.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView v, WebResourceRequest r, WebResourceError e) {
                if (r.isForMainFrame()) {
                    v.loadDataWithBaseURL(null,
                        "<html><body style='background:#071016;color:#d7e6ee;font-family:monospace;padding:24px'>"
                        + "<h3 style='color:#35d7ff;letter-spacing:2px'>JACK PANTAU</h3><p>Tiada sambungan internet.</p>"
                        + "<button style='padding:12px 18px;font-family:monospace' onclick=\"location.href='" + URL + "'\">CUBA LAGI</button>"
                        + "</body></html>", "text/html", "utf-8", null);
                }
            }
        });
        if (b != null) w.restoreState(b); else w.loadUrl(URL);
    }

    @Override
    protected void onSaveInstanceState(Bundle o) { super.onSaveInstanceState(o); w.saveState(o); }

    @Override
    public void onBackPressed() { if (w.canGoBack()) w.goBack(); else super.onBackPressed(); }
}
