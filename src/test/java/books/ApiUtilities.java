package books;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class ApiUtilities {

    public static Response getMyCart() {
        String endPoint = "https://api.momox.fr/api/v3/cart/";

        Map<String, String> headerMomox = new HashMap<>();

        headerMomox.put("x-api-token", "2231443b8fb511c7b6a0eb25a62577320bac69b6");
        headerMomox.put("x-marketplace-id", "momox_fr");
        headerMomox.put("cookie", "media_sessionid=4ias37v8f1scm8v9ifb9xjdybuo748qh");

        Response response = given().
                accept(ContentType.JSON).
                headers(headerMomox).
                when().
                get(endPoint);
        return response;
    }
}
