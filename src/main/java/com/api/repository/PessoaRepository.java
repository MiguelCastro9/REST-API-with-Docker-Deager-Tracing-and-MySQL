package com.api.repository;

import com.api.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Miguel Castro
 */
@Repository
public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {

    public PessoaModel findByCpf(String cpf);

    public PessoaModel findByContatoEmail(String email);

    public PessoaModel findByContatoNumero(String numero);

}
