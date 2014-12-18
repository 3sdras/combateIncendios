package matematicaJatai.liquidosinflamaveis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;

public class TanquesVizinhos extends Activity {

	public static String value_tipoInflamavel;
	public static String value_PosicaoTanque;
	public static float value_Diametro;
	public static float value_Altura;
	public static float value_Vizinhos;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tanquesvizinhos);
		
		// SE VC FEZ O BUNDLE NA ACTIVITY ANTERIOR, TEM QUE 
		// PEGAR O BUNDLE NESTA ACTIVITY COM O CÓDIGO ABAIXO
		// DO CONTRÁRIO DÁ ERRO...
		Bundle b = getIntent().getExtras();
        if (b != null){
        	value_tipoInflamavel = b.getString("valorTipoInflamavel");
        	//bundle.getString com o segundo argumento só a partir da api level 12...
        	value_PosicaoTanque = b.getString("valorPosicaoTanque");
        	value_Diametro = b.getFloat("valorDiametro",0);
        	value_Altura = b.getFloat("valorAltura",0);  
        	value_Vizinhos = b.getFloat("valorVizinhos",0);  
        } 
        
        Button calcHome = (Button) findViewById(R.id.homeCalc2); //BOTÃO HOMECALC2 /= BOTÃO HOMECALC
	    calcHome.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
								goHome();
	    	}
	    	});
	    
	    Button resultButton = (Button) findViewById(R.id.botaoCalcular2); 
	    resultButton.setOnClickListener(new OnClickListener() {
	    		    	
			public void onClick(View arg0) {		
				//Spinner sp5 = (Spinner)findViewById(R.id.spinner5);
				//final Integer valVizinhos = (Integer) sp5.getSelectedItem();
				//if (valVizinhos == 0) { goHome();} else {toCalc2();}
				toResultados();
	    	}
	    	});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tanques_vizinhos, menu);
		return true;
	}
	
	private void goHome() { //MESMO MÉTODO (INCLUSIVE NOME) DA CLASSE CALCULO1
		Intent goHome = new Intent(this, MainActivity.class);
		 Bundle b = new Bundle();			 
		 goHome.putExtras(b);
         startActivity(goHome);
    }
	
	 private void toResultados() {
			Intent toResultados = new Intent(this, Resultados.class); 
			 Bundle b = new Bundle();	
			 
			// Spinner sp1 = (Spinner)findViewById(R.id.spinner1);
			// String valorTipoInflamavel = sp1.getSelectedItem().toString();
			// b.putString("valorTipoInflamavel",valorTipoInflamavel);
			 
			 Spinner spV2 = (Spinner)findViewById(R.id.spinnerV2);
			 String valorPosTanqViz = spV2.getSelectedItem().toString();
			 b.putString("valorPosTanqViz",valorPosTanqViz);
			 
			 Spinner spV3 = (Spinner)findViewById(R.id.spinnerV3);
			 String stringValorNumViz = spV3.getSelectedItem().toString();
			 Float valorNumViz = Float.parseFloat(stringValorNumViz);
			 b.putFloat("valorNumViz",valorNumViz);
			 
			 Spinner spV4 = (Spinner)findViewById(R.id.spinnerV4);
			 String stringValorDViz = spV4.getSelectedItem().toString();
			 Float valorDViz = Float.parseFloat(stringValorDViz);
			 b.putFloat("valorDViz",valorDViz);
			 
			 Spinner spV5 = (Spinner)findViewById(R.id.spinnerV5);
			 String stringValorAViz = spV5.getSelectedItem().toString();
			 Float valorAViz = Float.parseFloat(stringValorAViz);
			 b.putFloat("valorAViz",valorAViz);
			 
			 b.putString("value_tipoInflamavel", value_tipoInflamavel);
	         b.putString("value_PosicaoTanque",value_PosicaoTanque);
	         b.putFloat("value_Diametro",value_Diametro);
	         b.putFloat("value_Altura",value_Altura);  
	         b.putFloat("value_Vizinhos",value_Vizinhos); 
			 
			 toResultados.putExtras(b);
	         startActivity(toResultados);
	    }

}
