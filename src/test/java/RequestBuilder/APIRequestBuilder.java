package RequestBuilder;

import io.restassured.response.Response;

import static Common.BasePaths.*;
import static io.restassured.RestAssured.given;
import static PayloadBuilder.APIPayloadBuilder.*;

public class APIRequestBuilder {

    public static Response loginResponse(){
        return given().
                baseUri(baseUrl2).
                basePath("/login").
                contentType("application/json").
                body(loginPayload()).
                log().all().
                post().
                then().
                log().all().
                extract().response();
    }
}
