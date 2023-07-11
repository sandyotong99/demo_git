package starter.Gorest.post.PostsStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Gorest.post.PostApi;
import starter.Gorest.post.jsonPlace.JsonSchema;
import starter.Utils.Constants;

import java.io.File;

public class PostCreateUserPostStepDef {

    @Steps
    PostApi postApi;

    @Given("Post new user with valid parameter")
    public void postNewUserWithValidParameter() {
        File jsonReq = new File(Constants.JSON_REQ_BODY_POST + "SendValidData.json");
        postApi.postCreateUser(jsonReq);
    }

    @When("Send post new user parameter")
    public void sendPostNewUserParameter() {
        SerenityRest.when().post(PostApi.POST_VALID_USER);
    }


    @And("Validate post create user resources json schema")
    public void validatePutUpdateUserResourcesJsonSchema() {
        File jsonSchema = new File(JsonSchema.POST_CREATE_USER_POST_SCHEMA);
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }


    @Given("Post new user without inputting body")
    public void postNewUserWithoutInputtingBody() {
        File jsonReq = new File(Constants.JSON_REQ_BODY_POST + "SendBlankData.json");
        postApi.postCreateUser(jsonReq);
    }

    @Then("Status code should be {int} Unprocessable Entity")
    public void statusCodeShouldBeUnprocessableEntity(int unprocessableEntity) {
        SerenityRest.then().statusCode(unprocessableEntity);
    }

    @And("Validate post without inputting body json data schema")
    public void validatePostWithoutInputtingBodyJsonDataSchema() {
        File jsonSchema = new File(JsonSchema.NOT_INPUTTING_IDUSER);
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Post new user without inputting user_id")
    public void postNewUserWithoutInputtingUser_id() {
        File jsonReq = new File(Constants.JSON_REQ_BODY_POST + "SendWithoutId.json");
        postApi.postCreateUser(jsonReq);
    }

    @And("Validate post without inputting User_id json data schema")
    public void validatePostWithoutInputtingUser_idJsonDataSchema() {
        File jsonSchema = new File(JsonSchema.UNREGISTERED_ID);
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    @Given("Post new user without inputting title")
    public void postNewUserWithoutInputtingTitle(){
        File jsonReq = new File(Constants.JSON_REQ_BODY_POST + "SendWithoutTitle.json");
        postApi.postCreateUser(jsonReq);
    }

    @And("Validate post without inputting title json data schema")
    public void validatePostWithoutInputtingTitleJsonDataSchema() {
        File jsonSchema = new File(JsonSchema.UNREGISTERED_ID);
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
