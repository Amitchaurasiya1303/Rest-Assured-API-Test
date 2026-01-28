package Tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CreateProductTest {

    @Test
    public void createProduct(){
        RestAssured.baseURI = "https://fakestoreapi.com";

        String requestBody = "{\n" +
                "  \"title\": \"Wireless Gaming Mouse\",\n" +
                "  \"price\": 49.99,\n" +
                "  \"description\": \"High precision wireless gaming mouse with RGB lighting\",\n" +
                "  \"image\": \"https://example.com/mouse.png\",\n" +
                "  \"category\": \"electronics\"\n" +
                "}";

        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/products")
                .then()
                .statusCode(201)
                .log().all();
    }
}
