package org.example.test;

import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.example.endpoints.UserEndPoints;
import org.example.payload.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserTests {

    Faker faker;
    User userPayload;

    @BeforeClass
    public void setUpData(){
        faker = new Faker();
        userPayload = new User();
        userPayload.setId(faker.idNumber().hashCode());
        userPayload.setUsername(faker.name().username());
        userPayload.setFirstName(faker.name().firstName());
        userPayload.setLastName(faker.name().lastName());
        userPayload.setEmail(faker.internet().safeEmailAddress());
        userPayload.setPassword(faker.internet().password());
        userPayload.setPhone(faker.phoneNumber().cellPhone());
    }

    @Test
    public void postAnUser(){
        Response response  = UserEndPoints.createAnUser(userPayload);
        response.then().log().all();
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
