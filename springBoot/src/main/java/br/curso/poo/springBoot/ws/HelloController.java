package br.curso.poo.springBoot.ws;

import br.curso.poo.springBoot.service.SimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private SimpleService simpleService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(name = "GETCursoPOO", path = "/curso", method = RequestMethod.GET, params = {
          "name"
    })
    public String cursoPOO(String name) {
        return "Olá " + name;
    }

    @RequestMapping("/getId")
    public String getId() {
        return simpleService.getUUID();
    }
}
