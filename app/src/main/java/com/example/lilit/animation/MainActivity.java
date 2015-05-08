package com.example.lilit.animation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private Button fade;
    private Button zoom;
    private Button move;
    private Button rotate;
    private ImageView myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myImage = (ImageView) findViewById(R.id.image);
        fade = (Button) findViewById(R.id.fade);
        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            fadeAnimation();
            }
        });
        zoom = (Button) findViewById(R.id.zoom);
        zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scaleAnimation();
            }
        });
        rotate = (Button) findViewById(R.id.rotate);
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateAnimation();
            }
        });

        move = (Button) findViewById(R.id.move);
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveAnimation();
            }
        });

    }

    private void fadeAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.fade );
        myImage.startAnimation(animation);

    }
    private void scaleAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale );
        myImage.startAnimation(animation);
    }
    private void rotateAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate );
        myImage.startAnimation(animation);
    }

    private void moveAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.move );
        myImage.startAnimation(animation);

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
