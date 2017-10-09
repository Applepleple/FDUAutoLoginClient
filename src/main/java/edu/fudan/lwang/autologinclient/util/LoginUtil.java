package edu.fudan.lwang.autologinclient.util;

import edu.fudan.lwang.autologinclient.site.LoginSite;

public class LoginUtil {

    public static boolean login (String userName, String password) {
        boolean res;
        LoginSite loginSite = new LoginSite();
        res = loginSite.login(userName, password);
        loginSite.close();
        return res;
    }
}
