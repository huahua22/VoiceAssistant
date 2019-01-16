package com.example.administrator.voiceassistant.view;

import android.content.Context;
import android.content.Intent;
/**
 * 打电话界面
 */
public class CallView {

    private Context context;

    public CallView(Context context) {
        this.context = context;
    }

    public void start() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL_BUTTON);
        context.startActivity(intent);
    }
}
