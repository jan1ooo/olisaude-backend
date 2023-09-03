package br.com.jan1ooo.apiolisaude.controller;

import br.com.jan1ooo.apiolisaude.dto.ClienteDTO;
import br.com.jan1ooo.apiolisaude.model.Cliente;
import br.com.jan1ooo.apiolisaude.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @GetMapping("/clientes")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> findAll(){
        return service.findAll();
    }

    @PostMapping("/cliente/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente create(@RequestBody ClienteDTO clienteDTO){
        return service.create(clienteDTO);
    }

}
