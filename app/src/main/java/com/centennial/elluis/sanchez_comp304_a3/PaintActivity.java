package com.centennial.elluis.sanchez_comp304_a3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class PaintActivity extends AppCompatActivity {

    ImageView reusableImageView;

    //
    int startx = 10;
    int starty = 10;
    int endx=10;
    int endy=10;
    //
    Paint paint;
    Bitmap bitmap;
    Canvas canvas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paint);

        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(20);
        //creating a bitmap as content view for the canvas
        bitmap = Bitmap.createBitmap((int) getWindowManager()
                .getDefaultDisplay().getWidth(), (int) getWindowManager()
                .getDefaultDisplay().getHeight(), Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);
        //canvas.drawColor(Color.parseColor("d99ca0"));
        //
        reusableImageView = findViewById(R.id.ImageViewForDrawing);
        //setting a bitmap as content view for the image
        reusableImageView.setImageBitmap(bitmap);
        canvas.drawColor(Color.parseColor("#d99ca0"));
      //spinner instance
        Spinner strokeSpinner = findViewById(R.id.thicknessSpinner);
        //Line thickness selection
        strokeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        paint.setStrokeWidth(14);
                        break;
                    case 1:
                        paint.setStrokeWidth(16);
                        break;
                    case 2:
                        paint.setStrokeWidth(18);
                        break;
                    case 3:
                        paint.setStrokeWidth(20);
                        break;
                    case 4:
                        paint.setStrokeWidth(22);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                paint.setStrokeWidth(12);
            }
        });


    //Draw line method

    }

    //Draw Line method | PARAMS: int keyCode, Canvas canvas
    public void drawLine()
    {
        canvas.drawLine(startx, starty, endx, endy, paint);
        startx=endx;
        starty=endy;

    }

    //Clicking arrow images
    public void leftOnClick(View view) {
        reusableImageView.setFocusable(true);
        reusableImageView.requestFocus();
        endx-= 5;
        drawLine();
        reusableImageView.invalidate();
    }

    public void rightOnClick(View view) {
        reusableImageView.setFocusable(true);
        reusableImageView.requestFocus();
        endx+= 5;
        drawLine();
        reusableImageView.invalidate();
    }

    public void upOnClick(View view) {
        reusableImageView.setFocusable(true);
        reusableImageView.requestFocus();
        endy-= 5;
        drawLine();
        reusableImageView.invalidate();
    }

    public void downOnClick(View view) {
        reusableImageView.setFocusable(true);
        reusableImageView.requestFocus();
        endy+= 5;
        drawLine();
        reusableImageView.invalidate();
    }

    //PICK COLOR
    public void GoldColorOnClick(View view)
    {
        paint.setColor((Color.YELLOW));
    }

    public void BlueColorOnClick(View view) {
        paint.setColor(Color.parseColor("#2186f2"));
    }

    public void WhiteColorOnClick(View view) {
        paint.setColor(Color.WHITE);
    }

    //CLEAR CANVAS
    public void clearCanvas(View view) {
        canvas.drawColor(Color.parseColor("#d99ca0"));
    }

}
