package com.fiap.global_api.dto;

public class DesastreRequestCreate {

    private String nomeDesastre;
    private String regiao;
    private int risco;

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
