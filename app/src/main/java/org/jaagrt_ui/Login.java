package org.jaagrt_ui;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.drivemode.android.typeface.TypefaceHelper;


public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn = (Button) findViewById(R.id.button2);

        TypefaceHelper.getInstance().setTypeface(btn, "Roboto-Regular.ttf");
    }
}
