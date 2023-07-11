package starter.Gorest.users.UsersStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Gorest.users.UsersAPI.GorestUsersAPI;
import starter.Utils.Constants;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class GetSingleUserStepDef {
    @Steps
    GorestUsersAPI gorestUsersAPI;

    @Given("Get single user with valid parameter id {int} and token")
    public void getSingleUserWithValidIdAndToken(int id) {
        gorestUsersAPI.getSingleUserWithValidParameterIdAndValidToken(id);
    }
    @When("Send get single users")
    public void sendGetSingleUsers() {
        SerenityRest.when().get(GorestUsersAPI.GET_SINGLE_USER);
    }

    @And("Response body id should be id {int}")
    public void responseBodyIdShouldBeId(int id) {
        SerenityRest.and().body("id",equalTo(id));
    }

    @And("Validate get single user with valid parameter id and valid token json schema")
    public void validateGetSingleUserWithValidIdAndValidTokenJsonSchema() {
        File json = new File(Constants.JSON_SCHEMA_POST+"ValidGSUJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get single user with non registered parameter id {int} and valid token")
    public void getSingleUserWithNonRegisteredParameterIdAndValidToken(int id) {
        gorestUsersAPI.getSingleUserWithValidParameterIdAndValidToken(id);;
    }

    @And("Validate get single user with non registered parameter id and valid token json schema")
    public void validateGetSingleUserWithNonRegisteredParameterIdAndValidTokenJsonSchema() {
        File json = new File(Constants.JSON_SCHEMA_POST+"InvalidTokenGLUJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get single user with valid parameter id {int} and invalid token")
    public void getSingleUserWithValidParameterIdAndInvalidToken(int id) {
        gorestUsersAPI.getSingleUserWithValidParameterIdAndInvalidToken(id);;
    }

    @And("Validate get single user with valid parameter id and invalid token json schema")
    public void validateGetSingleUserWithValidParameterIdAndInvalidTokenJsonSchema() {
        File json = new File(Constants.JSON_SCHEMA_POST+"InvalidTokenGLUJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get single user with invalid parameter id {string} and valid token")
    public void getSingleUserWithInvalidParameterIdAndValidToken(String id){
        gorestUsersAPI.getSingleUserWithInvalidParameterIdAndValidToken(id);
    }

    @Then("Status code should be {int} Bad Request")
    public void statusCodeShouldBeBadRequest(int badRequest) {
        SerenityRest.then().statusCode(badRequest);
    }
}
