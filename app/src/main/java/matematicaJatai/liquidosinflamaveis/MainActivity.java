package matematicaJatai.liquidosinflamaveis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
    
    Button calcButton = (Button) findViewById(R.id.botaoCalculo); 
    calcButton.setOnClickListener(new OnClickListener() {
		public void onClick(View arg0) {
			//ao pressionar o botão, a linha abaixo apenas confirma o pressionamento
			//Toast.makeText(TexturaActivity.this, "Botão Embrapa Pressionado", Toast.LENGTH_SHORT).show();
			// e esta linha é responsável por iniciar a outra atividade.
			startCalc();
    	}
    	});
    
    Button manualButton = (Button) findViewById(R.id.botaoManual); 
    manualButton.setOnClickListener(new OnClickListener() {
		public void onClick(View arg0) {
			startManual();
    	}
    	});
    
    Button manualConvert = (Button) findViewById(R.id.botaoConvert); 
    manualConvert.setOnClickListener(new OnClickListener() {
		public void onClick(View arg0) {
			startConvert();
    	}
    	});
    
    Button sobreButton = (Button) findViewById(R.id.botaoCreditos); 
    sobreButton.setOnClickListener(new OnClickListener() {
		public void onClick(View arg0) {
			startSobre();
    	}
    	});
    
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    private void startCalc() {
		Intent startCalc = new Intent(this, Calculo1.class);
		 Bundle b = new Bundle(); 		 
		 startCalc.putExtras(b);
        startActivity(startCalc);
    }
    
    private void startManual() {
		Intent startManual = new Intent(this, Manual.class);
		startActivity(startManual);
    }
    
    private void startConvert() {
		Intent startConvert = new Intent(this, Convert.class);
		startActivity(startConvert);
    }
    
    private void startSobre() {
		Intent startSobre = new Intent(this, Sobre.class);
		startActivity(startSobre);
    }
    
    
}
