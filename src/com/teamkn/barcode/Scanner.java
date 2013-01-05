package com.teamkn.barcode;

import android.app.Activity;
import android.app.AlertDialog;

public class Scanner {
    static final String PACKAGE_NAME = "com.teamkn.zxing.scanner.android";

    static void displayFrameworkBugMessageAndExit(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(activity.getString(R.string.app_name));
        builder.setMessage(activity.getString(R.string.msg_camera_framework_bug));
        builder.setPositiveButton(R.string.button_ok, new FinishListener(activity));
        builder.setOnCancelListener(new FinishListener(activity));
        builder.show();
    }
}
