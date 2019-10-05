package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton btn = (ImageButton)findViewById(R.id.imageButton1);

        btn.setOnTouchListener(new View.OnTouchListener(){

            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction() == MotionEvent.ACTION_DOWN){

//重新設定按下時的背景圖片

                    ((ImageButton)v).setImageDrawable(getResources().getDrawable(R.drawable.f1));

                }else if(event.getAction() == MotionEvent.ACTION_UP){

//再修改為擡起時的正常圖片

                    ((ImageButton)v).setImageDrawable(getResources().getDrawable(R.drawable.f2));

                }

                return false;

            }

        });
    }
}
