package com.example.newbostonmenu;

import android.support.v7.app.ActionBarActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		RelativeLayout rl=(RelativeLayout) findViewById(R.id.rlayout);
		
		switch(item.getItemId()){
		case R.id.menu_red:
			if(item.isChecked()){
				item.setChecked(false);
			}
			else
				item.setChecked(true);
			rl.setBackgroundColor(Color.RED);
			return true;
			 
		case R.id.menu_green:
			if(item.isChecked()){
				item.setChecked(false);
			}
			else
				item.setChecked(true);
			rl.setBackgroundColor(Color.GREEN);
			return true;
			
		case R.id.menu_yellow:
			if(item.isChecked()){
				item.setChecked(false);
			}
			else
				item.setChecked(true);
			rl.setBackgroundColor(Color.YELLOW);	
		 return true;
		 
		default:  super.onOptionsItemSelected(item); return true;
		} 


		
	}
}
