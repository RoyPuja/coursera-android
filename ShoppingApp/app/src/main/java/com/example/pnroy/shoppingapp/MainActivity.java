package com.example.pnroy.shoppingapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.CheckBox;
import android.widget.TextView;
import java.util.ArrayList;

import java.util.HashMap;


public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox check1 = (CheckBox) findViewById(R.id.chk1);
        final CheckBox check2 = (CheckBox)findViewById(R.id.chk2);
        final CheckBox check3 = (CheckBox)findViewById(R.id.chk3);
        final CheckBox check4 = (CheckBox)findViewById(R.id.chk4);
        final Button button = (Button) findViewById(R.id.btnBuy);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                Intent intent = new Intent(MainActivity.this, CheckoutActivity.class);
               if(check1.isChecked()){
                   intent.putExtra("ItemName1","Shirt");
                   intent.putExtra("Price1","$40");


               }
                if (check2.isChecked()){
                   intent.putExtra("ItemName2","Trouser");
                   intent.putExtra("Price2","$40");

               }
                if(check3.isChecked()){
                   intent.putExtra("ItemName3","Sweater");
                   intent.putExtra("Price3","$40");

               }
                if(check4.isChecked()) {
                   intent.putExtra("ItemName4", "Shoes");
                   intent.putExtra("Price4", "$40");

               }
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
