package testSteps;

import pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Condition.visible;

public class MainPageSteps {

    private final MainPage mainPage;

    public MainPageSteps(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    @When("I accept cookie banner")
    public void acceptCookieBanner() {
        if(mainPage.cookieBanner().exists() && mainPage.cookieBanner().isDisplayed()) {
            mainPage.cookieBannerAcceptButton().shouldBe(visible).click();
        } else {
            System.out.println("Cookie banner is not visible on main page");
        }
    }

    @And("I enter {} in to search field")
    public void typeInSearchField(String searchText) {
        mainPage.searchBar().shouldBe(visible).setValue(searchText);
    }

    @And("I click on the first movie in the list")
    public void selectFirstMovieFromTheList() {
        mainPage.searchResults().shouldBe(visible).click();
    }
}

