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

public class PostCreateUserStepDef {
    @Steps
    GorestUsersAPI gorestUsersAPI;

    @Given("Post create user with valid json and path {string} and token")
    public void postCreateUserWithValidJsonPathAndToken(String path){
        File json = new File(Constants.JSON_REQ_BODY_POST+"CreateUserValidBody.json");
        gorestUsersAPI.postCreateUserWithValidJsonPathAndValidToken(path,json);
    }

    @When("Send post create user")
    public void sendPostCreateUser() {
        SerenityRest.when().post(GorestUsersAPI.POST_CREATE_USERS);
    }

    @Then("Status code should be {int} Created")
    public void statusCodeShouldBeCreated(int created) {
        SerenityRest.then().statusCode(created);
    }

    @And("Validate post create user with valid json and path and valid token json schema")
    public void validatePostCreteUserWithValidJsonPathAndValidTokenJsonSchema() {
        File json = new File(Constants.JSON_SCHEMA_POST+"ValidPCUJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Post create user with valid json and path {string} and invalid token")
    public void postCreateUserWithValidJsonAndPathAndInvalidToken(String path) {
        File json = new File(Constants.JSON_REQ_BODY_POST+"CreateUserValidBody.json");
        gorestUsersAPI.postCreateUserWithValidJsonPathAndInvalidToken(path,json);
    }

    @And("Validate post create user with valid json and path and invalid token json schema")
    public void validatePostCreateUserWithValidJsonAndPathAndInvalidTokenJsonSchema() {
        File json = new File(Constants.JSON_SCHEMA_POST+"InvalidTokenGLUJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Post create user with valid json and invalid path {string} and valid token")
    public void getListUserWithValidJsonAndInvalidPathAndValidToken(String path) {
        File json = new File(Constants.JSON_REQ_BODY_POST+"CreateUserValidBody.json");
        gorestUsersAPI.postCreateUserWithValidJsonPathAndValidToken(path,json);
    }

    @Given("Post create user with invalid json and valid path {string} and valid token")
    public void getListUserWithInvalidJsonAndValidPathAndValidToken(String path) {
        File json = new File(Constants.JSON_REQ_BODY_POST+"CreateUserInvalidBody.json");
        gorestUsersAPI.postCreateUserWithValidJsonPathAndValidToken(path,json);
    }

    @Given("Post Create user with invalid json and invalid path {string} and valid token")
    public void postCreateUserWithInvalidJsonAndInvalidPathAndValidToken(String path) {
        File json = new File(Constants.JSON_REQ_BODY_POST+"CreateUserInvalidBody.json");
        gorestUsersAPI.postCreateUserWithValidJsonPathAndValidToken(path,json);
    }
}
