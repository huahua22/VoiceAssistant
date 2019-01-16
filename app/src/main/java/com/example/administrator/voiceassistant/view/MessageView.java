package com.example.administrator.voiceassistant.view;

import android.content.Context;
import android.content.Intent;


/**
 * 发信息界面
 */
public class MessageView {
    private Context context;

    public MessageView(Context context) {
        this.context = context;
    }

    public void start() {
        Intent intent = new Intent();
        intent.setClassName("com.android.mms", "com.android.mms.ui.ConversationList");
        context.startActivity(intent);
    }
}
