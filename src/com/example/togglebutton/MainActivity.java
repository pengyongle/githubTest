package com.example.togglebutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends Activity implements OnCheckedChangeListener{
	
	private ToggleButton tb;
	private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb=(ToggleButton) findViewById(R.id.toggleButton1);
        img=(ImageView) findViewById(R.id.imageView1);
        tb.setOnCheckedChangeListener(this);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onCheckedChanged(CompoundButton arg0, boolean arg1) {
		img.setBackgroundResource(arg1?R.drawable.sword_art_online:R.drawable.kuroko_basuke);
		
	}
    
}
