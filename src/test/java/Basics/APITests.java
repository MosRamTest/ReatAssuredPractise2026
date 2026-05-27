package Basics;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITests {

    @Test
    void test1 (){

        Response r=  get("https://reqres.in/api/users?page=2");

        System.out.println("Response" +r.asString());
        System.out.println("Status Code"+r.getStatusCode());
        System.out.println("Body"+r.getBody().asString());
        System.out.println("Time takes"+r.getTime());
        System.out.println("Header"+r.getHeader("Content-type"));
        //r.getStatusCode();

        int statusCode = r.statusCode();
        Assert.assertEquals(statusCode,401);

    }

    @Test
    void test2(){

        given().
                get("https://reqres.in/api/users?page=2").
                then().
                statusCode(401);
    }
}
