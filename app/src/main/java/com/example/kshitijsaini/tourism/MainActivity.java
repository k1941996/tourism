package com.example.kshitijsaini.tourism;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ViewFlipper;


public class MainActivity extends Activity {
   private ViewFlipper viewFlipper;
    private float lastX;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper=(ViewFlipper)findViewById(R.id.vf);
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
//////////////////////////////////////////////
public boolean onTouchEvent(MotionEvent touchevent) {
     switch (touchevent.getAction()) {
         case MotionEvent.ACTION_DOWN: {
             lastX = touchevent.getX();
             break;
         }
         case MotionEvent.ACTION_UP: {
             float currentX = touchevent.getX();
             if (lastX < currentX) {
                 if (viewFlipper.getDisplayedChild() == 4)
                     break;
                 viewFlipper.setInAnimation(this, R.anim.left);
                 viewFlipper.setOutAnimation(this, R.anim.outright);
                 // Show The Previous Screen
                 viewFlipper.showPrevious();
             }
             // if right to left swipe on screen
             if (lastX > currentX) {
                 if (viewFlipper.getDisplayedChild() == 4)
                     break;
                 viewFlipper.setInAnimation(this, R.anim.right);
                 viewFlipper.setOutAnimation(this, R.anim.outleft);
                 // Show the next Screen
                 viewFlipper.showNext();
             }
             break;
         }
     }
        return false;
}
//////////////////////////////////////////

    public void maha(View view)
    {
        Intent intent=new Intent(this,maharastra.class);
        startActivity(intent);
    }

    public void delhi(View view)
    {
        Intent intent=new Intent(this,Delhi.class);
        startActivity(intent);
    }
    public void hp(View view)
    {
        Intent intent=new Intent(this,Hp.class);
        startActivity(intent);
    }

    public void bihar(View view)
    {
        Intent intent=new Intent(this,Bihar.class);
        startActivity(intent);
    }

    public void jammu(View view)
    {
        Intent intent=new Intent(this,Jammu.class);
        startActivity(intent);
    }

    public void goa(View view)
    {
        Intent intent=new Intent(this,Goa.class);
        startActivity(intent);
    }
    public void kerela(View view)
    {
        Intent intent=new Intent(this,Kerela.class);
        startActivity(intent);
    }
    public void tn(View view)
    {
        Intent intent=new Intent(this,TamilNadu.class);
        startActivity(intent);
    }
    public void up(View view)
    {
        Intent intent=new Intent(this,UttarPradesh.class);
        startActivity(intent);
    }
    public void raj(View view)
    {
        Intent intent=new Intent(this,Rajasthan.class);
        startActivity(intent);
    }
    public void dham(View view)
    {
        Intent intent=new Intent(this,FourDhams.class);
        startActivity(intent);
    }
    public void kar(View view)
    {
        Intent intent=new Intent(this,Karnataka.class);
        startActivity(intent);
    }
    public void ap(View view)
    {
        Intent intent=new Intent(this,Andhra.class);
        startActivity(intent);
    }
    public void ac(View view)
    {
        Intent intent=new Intent(this,Andaman.class);
        startActivity(intent);
    }





}
