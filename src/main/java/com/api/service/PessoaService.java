package com.api.service;

import com.api.model.PessoaModel;
import com.api.repository.PessoaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Miguel Castro
 */
@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public PessoaModel salvar(PessoaModel pessoaModel) {
        return pessoaRepository.save(pessoaModel);
    }

    public PessoaModel alterar(PessoaModel pessoaModel) {

        return pessoaRepository.saveAndFlush(pessoaModel);
    }

    public List<PessoaModel> listar() {
        return pessoaRepository.findAll();
    }

    public Optional<PessoaModel> buscar(Long id) {
        return pessoaRepository.findById(id);
    }

    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }
    
    
}
