package launchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		launchChrome();

	}

	public static void launchChrome() {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/watch?v=FX322RVNGj4&t=6560s");

	}

	public static void print() {
		System.out.println("print statement -------******--------");
	}
}
