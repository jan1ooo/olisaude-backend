package br.com.jan1ooo.apiolisaude.service;

import br.com.jan1ooo.apiolisaude.model.ProblemaSaude;
import br.com.jan1ooo.apiolisaude.repository.ProblemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProblemaService {

    @Autowired
    private ProblemaRepository repository;

    public ProblemaSaude findById(Long id){
        return repository.findById(id).get();
    }

    public List<ProblemaSaude> findAll(){
        return repository.findAll();
    }

}
