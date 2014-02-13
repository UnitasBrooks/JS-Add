import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.logging.Logger;

/**
 * Created with IntelliJ IDEA.
 * User: jyuhas
 * Date: 1/28/14
 * Time: 12:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
    public static void main(String [] args)
    {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/joe.html");

        long i = (Long) driver.executeScript("return " + "add(2,2);");
        Assert.assertEquals(i,5);

        driver.get("http://localhost:8080/test/SpecRunner.html");
        driver.executeScript("describe(\"Add 5 and 6\",function() {\n" +
                "    it(\"equals 11\",function() {\n" +
                "        expect(add(5,6)).toEqual(11);\n" +
                "    });\n" +
                "});");
    }
}
