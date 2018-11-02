import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
//Filter the conditions for selecting the gift: price,area,gift type.
public class homeScreen {
    public static void  chooseFiltering(WebDriver driver){

        WebElement chooseSum=driver.findElement(homeConstants.chooseSumBox);//find the chooseSum element from homeConstants class and click on it.
        chooseSum.click();
        List<WebElement> allSumElements = driver.findElements(homeConstants.chooseSumDrop);//enter to a list all chooseSum elements.
        allSumElements.get(3).click();//choose the third value and click on it.
        WebElement chooseArea=driver.findElement(homeConstants.chooseAreaBox);//find the chooseArea element from homeConstants class and click on it.
        chooseArea.click();
        List<WebElement> allAreaElements = driver.findElements(homeConstants.chooseAreaDrop);//enter to a list all chooseArea elements.
        allAreaElements.get(3).click();//choose the third value and click on it.
        WebElement chooseCategory=driver.findElement(homeConstants.chooseCategoryBox);//find the chooseCategory element from homeConstants class and click on it.
        chooseCategory.click();
        List<WebElement> allCategoryElements = driver.findElements(homeConstants.chooseCategoryDrop);//enter to a list all chooseCategory elements.
        allCategoryElements.get(3).click();//choose the third value and click on it.

    }
    public static void findMeAGift(WebDriver driver){
        driver.findElement(homeConstants.findPresentButton).click();//find the findPresentButton element from homeConstants class and click on it.
        try {//wait until the next page loads.
            Thread.sleep(300);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }
}
