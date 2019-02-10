import org.openqa.selenium.WebDriver;
public abstract BaseClass {
  
  private String url=null;
  private String browserType=null;
  private WebDriver driverDefault=null;
  private WebDriver driverCustom=null;
  
  abstract getLogName();
  
  /**
  *To get the properties from properties file 
  **/
  AutomationConfig config=new AutomationConfig();
  url=config.getAppilicationUrl();
  browserType=config.getBrowserType();
  
  /**
  *This will launch browser based on the browser type 
  *Browser type will get from properties file 
  *Because it is private constructor it will allow to create instance directly
  **/
  private BaseClass (){
    if(browserType.equals("firefox")){
       System.setProperties("webdriver.gecko.driver","path of gecko exe file");
       driverDefault=new FirefoxDriver();
    }
    else if(browserType.equals("chrome")){
       System.setProperties("webdriver.chrome.driver","path of chrome exe file");
       driverDefault=new ChromeDriver();
    }
    else if(browserType.equals("ie")){
       System.setProperties("webdriver.gecko.driver","path of ie exe file");
       driverDefault=new InternetExplorerDriver();
    }
    else{
      System.out.println("Invalid browser type , can not launch browser");
    }
  }
  /**
  *This is to launch driver based on browser type that needs for test 
  *This will not use browser that set in the properties file
  **/
  private BaseClass (String setBrowser){
    if(setBrowser.equals("firefox")){
       System.setProperties("webdriver.gecko.driver","path of gecko exe file");
       driverCustom=new FirefoxDriver();
    }
    else if(setBrowser.equals("chrome")){
       System.setProperties("webdriver.chrome.driver","path of chrome exe file");
       driverCustom=new ChromeDriver();
    }
    else if(setBrowser.equals("ie")){
       System.setProperties("webdriver.gecko.driver","path of ie exe file");
       driverCustom=new InternetExplorerDriver();
    }
    else{
      System.out.println("Invalid browser type , can not launch browser");
    }
  }
  /**
  *It will create webdriver object for browser type set in the properties file
  **/
  public synchronized WebDriver getWebDriver(){
   if(driverDefault==null){
    new BaseClass();
   }
    return driverDefault;
  }
  /**
  *It will create webdriver object for browser that test pass 
  **/
  public synchronized WebDriver getWebDriver(String setBrowser){
    new BaseClass(setBrowser);
    return driverCustom;
  }
  /**
  *Load login page url which is getting from properties file 
  **/
  public void loadLoginPage(WebDriver driver){
  driver.get(url);
  }
}
    
 
