package Edit.EducacionIt;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;



public class Laboratorio2 {
	@Test
	public void lab2_E0 () {
		 System.setProperty("webdriver.chrome.driver","..\\EducacionIt\\Drivers\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		    
		    driver.get("https://www.selenium.dev/");
		    WebElement linkDescarga = driver.findElement (By.linkText("Downloads"));
		    linkDescarga.click();
		    
		    driver.quit();
	}
	
	@Test
	 public void lab2_E1() {
        System.setProperty("webdriver.chrome.driver","..\\EducacionIt\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        WebDriverWait myWaitVar = new WebDriverWait(driver, 15);
        WebElement txtNombre = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("firstname")));
        txtNombre.sendKeys("Marali");
        
        WebElement txtApellido = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("lastname")));
        txtApellido.sendKeys("Betancourt");
        
        WebElement txtCel = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input[name='reg_email__']")));
        txtCel.sendKeys("123456789");
        
        WebElement txtCont = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("reg_passwd__")));
        txtCont.sendKeys("13123");
        
        Select mes = new Select(myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("month"))));
        mes.selectByVisibleText("mar");
        
        Select dia = new Select(myWaitVar.until(ExpectedConditions.elementToBeClickable(By.id("day"))));
        dia.selectByIndex(0);
       
        WebElement btnClic = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("websubmit")));
        btnClic.click();
        
        
       // driver.quit();
     }
	@Test
	 public void lab2_E2() {
       System.setProperty("webdriver.chrome.driver","..\\EducacionIt\\Drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       
       driver.get("https://www.facebook.com/");
       driver.manage().window().maximize();
       
       WebDriverWait myWaitVar = new WebDriverWait(driver, 15);
       WebElement txtCorreo = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("email")));
       txtCorreo.sendKeys("Marali.Betancourt@");
       
       WebElement txtContrase = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.name("pass")));
       txtContrase.sendKeys("Betancourt");
       
       WebElement btnClic = myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Entrar']")));
       btnClic.click();
       
       
      // driver.quit();
    }
}
