package com.api.dto;

import com.api.model.ContatoModel;
import com.api.model.FisicoModel;
import com.api.model.PessoaModel;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

/**
 *
 * @author Miguel Castro
 */
public class PessoaRequestDto {

    @NotBlank(message = "Nome é obrigatório.")
    @Length(min = 3, max = 40, message = "Nome requer no mínimo {min} e no máximo {max} caracteres.")
    private String nome;
    @NotNull(message = "Data de nascimento é obrigatório.")
    private Date data_nascimento;
    @CPF(message = "CPF mal formatado.")
    private String cpf;
    @NotNull(message = "Contato é obrigatório.")
    private List<ContatoModel> contato;
    @NotNull(message = "Físico é obrigatório.")
    private FisicoModel fisico;

    public PessoaModel converterPessoaDtoParaEntidade() {
        return new PessoaModel(nome, data_nascimento, cpf, contato, fisico);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
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

    @Override
    public String toString() {
        return "PacienteRequestDto{" + "nome=" + nome + ", data_nascimento=" + data_nascimento + ", cpf=" + cpf + ", contato=" + contato + ", fisico=" + fisico + '}';
    }
}
