import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Packageframehandling {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/keetch/Desktop/SeleniumTest/home.html");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.switchTo().frame("myHeader");
        WebElement el=driver.findElement(By.xpath("//h3[text()='Welcome to use satix']"));
        System.out.println(el.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("myNavigation");
        WebElement el1=driver.findElement(By.id("myTree"));
        System.out.println(el1.getText());
        el1.click();
        WebElement el2= driver.findElement(By.xpath("//a[text()='Handle Alert']"));
        System.out.println(el2.getText());
        el2.click();
        Alert al=driver.switchTo().alert();
        al.accept();
        driver.switchTo().defaultContent();
   	 driver.switchTo().frame("myDetail");
   	 WebElement el25=driver.findElement(By.id("myBtn"));
   	 el25.click();
   	 Alert al2=driver.switchTo().alert();
   	 System.out.println(al2.getText());
   	 al2.accept();
   	 WebElement el3=driver.findElement(By.id("myInputText"));
   	 el3.sendKeys("satishlanka");
   	 System.out.println(el3.getText());
   	 WebElement el4=driver.findElement(By.id("myInputTextArea"));
   	 el4.sendKeys("hi welcome to keetech.My name is satish working as a software trainee");
   	 WebElement selectelement=driver.findElement(By.id("mySelect"));
   	Select select=new Select(selectelement);
   	select.selectByVisibleText("option4");
   	 WebElement el7=driver.findElement(By.linkText("click me to show content"));
   	 el7.click();
   	 driver.findElement(By.id("myCheckbox")).click();
   	 WebElement el8=driver.findElement(By.id("hidden-content"));
   	 System.out.println(el8.getText());
   	 WebElement el9=driver.findElement(By.linkText("click me to open a new window"));
   	 System.out.println(el9.getText());
   	 el9.click();
   	 String parentwindowid=driver.getWindowHandle();
   	 System.out.println("parentwindow: "+parentwindowid);
   	 Set<String> setwindow=driver.getWindowHandles();
   	 for(String window:setwindow){
   		 if(window.equals(parentwindowid))
   			 continue;
   		 
   		 else
   		 {
   			 driver.switchTo().window(window);
   		     break;
   		 }}System.out.println("currentwindow id: "+driver.getTitle());
   		 Assert.assertEquals(driver.getTitle(), "satix new window");
   		 driver.findElement(By.id("newInputText")).sendKeys("my name is satish");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("subFrame");
        driver.switchTo().frame("frameHeader");
       WebElement el12= driver.findElement(By.xpath("//h3[text()='This is frame header']"));
        System.out.println(el12.getText());
        driver.switchTo().defaultContent();
        driver.switchTo().frame("subFrame");
        
        driver.switchTo().frame("frameDetail");
        WebElement el13=driver.findElement(By.id("myBtn2"));
        el3.click();
        
        System.out.println(el3.getText());
        

	
	
	
	
	
	}

}
	}

}
