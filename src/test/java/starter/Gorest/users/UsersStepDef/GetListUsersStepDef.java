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

public class GetListUsersStepDef {
    @Steps
    GorestUsersAPI gorestUsersAPI;

    @Given("Get list users with valid path {string} and token")
    public void getListUsersWithValidPathAndToken(String path) {
        gorestUsersAPI.getListUsersValidPathAndValidToken(path);
    }
    @When("Send get lists users")
    public void sendGetListsUsers() {
        SerenityRest.when().get(GorestUsersAPI.GET_LIST_USERS);
    }

    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int ok) {
        SerenityRest.then().statusCode(ok);
    }

    @And("Validate get list users with valid path and valid token json schema")
    public void validateGetListJsonSchema() {
        File json = new File(Constants.JSON_SCHEMA_POST+"ValidGLUJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get list users with valid path {string} and invalid token")
    public void getListUsersWithValidPathAndInvalidToken(String path) {
        gorestUsersAPI.getListUsersValidPathAndInvalidToken(path);
    }

    @Then("Status code should be {int} Unauthorized")
    public void statusCodeShouldBeUnauthorized(int Unauthorized) {
        SerenityRest.then().statusCode(Unauthorized);
    }

    @And("Response body message should be message {string}")
    public void responseBodyMessageShouldBeMessage(String message) {
        SerenityRest.and().body("message",equalTo(message));
    }

    @And("Validate get list users with valid path and invalid token json schema")
    public void validateGetListUsersWithValidPathAndInvalidTokenJsonSchema() {
        File json = new File(Constants.JSON_SCHEMA_POST+"InvalidTokenGLUJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get list users with invalid path {string} and valid token")
    public void getListUsersWithInvalidPathAndValidToken(String path) {
        gorestUsersAPI.getListUsersValidPathAndValidToken(path);
    }

    @Then("Status code should be {int} Not Found")
    public void statusCodeShouldBeNotFound(int notFound) {
        SerenityRest.then().statusCode(notFound);
    }

    @Given("Get list users with invalid path {string} and token")
    public void getListUsersWithInvalidPathAndToken(String path) {
        gorestUsersAPI.getListUsersValidPathAndValidToken(path);
    }
}
