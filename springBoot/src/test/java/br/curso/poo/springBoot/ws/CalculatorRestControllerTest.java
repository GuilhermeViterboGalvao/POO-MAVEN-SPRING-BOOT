package br.curso.poo.springBoot.ws;

import br.curso.poo.springBoot.App;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.jayway.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CalculatorRestControllerTest {


    public void test_() {
//        String result  = given()
//                .param("paginaAtual", offset)
//                .param("totalDeElementosPorPagina", limit)
//                .param("idLojista", LojistaTemplate.ID_LOJISTA_NORMAL)
//                .when()
//                .get("/compra")
//                .then()
//                .extract()
//                .response()
//                .as(String.class);
//        assertNotNull(page);
//        assertNotNull(page.getConteudo());
//        assertEquals(1, page.getConteudo().size());
//        assertEquals(page.getConteudo().get(0).getId().longValue(), compraNormal.getId().intValue());
    }
}
