package demo.pages.backoffice;

import demo.utils.RandomUtils;
import demo.webdriver.WebDriverInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModifiersPage {

  String generateModifierName = "";

  public void openPage() {
    WebDriverInstance.webDriver.get("https://backoffice.mokapos.com/library/modifier");
  }

  public void createModifierButton(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Create Modifier')]")).click();
  }

  public void inputModifierName(){
    generateModifierName = RandomUtils.generateRandomModifierName();
    WebDriverInstance.webDriver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys(generateModifierName);
  }

  public void addManageOptionsButton(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-primary btn-block']")).click();
  }

  public void addOptionsButton(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Add Options')]")).click();
  }

  public void inputAddOptionName(String optionName){
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-6']//input[@placeholder='Name']")).sendKeys(optionName);
  }

  public void inputAddOptionPrice(String price){
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='form-group col-sm-5']//input[@placeholder='Rp. 0']")).sendKeys(price);
  }

  public void cancelOptionbutton(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
  }

  public void saveOptionButton(){
    WebDriverInstance.webDriver.findElement(By.xpath("//div[@class='modal-footer']//button[@class='btn btn-primary'][contains(text(),'Save')]")).click();
  }

  public void cancelButton(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[@class='btn btn-default mr-10px']")).click();
  }

  public void saveButton(){
    WebDriverInstance.webDriver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
  }

  public boolean checkItemDisplayed(){
    String xpath = "//td[text()='"+generateModifierName+"']";
    WebDriverWait wait = new WebDriverWait(WebDriverInstance.webDriver, 20);
    return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(String.format(xpath, generateModifierName)))).isDisplayed();
  }

}
