package br.com.juliabatista.swaglabs.pages;

import br.com.juliabatista.swaglabs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By campoUsername = By.id("user-name");
    private By campoPassword = By.id("password");
    private By botaoLogin = By.id("login-button");

    public LoginPage(WebDriver navegador) {
        super(navegador);
    }

    public void realizarLogin(String username, String password){
        navegador.findElement(campoUsername).sendKeys(username);
        navegador.findElement(campoPassword).sendKeys(password);
        navegador.findElement(botaoLogin).click();
    }
}
