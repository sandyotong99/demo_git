package starter.Gorest.post.PostsStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Gorest.post.GetApi;
import starter.Gorest.post.jsonPlace.JsonSchema;

import java.io.File;

public class GetUserPostStepDef {

    @Steps
    GetApi getApi;


    // Postitive Case
    @Given("Get list user post with valid parameter")
    public void getListUserPostWithValidParameter() {
        getApi.getListUserPost();
    }

    @When("Send get list user")
    public void sendGetListUser() {
        SerenityRest.when().get(GetApi.GET_LIST_USER_POST);
    }


    @And("Validate json schema get list user post")
    public void validateJsonSchemaGetListUserPost() {
        File jsonSchema = new File(JsonSchema.GET_LIST_USER_POST_SCHEMA);
        SerenityRest.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(jsonSchema));
    }


    // Negative Case
    @Given("Get list user post with invalid parameter {string}")
    public void getListUserPostWithInvalidParameter(String feature) {
        getApi.getListUserPostInvalid(feature);
    }

    @When("Send get list user post invalid")
    public void sendGetListUserPostInvalid() {
        SerenityRest.when().get(GetApi.GET_LIST_USER_POST_INVALID);
    }
}

