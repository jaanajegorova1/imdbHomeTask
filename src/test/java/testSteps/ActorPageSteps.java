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

    @And("I verify, that {} profile is opened")
    public void printThirdActorName(String thirdActorName) {
        Assert.assertEquals(actorPage.actorName().should(exist).getText(), thirdActorName);
    }
}
