package matematicaJatai.liquidosinflamaveis;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class Convert extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_convert);
		
		
		Button homeButton3 = (Button) findViewById(R.id.homeButt3); 
	    homeButton3.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
								goHome();
	    	}
	    	});	    
	    
	    Button botaoQconverte = (Button) findViewById(R.id.buttonConvert); 
		botaoQconverte.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				
				// vou definir estas coisas aqui dentro pq se definir fora, 
				// pode acontecer de tentar pegar um float de um edittext 
				// no início da atividade. 
				// colocando aqui garantimos que tudo só acontece depois de
				// clicado um botão
				
				 Spinner unit1 = (Spinner)findViewById(R.id.spinner1);
					final String stringUnit1 = unit1.getSelectedItem().toString(); 

					Spinner unit2 = (Spinner)findViewById(R.id.spinner2);
			    	final String stringUnit2 = unit2.getSelectedItem().toString(); 
			    	
			    	final EditText entradaNumerica = (EditText) findViewById(R.id.editText1); 
			    	System.out.print(entradaNumerica);
					final float entradaNumericaFloat = Float.valueOf(entradaNumerica.getText().toString()); 
					System.out.print(entradaNumericaFloat);
					final TextView resposta = (TextView) findViewById(R.id.textView3);

                    //para evitar notação científica, usar isso e a conversão final para string:
                    NumberFormat formatter = new DecimalFormat("######################.#####################");

                    float vezesMil = entradaNumericaFloat *1000f;
					final String svezesMil1 = Float.toString(vezesMil);

					float divMil = entradaNumericaFloat / 1000f;
					final String sdivMil1 = Float.toString(divMil);
					
					float vezesMilhao = entradaNumericaFloat *1000000f;
					final String svezesMilhao1 = Float.toString(vezesMilhao);

					float divMilhao = entradaNumericaFloat / 1000000f;
					final String sdivMilhao1 = Float.toString(divMilhao);

                    // essa é a parte final da string pra não aparecer notação científica
					double a = Double.parseDouble(svezesMil1);
					String svezesMil = formatter.format(a);

                    double b = Double.parseDouble(sdivMil1);
                    String sdivMil = formatter.format(b);

                    double c = Double.parseDouble(svezesMilhao1);
                    String svezesMilhao = formatter.format(c);

                    double d = Double.parseDouble(sdivMilhao1);
                    String sdivMilhao = formatter.format(d);



                if (stringUnit1.equals("Litros") && stringUnit2.equals("Centímetros cúbicos"))
					resposta.setText(svezesMil);//(svezesMil);
				if (stringUnit1.equals("Litros") && stringUnit2.equals("Metros cúbicos")) 
					resposta.setText(sdivMil);
				
				if (stringUnit1.equals("Centímetros cúbicos") && stringUnit2.equals("Litros")) 
					resposta.setText(sdivMil);
				if (stringUnit1.equals("Centímetros cúbicos") && stringUnit2.equals("Metros cúbicos")) 
					resposta.setText(sdivMilhao);				
				
				if (stringUnit1.equals("Metros cúbicos") && stringUnit2.equals("Litros")) 
					resposta.setText(svezesMil);
				if (stringUnit1.equals("Metros cúbicos") && stringUnit2.equals("Centímetros cúbicos")) 
					resposta.setText(svezesMilhao);
	    	
			}
	    	});			
	   	
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.convert, menu);
		return true;
	}
	
	private void goHome() { //MESMO MÉTODO (INCLUSIVE NOME) DA CLASSE CALCULO1
		Intent goHome = new Intent(this, MainActivity.class);
		 Bundle b = new Bundle();			 
		 goHome.putExtras(b);
         startActivity(goHome);
    }

}
