package br.com.jan1ooo.apiolisaude.service;

import br.com.jan1ooo.apiolisaude.dto.ClienteDTO;
import br.com.jan1ooo.apiolisaude.model.Cliente;
import br.com.jan1ooo.apiolisaude.model.ProblemaSaude;
import br.com.jan1ooo.apiolisaude.repository.ClienteRepository;
import ch.qos.logback.core.net.server.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        Cliente cliente = new Cliente();
        cliente.setNome(clienteDTO.nome());
        cliente.setSexo(clienteDTO.sexo().toUpperCase());
        cliente.setDataCriacao(LocalDateTime.now());
        return repository.save(cliente);
    }

    public Cliente update(Long id, ClienteDTO cliente){
        Cliente novo = findById(id);
        novo.setNome(cliente.nome());
        novo.setSexo(cliente.sexo());
        novo.setDataAtualizacao(LocalDateTime.now());
        repository.save(novo);
        return novo;
    }

    public void associarProblemasDeSaudeAoCliente(Long idCliente, List<Long> idProblemas) {
        // Obtém o cliente pelo ID
        Cliente cliente = findById(idCliente);
        // Obtém a lista de problemas de saúde com base nos IDs fornecidos
        List<ProblemaSaude> problemas = idProblemas.stream()
                .map(idProblema -> problemaService.findById(idProblema))
                .collect(Collectors.toList());
        // Associa os problemas de saúde ao cliente
        cliente.setProblemaSaude(problemas);
        cliente.setDataAtualizacao(LocalDateTime.now());
        // Salva as alterações no cliente
        repository.save(cliente);
    }


}
