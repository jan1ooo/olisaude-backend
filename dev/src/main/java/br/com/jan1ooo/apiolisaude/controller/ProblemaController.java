package br.com.jan1ooo.apiolisaude.controller;

import br.com.jan1ooo.apiolisaude.model.ProblemaSaude;
import br.com.jan1ooo.apiolisaude.service.ProblemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/problema")
public class ProblemaController {

    @Autowired
    private ProblemaService service;

    @GetMapping
    public List<ProblemaSaude> findAll(){
        return service.findAll();
    }
}
