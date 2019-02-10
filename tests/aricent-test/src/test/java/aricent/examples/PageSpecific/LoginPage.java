import org.openqa.selenium.WebDriver;
public class LoginPage extends SeleniumMethods{
 WebDriver driver=null;
 LoginPage(WebDriver driver){
 super(driver);
 this.driver=driver;
 }
 ObjectRepository obj=new ObjectRepository(driver);
 public LoginPage doSignIn(String userName,String password){
    type(obj.getUserName(),userName);
    type(obj.getPassword(),password); 
    click(obj.getSignIn());
  return this;
}
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
