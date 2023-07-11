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

public class DeleteUserStepDef {
    @Steps
    GorestUsersAPI gorestUsersAPI;

    @Given("Delete user with valid parameter id {int} and valid token")
    public void deleteUserWithValidParameterIdAndValidToken(int id) {
        gorestUsersAPI.deleteUserWithValidParameterIdAndValidToken(id);
    }

    @When("Send delete user")
    public void sendDeleteUser() {
        SerenityRest.when().delete(GorestUsersAPI.DELETE_USER);
    }

    @Then("Status code should be {int} No Content")
    public void statusCodeShouldBeNoContent(int noContent) {
        SerenityRest.then().statusCode(noContent);
    }

    @Given("Delete user with non registered id {int} and valid token")
    public void deleteUserWithNonRegisteredIdAndValidToken(int id) {
        gorestUsersAPI.deleteUserWithValidParameterIdAndValidToken(id);
    }

    @Given("Delete user with valid parameter id {int} and invalid token")
    public void deleteUserWithValidParameterIdAndInvalidToken(int id) {
        gorestUsersAPI.deleteUserWithValidParameterIdAndInvalidToken(id);
    }

    @And("Validate delete user with valid parameter id and invalid token json schema")
    public void validateDeleteUserWithValidParameterIdAndInvalidTokenJsonSchema() {
        File json = new File(Constants.JSON_SCHEMA_POST+"InvalidTokenGLUJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
