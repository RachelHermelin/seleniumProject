import com.aventstack.extentreports.MediaEntityBuilder;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class RgistrationScreen {
    //Enter the registration screen to enable writing personal information and registering for the site.
    public static void enterToLoginScreen(WebDriver driver){
        WebElement signButton=driver.findElement(By.className(RgistrationConstants.signButton));//find the signButton  element from RegistrationConstants class and click on it.
        signButton.click();
        WebElement didNotSignButton=driver.findElement((RgistrationConstants.didNotSignButton));//find the signButton  element from RegistrationConstants class and click on it.
        didNotSignButton.click();
    }
//Entering the registration screen, writing the personal information and registering for the site.
    public static void loginTest_1(WebDriver driver){

        WebElement firstName=driver.findElement(By.id(RgistrationConstants.firstName));//find the firstName element from RegistrationConstants   class and write in it the first name.
        firstName.sendKeys("Rachel");
        WebElement email=driver.findElement(RgistrationConstants.email);//find the email element from RegistrationConstants   class and write in it the email address.
      email.sendKeys("rmh453556@gmail.com");
        WebElement password=driver.findElement(By.id(RgistrationConstants.password));//find the password element from RegistrationConstants   class and write in it the password.
       password.sendKeys("R123456h");
        WebElement realPassword=driver.findElement(By.id(RgistrationConstants.realPassword));//find the realPassword element from RegistrationConstants   class and write in it the password again.
       realPassword.sendKeys("R123456h");
        WebElement agree=driver.findElement(RgistrationConstants.agree);//find the agree (radio button) element from RegistrationConstants   class and click on it.
        agree.click();
        WebElement sign=driver.findElement(By.className(RgistrationConstants.sign));//find the sign element from RegistrationConstants   class and click on it.
        sign.click();
        try {//wait until the next page loads.
            Thread.sleep(300);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

     }


