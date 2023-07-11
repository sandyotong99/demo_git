package starter.Gorest.post;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

public class PostApi extends Constants {

    public static String POST_VALID_USER = BASE_URL + "/posts";

    public static String TOKEN = "5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754";

    @Step("Post create user")
    public void postCreateUser(File json) {
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .contentType(ContentType.JSON)
                .body(json);
    }

}
