package br.com.juliabatista.swaglabs.login;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@DisplayName("Testes Automatizados da Funcionalidade de Login")
public class LoginTests {
    @Test
    @DisplayName("Login bem sucedido")
    public void testLoginBemSucedido(){
        // Abrir o chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        // Abrir o site https://www.saucedemo.com/
        navegador.get("https://www.saucedemo.com/");
        //acessar ID user-name
        navegador.findElement(By.id("user-name")).sendKeys("standard_user");

        //acessar id password
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");
        //clicar em id login-button
        navegador.findElement(By.id("login-button")).click();
        //validar mensagem
        String paginaAtual = navegador.getCurrentUrl();
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", paginaAtual);
    }
}
