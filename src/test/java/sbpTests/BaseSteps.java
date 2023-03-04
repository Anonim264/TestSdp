package sbpTests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import java.time.Duration;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
public class BaseSteps {
    @BeforeAll
    static void beforeConfig() {
        SelenideLogger.addListener("listenerAllure",new AllureSelenide().screenshots(true).savePageSource(false));
        Configuration.timeout = 3000;
        Configuration.browserSize = "1920x1080";
    }
    @BeforeEach
    void before() {
        Selenide.open(Locators.baseUrl);
        Locators.logoImg.shouldBe(visible);
        login();
    }
    @AfterEach
    void after() {
        closeWebDriver();
    }
    @Description("Авторизация в интернет банке БСБП")
    static void login() {
        $(By.xpath("//input[@name='username']")).shouldBe(visible).val("demo");
        Locators.passwordInput.shouldBe(visible).val("demo");
        Locators.logInButton.shouldBe(visible).click();
        Locators.logoImg.shouldBe(visible);
        Locators.smsInput.shouldBe(visible).val("0000");
        Locators.codeButton.shouldBe(visible).click();
        Locators.logoIn.shouldBe(visible);
        Locators.appName.shouldBe(visible, Duration.ofSeconds(11));
        assertThat("Не соответствует текст", Locators.appName.getText(), containsString("Интернет-банк"));
    }

}
