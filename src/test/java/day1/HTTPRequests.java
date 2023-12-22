package day1;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
/*given()
     content type, set cookies, Add auth, add param, set header info etc.
when()
      get, post, put, delete
then()
     validate status code, extract response, extract header cookies, response body...*/

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HTTPRequests {
    @Test
    void getUsers()
    {
        //import static packages

        // Get users main url - https://reqres.in/    /api/users/2

        given()//becoz get request does not require any prerequisite

                .when()
                  .get("https://reqres.in/api/users?page=2")


                .then()
                  .statusCode(200)
                  .body("page",equalTo(2))
                  .log().all();    //if we want to display msg on console window

    }
}
