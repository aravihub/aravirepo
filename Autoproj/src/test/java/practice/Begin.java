package practice;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Begin {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.get("https://www.google.com/");
		 driver.switchTo().newWindow(WindowType.TAB);
		 driver.get("https://www.gmail.com/");
	Set<String> ids=driver.getWindowHandles();
	for (String urlid : ids) {
		String title=driver.switchTo().window(urlid).getTitle();
		System.out.println(title);
		driver.quit();
	}
	}
}
		 
		 /*List<WebElement> links = driver.findElements(By.tagName("a"));
		 System.out.println(links.size());
		 for (WebElement ele : links) {
			 System.out.println("Link "+ele.getText());
			 System.out.println("Link "+ele.getAttribute("href"));

		}
		 
	}}
		// File scr=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// FileUtils.copyFile(scr, new File("./screenshots/sample.png"));
		 /* WebElement channelHeader=driver.findElement(By.xpath("//*[@id=\"hplogo\"]"));
		  File file=channelHeader.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file,new File("./screenshots/heee.png"));
		   Thread.sleep(2000);
		 
		  driver.quit();
		 }}
		/*driver.get("http:\\google.com");
		WebElement gogimg = driver.findElement(By.xpath("//*[@class=\"lnXdpd\"]"));
		TakesScreenshot scrShot =((TakesScreenshot)gogimg);
		File file=scrShot.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyDirectory(scrShot, new File("C:\\Users\\aravi\\eclipse-workspace\\Autoproj\\Screen\\gog.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();


		}}

		
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("selenium");			
		List<WebElement> elem=driver.findElements(By.xpath("//*[@role=\"listbox\"]/li"));
		for (WebElement aravind : elem)
		{
			System.out.println(aravind.getText());
			if(aravind.getText().trim().equals("selenium dev"))
			{
			aravind.click();
			break;
			}
			
		}*/
		
		
	
