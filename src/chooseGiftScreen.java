import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class chooseGiftScreen {
    public static void assertTest(WebDriver driver) {
        String URL1 = "https://buyme.co.il/search?budget=3&category=8&region=9";
        Assert.assertEquals(URL1, driver.getCurrentUrl());


    }

    public static void chooseBusinessTest(WebDriver driver) {
        WebElement businessPromoCover = driver.findElement(chooseGiftConstants.business);//find the businessPromoCover element from chooseGiftScreen Constants class and click on it.
        businessPromoCover.click();

    }
    public static void chooseMealTest(WebDriver driver){
        WebElement MealGiftCard=driver.findElement(chooseGiftConstants.mealGiftCard);
        MealGiftCard.click();

    }


}