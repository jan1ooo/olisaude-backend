package br.com.jan1ooo.apiolisaude.service;

import br.com.jan1ooo.apiolisaude.dto.ClienteDTO;
import br.com.jan1ooo.apiolisaude.model.Cliente;
import br.com.jan1ooo.apiolisaude.model.ProblemaSaude;
import br.com.jan1ooo.apiolisaude.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private ProblemaService problemaService;

    public List<Cliente> findAll(){
        return repository.findAll();
    }

    public Cliente findById(Long id){
        return repository.findById(id).get();
    }

    public Cliente create(ClienteDTO clienteDTO){
        ProblemaSaude problemaSaude = problemaService.findById(clienteDTO.problemaSaude());
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.nome());
        cliente.setSexo(clienteDTO.sexo().toUpperCase());
        cliente.setProblemaSaude(problemaSaude);
        cliente.setDataCriacao(LocalDateTime.now());
        return repository.save(cliente);
    }
}
