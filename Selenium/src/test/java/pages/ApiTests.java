package pages;

import io.restassured.RestAssured;
import org.junit.Assert;
import org.testng.annotations.Test;

public class ApiTests {
    @Test
    public void getPetStatusCodeTest() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        RestAssured
                .given()
                .when()
                .get("/pet/10")
                .then()
                .statusCode(200);
    }

    @Test
    public void createPostTest() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";

        Post post = new Post(
                "My title",
                "This is my post body",
                1
        );

        Post responsePost = RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(post)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .extract()
                .as(Post.class);

        Assert.assertEquals(post.title, responsePost.title);
    }
}
