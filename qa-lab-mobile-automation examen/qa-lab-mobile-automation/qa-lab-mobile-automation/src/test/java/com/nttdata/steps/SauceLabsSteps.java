package com.nttdata.steps;

import com.nttdata.screens.LoginSaucelabsScreen;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class SauceLabsSteps {
    private WebDriver driver;

    LoginSaucelabsScreen loginSauce;

    @Step("Búsqueda por texto {0}")
    public void LogeoUsuaria(String Lgusuaria){
        System.out.println("LogUser ini");
        loginSauce.LogeoApp(Lgusuaria);
        System.out.println("LogUser fin");
    }
    public void LogContrasena(String LogContra){
        System.out.println("LogContra ini");
        loginSauce.LogeoContra(LogContra);
        System.out.println("LogContra fin");
    }

    public void ClickLog(){
        System.out.println("ClickLog ini");
        loginSauce.ClickLogeo();
        System.out.println("ClickLog fin");
    }

}
