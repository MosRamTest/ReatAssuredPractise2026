package PayloadBuilder;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class APIPayloadBuilder {


    @Test
    public static JSONObject loginPayload() {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("email", "admin@gmail.com");
        jsonObject.put("password", "@12345678");
        return jsonObject;


    }

}
