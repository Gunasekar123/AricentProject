import org.openqa.selenium.WebDriver;

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

}
