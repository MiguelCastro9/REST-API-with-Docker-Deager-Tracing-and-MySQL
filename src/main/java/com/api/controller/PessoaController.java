package com.api.controller;

import com.api.model.PessoaModel;
import com.api.service.PessoaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Miguel Castro
 */
@RestController
@RequestMapping("/pessoas")
public class PessoaController {
    
    @Autowired
    PessoaService pessoaService;
    
    @PostMapping("/salvar")
    public ResponseEntity<PessoaModel> salvar(@RequestBody PessoaModel pessoaModel) {
        
        return new ResponseEntity<PessoaModel>(pessoaService.salvar(pessoaModel), HttpStatus.CREATED);
    }
    
    @PutMapping("/alterar")
    public ResponseEntity<PessoaModel> alterar(@RequestBody PessoaModel pessoaModel) {
        
        return new ResponseEntity<PessoaModel>(pessoaService.alterar(pessoaModel), HttpStatus.OK);
    }
    
    @GetMapping("/listar")
    public ResponseEntity<List<PessoaModel>> listar() {
        
        return new ResponseEntity<>(pessoaService.listar(), HttpStatus.OK);
    }
    
    @GetMapping("/buscar/{id}")
    public ResponseEntity<?> buscar(@PathVariable("id") Long id) {
        
        return new ResponseEntity<>(pessoaService.buscar(id), HttpStatus.OK);
    }
    
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<?> deletar(@PathVariable("id") Long id) {
        
        pessoaService.deletar(id);
        return new ResponseEntity(HttpStatus.OK);
    }
}