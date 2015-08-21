package com.example.pnroy.shoppingapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import static com.example.pnroy.shoppingapp.Constants.Name;
import static com.example.pnroy.shoppingapp.Constants.Price;
/**
 * Created by pnroy on 8/16/15.
 */
public class CheckoutActivity extends Activity {
    private ArrayList<HashMap<String,String>> list;
    String itemName1;
    String itemPrice1;
    String itemName2;
    String itemPrice2;
    String itemName3;
    String itemPrice3;
    String itemName4;
    String itemPrice4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Bundle bundle = getIntent().getExtras();
         itemName1 = bundle.getString("ItemName1");
         itemPrice1 = bundle.getString("Price1");
         itemName2 = bundle.getString("ItemName2");
         itemPrice2 = bundle.getString("Price2");

         itemName3 = bundle.getString("ItemName3");
         itemPrice3 = bundle.getString("Price3");
         itemName4 = bundle.getString("ItemName4");
         itemPrice4 = bundle.getString("Price4");

        ListView listview=(ListView)findViewById(R.id.LVItems);
        populateList();
        ListViewAdapter adapter=new ListViewAdapter(this,list);
        listview.setAdapter(adapter);

    }

private void populateList(){
    list=new ArrayList<HashMap<String,String>>();
    if(itemName1 != null){
        HashMap<String,String> temp=new HashMap<String,String>();
        temp.put(Name,itemName1);
        temp.put(Price,itemPrice1);
        list.add(temp);
    }
    if(itemName2 != null) {
        HashMap<String, String> temp1 = new HashMap<String, String>();
        temp1.put(Name, itemName2);
        temp1.put(Price, itemPrice2);
        list.add(temp1);
    }
    if(itemName3 != null){
        HashMap<String,String> temp=new HashMap<String,String>();
        temp.put(Name,itemName3);
        temp.put(Price,itemPrice3);
        list.add(temp);
    }
    if(itemName4 != null) {
        HashMap<String, String> temp1 = new HashMap<String, String>();
        temp1.put(Name, itemName4);
        temp1.put(Price, itemPrice4);
        list.add(temp1);
    }


}

}
