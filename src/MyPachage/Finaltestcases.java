package MyPachage;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//to make this class read from other classes we used extend
public class Finaltestcases extends dataparameters{
	
	@BeforeTest
	public void setup() {
		
		configrations();
	}
	
	@Test(priority=1)
	
	public void checkdefualtlangenglish() {
	
		String actuallang = driver.findElement(By.tagName("html")).getDomAttribute("lang");
		Assert.assertEquals(actuallang, expectedlang);
		
	}
	
	@Test(priority=2)
	
	public void checkdefualtcuuruncy() {
		//we put . before first class and . before second class
		String actualcurrancy = driver.findElement(By.cssSelector(".sc-hUfwpO.kAhsZG")).getText();
		Assert.assertEquals(actualcurrancy, excpectedcurrancy);
		
	
		
	}

	@Test(priority=3)
	
	public void checkthemobileno() {
		//we put . before first class and . before second class
		String actualmobile = driver.findElement(By.tagName("strong")).getText();
		Assert.assertEquals(actualmobile, excpectedmobileno);
	
}
	
	@Test(priority=4)
	
	public void checkqitaflogo() {
		WebElement Thefooter = driver.findElement(By.tagName("footer"));
		WebElement thecontainerdiv = Thefooter.findElement(By.cssSelector(".sc-eNNmBn.fIPNzB"));
		WebElement qitqflogo = driver.findElement(By.tagName("svg"));
		Boolean actualqitaflogo = qitqflogo.isDisplayed();
		Assert.assertEquals(actualqitaflogo, excpetedqitaflogo);
		
		
	
}
	
	@Test(priority=5)
	
	public void checkhoteltabnotselected() {
		WebElement hoteltab = driver.findElement(By.id("uncontrolled-tab-example-tab-hotels"));
		String actualvalushoteltab = hoteltab.getDomAttribute("aria-selected");
		Assert.assertEquals(actualvalushoteltab, excpectedvaluehoteltab);
		
	}
@Test(priority=6)
	
	public void checkdeparturedate() {	
	List<WebElement> dates =  driver.findElements(By.cssSelector(".sc-dXfzlN.iPVuSG"));
	String actualdeparturedate = dates.get(0).getText();
	Assert.assertEquals(actualdeparturedate,tomorrow);

	
	
	
}
}