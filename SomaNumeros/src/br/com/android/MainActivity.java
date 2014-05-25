package br.com.android;

import android.os.Bundle;
import android.view.*;
import android.app.*;
import android.app.AlertDialog.Builder;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	EditText ednumero1, ednumero2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ednumero1 = (EditText) findViewById(R.id.numero1);
		ednumero2 = (EditText) findViewById(R.id.numero2);
		
		Button btsomar = (Button) findViewById(R.id.btsomar);
		btsomar.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				double num1 = Double.parseDouble(ednumero1.getText().toString());
				double num2 = Double.parseDouble(ednumero2.getText().toString());
				double res = num1 + num2;
				
		
				AlertDialog.Builder dialogo  = new AlertDialog.Builder(MainActivity.this);
				dialogo.setTitle("Veja!");
				dialogo.setMessage("Soma "+res);
				dialogo.setNeutralButton("OK", null);
				dialogo.show();
				
			}
		});
	

		if (savedInstanceState == null) {
			getSupportFragmentManager().beginTransaction()
					.add(R.id.container, new PlaceholderFragment()).commit();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_main, container,
					false);
			return rootView;
		}
	}

}
