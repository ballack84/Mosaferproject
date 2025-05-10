package MyPachage;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
		Assert.assertEquals(actuallang, expectedlangen);
		
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
@Test(priority=7)

public void checkreturnedate() {	
List<WebElement> dates =  driver.findElements(By.cssSelector(".sc-dXfzlN.iPVuSG"));
String actualreturnedate = dates.get(1).getText();
Assert.assertEquals(actualreturnedate,aftertomorrow);


}
@Test(priority=8)

public void checkrandonlywebsitelanguage() throws InterruptedException {
	
	driver.get(website[randomindexforwebsite]);
	
	WebElement hoteltab = driver.findElement(By.xpath("//a[@data-testid='Header__HotelsNavigationTab']/span"));
	hoteltab.click();

	WebElement searchcities = driver.findElement(By.cssSelector(".sc-phbroq-2.uQFRS.AutoComplete__Input"));
	
	
	if (driver.getCurrentUrl().contains("en")) {
		
		String actuallang = driver.findElement(By.tagName("html")).getDomAttribute("lang");
		Assert.assertEquals(actuallang, expectedlangen);
		searchcities.sendKeys(englishcities[randomenglishcities]);
		WebElement listofcities = driver.findElement(By.cssSelector(".sc-phbroq-4.gGwzVo.AutoComplete__List"));
		listofcities.findElements(By.tagName("li")).get(1);
			
	}
	else {
		String actuallang =  driver.findElement(By.tagName("html")).getDomAttribute("lang");
		Assert.assertEquals(actuallang, expectedlangar);
		searchcities.sendKeys(arabiccities[randomarabiccities]);
		WebElement listofcities = driver.findElement(By.cssSelector(".sc-phbroq-4.gGwzVo.AutoComplete__List"));
		listofcities.findElements(By.tagName("li")).get(1);
	}
	
	WebElement numberofvisitors = driver.findElement(By.cssSelector(".sc-tln3e3-1.gvrkTi"));
	Select myselector = new Select(numberofvisitors);
	int randominex = rand.nextInt(2);
	myselector.selectByIndex(randominex);
	WebElement searchbutton = driver.findElement(By.cssSelector(".sc-1vkdpp9-5.btwWVk"));
	searchbutton.click();
	Thread.sleep(30000);
	WebElement results = driver.findElement(By.xpath("//span[@data-testid='srp_properties_found']"));
	results.getText();
	Boolean actualresults = results.getText().contains("stays")||results.getText().contains("مكان");
	Assert.assertEquals(actualresults,expectedresult);
	
}
}