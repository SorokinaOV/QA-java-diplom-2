package api;

import config.Config;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseSteps {
    protected static RequestSpecification getRequestSpec() {
        return given()
                .baseUri(Config.BaseURL)
                .contentType(ContentType.JSON);
    }
}
