
package com.example.animatedstatelistdemo;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by tom on 29/05/2015.
 */
public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.frament_main);

        ImageView alien = (ImageView) findViewById(R.id.alienImage);

        ((AnimationDrawable) alien.getBackground()).start();

        final ImageView selectorAlien = (ImageView) findViewById(R.id.alienImageSelector);

        selectorAlien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectorAlien.setActivated(!selectorAlien.isActivated());
            }
        });

    }
}
