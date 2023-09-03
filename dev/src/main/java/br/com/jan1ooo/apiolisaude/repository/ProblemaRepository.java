package br.com.jan1ooo.apiolisaude.repository;

import br.com.jan1ooo.apiolisaude.model.ProblemaSaude;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemaRepository extends JpaRepository<ProblemaSaude, Long> {
}
