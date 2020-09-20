package com.example.kshitijsaini.tourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class TamilNadu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil_nadu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_tamil_nadu, menu);
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

    public void menakshi(View view)
    {
        Intent intent=new Intent(this,Men.class);
        startActivity(intent);
    }
    public void bri(View view)
    {
        Intent intent=new Intent(this,Bri.class);
        startActivity(intent);
    }
    public void vivek(View view)
    {
        Intent intent=new Intent(this,Vivek.class);
        startActivity(intent);
    }
    public void nilgiri(View view)
    {
        Intent intent=new Intent(this,Nilgiri.class);
        startActivity(intent);
    }
    public void ram(View view)
    {
        Intent intent=new Intent(this,Ram.class);
        startActivity(intent);
    }

}
