package edu.fudan.lwang.autologinclient.site;

import com.gargoylesoftware.htmlunit.html.*;
import edu.fudan.lwang.autologinclient.Constant;

public class LoginSite extends BaseSite {

	public boolean login(String userName, String password) {
		boolean res = false;
		HtmlPage loginPage = visitPage(Constant.LOGIN_URL);
		HtmlTextInput nameInput = (HtmlTextInput) loginPage.getElementById("loginname");
		nameInput.setValueAttribute(userName);
		HtmlPasswordInput passwdInput = (HtmlPasswordInput) loginPage.getElementById("password");
		passwdInput.setValueAttribute(password);
		HtmlSubmitInput submitButton = (HtmlSubmitInput) loginPage.getElementById("button");
		try {
			HtmlPage returnPage = submitButton.click();
			DomElement result = returnPage.getElementById("login_in");
			if (result != null && !result.asText().isEmpty()) {
                System.out.println("Login successfully");
				res = true;
			}
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
            System.err.println("Failed to login");
			e.printStackTrace();
		}

		return res;
	}
}
