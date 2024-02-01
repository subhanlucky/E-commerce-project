package ECommerce_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestScript01 {


		public static void main(String[] args) {
			
			    System.setProperty("webdriver.chrome.driver", "C:\\Users\\subha\\OneDrive\\Desktop\\others\\drivers\\drvrs\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");

	            WebDriver driver = new ChromeDriver();
	       
			      
			    driver.get("http://live.techpanda.org/index.php/");
			    
			    driver.manage().window().maximize() ;
			    
			    String title1 = driver.getTitle();
			    
			    if(title1.equalsIgnoreCase("Home page"))
			    {
			    	   System.out.println("Success");
			    }
			    else		    {
			    	   System.out.println("Failed");
			    }       
			    
			    driver.findElement(By.className("level0")).click();	 
			      
	            String title2 = driver.getTitle();
			    
			    if(title2.equalsIgnoreCase("Mobile"))
			    {
			    	   System.out.println("Success");
			    }
			    else
			    {
			    	   System.out.println("Failed");
			    }       
			    
			    WebElement dropdown = driver.findElement(By.cssSelector("select[title='Sort By']"));
		       
		        Select select = new Select(dropdown);
		     
			    select.selectByVisibleText("Name");
			    
			    driver.quit();
			 
		}

	}
