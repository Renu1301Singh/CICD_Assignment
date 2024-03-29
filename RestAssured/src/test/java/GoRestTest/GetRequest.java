package GoRestTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import util.Config;

import static io.restassured.RestAssured.given;
public class GetRequest {
    public int getAll(){
        RestAssured.baseURI = "https://gorest.co.in/public/v2";
        Response response = given()
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", Config.token)
                .when()
                .get("/users");

        System.out.println("Status: " + response.getStatusCode());
        System.out.println("Body: " + response.getBody().asString());

        return response.getStatusCode();

    }
    public int getId(String userId){
        RestAssured.baseURI = "https://gorest.co.in/public/v2";
        Response response = given()
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", Config.token)
                .when()
                .get("/users/"+userId);

        System.out.println("Status: " + response.getStatusCode());
        System.out.println("Body: " + response.getBody().asString());

        return response.getStatusCode();

    }
}
