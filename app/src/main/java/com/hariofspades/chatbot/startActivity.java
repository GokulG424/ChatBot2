package com.hariofspades.chatbot;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.os.CountDownTimer;
import android.widget.TextView;

import com.hariofspades.chatbot.MainActivity;
import com.hariofspades.chatbot.R;

public class startActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        RotateAnimation anim = new RotateAnimation(0f, 350f, 15f, 15f);
        anim.setInterpolator(new LinearInterpolator());
        anim.setRepeatCount(Animation.INFINITE);
        anim.setDuration(7000);
        ImageView img;
        TextView t1;
        img=(ImageView) findViewById(R.id.splash);
        t1=(TextView) findViewById(R.id.Convx);
// Start animating the image
        final ImageView splash = (ImageView) findViewById(R.id.splash);
        splash.startAnimation(anim);

// Later.. stop the animation
        splash.setAnimation(null);

        Animation animation1,animation2;
        animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        animation2 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        img.startAnimation(animation2);
        t1.startAnimation(animation1);
        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {

            }
            public void onFinish() {
                Intent myintent =new Intent(getApplicationContext(), context.class);
                startActivity(myintent);
            }
        }.start();

    }
}
