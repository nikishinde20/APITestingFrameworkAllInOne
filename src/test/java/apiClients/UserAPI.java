package apiClients;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserAPI extends BaseAPI {

    public static Response getUser(int id) {
        return RestAssured
                .given()
                .when()
                .get("/api/users/" + id)
                .then()
                .extract()
                .response();
    }
}