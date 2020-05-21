package pruebas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;



public class Laboratorio3_E1 {
    WebDriver driver;
    
    @BeforeSuite
	public void setUp() {
    	System.setProperty("webdriver.chrome.driver", "..\\EducacionIt\\Drivers\\chromedriver.exe");
    	driver = new ChromeDriver();
	}

	@BeforeTest 
	public void irUrl() {
		driver.get("https://www.facebook.com/");
	}

	@BeforeClass 
	public void maxVentana() {
    driver.manage().window().maximize();
	}

  @Test
  public void registroUsuario() {
	     	        
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
	  }
	        @AfterClass 
	        public void finPrueba() {
	            System.out.println("Fin de prueba");
	        }
	        
	        @AfterTest 
	        public void cierre() {
	            driver.quit();
	        }
	    
	        @AfterSuite
	        public void finSuite() {
	            System.out.println("Fin Suite");
	        }
	    }


