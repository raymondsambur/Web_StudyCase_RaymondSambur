package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoriesPage {

    public void openPage() {
        WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/categories");
    }

    public void inputSearch(String searchKeyword) {
        WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(searchKeyword);
    }

    public void createCategoryButton() {
        WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Category')]")).click();
    }

    public void inputCategoryName() {
        WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Category Name']")).sendKeys(RandomUtils.generateRandomCategoryName());
    }

    public void saveButton() {
        WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary PhtzjEWwHfB2xdkEDI8ca']")).click();
    }

    public void cancelButton() {
        WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-default _2D7tChVkI79gwfmefsc74M']")).click();
    }

    public void deleteButton() {
        WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
    }

}
