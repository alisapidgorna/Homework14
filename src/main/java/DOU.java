import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DOU {
    public static String browser = "chrome";
    public static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException {

        if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        } else if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equals("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }

        driver.get("https://dou.ua/");
        driver.manage().window().maximize();
        String titleOfThePage = driver.getTitle();
        System.out.println("Title of the page is: " + titleOfThePage);

        //click on Лента button
        driver.findElement(By.xpath("/html/body/div[1]/header/ul/li[4]/a")).click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("scroll(0, 500)");
        Thread.sleep(2000);

        //click on Стажировки в украинских компаниях button
        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div[2]/div/div/div[3]/div[1]/ul/li[12]/div/a")).click();
        JavascriptExecutor js1 = (JavascriptExecutor)driver;
        js1.executeScript("scroll(0, 250)");
        Thread.sleep(2000);

        //click on Junior дайджест: курси, стажування, вакансії. Травень’20
        driver.findElement(By.linkText("Junior дайджест: курси, стажування, вакансії. Травень’20")).click();
        Thread.sleep(2000);

        //click on Работа button
        driver.findElement(By.xpath("/html/body/div[1]/header/ul/li[6]/a")).click();
        //click on Компании button
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div[1]/div[1]/ul/li[3]/a")).click();

        //searching of Компьютерная школа Hillel in search field
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div[1]/div[2]/form/input[1]")).sendKeys("Компьютерная школа Hillel ");
        Thread.sleep(1000);
        //click on search button
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/div[1]/div[2]/form/input[2]")).click();
        Thread.sleep(2000);

        //click on Компьютерная школа Hillel button
        driver.findElement(By.xpath("//*[@id=\"companiesListId\"]/ul/li/div/div[1]/div[1]/a")).click();
        String titleOfThePage2 = driver.getTitle();
        System.out.println("Title of the page is: " + titleOfThePage2);
        Thread.sleep(2000);

        //click on Фотографии button
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        //click on Офисы button
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[1]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        //click on Отзывы button
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[1]/ul/li[4]/a")).click();
        Thread.sleep(2000);

        //click on ithillel.ua link
        driver.findElement(By.xpath("//*[@id=\"container\"]/div[2]/div[1]/div/div[2]/a")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}



