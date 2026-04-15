package pages;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;

public class InventoryPage {
    private WebDriver driver;

    //BOTONES
    // Cambia estas líneas en tu InventoryPage.java
    private By addBackpackBtn = By.id("add-to-cart-sauce-labs-backpack");
    private By addBikeLightBtn = By.id("add-to-cart-sauce-labs-bike-light");
    private By removeBackpackBtn = By.id("remove-sauce-labs-backpack");
    // ESTA ES LA QUE DEBE ESTAR (LA CORRECTA)
    private By cartBadge = By.className("shopping_cart_badge");
    //verificador del texto del botón
    private By BackpackBtn = By.id("remove-sauce-labs-backpack");

    public InventoryPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void addBackpack()
    {
        driver.findElement(addBackpackBtn).click();
    }

    public void addBikeLight()
    {
        driver.findElement(addBikeLightBtn).click();
    }

    public String getCartCount()
    {
        return driver.findElement(cartBadge).getText();
    }

    public String getBackpackButtonText()
    {
        return driver.findElement(By.id("remove-sauce-labs-backpack")).getText();
    }
}
