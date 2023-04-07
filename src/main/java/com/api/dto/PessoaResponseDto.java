package com.api.dto;

import com.api.model.PessoaModel;
import java.util.Date;

/**
 *
 * @author Miguel Castro
 */
public class PessoaResponseDto {

    private Long id;
    private String nome;
    private Date data_nascimento;
    private String cpf;

    public PessoaResponseDto(Long id, String nome, Date data_nascimento, String cpf) {
        this.id = id;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.cpf = cpf;
    }

    public static PessoaResponseDto converterEntidadeParaPacienteDto(PessoaModel pessoaModel) {
        return new PessoaResponseDto(pessoaModel.getId(), pessoaModel.getNome(), 
                pessoaModel.getData_nascimento(), pessoaModel.getCpf());
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
}
