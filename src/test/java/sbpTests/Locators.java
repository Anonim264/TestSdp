package sbpTests;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
public class Locators {
    public final static SelenideElement logoImg = $x("//img[@id='logo']");
    public static final SelenideElement logInButton = $x("//button[@id='login-button']");
    public final static SelenideElement passwordInput = $x("//input[@name='password']");
    public final static SelenideElement smsInput = $x("//input[@id='otp-code']");
    public final static SelenideElement codeButton = $x("//button[@id='login-otp-button']");
    public final static String baseUrl = "https://idemo.bspb.ru/";
    public final static SelenideElement appName = $x("//div[@class='environment print-hidden']");
    public final static SelenideElement logoIn = $x("//a[@id='logo']");
    public final static SelenideElement clickAvatar = $x("//img[@title='Аватар']");
    public final static SelenideElement selectImg = $x("//div[@id='avatars']//img[@data-avatar='9.png']");
    public final static SelenideElement saveButton = $x("//button[@id='submit-button']");
    public final static SelenideElement selectCard = $x("//a[@id='cards-overview-index']");
    public final static SelenideElement panelBlockCard = $x("//span[contains(text(), 'Заблокировать')]");
    public final static SelenideElement blockCard = $x("//button[@id='block-card']");
    public final static SelenideElement confirmCard = $x("//button[@id='confirm']");
    public final static SelenideElement panelUnblockCard = $x("//span[contains(text(), 'Разблокировать')]");
    public final static SelenideElement checkCardOn = $x("//div[contains(text(), 'Действует')]");
    public final static SelenideElement checkCardOff = $x("//div[contains(text(), 'Заблокирована')]");
}
