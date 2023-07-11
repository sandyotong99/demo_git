package starter.Gorest.users.UsersStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Gorest.users.UsersAPI.GorestUsersAPI;
import starter.Utils.Constants;

import java.io.File;

public class PutUpdateUserStepDef {
    @Steps
    GorestUsersAPI gorestUsersAPI;

    @Given("Put update user with valid json and parameter id {int} and valid token")
    public void putUpdateUserWithValidJsonAndParameterIdAndValidToken(int id){
        File json = new File(Constants.JSON_REQ_BODY_POST+"PutUpdateUserValidBody.json");
        gorestUsersAPI.putCreateUserWithValidJsonAndParameterIdAndValidToken(id, json);
    }

    @When("Send put update user")
    public void sendPutUpdateUser() {
        SerenityRest.when().put(GorestUsersAPI.PUT_UPDATE_USER);
    }

    @And("Validate post create user with valid json and parameter id and valid token json schema")
    public void validatePostCreateUserWithValidJsonAndParameterIdAndValidTokenJsonSchema() {
        File json = new File(Constants.JSON_SCHEMA_POST+"ValidPUUJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get list user with invalid json and valid parameter id {int} and valid token")
    public void getListUserWithInvalidJsonAndValidParameterIdAndValidToken(int id) {
        File json = new File(Constants.JSON_REQ_BODY_POST+"PutUpdateUserInvalidBody.json");
        gorestUsersAPI.putCreateUserWithValidJsonAndParameterIdAndValidToken(id, json);
    }

    @And("Validate post create user with invalid json and valid parameter id and valid token json schema")
    public void validatePostCreateUserWithInvalidJsonAndValidParameterIdAndValidTokenJsonSchema() {
        File json = new File(Constants.JSON_SCHEMA_POST+"InvalidTokenGLUJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get list user with valid json and parameter id {int} and invalid token")
    public void getListUserWithValidJsonAndParameterIdAndInvalidToken(int id) {
        File json = new File(Constants.JSON_REQ_BODY_POST+"PutUpdateUserValidBody.json");
        gorestUsersAPI.putCreateUserWithValidJsonAndParameterIdAndInvalidToken(id, json);
    }

    @And("Validate get list user with valid json and parameter id and invalid token json schema")
    public void validateGetListUserWithValidJsonAndParameterIdAndInvalidTokenJsonSchema() {
        File json = new File(Constants.JSON_SCHEMA_POST+"InvalidTokenGLUJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get list user with valid json and  non registered id {int} and valid token")
    public void getListUserWithValidJsonAndNonRegisteredIdAndValidToken(int id) {
        File json = new File(Constants.JSON_REQ_BODY_POST+"PutUpdateUserValidBody.json");
        gorestUsersAPI.putCreateUserWithValidJsonAndParameterIdAndValidToken(id, json);
    }

    @And("Validate get list resources user with valid json and  non registered id and valid token schema")
    public void validateGetListResourcesUserWithValidJsonAndNonRegisteredIdAndValidTokenSchema() {
        File json = new File(Constants.JSON_SCHEMA_POST+"InvalidTokenGLUJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }

    @Given("Get list user with invalid json and non registered id {int} and valid token")
    public void getListUserWithInvalidJsonAndNonRegisteredIdAndValidToken(int id) {
        File json = new File(Constants.JSON_REQ_BODY_POST+"PutUpdateUserInvalidBody.json");
        gorestUsersAPI.putCreateUserWithValidJsonAndParameterIdAndValidToken(id, json);
    }

    @And("Validate get list resources user with invalid json and non registered id and valid token schema")
    public void validateGetListResourcesUserWithInvalidJsonAndNonRegisteredIdAndValidTokenSchema() {
        File json = new File(Constants.JSON_SCHEMA_POST+"InvalidTokenGLUJSONSchema.json");
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
