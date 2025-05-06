package MyPachage;

import java.time.Duration;
import java.time.LocalDate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataparameters {
	
	WebDriver driver = new ChromeDriver();
	String defualturl = "https://www.almosafer.com/en";
	String expectedlang = "en";
	String excpectedcurrancy = "SAR";
	String excpectedmobileno = "+966554400000";
	Boolean excpetedqitaflogo = true;
	String excpectedvaluehoteltab = "false";
	LocalDate date = LocalDate.now();
	int today = date.getDayOfMonth();
	String tomorrow = Integer.toString(date.plusDays(1).getDayOfMonth());




public void configrations() {
	driver.get(defualturl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
}
}