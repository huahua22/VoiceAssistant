package com.example.administrator.voiceassistant.action;


import com.example.administrator.voiceassistant.ui.MainActivity;

public class OpenQA {

	private String mText;
	MainActivity mActivity;
	
	public OpenQA(String text, MainActivity activity){
		mText=text;
		mActivity=activity;
	}
	
	public void start(){
		mActivity.speakAnswer(mText);
	}
	
}
