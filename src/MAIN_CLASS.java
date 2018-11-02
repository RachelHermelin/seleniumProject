import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)//make the test run in the specific order.
public class MAIN_CLASS {
    private static WebDriver driver;
    // create ExtentReports and attach reporter(s)
    private static ExtentReports extent ;

    // creates a toggle for the given test, adds all log events under it
    public static ExtentTest test ;

    @BeforeClass
    public static void runBefore() throws SAXException, ParserConfigurationException, jdk.internal.org.xml.sax.SAXException, IOException {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("C://Users//Rachel//Desktop//extent.html");
        // choose to append each test
        htmlReporter.setAppendExisting(true);
        // attach reporter
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        // name your test and add description
        test = extent.createTest("ByMe website sanity test", "check all screens actions in the website: login, choose a business,choose a present and sending");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rachel\\IdeaProjects\\chromedriver\\chromedriver.exe");

        String NAME= enter_to_byme.getData("NAME");//call the function from enter_to_byme class and open the correct(chrome) browser.
        if (NAME.equals("chrome")){
            driver= new ChromeDriver();
//            ChromeOptions options=new ChromeOptions();
//            options.addArguments("--headless");
//            driver=new ChromeDriver(options);
        }else if (NAME.equals("Firefox")){
            driver=new FirefoxDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//wait 10 seconds to load the website.
        String URL = enter_to_byme.getData("URL");//call the function from enter_to_byme class.
        driver.get(URL);//open the byme website.



    }
    //screen shot function.
    private static String takeScreenShot(String ImagesPath) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(ImagesPath+".png");
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return ImagesPath+".png";
    }

    @Rule
    public TestName name = new TestName();


    @Test//call the functions from RegistrationScreen class and send report.
    public void test00_loginTest() throws IOException {

        boolean loginScreen=false;
        try {
            RgistrationScreen.enterToLoginScreen(driver);
              // add screenshot to the report
            test.pass("login screenshot", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("C:\\Users\\Rachel\\Desktop\\" + name.getMethodName())).build());
            RgistrationScreen.loginTest_1(driver);
            loginScreen=true;
        }
        catch (Exception e){
            e.printStackTrace();
            // log results
            test.log(Status.FAIL,"registration Test failed"+e.getMessage());
            loginScreen=false;
        }finally {
            if (loginScreen)
                // log results
                test.log(Status.PASS,"registration Test passed");
        }
    }

    @Test//call the functions from HomeScreen class and send report.
    public void test01_homeScreenTest() throws IOException {
        boolean homeScreen1=false;
         try {

             homeScreen.chooseFiltering(driver);
             // add screenshot to the report.
             test.pass("home screen screen shot", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("C:\\Users\\Rachel\\Desktop\\" + name.getMethodName())) .build());
             homeScreen.findMeAGift(driver);
             homeScreen1=true;
         }
       catch (Exception e){
         e.printStackTrace();
           // log results
         test.log(Status.FAIL,"filtering Test failed"+e.getMessage());
         homeScreen1=false;
       }finally {
             if (homeScreen1)
                 // log results
             test.log(Status.PASS,"filtering Test passed");
         }

    }
    @Test//call the first function from choose gift screen class and send report.
    public void test02_chooseGiftScreen_step_A() throws IOException {

        boolean chooseGiftAS=false;
        try {
            chooseGiftScreen.assertTest(driver);
            chooseGiftAS=true;
        }
        catch (Exception e){
            e.printStackTrace();
            // log results
            test.log(Status.FAIL,"choose gift assert Test failed"+e.getMessage());
            chooseGiftAS=false;
        }finally {
            if (chooseGiftAS)
                // log results
                test.log(Status.PASS," choose gift assert Test passed");
        }
    }
    @Test//call the second function from choose gift screen class and send report.
    public void test03_chooseGiftScreen_step_B(){


        boolean chooseGift=false;
        try {
            chooseGiftScreen.chooseBusinessTest(driver);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//wait 5 seconds to load the page.
            // add screenshot to the report.
            test.pass("choose gift screen shot", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("C:\\Users\\Rachel\\Desktop\\" + name.getMethodName())).build());


            chooseGift=true;
        }
        catch (Exception e){
            e.printStackTrace();
            // log results
            test.log(Status.FAIL,"choose gift Test failed"+e.getMessage());
            chooseGift=false;
        }finally {
            if (chooseGift)
                // log results
                test.log(Status.PASS,"choose gift Test passed");
        }
    }

    @Test//call the third function from choose gift screen class and send report.
    public void test04_chooseMealTest() throws IOException {

        boolean chooseMeal=false;
        try {
            chooseGiftScreen.chooseMealTest(driver);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//wait 5 seconds to load the page.
            // add screenshot to the report.
            test.pass("choose meal screen shot", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("C:\\Users\\Rachel\\Desktop\\" + name.getMethodName())).build());


            chooseMeal=true;
        }
        catch (Exception e){
            e.printStackTrace();
            // log results
            test.log(Status.FAIL,"choose meal Test failed"+e.getMessage());
            chooseMeal=false;
        }finally {
            if (chooseMeal)
                // log results
                test.log(Status.PASS,"choose meal Test passed");
        }

    }
    @Test//call the  function from send and receive screen class and send report.
    public void test05_sendAndReceiveScreen() throws IOException {
        boolean sendAndReceive=false;
        try {
            sendAndReciveScreen.SendScreen(driver);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//wait 5 seconds to load the page.
            // add screenshot to the report.
            test.pass("send and receive screen shot", MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot("C:\\Users\\Rachel\\Desktop\\" + name.getMethodName())).build());

            sendAndReceive=true;
        }
        catch (Exception e){
            e.printStackTrace();
            // log results
            test.log(Status.FAIL,"send and receive Test failed"+e.getMessage());
            sendAndReceive=false;
        }finally {
            if (sendAndReceive)
                // log results
                test.log(Status.PASS,"send and receive Test passed");
        }


    }



    @AfterClass
    public static void runAfter(){
        //close the sites.
        driver.quit();
     //build and flush report
        extent.flush();
    }

}
