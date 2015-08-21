package com.example.pnroy.udemy_ch8_sol;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView TVFName=(TextView) findViewById(R.id.TVFirstName);
        final TextView TVLName=(TextView) findViewById(R.id.TVLastName);
        final TextView TVEmail=(TextView) findViewById(R.id.TvEmail);

        Button btn=(Button) findViewById(R.id.btnNext);
        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent myIntent=new Intent(getApplicationContext(),SecondActivity.class);
               String FirstName=TVFName.getText().toString();
                String LastName=TVLName.getText().toString();
                String Email=TVEmail.getText().toString();
                myIntent.putExtra("FName",FirstName);
                myIntent.putExtra("LName",LastName);
                myIntent.putExtra("Email",Email);
                startActivity(myIntent);

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
