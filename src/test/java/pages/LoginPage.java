package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Waiter;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//input[@id='username']")
    // более эффективный способ инициализации, но не подходит для динамических локаторов
    private WebElement usernameField;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='Login']")
    private WebElement loginButton;

    public LoginPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage fillInUserName(String userName) {
        usernameField.sendKeys(userName);
        return this;
    }

    public LoginPage fillInPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }



}
