package aricent.examples.practise-test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider

public class SimpleTest{

     @DataProvider
    public Object[][] dp() {
        return new Object[][]{{"Apple"}, {"Banana"},{"Orange"}};
    }

    private String param = "";
    public SimpleTest(String param) {

        this.param = param;

    }
    
    @BeforeClass

    public void beforeClass() {

        System.out.println("Before class executed.");

    }

    @Test(dataProvider="dp")
    public void testMethod(String fruit) {
        SimpleTest st=new SimpleTest(fruit);
        System.out.println("Value is: " + param);

    }

}
