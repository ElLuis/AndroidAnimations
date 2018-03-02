package com.centennial.elluis.sanchez_comp304_a3;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TweenActivity extends AppCompatActivity {
private ImageView earthImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);

        earthImageView = findViewById(R.id.earthImageView);
    }

    public void revolveOnClick(View view) {
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.revolve);

        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        earthImageView.startAnimation(animation);
    }
}
