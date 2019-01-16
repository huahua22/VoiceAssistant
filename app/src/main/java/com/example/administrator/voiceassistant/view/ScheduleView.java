package com.example.administrator.voiceassistant.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.provider.AlarmClock;
import android.provider.CalendarContract;

import com.example.administrator.voiceassistant.MainActivity;


/**
 * 时间表界面
 */
public class ScheduleView {

	private String mName;
	private Context context;
	
	public ScheduleView(String name, String time, String date, String content,Context context){
		mName=name;
		this.context = context;
	}
	
	public void start(){
		switch(mName){
			case "clock":{
				clockView();
				break;
			}
			case "reminder":{
				reminderView();
				break;
			}
			default:break;
		}
	}
	
	private void clockView(){
		Intent alarmas = new Intent(AlarmClock.ACTION_SET_ALARM);
       context.startActivity(alarmas);
	}
	
	@SuppressLint("NewApi") private void reminderView(){
		Intent intent = new Intent(Intent.ACTION_INSERT);
		intent.setData(CalendarContract.Events.CONTENT_URI);
		context.startActivity(intent);
	}
}
