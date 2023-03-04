package sbpTests;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
public class LoginTest extends BaseSteps{
    @Step("Изменить аватар")
    @Test
    void selectAva() {
        Locators.clickAvatar.shouldBe(visible).click();
        switchTo().frame($x("(//div[@id='contentbar']/iframe)"));
        Locators.selectImg.shouldBe(visible).click();
        Locators.saveButton.shouldHave(text("Сохранить"));
        Locators.saveButton.click();
    }
    @Step("Блокировка-Разблокировка")
    @Test
    void blockinCard() {
        Locators.selectCard.shouldBe(visible).click();
        Locators.panelBlockCard.shouldHave(text("Заблокировать"));
        Locators.panelBlockCard.shouldBe(visible).click();
        Locators.blockCard.shouldBe(visible).click();
        switchTo().frame($x("//iframe[@id='confirmation-frame']"));
        Locators.confirmCard.shouldBe(visible).click();

        Locators.panelUnblockCard.shouldBe(visible);
        Locators.panelUnblockCard.shouldHave(text("Разблокировать"));
        Locators.panelUnblockCard.shouldBe(visible).click();
        switchTo().frame($x("//iframe"));
        Locators.confirmCard.shouldBe(visible).click();
    }
}
