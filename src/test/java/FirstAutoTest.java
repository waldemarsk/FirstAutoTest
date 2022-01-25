import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideWait;
import com.codeborne.selenide.commands.Click;
import com.sun.org.apache.xpath.internal.compiler.Keywords;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class FirstAutoTest {

    @Test

public void FirstAutoTest() {
    WebDriverManager.chromedriver().setup();

//        Selenide.open("https://www.google.com.ua");
//        Selenide.$(By.name("q")).sendKeys("Hillel");
//        Selenide.$(By.name("q")).sendKeys(Keys.ENTER);
//        Selenide.$$(By.cssSelector("cite")).first().shouldHave(Condition.text("https://ithillel.ua"));



        Selenide.open("https://next.privat24.ua/money-transfer/card");

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

        Selenide.$(By.cssSelector("input[data-qa-node=numberdebitSource]")).sendKeys("4552331448138217");
        Selenide.$(By.cssSelector("input[data-qa-node=expiredebitSource]")).sendKeys("05/24");
        Selenide.$(By.cssSelector("input[data-qa-node=cvvdebitSource]")).sendKeys("926");

        Selenide.$(By.cssSelector("input[data-qa-node=firstNamedebitSource]")).sendKeys("FRODO");
        Selenide.$(By.cssSelector("input[data-qa-node=lastNamedebitSource]")).sendKeys("BAGGINS");

        Selenide.$(By.cssSelector("input[data-qa-node=numberreceiver]")).sendKeys("4004159115449003");

        Selenide.$(By.cssSelector("input[data-qa-node=firstNamereceiver]")).sendKeys("SAM");
        Selenide.$(By.cssSelector("input[data-qa-node=lastNamereceiver]")).sendKeys("GAMGEE");

        Selenide.$(By.name("amount")).sendKeys("123");

        Selenide.$(By.cssSelector("span[class='sc-kPVwWT kbiIqo']")).click();
        Selenide.$(By.cssSelector("button[data-qa-value=USD]")).click();

        Selenide.$(By.className("cQOKFU")).click();

        Selenide.$$(By.cssSelector("span[data-qa-node=payer-card]")).first().shouldHave(Condition.text("4552 3314 4813 8217"));
        Selenide.$$(By.cssSelector("span[data-qa-node=receiver-card]")).first().shouldHave(Condition.text("4004 1591 1544 9003"));
        Selenide.$$(By.cssSelector("div[data-qa-node=receiver-name]")).first().shouldHave(Condition.text("SAM GAMGEE"));
        Selenide.$$(By.cssSelector("div[data-qa-node=payer-amount]")).first().shouldHave(Condition.text("123 USD"));
        Selenide.$$(By.cssSelector("div[data-qa-node=receiver-amount]")).first().shouldHave(Condition.text("123 USD"));
        Selenide.$$(By.cssSelector("div[data-qa-node=payer-currency]")).first().shouldHave(Condition.text("5.41 USD"));
        Selenide.$$(By.cssSelector("div[data-qa-node=receiver-currency]")).first().shouldHave(Condition.text("0 USD"));
        Selenide.$$(By.cssSelector("div[class='sc-iQKALj ldQFQo']")).first().shouldHave(Condition.text("128.41"));
        Selenide.$$(By.cssSelector("div[class='sc-iQKALj ldQFQo']")).first().shouldHave(Condition.text("USD"));
    }
}
