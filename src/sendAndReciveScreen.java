import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class sendAndReciveScreen {
    public static void SendScreen(WebDriver driver){
        driver.findElement(sendAndReciveConstants.anotherPerson).click();//find the anotherPerson element from sendAndReciveConstants class and click on it.
        driver.findElement(sendAndReciveConstants.receiverName).sendKeys("Daniel Hermelin");//find the receiverName  element from sendAndReceiveConstants class and write in it the receiver name.
        driver.findElement(sendAndReciveConstants.senderName).clear();//find the senderName element from sendAndReceiveConstants class and clear it.
         driver.findElement(sendAndReciveConstants.senderName).sendKeys("Rachel Munter");//find the senderName  element from sendAndReceiveConstants class and write in it the sender name.
        driver.findElement(sendAndReciveConstants.picture).sendKeys("C:\\Users\\Rachel\\Desktop\\InkedBD1A9109_LI.jpg");//upload a picture.
        driver.findElement(sendAndReciveConstants.whatEvent).click();//find the whatEvent element from sendAndReceiveConstants class and click on it.
        List<WebElement> allEventElements = driver.findElements(sendAndReciveConstants.whatEventDrop);//find all whatEventDrop elements from sendAndReceiveConstants class and put them into a list..
        allEventElements.get(2).click();//choose the second value in the list and click on it.
        driver.findElement(sendAndReciveConstants.blessing).clear();//find the blessing element from sendAndReceiveConstants class and clear it.
        driver.findElement(sendAndReciveConstants.blessing).sendKeys("Thank you!");//find the blessing  element from sendAndReceiveConstants class and write in it the blessing.
        driver.findElement(sendAndReciveConstants.afterPay).click();//find the afterPay element from sendAndReceiveConstants class and click on it.
        driver.findElement(sendAndReciveConstants.emailButton).click();//find the emailButton element from sendAndReceiveConstants class and click on it.
        driver.findElement(sendAndReciveConstants.emailAddress).sendKeys("rmh22222@gmail.com");//find the emailAddress element from sendAndReceiveConstants class and write in it the email address.
        driver.findElement(sendAndReciveConstants.saveButton).click();//find the saveButton element from sendAndReceiveConstants class and click on it.



    }
}
