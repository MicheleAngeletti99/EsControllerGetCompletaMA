package com.example.escontrollergetcompleta;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class GreetingController {

    @GetMapping(path = "/ciao/{provincia}")
    public User greet(@PathVariable String provincia, @RequestParam(value = "nome", required = true) String nome) {
        String saluto = "Ciao " + nome + ", com'è il tempo in " + provincia + "?";
        return new User(nome, provincia, saluto);
    }
}