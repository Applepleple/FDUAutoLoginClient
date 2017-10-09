package edu.fudan.lwang.autologinclient;

import org.kohsuke.args4j.Option;

public class AutoLoginCmdOption {
    @Option(name="-h",aliases="-help", usage="Help info.")
    public boolean help = false;

//    @Option(name="-u", aliases="-username", usage="The username of your login credential. Mandatory.")
//    public String userName;
//
//    @Option(name="-p", aliases="-password", usage="The password of your login credential. Mandatory.")
//    public String password;

    @Option(name="-a",aliases="-auto", usage="Whether the program runs in auto mode. If so, the login process will start at 4am every day. Default false.")
    public boolean auto = false;

    @Option(name="-i",aliases="-interval", usage="Interval in hours of each process in auto mode. Default 24.")
    public int intervalInHours = 24;
}
