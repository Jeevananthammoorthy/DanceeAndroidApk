package com.amer.dancee;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Type3 extends Activity {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_type3);
		 b1=(Button) findViewById(R.id.b1);	
		    b2=(Button) findViewById(R.id.b2);	
		    b3=(Button) findViewById(R.id.b3);	
		    b4=(Button) findViewById(R.id.b4);	
		    b5=(Button) findViewById(R.id.b5);	
		    b6=(Button) findViewById(R.id.b6);	
		    b7=(Button) findViewById(R.id.b7);	
		    b8=(Button) findViewById(R.id.b8);	
		    b9=(Button) findViewById(R.id.b9);	
		    b10=(Button) findViewById(R.id.b10);	
		    b11=(Button) findViewById(R.id.b11);	
		    b12=(Button) findViewById(R.id.b12);	
		    b13=(Button) findViewById(R.id.b13);	
		    b14=(Button) findViewById(R.id.b14);	
		    b15=(Button) findViewById(R.id.b15);	
		    b16=(Button) findViewById(R.id.b16);	
		    b17=(Button) findViewById(R.id.b17);	
		    b18=(Button) findViewById(R.id.b18);	
		    b19=(Button) findViewById(R.id.b19);	
		    b20=(Button) findViewById(R.id.b20);	
		    b21=(Button) findViewById(R.id.b21);	
		    b22=(Button) findViewById(R.id.b22);	
		    b23=(Button) findViewById(R.id.b23);	
		    b24=(Button) findViewById(R.id.b24);	
		    b25=(Button) findViewById(R.id.b25);	
		    b26=(Button) findViewById(R.id.b26);	
		    b27=(Button) findViewById(R.id.b27);	
		    b28=(Button) findViewById(R.id.b28);	
		    b29=(Button) findViewById(R.id.b29);	
		    b1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent il=new Intent(Type3.this,Fla.class);
					startActivity(il);

				}
			});
		   
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
}
