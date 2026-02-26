package stepDefinitions;

import apiClients.UserAPI;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;

import static org.junit.Assert.*;

public class UserSteps {

    Response response;

    @When("I get user with id {int}")
    public void get_user(int id) {
        response = UserAPI.getUser(id);
    }

    @Then("status code should be {int}")
    public void verify_status(int code) {
        assertEquals(code, response.getStatusCode());
    }
}