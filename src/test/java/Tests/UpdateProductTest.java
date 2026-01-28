package Tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class UpdateProductTest {

    @Test
    public void updateProduct(){
        RestAssured.baseURI = "https://fakestoreapi.com";
        int productId = 1;

        String requestBody = "{\n" +
                "  \"title\": \"Updated Backpack Pro\",\n" +
                "  \"price\": 89.99,\n" +
                "  \"description\": \"Updated backpack with better material and padding\",\n" +
                "  \"image\": \"https://example.com/newbag.png\",\n" +
                "  \"category\": \"men's clothing\"\n" +
                "}";

        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .pathParams("id",productId)
                .when()
                .put("products/{id}")
                .then()
                .statusCode(200)
                .log().all();
    }
}
