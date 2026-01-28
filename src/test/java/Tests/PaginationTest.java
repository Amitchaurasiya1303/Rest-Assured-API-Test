package Tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PaginationTest {

    @Test
    public void getProducts(){
        RestAssured.baseURI = "https://fakestoreapi.com";

        given()
                .queryParam("limit",3)
                .when()
                .get("/products")
                .then()
                .statusCode(200)
                .log().all();
    }
}
