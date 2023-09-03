package br.com.jan1ooo.apiolisaude.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @GetMapping
    public String teste(){
        return "teste";
    }

}
