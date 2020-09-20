package com.example.kshitijsaini.tourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class maharastra extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maharastra);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_maharastra, menu);
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


    public void tajh(View view)
    {
        Intent intent=new Intent(this,TajHotel.class);
        startActivity(intent);
    }
    public void siddhivinayak(View view)
    {
        Intent intent=new Intent(this,Siddhivinayak.class);
        startActivity(intent);
    }
    public void gateway(View view)
    {
        Intent intent=new Intent(this,GatewayOfIndia.class);
        startActivity(intent);
    }
    public void elephanta(View view)
    {
        Intent intent=new Intent(this,ElephantaCaves.class);
        startActivity(intent);
    }
    public void lakshmi(View view)
    {
        Intent intent=new Intent(this,Lakshmi.class);
        startActivity(intent);
    }
}
