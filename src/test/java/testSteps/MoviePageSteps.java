package testSteps;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.MoviePage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;

public class MoviePageSteps {

    private final MoviePage moviePage;

    public MoviePageSteps(MoviePage moviePage) {
        this.moviePage = moviePage;
    }

    @And("Movie {} page is opened")
    public void selectFirstMovieFromTheList(String movieName) {
        Assert.assertEquals(moviePage.movieTitle().should(exist).getText(),
                movieName);
    }

    @And("7 names from top cast list is printed to console")
    public void printTopActorNames() {
        for (int i = 0; i < 7; i++) {
            System.out.println("Actor name is : " + moviePage.actorNameList().get(i).getText());
        }
    }

    @And("I click on 3rd profile")
    public void selectThirdProfileOfActors() {
       // moviePage.thirdActorName().should(exist).getText();
         moviePage.thirdActorName().scrollTo().shouldBe(visible).click();
    }
}

