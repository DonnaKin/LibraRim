package com.example.minkyung.librarim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by minkyung on 2017-11-07.
 */

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //setContentContentView는 하지 않습니다.
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
            startActivity(new Intent(this, MainActivity.class));
            finish();

    }
}
