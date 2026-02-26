package apiClients;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class UserAPI extends BaseAPI {

    public static Response getUser(int id) {
        return RestAssured
                .given()
                .header("User-Agent", "Mozilla/5.0")
                .header("Accept", "application/json")
                .when()
                .get("/users/" + id)
                .then()
                .extract()
                .response();
    }
}