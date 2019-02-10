package aricent.examples.tests;
import aricent.examples.tests.BaseClass;
import aricent.examples.tests.PageSpecific.LoginPage;
/**
*Test to verify Login page 
**/
public class LoginTest extends BaseClass{
  WebDriver driver=null;
  /**
  *Implementing abstract method of base class
  **/
  @Override
  public String getLogName(){
    return LoginTest.class.getName();
  }
  /***
  *Initilizing logger
  **/
  TestCaseLogger logger=new TestCaseLogger(getLogName());
  /**
  *Setting up the environment to test login
  **/
  @BeforeClass
  public void baseSetup(){
   logger.info("Setting up the environment");
    driver=super.getDriver();
    logger.info("Loadind login page");
    super.loadLoginPage(driver);
  }
  /**
  *Testing login and validating successful login message 
  **/
  @Test
  public void testLogin(){
  LoginPage lp=new LoginPage(driver);
   logger.info("Doing signIn");
   lp.doSignIn("Guna","myPass");
   logger.info("Completed signIn");
   logger.info("Validating the page with expected mesage after login");
   lp.validateSucessfullSignIn("//loginPageUrl","Logged in Successfully");
   logger.info("Page validation is completed");
  }
  /**
  *Closing driver
  *Closing browser
  **/
  @AfterClass
  public tearDown(){
    logger.info("End of test , Closing the driver ");
    driver.close();
  }
}  
}
