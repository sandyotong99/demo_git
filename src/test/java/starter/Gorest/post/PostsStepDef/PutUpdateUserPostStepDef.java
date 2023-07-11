package starter.Gorest.post.PostsStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Gorest.post.PutApi;
import starter.Gorest.post.jsonPlace.JsonSchema;
import starter.Utils.Constants;

import java.io.File;

public class PutUpdateUserPostStepDef {

    @Steps
    PutApi putApi;

    @Given("Put update user with valid parameter {int} as id and json with auth token")
    public void putUpdateUserWithValidParameterAsIdAndJsonWithAuthToken(int id) {
        File jsonReq = new File(Constants.JSON_REQ_BODY_POST + "ReqBodyUpdateValid.json");
        putApi.updateValidUser(id, jsonReq);
    }

    @When("Send put update user parameter with json")
    public void sendPutUpdateUserParameterWithJson() {
        SerenityRest.when().put(PutApi.PUT_VALID_USER);
    }

    @And("Validate put update user resources json schema")
    public void validatePutUpdateUserResourcesJsonSchema() {
        File jsonSchema = new File(JsonSchema.PUT_VALID_USER);
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Put update user with valid parameter {int} as id and not inputting title")
    public void putUpdateUserWithValidParameterAsIdAndNotInputtingTitle(int id) {
        File jsonReq = new File(Constants.JSON_REQ_BODY_POST + "SendWithoutTitle.json");
        putApi.updateValidUser(id, jsonReq);
    }

}
