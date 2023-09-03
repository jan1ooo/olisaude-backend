package br.com.jan1ooo.apiolisaude.model;

import jakarta.persistence.*;

@Table(name = "problema_saude")
@Entity
public class ProblemaSaude {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_problema;
    private String nome;
    @Column(name = "grau_do_problema")
    private Long grauDoProblema;

    public ProblemaSaude(){

    }

    public ProblemaSaude(Long id_problema, String nome, Long grauDoProblema){
        this.grauDoProblema = grauDoProblema;
        this.id_problema = id_problema;
        this.nome = nome;
    }

    public Long getId_problema() {
        return id_problema;
    }

    public void setId_problema(Long id_problema) {
        this.id_problema = id_problema;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getGrauDoProblema() {
        return grauDoProblema;
    }

    public void setGrauDoProblema(Long grauDoProblema) {
        this.grauDoProblema = grauDoProblema;
    }
}
