import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class Test {
    public static void main(String[] args) {
    }
}
/*
//EXAMPLE 1
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://rozetka.com.ua/");
            WebElement element = driver.findElement(By.xpath("//button[@class='btn-link-i']"));
            System.out.println("Button is displayed. It's " + element.isDisplayed());
        } finally {
            driver.quit();
        }

//EXAMPLE 2 Explicit Wait
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://rozetka.com.ua/");
            WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn-link-i']")));
            System.out.println("The text of a button is: " + firstResult.getText());
        } finally {
            driver.quit();
        }

//EXAMPLE 3
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.softserveinc.com/");

        driver.findElement(By.xpath("//a[@class='menu__search menu__search_background_white']")).click();

        WebElement searchInput = driver.findElement(By.xpath("//div/input[@class='form-input__text']"));
        searchInput.sendKeys("academy");
        searchInput.sendKeys(Keys.ENTER);

        List<WebElement> results = driver.findElements(By.xpath("//h3[@class='search-card__title']"));
        String firstResultTitle = results.get(0).getText();

        System.out.println(firstResultTitle.equals("IT Academy"));
        driver.quit();

//EXAMPLE 4 Explicit Wait
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.softserveinc.com/");

        driver.findElement(By.xpath("//a[@class='menu__search menu__search_background_white']")).click();

        new WebDriverWait(driver, Duration.ofSeconds(4))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div/input[@class='form-input__text']")));
        WebElement searchInput = driver.findElement(By.xpath("//div/input[@class='form-input__text']"));
        searchInput.sendKeys("academy");
        searchInput.sendKeys(Keys.ENTER);

        new WebDriverWait(driver, Duration.ofSeconds(4))
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@class='search-card__title']")))
                .isDisplayed();
        List<WebElement> results = driver.findElements(By.xpath("//h3[@class='search-card__title']"));
        String firstResultTitle = results.get(0).getText();
        System.out.println(firstResultTitle.equals("IT Academy"));
        driver.quit();

// EXAMPLE 5 Implicit Wait
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.softserveinc.com/");

        driver.findElement(By.xpath("//a[@class='menu__search menu__search_background_white']")).click();

        WebElement searchInput = driver.findElement(By.xpath("//div/input[@class='form-input__text']"));
        searchInput.sendKeys("academy");
        searchInput.sendKeys(Keys.ENTER);

        List<WebElement> results = driver.findElements(By.xpath("//h3[@class='search-card__title']"));
        String firstResultTitle = results.get(0).getText();

        System.out.println(firstResultTitle.equals("IT Academy"));
        driver.quit();

// EXAMPLE 6 Fluent Wait
public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://rozetka.com.ua/");
            System.out.println(isElementLoaded(driver, By.xpath("//button[@class='btn-link-i']")));
        } finally {
            driver.quit();
        }
    }

    public static String isElementLoaded(WebDriver driver, By loadElement) {
        WebElement f = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds((long) 20.0))
                .pollingEvery(Duration.ofSeconds((long) 5.0))
                .ignoring(NoSuchElementException.class)
                .until(ExpectedConditions.presenceOfElementLocated(loadElement));
        return f.getText();

    }

 */
