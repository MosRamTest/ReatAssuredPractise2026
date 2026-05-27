package Tests;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.*;

import static Common.CommonTestData.*;
import static RequestBuilder.APIRequestBuilder.*;

@Test
@Feature("API Test")
@Story("Login")

public class APITests {

    @Description("As a user I want to login")
    public void loginTest(){

        loginResponse().
                then().
                log().all().
                assertThat().statusCode(success_status_code);
    }


}
