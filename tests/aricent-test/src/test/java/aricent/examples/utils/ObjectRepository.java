
public class ObjectRepository {
  
  WebDriver driver=null;
  ObjectRepository(WebDriver driver){
    this.driver=driver;
  }
  

/**
*Login page Web Elements 
**/
  WebElement  userName= driver.findElement(By.id(" "));
  WebElement  password= driver.findElement(By.id(" "));
  WebElement  clickOnLogin= driver.findElement(By.id(" "));
  
  public WebElement getUserName(){
    return userName;
  }
  public WebElement getPassword(){
    return userName;
  }
  public WebElement getLogin(){
    return userName;
  }
  
  
  
}
  
