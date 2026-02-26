package apiClients;

import io.restassured.RestAssured;
import utilities.ConfigReader;

public class BaseAPI {

    static {
        RestAssured.baseURI = ConfigReader.getBaseUrl();
    }
}