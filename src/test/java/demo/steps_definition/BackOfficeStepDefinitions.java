package demo.steps_definition;

import demo.pages.backoffice.CategoriesPage;
import demo.pages.backoffice.DashboardPage;
import demo.pages.backoffice.ItemLibraryPage;
import demo.pages.backoffice.LoginPage;
import demo.pages.backoffice.ModifiersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class BackOfficeStepDefinitions {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    CategoriesPage categoriesPage = new CategoriesPage();
    ItemLibraryPage itemLibraryPage = new ItemLibraryPage();
    ModifiersPage modifiersPage = new ModifiersPage();

    @Given("User open moka backoffice login page")
    public void userOpenMokaBackofficeLoginPage() {
        loginPage.openPage();
    }

    @When("User input email/phone {string} on backoffice login page")
    public void userInputEmailOnBackofficeLoginPage(String emailOrPhone) {
        loginPage.inputEmailorPhone(emailOrPhone);
    }

    @When("User input password {string} on backoffice login page")
    public void userInputPasswordOnBackofficeLoginPage(String password) {
        loginPage.inputPassword(password);
    }

    @When("User click Sign in on backoffice login page")
    public void userClickSignInOnBackofficeLoginPage() {
        loginPage.clickSignIn();
    }


    @Then("User successfully login on backoffice")
    public void userSuccessfullyLoginOnBackoffice() {
        Assert.assertTrue(dashboardPage.isOnPage());
    }

    @When("User go to menu categories on backoffice")
    public void userGoToMenuCategoriesOnBackoffice() {
        categoriesPage.openPage();
    }


    @When("User go to menu item library on backoffice")
    public void userGoToMenuItemLibraryOnBackoffice() {
        itemLibraryPage.openPage();
    }

    @When("User go to menu modifiers on backoffice")
    public void userGoToMenuModifiersOnBackoffice() {
        modifiersPage.openPage();
    }

    @And("User click create item button")
    public void userClickCreateItemButton() {
        itemLibraryPage.createItemButton();
    }

    @And("User input item name")
    public void userInputItemName() {
        itemLibraryPage.inputItemName();
    }

    @And("User input random item price")
    public void userInputAsItemPrice() {
        itemLibraryPage.inputItemPrice();
    }

    @And("User input random sku")
    public void userInputAsSku() {
        itemLibraryPage.inputSKU();
    }

    @And("User input {string} as description")
    public void userInputAsDescription(String description) {
        itemLibraryPage.inputDescription(description);
    }

    @Then("User click save item button on library page")
    public void userClickSaveItemButtonOnLibraryPage() {
        itemLibraryPage.saveButton();
    }

    @And("User click create category")
    public void userClickCreateCategory() {
        categoriesPage.createCategoryButton();
    }

    @And("User input category name")
    public void userInputCategoryName() {
        categoriesPage.inputCategoryName();
    }

    @Then("User click save category button on categories page")
    public void userClickSaveCategoryButtonOnCategoriesPage() {
        categoriesPage.saveButton();
    }

    @And("User click create modifier button")
    public void userClickCreateModifierButton() {
        modifiersPage.createModifierButton();
    }

    @And("User input random modifier name")
    public void userInputAsModifierName() {
        modifiersPage.inputModifierName();
    }

    @And("User click add or manage option")
    public void userClickAddOrManageOption() {
        modifiersPage.addManageOptionsButton();
    }

    @Then("User click save modifier button on modifier page")
    public void userClickSaveModifierButtonOnModifierPage() {
        modifiersPage.saveButton();
    }

    @And("User click add options button")
    public void userClickAddOptionsButton() {
        modifiersPage.addOptionsButton();
    }

    @And("User input {string} as option name")
    public void userInputAsOptionName(String name) {
        modifiersPage.inputAddOptionName(name);
    }

    @And("User input {string} as option price")
    public void userInputAsOptionPrice(String price) {
        modifiersPage.inputAddOptionPrice(price);
    }

    @And("User click save options")
    public void userClickSaveOptions() {
        modifiersPage.saveOptionButton();
    }

    @And("User check item created")
    public void userCheckItemCreated() {
        Assert.assertTrue(itemLibraryPage.checkItemDisplayed());
    }

    @And("User check modifier name")
    public void userCheckModifierName() {
        Assert.assertTrue(modifiersPage.checkItemDisplayed());
    }

    @And("User select {string} as modifier")
    public void userSelectAsModifier(String modifierName) {
        itemLibraryPage.addModifier(modifierName);
    }
}
