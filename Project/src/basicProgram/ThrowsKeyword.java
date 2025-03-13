package basicProgram;

import java.net.MalformedURLException;
import java.net.URL;

public class ThrowsKeyword {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
	System.out.println("1");
	Thread.sleep(5000);
	System.out.println("2");
	URL url = new URL("https://www.amazon.com"); 
	System.out.println(url);
	}

}
