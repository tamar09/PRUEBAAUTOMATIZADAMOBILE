package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import javafx.scene.web.WebEngine;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class LoginSaucelabsScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Close\"]")
    private WebElement txtUsuaria;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-standard_user\"]/android.widget.TextView")
    private WebElement Clik;
    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement txtClave;

//

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement txtBtnLogin;




    private WebEngine driver;
    public void LogeoApp(String Userr){
        System.out.println("LoginApp ini");
        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        txtUsuaria.click();
        txtUsuaria.sendKeys(Userr);
//        WebElement userInputElement = driver.();
//        userInputElement.sendKeys(User);

    }
    public void LogeoContra(String Contrasena){
        System.out.println("LoginApp ini");
        getDriver().manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        txtClave.sendKeys(Contrasena);
    }

    public void ClickLogeo(){
        System.out.println("LoginApp ini");
        getDriver().manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
        txtBtnLogin.click();

    }

    private WebDriver setDriver(WebEngine driver) {
        return getDriver();
    }

    public void enter(){
        Actions action = new Actions(setDriver(driver));
        action.sendKeys(Keys.ENTER).perform();

    }
}
