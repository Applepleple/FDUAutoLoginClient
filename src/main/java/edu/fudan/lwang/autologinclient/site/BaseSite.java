package edu.fudan.lwang.autologinclient.site;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.util.Cookie;

import java.util.Random;
import java.util.Set;

public abstract class BaseSite {

	private WebClient webClient;
	
	public BaseSite() {
		webClient = new WebClient(BrowserVersion.CHROME);
		webClient.getOptions().setUseInsecureSSL(true);
		webClient.getOptions().setCssEnabled(false);
		webClient.getOptions().setThrowExceptionOnScriptError(false);
	}
	
	public abstract boolean login(String userName, String password);
    
    protected HtmlPage visitPage(String url) {
    	HtmlPage page;
		
		try {	
			page = webClient.getPage(url);
			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		
		Random random = new Random();
		long sleepTime = random.nextInt(3521) + 2514;
		try {
			Thread.sleep(sleepTime);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return page;
    }
	
	public void close() {
		this.webClient.closeAllWindows();
	}
}
