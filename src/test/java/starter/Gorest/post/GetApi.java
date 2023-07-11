package starter.Gorest.post;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

public class GetApi extends Constants {

    public static String GET_LIST_USER_POST = BASE_URL + "/posts";

    public static String GET_LIST_USER_POST_INVALID = BASE_URL + "/{feature}";

    public static String GET_SINGLE_USER_POST = BASE_URL + "/posts/{id}";

    public static String GET_SINGLE_USER_INVALID = BASE_URL + "/{feature}/{id}";


    @Step("Get list user post")
    public void getListUserPost(){
        SerenityRest.given();
    }

    @Step("Get list user post invalid")
    public void getListUserPostInvalid(String feature){
        SerenityRest.given().pathParam("feature", feature);
    }


    @Step("Get single user post")
    public void getSingleUserPost(int id){
        SerenityRest.given().pathParam("id", id);
    }

    @Step("Get single user post invalid")
    public void getSingleUserPostInvalid(int page){
        SerenityRest.given().pathParam("page", page);
    }
}
