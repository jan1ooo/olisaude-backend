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

    @GetMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Cliente findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PutMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Cliente update(@PathVariable Long id, @RequestBody ClienteDTO cliente){
        return service.update(id, cliente);
    }

    @PostMapping("/cliente/{id_cliente}/problema")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void associarProblemasDeSaudeAoCliente(@PathVariable Long id_cliente, @RequestBody List<Long> problemaSaudeIds) {
        service.associarProblemasDeSaudeAoCliente(id_cliente, problemaSaudeIds);
    }
}
