package Tests;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteProductTest {

    @Test
    public void deleteProduct(){
        RestAssured.baseURI = "https://fakestoreapi.com";

        given()
                .pathParams("id",1)
                .when()
                .delete("products/{id}")
                .then()
                .statusCode(200)
                .log().all();
    }
}
