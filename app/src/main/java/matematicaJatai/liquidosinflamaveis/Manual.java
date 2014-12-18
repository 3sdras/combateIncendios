package matematicaJatai.liquidosinflamaveis;

//import com.androidengineer.formatted.CharSequence;
//import com.androidengineer.formatted.TextView;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Manual extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_manual);
		
		Button manualHome = (Button) findViewById(R.id.manualHomeButton); 
	    manualHome.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
								goHome();
	    	}
	    	});
	    /*
	    final String conceitosBasicos =  "<h2>Manual</h2>  <br> " 				+
            "<p>Realizar os cálculos para dimensionamento do sistema de combate "
            + "a incêndio em tanques aéreos contendo líquidos combustíveis e inflamáveis "
            + "pode ser complicado e demorado. Entretanto, a eficiência do combate exige a"
            + " precisão desses resultados.</p>  <br>" 
            + 
            "<p>Este aplicativo foi desenvolvido como alternativa para o dimensionamento "
            + "dos sistemas de resfriamento e espumas para tanques em chamas momento do "
            + "combate ao incêndio, considerando que os sistemas não foram instalados ou "
            + "foram danificados pelo fogo. Logo, o resfriamento e o combate com espuma "
            + "será feito apenas por linhas manuais e/ou canhões monitores. </p> <br>" 
            +
            "<p> Os dados de entrada são as dimensões do tanque em chamas e o tipo de "
            + "líquido combustível ou inflamável. O programa executa os cálculos e "
            + "dimensiona a quantidade de água, LGE e os equipamentos necessários para o "
            + "combate, o que facilita o serviço operacional e proporciona um planejamento "
            + "adequado das ações.</p>"			+
            
            "<p>Para os cálculos são utilizadas as concentrações usuais de LGE de 3% para"
            + " hidrocarboneto e 6% para solventes polares.</p>"
            +
              "<p>Este é um software de apoio, que não substitui um profissional bem instruído."
            + "O uso deve ser responsável, e os resultados, preferencialmente, conferidos "
            + "segundo as instruções oferecidas nos cursos de formação correspondentes.</p>"
            ; 
	    
	        
	    TextView teXte2 = (TextView) findViewById(R.id.manualTextView2);
		teXte2.setText(Html.fromHtml(conceitosBasicos));

        */

        WebView browser = (WebView) findViewById(R.id.webviewManual);

        browser.loadUrl("file:///android_asset/www/manual.html");
	    
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
