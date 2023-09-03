package br.com.jan1ooo.apiolisaude.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cliente;
    private String nome;

    @NotNull
    private String sexo;

    @OneToOne
    @JoinColumn(name = "id_problema")
    private ProblemaSaude problemaSaude;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Future
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "data_autorizacao")
    private LocalDateTime dataAutorizacao;

    public Cliente() {
    }

    public Long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(Long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ProblemaSaude getProblemaSaude() {
        return problemaSaude;
    }

    public void setProblemaSaude(ProblemaSaude problemaSaude) {
        this.problemaSaude = problemaSaude;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataAutorizacao() {
        return dataAutorizacao;
    }

    public void setDataAutorizacao(LocalDateTime dataAutorizacao) {
        this.dataAutorizacao = dataAutorizacao;
    }
}
