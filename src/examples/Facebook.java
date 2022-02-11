package examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\W10-Lenovo\\Desktop\\New folder (4)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if(title.equals("Facebook"))
		{
			System.out.println("Title is matched");
		}
		else
		{
			System.out.println("Title is not matched");
		}
		driver.findElement(By.id("email")).sendKeys("9542315175");
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys("jeevan143");
		Thread.sleep(2000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@aria-label='Account']")).click();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[@id=\"mount_0_0_Su\"]/div/div[1]/div/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div/div[1]/div/div[1]/div[2]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		Thread.sleep(1000);
		//driver.switchTo().frame(0);
		
	   // Alert alert=driver.switchTo().alert();
	   // String text=alert.getText();
	    //System.out.println(text);
	    //alert.accept();
		driver.findElement(By.xpath("//div[@aria-label='Log out']")).click();
            if(title.equals("Facebook"))
		{
			System.out.println("Title is matched");
		}
		else
		{
			System.out.println("Title is not matched");
		}
		

	}

}
