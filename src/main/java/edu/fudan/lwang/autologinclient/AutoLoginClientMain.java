package edu.fudan.lwang.autologinclient;

import edu.fudan.lwang.autologinclient.scheduler.LoginScheduler;
import edu.fudan.lwang.autologinclient.util.LoginUtil;
import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import java.io.Console;

public class AutoLoginClientMain {

    public static void main(String[] args) {
        AutoLoginCmdOption mAutoLoginCmdOption = new AutoLoginCmdOption();
        CmdLineParser parser = new CmdLineParser(mAutoLoginCmdOption);
        try {
            parser.parseArgument(args);
        } catch (CmdLineException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            parser.printUsage(System.err);
            System.exit(1);
        }

        if (mAutoLoginCmdOption.help) {
            parser.printUsage(System.out);
            System.exit(0);
        }

        Console console = System.console();
        String userName = console.readLine("Please enter your UIS account : ");
        String password = new String(console.readPassword("Please enter your UIS password : "));

        if (mAutoLoginCmdOption.auto) {
            LoginScheduler.getInstance().runAt4amEveryDay(userName, password, mAutoLoginCmdOption.intervalInHours);
        } else {
            LoginUtil.login(userName, password);
        }

    }

}
