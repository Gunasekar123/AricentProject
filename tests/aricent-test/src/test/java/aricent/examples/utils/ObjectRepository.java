
public class ObjectRepository {
  
  WebDriver driver=null;
  ObjectRepository(WebDriver driver){
    this.driver=driver;
  }
  

/**
*Login page Web Elements 
**/
  WebElement  userName= driver.findElement(By.id("okta-signin-username"));
  WebElement  password= driver.findElement(By.class("okta-signin-password"));
  WebElement  clickOnSignIn= driver.findElement(By.xpath("//*[@class='okta-signin-password']//following-sibling::*[1]"));
  
  public WebElement getUserName(){
    return userName;
  }
  public WebElement getPassword(){
    return password;
  }
  public WebElement getSignIn(){
    return clickOnSignIn;
  }
  
  
  
}
  
