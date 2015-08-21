package tv.learntoprogram.Android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class L2pLab6StarterActivity extends Activity {
    /** Called when the activity is first created. */
	String resultString;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Button btnResult = (Button)findViewById(R.id.report);
        
        final ToggleButton toggleFun = (ToggleButton)findViewById(R.id.toggleFun);
        
        final CheckBox checkEat = (CheckBox)findViewById(R.id.checkEat);
        final CheckBox checkDrink = (CheckBox)findViewById(R.id.checkDrink);
        final CheckBox checkMerry = (CheckBox)findViewById(R.id.checkMerry);
        
        final RadioButton radioMale = (RadioButton)findViewById(R.id.radioMale);
        final RadioButton radioFemale = (RadioButton)findViewById(R.id.radioFemale);
        
        final Spinner spinnerBands = (Spinner)findViewById(R.id.spinnerBands);
        final String[] bands = new String[]{"Heart", "REO Speedwagon", "Journey", "Styx", "Kansas"};
        ArrayAdapter<String> bandsAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_item, bands);
        
        spinnerBands.setAdapter(bandsAdapter);
        
        resultString = "";
        btnResult.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				resultString += "Fun Button: ";
				if(toggleFun.isChecked()){
					resultString += "On";
				}else
				{
					resultString += "Off";
				}
				resultString += "\nThings I Like To Do: ";
				if(checkEat.isChecked())
				{
					resultString += checkEat.getText();
				}
				if(checkDrink.isChecked())
				{
					resultString += " " + checkDrink.getText();
				}
				if(checkMerry.isChecked())
				{
					resultString += " " + checkMerry.getText();
				}
				resultString += "\nGender: ";
				if(radioMale.isChecked())
				{
					resultString += "Male";
				} else if(radioFemale.isChecked()) {
					resultString += "Female";
				}
				resultString += "\nFavorite Band: " + bands[spinnerBands.getSelectedItemPosition()];
				Toast.makeText(getApplicationContext(), resultString, Toast.LENGTH_SHORT).show();
				resultString = "";
			}
        	
        });
        
        
        
    }
}