package starter.Gorest.post.PostsStepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Gorest.post.DeleteApi;

public class DeleteUserPostStepDef {

    @Steps
    DeleteApi deleteApi;

    @Given("Delete single user with valid and existing parameter {int}")
    public void deleteSingleUserWithValidAndExistingParameter(int id) {
        deleteApi.deleteValidUser(id);
    }

    @When("Send delete single user post")
    public void sendDeleteSingleUserPost() {
        SerenityRest.when().delete(DeleteApi.DELETE_USER_POST);
    }

    @Given("Delete single user with invalid {string}")
    public void deleteSingleUserWithInvalid(String id) {
        deleteApi.deleteInvalidUser(id);
    }
}
