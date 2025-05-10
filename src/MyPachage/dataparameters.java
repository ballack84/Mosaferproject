package MyPachage;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dataparameters {
	
	WebDriver driver = new ChromeDriver();
	Random rand = new Random();
	String defualturl = "https://www.almosafer.com/en";
	String expectedlangen = "en";
	String expectedlangar = "ar";
	String excpectedcurrancy = "SAR";
	String excpectedmobileno = "+966554400000";
	Boolean excpetedqitaflogo = true;
	String excpectedvaluehoteltab = "false";
	LocalDate date = LocalDate.now();
	int today = date.getDayOfMonth();
	String tomorrow = String.format("%02d",date.plusDays(1).getDayOfMonth());
	String aftertomorrow = String.format("%02d",date.plusDays(2).getDayOfMonth());
	String [] website = {"https://www.almosafer.com/en","https://www.almosafer.com/ar"};
	int randomindexforwebsite = rand.nextInt(website.length);
	String [] englishcities = {"Dubai","Jeddah","Riyadh"};
	int randomenglishcities = rand.nextInt(englishcities.length);
	String [] arabiccities = {"دبي","جده"};
	int randomarabiccities = rand.nextInt(arabiccities.length);
	Boolean expectedresult = true;




public void configrations() {
	driver.get(defualturl);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
}
}