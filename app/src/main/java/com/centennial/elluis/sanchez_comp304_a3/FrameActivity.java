package com.centennial.elluis.sanchez_comp304_a3;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameActivity extends AppCompatActivity {

    private ImageView imageView;
    private AnimationDrawable canoeAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        imageView = findViewById(R.id.animationIV);
        if (imageView == null) throw new AssertionError();

        imageView.setVisibility(View.INVISIBLE);
        imageView.setBackgroundResource(R.drawable.canoe_animation);

        canoeAnimation = (AnimationDrawable) imageView.getBackground();
    }

    public void startAnimationOnClick(View view) {
        imageView.setVisibility(View.VISIBLE);
        if(canoeAnimation.isRunning())
        {
            canoeAnimation.stop();
        }
        canoeAnimation.start();
    }

    public void stopAnimationOnClick(View view) {
        canoeAnimation.stop();
    }
}
