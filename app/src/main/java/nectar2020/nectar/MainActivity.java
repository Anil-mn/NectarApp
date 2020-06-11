package nectar2020.nectar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
  private WebView mywebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mywebview = (WebView)findViewById(R.id.webview);
        WebSettings webSetting = mywebview.getSettings();
        webSetting.setJavaScriptEnabled(true);
        mywebview.loadUrl("http://www.nectar2020.in");
        mywebview.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(mywebview.canGoBack()){
            mywebview.goBack();
        }
        else {
        super.onBackPressed();
        }
    }
}
