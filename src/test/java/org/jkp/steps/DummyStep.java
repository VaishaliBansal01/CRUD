package org.jkp.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static io.restassured.RestAssured.given;

public class DummyStep {
//    ResponseEntity<String> lastResponse;
//  @LocalServerPort
//    String port;

  Response response;



    @Given("I have a valid API endpoint")
    public void setApiEndpoint() {
        // Set API endpoint
      RestAssured.baseURI="https://reqres.in/";
      RestAssured.basePath="/api/users";
    }

    @When("I make a GET request")
    public void makeGetRequest(int pageNumber) {
        // Make GET request and store response
//        lastResponse= new RestTemplate().exchange(url : "http://localhost:" +port + String.class)
      response = given().
              queryParam("page",pageNumber).
              when().
              get().
              then().
              contentType(ContentType.JSON).
              extract().response();
    }

    @Then("I should get a successful response")
    public void verifySuccessfulResponse(String emailID) {
        // Verify response status code, content, etc.
//      assertThat
      String userEmail = response.path("data[0].email");
      Assert.assertEquals(userEmail, emailID);

    }
}
