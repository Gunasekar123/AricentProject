package aricent.examples.PageSpecific;
import org.openqa.selenium.WebDriver;
/**
*This page containd login page methods 
**/
public class LoginPage extends SeleniumMethods{
 WebDriver driver=null;
 LoginPage(WebDriver driver){
 super(driver);
 this.driver=driver;
 }
 /**
 *Creating Object repository object 
 **/
 ObjectRepository obj=new ObjectRepository(driver);
 /**
 *It will do signIn 
 *This method will take two parameters as a argument 
 **/
 public LoginPage doSignIn(String userName,String password){
    type(obj.getUserName(),userName);
    type(obj.getPassword(),password); 
    click(obj.getSignIn());
  return this;
}
 /**
 *This is to validate page message after sucessfull sigin
 **/
 public LoginPage validateSucessfullSignIn(String expectedPageUrl,String messageToValidate){
  if(driver.getCurrentUrl().equals(expectedPageUrl))
     {
       String pageSource = driver.getPageSource();
       System.out.println(pageSource);
       Assert.assertTrue(pageSource.contains(messageToValidate));
     }
     else
     {
         System.out.println("Not navigated to the correct page");
     }
  return this;
 }
}
