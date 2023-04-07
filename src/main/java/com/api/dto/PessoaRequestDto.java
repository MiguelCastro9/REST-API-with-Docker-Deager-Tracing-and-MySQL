package com.api.dto;

import com.api.model.PessoaModel;
import java.util.Date;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

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

    public PessoaModel converterPessoaDtoParaEntidade() {
        return new PessoaModel(nome, data_nascimento);
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

    @Override
    public String toString() {
        return "PessoaRequestDto{" + "nome=" + nome + ", data_nascimento=" + data_nascimento + '}';
    }
}
