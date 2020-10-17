import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class NewTest {
  
  @Test()
  public void f() throws IOException 
  {
	  Date date = new Date();
	  String current_Month = new SimpleDateFormat("MM-yy").format(date);
	  
		/*
		 * ExtentReports report = new
		 * ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
		 * ExtentTest test = report.startTest("hello"); test.log(LogStatus.INFO,
		 * "How are you");
		 * 
		 * System.setProperty("webdriver.chrome.driver",
		 * "D:\\Selenium\\chromedriver_win32_80\\chromedriver.exe");
		 * 
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("--start-maximized"); DesiredCapabilities cap = new
		 * DesiredCapabilities(); cap.setCapability(ChromeOptions.CAPABILITY, options);
		 * options.merge(cap); WebDriver driver = new ChromeDriver(options);
		 * driver.get("http://google.com/");
		 */
	  
	  
	  
		
		/*
		 * File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(file, new
		 * File(System.getProperty("user.dir")+"\\hello.png"));
		 */
	  test.log(LogStatus.INFO,test.addScreenCapture(System.getProperty("user.dir")+"\\hello.png"),"screenshot");
	   
	  report.endTest(test);
	  report.flush();
	  
  }
}
