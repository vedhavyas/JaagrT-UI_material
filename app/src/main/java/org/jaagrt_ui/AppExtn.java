package org.jaagrt_ui;

import android.app.Application;

import com.drivemode.android.typeface.TypefaceHelper;

/**
 * Authored by vedhavyas on 23/12/14.
 * Project JaagrT-UI
 */
public class AppExtn extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceHelper.initialize(this);
    }

    @Override
    public void onTerminate() {
        TypefaceHelper.destroy();
        super.onTerminate();
    }
}
