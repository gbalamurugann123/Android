package com.OrienChange;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class OrienChangeActivity1 extends Activity {
	int selIndex = 0;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main1);
        selIndex = this.getIntent().getIntExtra("selIndex", -1);
        TextView tv = (TextView)findViewById(R.id.tv);
        
        if(savedInstanceState != null)
        	selIndex = savedInstanceState.getInt("selIndex"); 
        System.out.println("onConfigurationChanged() onCreate"); 
        tv.setText("Value:"+selIndex);
    }
    
    protected void onSaveInstanceState(Bundle outState) {     
    	super.onSaveInstanceState(outState);     
    	outState.putInt("selIndex", selIndex); 
    } 
    
    public void onConfigurationChanged(Configuration newConfig) { 
        //don't reload the current page when the orientation is changed 
    	System.out.println("onConfigurationChanged() Called"); 
        super.onConfigurationChanged(newConfig); 
        System.out.println("onConfigurationChanged() Called"); 
    } 

}
