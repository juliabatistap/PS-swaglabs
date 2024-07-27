package br.com.juliabatista.swaglabs.pages;

import br.com.juliabatista.swaglabs.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By username = By.id("user-name");
    private By password = By.id("password");
    private By botaoLogin = By.id("login-button");

    public HomePage(WebDriver navegador) {
        super(navegador);

    }
    public void acessarPagina(){
        navegador.get("https://www.saucedemo.com/");
    }

    public void inputDados(){
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    public void inputPassword(){
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");

    }
    public void clicarBotaoLogin(){
        navegador.findElement(By.id("login-button")).click();
    }
}
