package test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

public class LoginTest {
        WebDriver driver;
        LoginPage loginPage;

        @BeforeEach
        void setUp()
        {
                driver = new ChromeDriver();
                driver.get("https://www.saucedemo.com/");
                loginPage = new LoginPage(driver);
        }

        @Test
        void loginCorrecto()
        {
                loginPage.login("standard_user", "secret_sauce");
                assertTrue(driver.getCurrentUrl().contains("inventory"));
        }

        @Test
        void loginIncorrecto()
        {
                loginPage.login("standard_user", "password_falso");
                assertTrue(loginPage.obtenerTextoError().contains("Username and password do not match"));
        }

        @AfterEach
        void tearDown()
        {
                driver.quit();
        }
}
