package com.example.administrator.voiceassistant.view;

import android.content.Intent;

import com.example.administrator.voiceassistant.MainActivity;


/**
 * 发信息界面
 */
public class MessageView {
    private MainActivity mActivity;

    public MessageView(MainActivity activity) {
        mActivity = activity;
    }

    public void start() {
        Intent intent = new Intent();
        intent.setClassName("com.android.mms", "com.android.mms.ui.ConversationList");
        mActivity.startActivity(intent);
    }
}
