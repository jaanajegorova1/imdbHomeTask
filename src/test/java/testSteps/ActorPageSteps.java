package testSteps;

import io.cucumber.java.en.And;
import org.testng.Assert;
import pages.ActorPage;

import static com.codeborne.selenide.Condition.exist;
public class ActorPageSteps {

    private final ActorPage actorPage;

    public ActorPageSteps(ActorPage actorPage) {
        this.actorPage = actorPage;
    }

    @And("I click on 3rd profile of actor")
    public void selectThirdProfileOfActors(String thirdActorName) {
        Assert.assertEquals(actorPage.thirdActorName().should(exist).getText(), thirdActorName);
    }

    @And("I verify the correct profile have opened")
    public void printThirdActorName(String actorName) {
        Assert.assertEquals(actorPage.thirdActorName().should(exist).getText(), actorName);
    }

}
