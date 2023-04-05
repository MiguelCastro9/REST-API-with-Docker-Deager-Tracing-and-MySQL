package com.api.model;

import com.api.enums.TipoContatoEnum;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Miguel Castro
 */
@Entity
@Table(name = "contatos")
public class ContatoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private TipoContatoEnum tipo_contato;
    @Column(nullable = false)
    private String numero;

    public ContatoModel() {
    }

    public ContatoModel(Long id, String email, TipoContatoEnum tipo_contato, String numero) {
        this.id = id;
        this.email = email;
        this.tipo_contato = tipo_contato;
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoContatoEnum getTipo_contato() {
        return tipo_contato;
    }

    public void setTipo_contato(TipoContatoEnum tipo_contato) {
        this.tipo_contato = tipo_contato;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
