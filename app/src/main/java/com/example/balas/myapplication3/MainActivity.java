package com.example.balas.myapplication3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
// import java.io.IOException;
// import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
/* import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.Menu; */
import android.view.View;
// import android.view.View.OnClickListener;
import android.widget.Button;
/* import android.widget.Toast;
import android.text.format.Time;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.os.Handler; */

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView myTextView;
    TextView myTextView2;
    TextView myTextView3;
    Button home;
    Button guest;
    Button home2;
    Button guest2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //textView = (TextView);
        findViewById(R.id.textView);
        myTextView = (TextView) findViewById(R.id.myTextView);
        Button home = (Button) findViewById(R.id.home);
        myTextView2 = (TextView) findViewById(R.id.myTextView2);
        myTextView3 = (TextView) findViewById(R.id.myTextView3);
        Button guest = (Button) findViewById(R.id.guest);
        Button home2 = (Button) findViewById(R.id.home2);
        Button guest2 = (Button) findViewById(R.id.guest2);
        home.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                increaseScore3 (v);


                myTextView2.setText(" ");
                myTextView.setText("GOAL!");


            }



        });
        guest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                increaseScore4(v);
                myTextView.setText(" ");
                myTextView2.setText("GOAL!");
            }
        });
        home2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                increaseScore1(v);

            }
        });
         guest2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                increaseScore2(v);

            }
        });

    }


    public void click (View view) {
        int clicks = Integer.parseInt(textView.getText().toString());
        home.setText(Integer.toString(++clicks));
    }

   /* public void increaseScore(View view) {
        Button button = null;
        switch (view.getId()) {
            case R.id.home: button = findViewById(R.id.home); break;
            case R.id.guest: button = findViewById(R.id.guest); break;
           }
        int res = Integer.parseInt(button.getText().toString());
        button.setText (Integer.toString(++res));
    } */

    public void increaseScore3(View view) {
        Button button = null;
        button = findViewById(R.id.home);
        Button button1 = null;
        button1 = findViewById(R.id.guest);
        int res = Integer.parseInt(button.getText().toString());
        int res1 = Integer.parseInt(button1.getText().toString());
        if (res<24) {
            button.setText(Integer.toString(++res));
        }
        else if (res==res1) {
            button.setText(Integer.toString(++res));
        }
        else {
            myTextView3.setText ("The Home team won (in the previous round)");
            button.setText("0");
            button1.setText("0");
            myTextView.setText(" ");
        }
    }
    public void increaseScore4(View view) {
        Button button = null;
        button = findViewById(R.id.home);
        Button button1 = null;
        button1 = findViewById(R.id.guest);
        int res = Integer.parseInt(button1.getText().toString());
        int res1 = Integer.parseInt(button.getText().toString());
        if (res<24) {
            button1.setText(Integer.toString(++res));
        }
        else if (res==res1) {
            button1.setText(Integer.toString(++res));
        }
        else {
            myTextView3.setText ("The Guest team won  (in the previous round)");
            button.setText("0");
            button1.setText("0");
            myTextView2.setText(" ");

        }
    }

    public void increaseScore1(View view) {
       Button button = null;
       button = findViewById(R.id.home2);
       Button button1 = null;
       button1 = findViewById(R.id.guest2);
       Button button2 = null;
       button2 = findViewById(R.id.home);
       Button button3 = null;
       button3 = findViewById(R.id.guest);
       int res = Integer.parseInt(button.getText().toString());
       if (res<2) {
        button.setText (Integer.toString(++res));}
        else {
           myTextView3.setText ("The Home team won (in the previous game)");
           button.setText("0");
           button1.setText("0");
           button2.setText("0");
           button3.setText("0");
           myTextView.setText(" ");
           myTextView2.setText(" ");
        }
    }
    public void increaseScore2(View view) {
        Button button = null;
        button = findViewById(R.id.guest2);
        Button button1 = null;
        button1 = findViewById(R.id.home2);
        Button button2 = null;
        button2 = findViewById(R.id.home);
        Button button3 = null;
        button3 = findViewById(R.id.guest);
        int res = Integer.parseInt(button.getText().toString());
        if (res<2) {
           button.setText (Integer.toString(++res));}
        else {
        myTextView3.setText ("The Guest team won  (in the previous game)");
        button.setText("0");
        button1.setText("0");
        button2.setText("0");
        button3.setText("0");
        myTextView.setText(" ");
        myTextView2.setText(" ");

        }
    }


}
