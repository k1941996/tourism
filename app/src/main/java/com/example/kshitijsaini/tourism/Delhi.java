package com.example.kshitijsaini.tourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Delhi extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delhi);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_delhi, menu);
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

    public void aksh(View view)
    {
        Intent intent=new Intent(this,Akshardham.class);
        startActivity(intent);
    }
    public void redfort(View view)
    {
        Intent intent=new Intent(this,RedFort.class);
        startActivity(intent);
    }
    public void qutab(View view)
    {
        Intent intent=new Intent(this,Qutab.class);
        startActivity(intent);
    }
    public void indiagate(View view)
    {
        Intent intent=new Intent(this,IndiaGate.class);
        startActivity(intent);
    }
    public void guru(View view)
    {
        Intent intent=new Intent(this,Guru.class);
        startActivity(intent);
    }



}
