import org.openqa.selenium.WebDriver;
public abstract BaseClass {
  
  private String url=null;
  private String browserType=null;
  private WebDriver driver=null;
  
  abstract getLogName();
  
  /**
  *To get the properties from properties file 
  **/
  AutomationConfig config=new AutomationConfig();
  url=config.getAppilicationUrl();
  browserType=config.getBrowserType();
  
  /**
  *This is launch browser based on the browser type 
  *Browser type will get from properties file 
  **/
  private BaseClass launchBrowser(){
    if(browserType.equals("firefox")){
       System.setProperties("webdriver.gecko.driver","path of gecko exe file");
       driver=new FirefoxDriver();
    }
    else if(browserType.equals("firefox")){
       System.setProperties("webdriver.gecko.driver","path of gecko exe file");
       WebDriver=new FirefoxDriver();
    }
    else if(browserType.equals("firefox")){
       System.setProperties("webdriver.gecko.driver","path of gecko exe file");
       WebDriver=new FirefoxDriver();
    }
    else{
      System.out.println("Invalid browser type , can not launch browser");
    }
    return this;
  }
  public WebDriver getWebDriver(){
    return driver;
  }
  public BaseClass loadDefaultPage(){
  driver.get(url);
  return this;
  }
  public BaseClass loadDefaultPage(String urlToLoad){
  driver.get(urlToLoad);
  return this;
  }
  
}
    
 
