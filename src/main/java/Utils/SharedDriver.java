package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class SharedDriver {

            private static WebDriver webdriver;


        public enum Browser{
            CHROME,
            FIREFOX,
            EI

        }
        protected static WebDriver getWebdriver(Browser browser){

            switch (browser){
                case CHROME:
                    WebDriverManager.chromedriver().setup();
                    webdriver= new ChromeDriver();
                    break;
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    webdriver= new FirefoxDriver();
                    break;
                case EI:
                    WebDriverManager.iedriver().setup();
                    webdriver= new InternetExplorerDriver();
                    break;
            }

            webdriver.manage().window().maximize();
            webdriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            return webdriver;

        }

        protected static void  closeWebdriver(){
            if(webdriver!=null){
                webdriver.close();
            }


        }
    }


