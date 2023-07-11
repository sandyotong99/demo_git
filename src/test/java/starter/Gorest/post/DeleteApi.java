package starter.Gorest.post;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

public class DeleteApi extends Constants {

    public static String DELETE_USER_POST = BASE_URL + "/posts/{id}";

    public static String DELETE_USER_POST_INVALID = BASE_URL + "/posts";

    public static String TOKEN = "5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754";

    @Step("Delete user valid parameter")
    public void deleteValidUser(int id){
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .pathParam("id", id);
    }

    @Step("Delete user invalid parameter")
    public void deleteInvalidUser(String id){
        SerenityRest.given().pathParam("id", id);
    }

}
