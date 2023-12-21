import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork {

        WebDriver wd;

        @BeforeClass
        public void setUp(){
           // System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver.exe");
            wd = new ChromeDriver();
            wd.get("https://telranedu.web.app/login");
        }

        @Test
        public void tableTest(){
            WebElement canada = wd.findElement(By.cssSelector("tr:nth-child(3) td:last-child"));

            Assert.assertEquals(canada.getText(),  "Canada");
        }



        @Test
        public void cssLocator(){
            //by tag name
            WebElement h1 = wd.findElement(By.xpath("//h1"));

            //by id
            WebElement div = wd.findElement(By.xpath("//*[@id='root']"));


            //by class
            WebElement div1 = wd.findElement(By.xpath("//div[@class ='container']"));


            //by attribute


            //one of elements find by attribute ====>start & end & contains
            WebElement inp = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
            WebElement inpX = wd.findElement(By.xpath("//input[@placeholder='Email']"));

            //start
            WebElement inp1= wd.findElement(By.cssSelector("[placeholder ^='Em']"));
            WebElement inpX1 = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'Em')]"));


            WebElement inp2= wd.findElement(By.cssSelector("[placeholder $='il']"));
            WebElement inpX2 = wd.findElement(By.xpath("//*[contains(@placeholder, 'il')]"));

            //contains
            WebElement inp3= wd.findElement(By.cssSelector("[placeholder *='ma']"));
            WebElement inpX3 = wd.findElement(By.xpath("//*[contains(@placeholder, 'ma')]"));

        }




    }

