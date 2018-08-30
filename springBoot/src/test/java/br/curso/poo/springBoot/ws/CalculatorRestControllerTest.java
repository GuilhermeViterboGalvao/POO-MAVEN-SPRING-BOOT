package br.curso.poo.springBoot.ws;

import br.curso.poo.springBoot.App;
import br.curso.poo.springBoot.dto.CalculatorResponseDTO;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.parsing.Parser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.jayway.restassured.RestAssured.given;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculatorRestControllerTest {

    @Value("${local.server.port}")
    private int serverPort;

    @Before
    public void before() {
        RestAssured.port = serverPort;
        RestAssured.defaultParser = Parser.JSON;
    }

    @Test
    public void test___calculator_sum___n1_igual_1d5___n2_igual_1d5() {
        CalculatorResponseDTO dto  = given()
                .param("n1", 1.5)
                .param("n2", 1.5)
                .when()
                .get("/calculator/sum")
                .then()
                .extract()
                .response()
                .as(CalculatorResponseDTO.class);
        assertNotNull(dto);
        assertTrue(Double.parseDouble(dto.getResult()) == 3d);
    }
}
