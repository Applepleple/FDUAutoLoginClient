package edu.fudan.lwang.autologinclient.scheduler;

import edu.fudan.lwang.autologinclient.util.LoginUtil;

import java.util.Date;
import java.util.TimerTask;

public class LoginTimerTask extends TimerTask {

	private String userName;
	private String password;

	public LoginTimerTask(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Task started. " + new Date());
		int retry = 0;
		while (!LoginUtil.login(userName, password) && retry <= 3) {
			retry++;
		}
		System.out.println("Task finished. " + new Date());
	}

}
