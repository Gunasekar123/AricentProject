import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public SeleniumMethods {

  WebDriver driver=null;
  
  SeleniumMethods(WebDriver driver){
    this.driver=driver;
  }

  public void click(WebElement element){
   driver.element.click(); 
  }
  
 public void type(WebElement element,String text){
  driver.element.sendKeys(text); 
 }
public void waitForLoad(WebDriver driver,long timeOutInSeconds) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                     }
                };
        WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
        wait.until(pageLoadCondition);
    }
}
