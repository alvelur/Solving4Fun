package org.example.SdetProject.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.example.SdetProject.endpoints.payload.User;

import static io.restassured.RestAssured.given;

public class UserEndPoints {

    public static Response createAnUser(User payload){
        Response response =
                given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
                .when()
                //Como es estatico podemos llamarlo directamente con la clase
                .post(Routes.post_User);
        return response;
    }

    public static Response getAnUser(String userName){
        Response response =
                given()
                        .pathParam("username", userName)
                        .when()
                        .get(Routes.get_User);
        return response;
    }

    public static Response updateAnUser(User payload, String userName){
        Response response =
                given()
                        .contentType(ContentType.JSON)
                        .accept(ContentType.JSON)
                        .pathParam("username", userName)
                        .body(payload)
                        .when()
                        //Como es estatico podemos llamarlo directamente con la clase
                        .put(Routes.put_User);
        return response;
    }

    public static Response deleteAnUser(String userName){
        Response response =
                given()
                        .pathParam("username", userName)
                        .when()
                        .delete(Routes.delete_User);
        return response;
    }

}
