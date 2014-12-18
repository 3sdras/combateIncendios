package matematicaJatai.liquidosinflamaveis;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Point;
import android.text.Html;
import android.view.Display;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Sobre extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sobre);
		
		Button sobreHome = (Button) findViewById(R.id.sobreHomeButton); 
	    sobreHome.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
								goHome();
	    	}
	    	});

        WebView browser = (WebView) findViewById(R.id.webviewSobre);

        browser.loadUrl("file:///android_asset/www/sobre.html");
		
	}
	    
	    
	    @Override
		public boolean onCreateOptionsMenu(Menu menu) {
			// Inflate the menu; this adds items to the action bar if it is present.
			getMenuInflater().inflate(R.menu.manual, menu);
			return true;
		}
		
		 private void goHome() {
				Intent goHome = new Intent(this, MainActivity.class);
	            startActivity(goHome);
		    }
	    
	}