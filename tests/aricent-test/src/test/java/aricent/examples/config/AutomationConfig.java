public class AutomationConfig{

private String applicationUrl=null;

private String browserType=null;


public void load(){
 Properties properties = new Properties();
    File currentDirectory = new File(new File("").getAbsolutePath());
    WORKING_DIR = currentDirectory.getAbsolutePath();
    if (!(new File(WORKING_DIR + "\\src\\test\\java\\aricent\\examples\\resources\\Environments\\Sample.properties").exists())) {
      System.out.println("ERROR:There is no environment property file.Please specify the correct environment");
    }
    properties.load(new FileInputStream(new File(WORKING_DIR
        + "\\src\\test\\java\\aricent\\examples\\resources\\Environments\\Sample.properties")));
   
   setAppilicationUrl();
   setBrowserType();

}

public void setAppilicationUrl(String applicationUrl){
this.applicationUrl=applicationUrl;
}

public void setBrowserType(String browserType){
this.browserType=browserType;
}
}
