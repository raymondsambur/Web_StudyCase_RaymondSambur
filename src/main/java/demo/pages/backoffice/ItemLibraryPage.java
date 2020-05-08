package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static demo.webdriver.WebDriverInstance.getWebDriver;

public class ItemLibraryPage {

    public String generatedItemName = "";

    public void openPage() {
        WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/list");
    }

    public void createItemButton() {
        waitABit(5000);
        WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Item')]")).click();
    }

    public void inputSearch(String searchKeyword) {
        WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(searchKeyword);
    }

    public void inventoryListButton() {
        WebDriverInstance.webDriver.findElement(By.xpath("//select[@id='filterSelectInventory']")).click();
    }

    public void categoriesListButton() {
        WebDriverInstance.webDriver.findElement(By.xpath("//select[@id='filterSelectCategory']")).click();
    }

    public void inputItemName() {
        generatedItemName = RandomUtils.generateRandomFoodName();
        WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Item Name']")).sendKeys(generatedItemName);
    }

    public void categoriesListArrowButton() {
        WebDriverInstance.webDriver.findElement(By.xpath("//span[@class='Select-arrow-zone']")).click();
    }

    public void chooseCategories(String categoryName) {
        WebDriverInstance.webDriver.findElement(By.xpath("//div[@aria-label='" + categoryName + "']")).click();
    }

    public void inputItemPrice() {
        WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Price']")).sendKeys(RandomUtils.generateRandomPrice());
    }

    public void inputSKU() {
        WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='SKU']")).sendKeys(RandomUtils.generateRandomSKU());
    }

    public void addVariantButton() {
        WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-block no-border-radius-top']")).click();
    }

    public void inputDescription(String itemDescription) {
        WebDriverInstance.webDriver.findElement(By.xpath("//textarea[@placeholder='Item Description']")).sendKeys(itemDescription);
    }

    public void inputVariantName(String variantName) {
        WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(variantName);
    }

    public void inputVariantPrice(String variantPrice) {
        WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Rp. 0']")).sendKeys(variantPrice);
    }

    public void inputVariantSKU(String variantSKU) {
        WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-4']//div//input[@placeholder='SKU']")).sendKeys(variantSKU);
    }

    public void inputVariantCancelButton() {
        WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
    }

    public void inputVariantConfirmButton() {
        WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Confirm')]")).click();
    }

    public void saveButton() {
        WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary no-outline']")).click();
    }

    public void cancelButton() {
        WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-default no-outline']")).click();
    }

    public void waitABit(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean checkItemDisplayed(){
        String xpath = "//td[text()='"+generatedItemName+"']";
        WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 20);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format(xpath, generatedItemName)))).isDisplayed();
    }

    public void addModifier(String modifierName){
        WebElement modifier = getWebDriver()
                .findElement(By.xpath("//label[text()='"+modifierName+"']/parent::div/input"));
        JavascriptExecutor js = (JavascriptExecutor) WebDriverInstance.webDriver;
        js.executeScript("arguments[0].scrollIntoView();",modifier);
        modifier.click();
    }

}
