package matematicaJatai.liquidosinflamaveis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Spinner;

public class Calculo1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculo1);
		
		//final Integer valVizinhos = null;
		
		//Typeface regLi = Typeface.createFromAsset(getAssets(), "fonts/RegencieLight.ttf");
	//	Typeface yox = Typeface.createFromAsset(getAssets(), "fonts/YOXALL_B.ttf");
		

				
		Button calcHome = (Button) findViewById(R.id.homeCalc); 
	    calcHome.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
								goHome();
	    	}
	    	});
	    
	    Button calc2Button = (Button) findViewById(R.id.botaoCalcular1); 
	    calc2Button.setOnClickListener(new OnClickListener() {
	    	
	    	
	    		    	
			public void onClick(View arg0) {		
	//			// posso chamar o spinner sp5 duas vezes: uma aqui dentro do onClick do
	//			// calc2Button e outra no final, dentro do intent toCalcfinal1
	//			Spinner sp5 = (Spinner)findViewById(R.id.spinner5);
	//			String stringValorVizinhos = sp5.getSelectedItem().toString(); 
	//			Float valorVizinhos = Float.parseFloat(stringValorVizinhos);
				
	//			if (valorVizinhos == 0) { toCalcfinal1();} else {toCalc2();}
	    	toCalcfinal1();
				
	    	}
	    	});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculo1, menu);
		return true;
	}
	
	 private void goHome() {
			Intent goHome = new Intent(this, MainActivity.class);
			 Bundle b = new Bundle();			 
			 goHome.putExtras(b);
	         startActivity(goHome);
	    }
//	 private void toCalc2() {
//			Intent toCalc2 = new Intent(this, TanquesVizinhos.class); 
//			 Bundle b = new Bundle();			 
//			 toCalc2.putExtras(b);
//	         startActivity(toCalc2);
//	    }
	 private void toCalcfinal1() {
			Intent toCalcfinal1 = new Intent(this, Resultados.class); 
			 Bundle b = new Bundle();	
			 
			 Spinner sp1 = (Spinner)findViewById(R.id.spinner1);
			 String valorTipoInflamavel = sp1.getSelectedItem().toString();
			 b.putString("valorTipoInflamavel",valorTipoInflamavel);
			 
			 Spinner sp2 = (Spinner)findViewById(R.id.spinner2);
			 String valorPosicaoTanque = sp2.getSelectedItem().toString();
			 b.putString("valorPosicaoTanque",valorPosicaoTanque);
			 
			 Spinner sp3 = (Spinner)findViewById(R.id.spinner3);
			 String stringValorDiametro = sp3.getSelectedItem().toString();
			 Float valorDiametro = Float.parseFloat(stringValorDiametro);
			 b.putFloat("valorDiametro",valorDiametro);
			 
			 Spinner sp4 = (Spinner)findViewById(R.id.spinner4);
			 String stringValorAltura = sp4.getSelectedItem().toString();
			 Float valorAltura = Float.parseFloat(stringValorAltura);  
			 b.putFloat("valorAltura",valorAltura);
			 
			// Spinner sp5 = (Spinner)findViewById(R.id.spinner5);
			// String stringValorVizinhos = sp5.getSelectedItem().toString(); 
			// Float valorVizinhos = Float.parseFloat(stringValorVizinhos);
			// b.putFloat("valorVizinhos",valorVizinhos);
			 
			 toCalcfinal1.putExtras(b);
	         startActivity(toCalcfinal1);
	    }

}
