package com.example.student2.something;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public class MySurfaceView extends SurfaceView implements SurfaceHolder.Callback {
        boolean pressed = false;
        SurfaceHolder holder;
        float x=0;
        float y=0;
        int r=0;

        @Override
        public boolean onTouchEvent(MotionEvent event){
            x = event.getX();
            y = event.getY();
            pressed = true;
            return super.onTouchEvent(event);
        }

        public MySurfaceView(Context context) {
            super(context);
            holder = getHolder();
            holder.addCallback(this);
            p.setColor(Color.YELLOW);

        }
        Paint p =new Paint();
        @Override
        public void surfaceCreated(SurfaceHolder holder) {
            new MyThread().start();
        }

        @Override
        public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

        }

        @Override
        public void surfaceDestroyed(SurfaceHolder holder) {

        }



        class MyThread extends Thread{

            @Override
            public void run(){
                while(true){
                    Canvas canvas = holder.lockCanvas();
                    canvas.drawColor(Color.BLUE);
                    if(pressed == true) {
                        canvas.drawCircle(x, y, r, p);
                    }
                    holder.unlockCanvasAndPost(canvas);



                       x++;
                       y++;
                       r += 5;
                       try {
                           Thread.sleep(1000);
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       } finally {
                       }

                }
            }
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MySurfaceView(this));
    }


}


