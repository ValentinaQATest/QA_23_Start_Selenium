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
        public void cssLocator(){
            //by tag name DONE CSS/XPath
            WebElement h1 = wd.findElement(By.xpath("//h1"));
            WebElement h2 = wd.findElement(By.xpath("/html/body/div/div/h1"));
            WebElement h3 = wd.findElement(By.cssSelector("h1"));


            //by id DONE CSS/XPath
            WebElement root = wd.findElement(By.id("root"));
            WebElement root1 = wd.findElement(By.cssSelector("#root"));
            //WebElement root2 = wd.findElement(By.xpath("//*[@id='crx-root-main']"));
           //WebElement root3 = wd.findElement(By.id("crx-root-main"));
           //WebElement root4 = wd.findElement(By.cssSelector("#crx-root-main"));


            //by class DONE CSS/XPath
            WebElement div1 = wd.findElement(By.xpath("//div[@class ='container']"));
            WebElement div2 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
            WebElement div3 = wd.findElement((By.cssSelector(".navbar-component_nav__1X_4m")));
            WebElement div4 = wd.findElement(By.className("container"));
            WebElement div5 = wd.findElement((By.cssSelector(".container")));


            //by attribute
            WebElement hr = wd.findElement(By.cssSelector("[href='/home']"));
            WebElement hr1 = wd.findElement(By.cssSelector("[href='/about']"));

            WebElement hrX = wd.findElement(By.xpath("//a[@href='/home']"));
            WebElement hrX1 = wd.findElement(By.xpath("//a[@href='/about']"));



            //one of elements find by attribute ====>start & end & contains
            WebElement inp = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
            WebElement inpX = wd.findElement(By.xpath("//input[@placeholder='Email']"));

            WebElement nam = wd.findElement(By.cssSelector("[name = 'login']"));
            WebElement namX = wd.findElement(By.xpath("//button[@name='login']"));

            //start
            WebElement inp1= wd.findElement(By.cssSelector("[placeholder ^='Em']"));
            WebElement inpX1 = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'Em')]"));

            WebElement nam1 = wd.findElement(By.cssSelector("[name ^= 'log']"));
            WebElement namX1 = wd.findElement(By.xpath("//button[starts-with(@name,'log')]"));

            //end
            WebElement inp2= wd.findElement(By.cssSelector("[placeholder $='il']"));
            WebElement inpX2 = wd.findElement(By.xpath("//*[contains(@placeholder, 'il')]"));

            WebElement nam2 = wd.findElement(By.cssSelector("[name $= 'in']"));
            WebElement namX2 = wd.findElement(By.xpath("//button[contains(@name,'in')]"));

            //contains
            WebElement inp3= wd.findElement(By.cssSelector("[placeholder *='ma']"));
            WebElement inpX3 = wd.findElement(By.xpath("//*[contains(@placeholder, 'ma')]"));

            WebElement nam3 = wd.findElement(By.cssSelector("[name *= 'ogi']"));
            WebElement namX3 = wd.findElement(By.xpath("//*[contains(@name,'ogi')]"));

        }


        

    }

