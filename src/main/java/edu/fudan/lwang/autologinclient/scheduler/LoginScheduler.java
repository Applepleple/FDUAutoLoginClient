package edu.fudan.lwang.autologinclient.scheduler;

import edu.fudan.lwang.autologinclient.Constant;
import edu.fudan.lwang.autologinclient.util.DateTimeUtils;

import java.util.Date;
import java.util.Timer;

public class LoginScheduler extends Timer {

    private static LoginScheduler mLoginScheduler = null;

    private LoginScheduler() {

    }

    public static synchronized LoginScheduler getInstance() {
        if (mLoginScheduler == null) {
            mLoginScheduler = new LoginScheduler();
        }
        return mLoginScheduler;
    }

    public void runAt4amEveryDay(String userName, String password, int intervalInHours) {
        Date startDate = DateTimeUtils.getTimesRequest(4, 0, 0);
        long period = intervalInHours * Constant.ONE_HOUR;
        System.out.println("Current time is : " + new Date());
        System.out.println("Start time is : " + startDate);
        System.out.println("Interval is : " + intervalInHours + " hours");
        scheduleAtFixedRate(new LoginTimerTask(userName, password), startDate, period);
    }
}
