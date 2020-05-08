package demo.steps_definition;

import demo.pages.android.*;
import demo.pages.pos.StartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class MokaStepDefinitions {

  StartPage startPage = new StartPage();
  demo.pages.android.StartPage androidStartPage = new demo.pages.android.StartPage();
  ShoppingCart shoppingCart = new ShoppingCart();
  LoginPage loginPage = new LoginPage();
  MokaMainPage mokaMainPage = new MokaMainPage();
  Favourites favourites = new Favourites();
  CheckoutPopUp checkoutPopUp = new CheckoutPopUp();
  ReceiptPage receiptPage = new ReceiptPage();

  @Given("User is on moka start page")
  public void userIsOnMokaStartPage() {
    boolean actual = startPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page")
  public void userClickSignInButtonOnMokaStartPage() {
    startPage.clikSignInButton();
  }

  @Given("User is on moka start page android")
  public void userIsOnMokaStartPageAndroid() {
    boolean actual = androidStartPage.isOnPage();
    Assert.assertTrue(actual);
  }

  @When("User click sign in button on moka start page android")
  public void userClickSignInButtonOnMokaStartPageAndroid() {
    startPage.clikSignInButton();
  }

  @And("User is on login page")
  public void userIsOnLoginPage() {
    boolean actual = loginPage.isOnLoginPage();
    Assert.assertTrue(actual);
  }

  @And("User input {string} as username")
  public void userInputAsUsername(String username) {
    loginPage.inputEmailOrPhone(username);
  }

  @And("User input {string} as password")
  public void userInputAsPassword(String password) {
    loginPage.inputPassword(password);
  }

  @Then("User click sign in button on login page")
  public void userClickSignInButtonOnLoginPage() {
    loginPage.clickSignIn();
  }

  @And("User is on moka main page")
  public void userIsOnMokaMainPage() {
    mokaMainPage.isOnMokaMainPage();
  }

  @When("User click {string} with quantity of {int} in item list")
  public void userClickWithQuantityOfInItemList(String itemName, int qty) {
    favourites.getItem(itemName, qty);
  }

  @And("User click charge button on shopping cart")
  public void userClickChargeButtonOnShoppingCart() {
    shoppingCart.clickCharge();
  }

  @And("User input cash amount of {string}")
  public void userInputCashAmountOf(String cash) {
    checkoutPopUp.inputCash(cash);
  }

  @And("User click charge button on checkout pop up")
  public void userClickChargeButtonOnCheckoutPopUp() {
    checkoutPopUp.clickCharge();
  }

  @Then("User see receipt page")
  public void userSeeReceiptPage() {
    Boolean actual = receiptPage.isOnReceiptPage();
    Assert.assertTrue(actual);
  }

  @And("User click new sale button")
  public void userClickNewSaleButton() {
    receiptPage.clickNewSale();
  }
}
