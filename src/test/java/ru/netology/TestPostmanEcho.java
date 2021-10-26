package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestPostmanEcho {
    @Test
    void shouldReturnPostRequest() {
        //Подход Given-When-Then
        //Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data")
                //Выполняемые действия
                .when()
                .post("/post")
                //Проверки
                .then()
                .statusCode(300)
                .body("data", equalTo("some data"))
        ;
    }

}
