package com.fiap.global_api.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Desastre {

    @Id
    @GeneratedValue
    private Long id;
    private String nomeDesastre;
    private String regiao;
    private int risco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDesastre() {
        return nomeDesastre;
    }

    public void setNomeDesastre(String nomeDesastre) {
        this.nomeDesastre = nomeDesastre;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public int getRisco() {
        return risco;
    }

    public void setRisco(int risco) {
        this.risco = risco;
    }
}
