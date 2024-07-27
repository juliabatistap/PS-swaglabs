package br.com.juliabatista.swaglabs.tests;

import br.com.juliabatista.swaglabs.pages.HomePage;
import br.com.juliabatista.swaglabs.pages.LoginPage;
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
        String usernameLogin = "standard_user";
        String passwordLogin = "secret_sauce";
        // Abrir o chrome
        WebDriverManager.chromedriver().setup();
        WebDriver navegador = new ChromeDriver();

        // Abrir o site https://www.saucedemo.com/
        HomePage homePage = new HomePage(navegador);
        homePage.acessarPagina();

        //Realizar Login
        LoginPage loginPage = new LoginPage(navegador);
        loginPage.realizarLogin(usernameLogin, passwordLogin);

        //validar mensagem
        String paginaAtual = navegador.getCurrentUrl();
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html", paginaAtual);
    }
}
