package starter.Gorest.users.UsersAPI;

import io.restassured.http.ContentType;
import io.restassured.http.Method;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

import java.io.File;

import static io.restassured.RestAssured.post;
import static io.restassured.RestAssured.request;

public class GorestUsersAPI {
    public static String GET_LIST_USERS = Constants.BASE_URL + "/{path}";
    public static String GET_SINGLE_USER = Constants.BASE_URL + "/users/{id}";
    public static String POST_CREATE_USERS = Constants.BASE_URL + "/{path}";
    public static String PUT_UPDATE_USER = Constants.BASE_URL + "/users/{id}";
    public static String DELETE_USER = Constants.BASE_URL + "/users/{id}";

    @Step("Get list users with valid path and valid token")
    public void getListUsersValidPathAndValidToken(String path) {
        SerenityRest.given()
                .pathParam("path", path)
                .header("Authorization", "Bearer 5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754");
    }

    @Step("Get list users with valid path and invalid token")
    public void getListUsersValidPathAndInvalidToken(String path) {
        SerenityRest.given()
                .pathParam("path", path)
                .header("Authorization", "Bearer aaa5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754");
        ;
    }

    @Step("Get single user with valid parameter id and valid token")
    public void getSingleUserWithValidParameterIdAndValidToken(int id) {
        SerenityRest.given()
                .pathParam("id", id)
                .header("Authorization", "Bearer 5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754");
    }

    @Step("Get single user with valid parameter id and invalid token")
    public void getSingleUserWithValidParameterIdAndInvalidToken(int id) {
        SerenityRest.given()
                .pathParam("id", id)
                .header("Authorization", "Bearer aaa5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754");
        ;
    }

    @Step("Get single user with invalid parameter id and valid token")
    public void getSingleUserWithInvalidParameterIdAndValidToken(String id) {
        SerenityRest.given()
                .pathParam("id", id)
                .header("Authorization", "Bearer 5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754");
    }

    @Step("Post Create user with valid json, path and valid token")
    public void postCreateUserWithValidJsonPathAndValidToken(String path, File json) {
        SerenityRest.given()
                .pathParam("path",path)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer 5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754");

    }
    @Step("Post Create user with valid json, path and invalid token")
    public void postCreateUserWithValidJsonPathAndInvalidToken(String path, File json) {
        SerenityRest.given()
                .pathParam("path",path)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer aaa5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754");

    }
    @Step("Put update user with valid json and parameter id and valid token")
    public void putCreateUserWithValidJsonAndParameterIdAndValidToken(int id, File json) {
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer 5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754");
    }
    @Step("Put update user with valid json and parameter id and invalid token")
    public void putCreateUserWithValidJsonAndParameterIdAndInvalidToken(int id, File json) {
        SerenityRest.given()
                .pathParam("id", id)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer aaa5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754");
    }
    @Step("Delete user with valid parameter id and valid token")
    public void deleteUserWithValidParameterIdAndValidToken(int id) {
        SerenityRest.given()
                .pathParam("id", id)
                .header("Authorization", "Bearer 5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754");
    }
    @Step("Delete user with valid parameter id and invalid token")
    public void deleteUserWithValidParameterIdAndInvalidToken(int id) {
        SerenityRest.given()
                .pathParam("id", id)
                .header("Authorization", "Bearer aaa5c258992a4cb60cbbc85fd1813f124767bac25a70a8a38a88d087292c1739754");
    }
}
