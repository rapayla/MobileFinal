package com.example.nard.finalsinmobilecomputing;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by nard on 10/4/2016.
 */
public class quadrant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quadrant);

        final ImageView qd = (ImageView) findViewById(R.id.quad);
        final EditText xa = (EditText) findViewById(R.id.editText3);
        final EditText xb = (EditText) findViewById(R.id.editText4);
        final EditText ya = (EditText) findViewById(R.id.editText6);
        final EditText yb = (EditText) findViewById(R.id.editText7);
        final EditText xdiff = (EditText) findViewById(R.id.editText5);
        final EditText ydiff = (EditText) findViewById(R.id.editText8);
        final EditText mo = (EditText) findViewById(R.id.editText9);
        final EditText quad = (EditText) findViewById(R.id.editText10);

        qd.setOnTouchListener(new View.OnTouchListener() {
            float x1, x2, y1, y2;

            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();

                switch (action) {
                    case MotionEvent.ACTION_DOWN:
                        x1 = motionEvent.getX();
                        y1 = motionEvent.getY();
                        xa.setText(String.format("%.2f", x1));
                        ya.setText(String.format("%.2f", y1));
                    case MotionEvent.ACTION_UP:
                        x2 = motionEvent.getX();
                        y2 = motionEvent.getY();
                        xb.setText(String.format("%.2f", x2));
                        yb.setText(String.format("%.2f", y2));

                        float xdif, ydif;
                        String motion = "";
                        String quadrant = "";

                        if (x1 > x2) {
                            xdif = x1 - x2;
                            motion = "Swipe Right and";
                        } else {
                            xdif = x2 - x1;
                            motion = "Swipe Left and";
                        }
                        if (y1 > y2) {
                            ydif = y1 - y2;
                            motion = motion + "Up";
                        } else {
                            ydif = y2 - y1;
                            motion = motion + "down";
                        }
                        xdiff.setText(String.format("%.2f", xdif));
                        ydiff.setText(String.format("%.2f", ydif));
                        mo.setText(motion);

                        float halfWidth = qd.getWidth() / 2;
                        float halfHeight = qd.getHeight() / 2;

                        if (x2 > halfWidth && y2 < halfHeight) {
                            quad.setText("Quadrant 1");
                        } else if (x2 < halfWidth && y2 < halfHeight) {
                            quad.setText("Quadrant 2");
                        } else if (x2 < halfWidth && y2 > halfHeight) {
                            quad.setText("Quadrant 3");
                        } else if (x2 > halfWidth && y2 > halfHeight) {
                            quad.setText("Quadrant 4");
                        }
                        return true;
                }
                return false;

            }
        });
    }
}






