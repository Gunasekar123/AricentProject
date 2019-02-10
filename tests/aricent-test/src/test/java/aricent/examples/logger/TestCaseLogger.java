
import org.apache.log4j.Logger;
import org.apache.logging.log4j.Logger;
import java.io.*;

public class TestCaseLogger {
    Class clasz=null;
    private org.apache.logging.log4j.Logger logger;
 
  private TestCaseLogger(String logName){
        logger = Logger.getLogger(logName);
    }
    

public void setLogger(Class clasz){
 this.clasz=clasz;
}
public Logger getLogger(){

return logger;
}

public void warn(String msg)
 {
  logger.warn( msg);
  }

  public void error(String msg)
  {
    logger.error(msg);
   }
  public void debug(String msg)
   {
      logger.debug(msg);
    }
     public void info(String msg)
   {
      logger.info(msg);
    }

}



