package com.api.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Miguel Castro
 */
@Entity
@Table(name = "pessoas")
public class PessoaModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_nascimento;
    @Column(nullable = false)
    private String cpf;
    @OneToMany(mappedBy = "id", targetEntity = ContatoModel.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<ContatoModel> contato;
    
    @OneToOne(targetEntity = FisicoModel.class, cascade = CascadeType.ALL)
    private FisicoModel fisico;

    public PessoaModel() {
    }

    public PessoaModel(Long id, String nome, Date data_nascimento, String cpf, List<ContatoModel> contato, FisicoModel fisico) {
        this.id = id;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.contato = contato;
        this.fisico = fisico;
    }

    public PessoaModel(String nome, Date data_nascimento, String cpf, List<ContatoModel> contato, FisicoModel fisico) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
        this.contato = contato;
        this.fisico = fisico;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<ContatoModel> getContato() {
        return contato;
    }

    public void setContato(List<ContatoModel> contato) {
        this.contato = contato;
    }

    public FisicoModel getFisico() {
        return fisico;
    }

    public void setFisico(FisicoModel fisico) {
        this.fisico = fisico;
    }
}
