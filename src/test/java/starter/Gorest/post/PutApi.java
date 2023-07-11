package starter.Gorest.post;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

public class PutApi extends Constants {
    public static String PUT_VALID_USER = BASE_URL + "/posts/{id}";
    public static String PUT_INVALID_USER = BASE_URL + "/posts/{id}";
    public static String TOKEN = "5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754";

    @Step("Update valid user")
    public void updateValidUser(int id, File json) {
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }

    @Step("Update invalid user")
    public void updateInvalidUser(String id, File json){
        SerenityRest.given()
                .header("Authorization", TOKEN)
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .body(json);
    }
}
