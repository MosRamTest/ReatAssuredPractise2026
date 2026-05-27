package PayloadBuilder;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class APIPayloadBuilder {


    @Test
    public static JSONObject loginPayload() {
        JSONObject jsonObject = new JSONObject();

        jsonObject.put("email", "mosram2@gmail.com");
        jsonObject.put("password", "mosram2@gmail.com");
        return jsonObject;


    }

}
