package testSteps;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.MoviePage;

import static com.codeborne.selenide.Condition.exist;

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

//    @And("I click on 3rd profile of actor")
//    public void selectThirdProfileOfActors(String thirdActorName) {
//        Assert.assertEquals(moviePage.thirdActorName().should(exist).getText(), thirdActorName);
//    }
}

