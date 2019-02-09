import org.openqa.selenium.WebDriver;
public class LoginPage extends SeleniumMethods{
 WebDriver driver=null;
 LoginPage(WebDriver driver){
 super(driver);
 this.driver=driver;
 }
 ObjectRepository obj=new ObjectRepository(driver);
 public void doSignIn(String userName,String Password){
    type(obj.getUserName(),userName);
    type(obj.getPassword(),password); 
    click(obj.getSignIn());
}
