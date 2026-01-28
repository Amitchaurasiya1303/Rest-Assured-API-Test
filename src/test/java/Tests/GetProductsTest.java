package Tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class GetProductsTest {

    @Test
    public void getAllProducts(){
        RestAssured.baseURI = "https://fakestoreapi.com";

         given()
                .when()
                .get("/products")
                .then()
                 .statusCode(200)
                .log().all();
    }
}
