package test;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.InventoryPage;

public class InventoryTest {
    WebDriver driver;
    InventoryPage inventoryPage;

    @BeforeEach //logeo
    void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        LoginPage lp = new LoginPage(driver);
        lp.login("standard_user", "secret_sauce");
        inventoryPage = new InventoryPage(driver);
    }

    @Test
    void anadirUnProductoAlCarrito() {
        inventoryPage.addBackpack();
        assertEquals("1", inventoryPage.getCartCount());
    }

    @Test
    void anadirDosProductosAlCarrito() {
        inventoryPage.addBackpack();
        inventoryPage.addBikeLight();
        assertEquals("2", inventoryPage.getCartCount());
    }

    @Test
    void botonCambiaTrasAnadirProducto() {
        inventoryPage.addBackpack();
        // El botón debería decir "Remove"
        assertEquals("Remove", inventoryPage.getBackpackButtonText());
    }

    @AfterEach//cerrar página
    void tearDown() {
        driver.quit();
    }
}
