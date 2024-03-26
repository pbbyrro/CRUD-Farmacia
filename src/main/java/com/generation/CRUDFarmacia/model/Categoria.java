package com.generation.CRUDFarmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints. NotBlank;
import jakarta.validation. constraints.Size;
@Entity
@Table(name = "tb_categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "0 atributo nome é Obrigatório!")
    @Size(min = 5, max = 100, message = "0 atributo nome deve conter no mínimo 05 e no máximo 100 caracteres")
    private String nome;

    @NotBlank(message = "0 atributo descrição é Obrigatório!")
    @Size(min = 5, max = 1000, message = "0 atributo descriçao deve conter no mínimo 5 e no máximo 1000 caracteres")
    private String descricao;

    @OneToMany
    @JsonIgnoreProperties("categoria")
    private Produto produto;
    
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}