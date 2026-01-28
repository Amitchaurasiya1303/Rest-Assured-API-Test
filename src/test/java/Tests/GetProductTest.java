package Tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetProductTest {

    @Test
    public void getProduct(){
        RestAssured.baseURI = "https://fakestoreapi.com/";

        given()
                .pathParams("id", 1)
                .when()
                .get("/products/{id}")
                .then()
                .statusCode(200)
                .log().all();
    }
}
