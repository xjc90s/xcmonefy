import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.Point;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Navigation extends ConstructDesired{

    public static void main(String[] args) throws MalformedURLException {

        ConstructDesired driverConstructedDesired = new ConstructDesired();
        AndroidDriver<AndroidElement> driver= driverConstructedDesired.constructedDesired();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementByXPath("//android.widget.TextView[@text='Expenses']").click();
        driver.findElementByXPath("//android.widget.TextView[@text='Savings']").click();

    }

}