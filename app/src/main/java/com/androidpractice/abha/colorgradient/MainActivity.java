package com.androidpractice.abha.colorgradient;

import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        textView = (TextView) findViewById(R.id.textView);

        TextView textView = new TextView(this);
        textView = (TextView) findViewById(R.id.textView);
        Shader textShader = new LinearGradient(0, 0, 0, 90,
//                new int[]{Color.BLUE,Color.GREEN},
//                new int[]{R.color.gradientStartColor, R.color.gradientEndColor},
                new int[]{getResources().getColor(R.color.gradientStartColor), getResources().getColor(R.color.gradientEndColor)},
                new float[]{0, 1}, Shader.TileMode.CLAMP);
        textView.getPaint().setShader(textShader);
    }
}
