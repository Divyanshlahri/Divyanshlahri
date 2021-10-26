import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\M1073013\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/events/greatindianfestival?tag=msn2020deskstd1-21");
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Refrigerator");
		driver.findElement(By.id("nav-search-submit-button")).click();
	/*WebElement Divdriver = driver.findElement(By.className("sg-col-inner"));
	int a =Divdriver.findElements(By.className("class=\'sg-col-inner\'")).size();*/
		//driver.findElement(By.xpath("//div[@data-component-id='62']/div/span/div/div/div[1]/div[1]/div/div/div[2]/div/div/div/div[1]/a/span/span[1]/span[1]")).getText();		
		
		 String name = driver.findElement(By.xpath("//div[@data-component-id='62'] //span[@class='a-size-medium a-color-base a-text-normal']")).getText();	
		 System.out.println("The name of this Refrigerator is " +name);
		
		String price =driver.findElement(By.xpath("//div[@data-component-id='62'] //span[@class='a-price-whole']")).getText();
	    System.out.println("The price of this Refrigerator is " +price);
	    
	    String visitors = driver.findElement(By.xpath("//div[@data-component-id='62'] //span[@class='a-size-base']")).getText();	    
	    System.out.println("The number of visitors " +visitors);
	    
	  driver.findElement(By.xpath("//div[@data-component-id='62']/div/span/div/div/div/div/div/div/span/a/div/img")).click();	
	  Set<String> sw = driver.getWindowHandles();
	  Iterator<String> it = sw.iterator();
	  String parent = it.next();
	  String child = it.next();
	  driver.switchTo().window(child);
	  System.out.println("Check");
	if(driver.findElement(By.id("priceblock_ourprice")).getText().equalsIgnoreCase(price))
	{
		System.out.print("Test is passed");
	}else {
		System.out.print("Test is Failed");
	}
	
	  
		}
	
	
	//   /div/span/div/div/div[1]/div[1]/div/div/div[2]/div/div/div/div[1]/a/span/span[1]/span[1]
	

}
