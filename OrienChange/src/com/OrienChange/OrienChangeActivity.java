package com.OrienChange;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OrienChangeActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(addbtnListener); 

        //asd test

    }
    
    //add btn click listener
    private OnClickListener addbtnListener = new OnClickListener()
    {
        public void onClick(View v)
        {            
    		Intent activity_edit_intent = new Intent(OrienChangeActivity.this, OrienChangeActivity1.class);
    		activity_edit_intent.putExtra("selIndex", 1);  
        	startActivity(activity_edit_intent);
        }
    };    
}