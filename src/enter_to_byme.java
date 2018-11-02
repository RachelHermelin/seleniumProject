import jdk.internal.org.xml.sax.SAXException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;

public class enter_to_byme {
//Function that reads the contents of the tags from a xml file and open the site and the Chrome browser
    static String getData(String keyName) throws ParserConfigurationException, IOException, SAXException, org.xml.sax.SAXException {
        File configXmlFile = new File("C:\\Users\\Rachel\\Desktop\\Config.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(configXmlFile);

        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        assert doc != null;
        return doc.getElementsByTagName(keyName).item(0).getTextContent();



    }
    }
