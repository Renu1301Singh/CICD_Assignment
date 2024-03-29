package GoRestTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import util.Config;

import static io.restassured.RestAssured.given;
public class DeleteRequest {
        public int DeleteUser(String userId) {
            RestAssured.baseURI = "https://gorest.co.in/public/v2";
            Response response = given()
                    .header("Authorization", Config.token)
                    .when()
                    .delete("/users/" +userId );


            System.out.println("Status: " + response.getStatusCode());
            System.out.println("Body: " + response.getBody().asString());

            return response.statusCode();
        }
    }

