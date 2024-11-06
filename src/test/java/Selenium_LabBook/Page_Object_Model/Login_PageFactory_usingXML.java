package Selenium_LabBook.Page_Object_Model;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_PageFactory_usingXML {
    @Test
    public void login() throws InterruptedException, IOException, SAXException, ParserConfigurationException {
        String projectpath = System.getProperty("user.dir");
        System.out.println("Project path is : " + projectpath);

        // Load XML file
        File xmlfile = new File("C:\\Users\\david.doggala\\eclipse-workspace\\Oct2024\\Login.xml");
        DocumentBuilderFactory DBFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder DBBuilder = DBFactory.newDocumentBuilder();
        Document DBDoc = DBBuilder.parse(xmlfile);

        // Normalize XML structure
        DBDoc.getDocumentElement().normalize();

        // Parse XML and retrieve login details
        NodeList loginList = DBDoc.getElementsByTagName("Login");
        String opencart_url = null;
        String uname = null;
        String pword = null;

        for (int i = 0; i < loginList.getLength(); i++) {
            Node node = loginList.item(i);
            Element ele = (Element) node;

            // Check if the "id" attribute is "2"
            if ("2".equals(ele.getAttribute("id"))) {
                opencart_url = ele.getElementsByTagName("url2").item(0).getTextContent();
                uname = ele.getElementsByTagName("username2").item(0).getTextContent();
                pword = ele.getElementsByTagName("password2").item(0).getTextContent();
                break;
            }
        }

        if (opencart_url == null || uname == null || pword == null) {
            System.out.println("Login details for id='2' were not found.");
            return;
        }

        // Set up WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Login_PageFactory obj = PageFactory.initElements(driver, Login_PageFactory.class);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Perform login actions
        driver.get(opencart_url);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        obj.enterUserName(uname);
        Thread.sleep(1000);
        obj.enterPassword(pword);
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0, 300);");
        obj.clickloginButton();
    }
}
