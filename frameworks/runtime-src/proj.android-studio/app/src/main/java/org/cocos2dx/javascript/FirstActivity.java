package org.cocos2dx.javascript;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import org.cocos2d.start_project.R;

public class FirstActivity extends Activity {

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);
    }

    public void onClick(View view) {
        startActivity(new Intent(FirstActivity.this, AppActivity.class));
    }
}
