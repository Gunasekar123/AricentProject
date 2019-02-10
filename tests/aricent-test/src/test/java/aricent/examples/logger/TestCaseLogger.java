
import org.apache.log4j.Logger;
import org.apache.logging.log4j.Logger;
import java.io.*;

public class TestCaseLogger {
    Class clasz=null;
    private org.apache.logging.log4j.Logger logger;
 
  private TestCaseLogger(Class clazz){
        logger = Logger.getLogger(clazz);
    }
    

public void setLogger(Class clasz){
 this.clasz=clasz;
}
public Logger getLogger(){

return logger;
}

public void warn(String msg)
 {
  logger.warn("Warning Message : "+ msg);
  }

  public void error(String msg)
  {
    logger.error("Error message : "+ msg);
   }
  public void debug(String msg)
   {
      logger.debug("Debug Message : "+ msg);
    }

}



