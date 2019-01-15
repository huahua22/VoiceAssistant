package com.example.administrator.voiceassistant.view;

import android.content.Intent;

import com.example.administrator.voiceassistant.MainActivity;


/**
 * 打电话界面
 */
public class CallView {

    private MainActivity mActivity;

    public CallView(MainActivity activity) {
        mActivity = activity;
    }

    public void start() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_CALL_BUTTON);
        mActivity.startActivity(intent);
    }
}
