package starter.Gorest.post.PostsStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Gorest.GorestResponses;
import starter.Gorest.post.GetApi;
import starter.Gorest.post.jsonPlace.JsonSchema;

import java.io.File;

import static org.hamcrest.Matchers.equalTo;

public class GetSingleUserPostStepDef {

    @Steps
    GetApi getApi;

    //Positif Case

    @Given("Get single user with registered {int}")
    public void getSingleUserWithRegistered(int id) {
        getApi.getSingleUserPost(id);
    }

    @When("Send get single user post")
    public void sendGetSingleUserPost() {
        SerenityRest.when().get(GetApi.GET_SINGLE_USER_POST);
    }

    @And("Response body should be {int} user")
    public void responseBodyShouldBeUser(int id) {
        SerenityRest.then().body(GorestResponses.ID, equalTo(id));
    }

    @And("Validate get single json schema")
    public void validateGetSingleJsonSchema() {
        File jsonSchema = new File(JsonSchema.GET_SINGLE_USER_POST_SCHEMA);
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }

    //Negative Case
    @Given("Get single user with invalid {int}")
    public void getSingleUserWithInvalid(int page) {
        getApi.getSingleUserPostInvalid(page);
    }

    @When("Send get single user post page")
    public void sendGetSingleUserPostPage() {
        SerenityRest.when().get(GetApi.GET_SINGLE_USER_INVALID);
    }

    @And("Response body should be {string} as error message")
    public void responseBodyShouldBeAsErrorMessage(String error) {
        SerenityRest.then().body(GorestResponses.ERROR, equalTo(error));
    }

    @And("Validate get single json schema invalid")
    public void validateGetSingleJsonSchemaInvalid() {
        File jsonSchema = new File(JsonSchema.GET_SINGLE_USER_POST_INVALID_SCHEMA);
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }
}
