package com.amer.dancee;

import com.amer.dancee.R.string;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Samyuthatypes extends Activity {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_samyuthatypes);
		 b1=(Button) findViewById(R.id.but1);	
		    b2=(Button) findViewById(R.id.but2);	
		    b3=(Button) findViewById(R.id.but3);	
		    b4=(Button) findViewById(R.id.but4);	
		    b5=(Button) findViewById(R.id.but5);	
		    b6=(Button) findViewById(R.id.but6);	
		    b7=(Button) findViewById(R.id.but7);	
		    b8=(Button) findViewById(R.id.but8);	
		    b9=(Button) findViewById(R.id.but9);	
		    b10=(Button) findViewById(R.id.but10);	
		    b11=(Button) findViewById(R.id.but11);	
		    b12=(Button) findViewById(R.id.but12);	
		    b13=(Button) findViewById(R.id.but13);	
		    b14=(Button) findViewById(R.id.but14);	
		    b15=(Button) findViewById(R.id.but15);	
		    b16=(Button) findViewById(R.id.but16);	
		    b17=(Button) findViewById(R.id.but17);	
		    b18=(Button) findViewById(R.id.but18);	
		    b19=(Button) findViewById(R.id.but19);	
		    b20=(Button) findViewById(R.id.but20);	
		    b21=(Button) findViewById(R.id.but21);	
		    b22=(Button) findViewById(R.id.but22);	
		    b23=(Button) findViewById(R.id.but23);	
		    b24=(Button) findViewById(R.id.but24);	
		    b1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent il1=new Intent(Samyuthatypes.this,Salutation.class);
					startActivity(il1);

				}
			});
		    
		    b2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib2=new Intent(Samyuthatypes.this,Pigeon.class);
					startActivity(ib2);

				}
			});
		    
		    b3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib3=new Intent(Samyuthatypes.this,Crab.class);
					startActivity(ib3);

				}
			});
		    
		    b4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib4=new Intent(Samyuthatypes.this,Crossed.class);
					startActivity(ib4);

				}
			});
		    
		    b5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib5=new Intent(Samyuthatypes.this,Swing.class);
					startActivity(ib5);

				}
			});
		    
		    b6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib6=new Intent(Samyuthatypes.this,Handfulofflowers.class);
					startActivity(ib6);

				}
			});
		    
		    b7.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib7=new Intent(Samyuthatypes.this,Embrace.class);
					startActivity(ib7);

				}
			});
		    
		    b8.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib8=new Intent(Samyuthatypes.this,Lingaofshiva.class);
					startActivity(ib8);

				}
			});
		    
		    b9.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib9=new Intent(Samyuthatypes.this,Braceletincrease.class);
					startActivity(ib9);

				}
			});
		    
		    b10.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib10=new Intent(Samyuthatypes.this,Crossedscissor.class);
					startActivity(ib10);

				}
			});
		    
		    b11.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib11=new Intent(Samyuthatypes.this,Cart.class);
					startActivity(ib11);

				}
			});
		    
		    b12.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib12=new Intent(Samyuthatypes.this,Conch.class);
					startActivity(ib12);

				}
			});
		    
		    b13.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib13=new Intent(Samyuthatypes.this,Discus.class);
					startActivity(ib13);

				}
			});
		    
		    b14.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib14=new Intent(Samyuthatypes.this,Casket.class);
					startActivity(ib14);

				}
			});    
		    b15.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib15=new Intent(Samyuthatypes.this,String.class);
					startActivity(ib15);

				}
			});    
		    b16.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib16=new Intent(Samyuthatypes.this,Bond.class);
					startActivity(ib16);

				}
			});
		    
		    b17.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib17=new Intent(Samyuthatypes.this,Fish.class);
					startActivity(ib17);

				}
			});
		    
		    b18.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib18=new Intent(Samyuthatypes.this,Koormah.class);
					startActivity(ib18);

				}
			});    
		    b19.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib19=new Intent(Samyuthatypes.this,Boar.class);
					startActivity(ib19);

				}
			});
		    
		    b20.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib20=new Intent(Samyuthatypes.this,Mythicalbird.class);
					startActivity(ib20);

				}
			});
		    
		    b21.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib21=new Intent(Samyuthatypes.this,Serpentfetter.class);
					startActivity(ib21);

				}
			});
		    
		    b22.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib22=new Intent(Samyuthatypes.this,Bedstead.class);
					startActivity(ib22);

				}
			});
		    
		    b23.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent ib23=new Intent(Samyuthatypes.this,Mythicalbirdwithtwoheads.class);
					startActivity(ib23);

				}
			});
		    
		    b24.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Intent il24=new Intent(Samyuthatypes.this,Doublehandposes.class);
					startActivity(il24);

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
