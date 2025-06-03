package com.fiap.global_api.dto;

import com.fiap.global_api.model.Desastre;

public class ResponseDesastre {
    private Long id;
    private String nomeDesastre;
    private String regiao;
    private int risco;


    public ResponseDesastre toDto(Desastre desastre) {
        this.setId(desastre.getId());
        this.setNomeDesastre(desastre.getNomeDesastre());
        this.setRegiao(desastre.getRegiao());
        this.setRisco(desastre.getRisco());
        return this;
    }


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
