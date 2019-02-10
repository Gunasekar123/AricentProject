
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
    super.loadLoginPage(driver);
  }
  /**
  *Testing login and validating successful login message 
  **/
  @Test
  public void testLogin(){
  LoginPage lp=new LoginPage(driver);
   lp.doSignIn("Guna","myPass");
   lp.validateSucessfullSignIn();
    
    
  }
  /**
  *Closing driver
  *Closing browser
  **/
  @AfterClass
  public tearDown(){
    
  }
}

  
  
  
}
