package com.example.pnroy.udemy_ch8_sol;

/**
 * Created by pnroy on 8/13/15.
 */

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras=getIntent().getExtras();
        String FName=extras.getString("FName");
        String LName=extras.getString("LName");
        String Email=extras.getString("Email");

        TextView TvF=(TextView) findViewById(R.id.TVFirstName);
        TextView TvL=(TextView) findViewById(R.id.TVLastName);
        TextView TvEmail=(TextView) findViewById(R.id.TVEmail);

        TvF.setText(FName);
        TvL.setText(LName);
        TvEmail.setText(Email);




    }


}
