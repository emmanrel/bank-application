package com.company.model;

public class Transfer {

private String paysDorigine;
private String paysDeDestination;
private int sommeEnvoye;
private int sommeRecue;
        private String nomDuProprietaire;
private String nomDuBenefficiaire;
private String numroDuCompteBenefficiare;
    public Transfer() {
    }

    public String getNumroDuCompteBenefficiare() {
        return numroDuCompteBenefficiare;
    }

    public void setNumroDuCompteBenefficiare(String numroDuCompteBenefficiare) {
        this.numroDuCompteBenefficiare = numroDuCompteBenefficiare;
    }

    public String getPaysDorigine() {
        return paysDorigine;
    }

    public void setPaysDorigine(String paysDorigine) {
        this.paysDorigine = paysDorigine;
    }

    public String getPaysDeDestination() {
        return paysDeDestination;
    }

    public void setPaysDeDestination(String paysDeDestination) {
        this.paysDeDestination = paysDeDestination;
    }

    public int getSommeEnvoye() {
        return sommeEnvoye;
    }

    public void setSommeEnvoye(int sommeEnvoye) {
        this.sommeEnvoye = sommeEnvoye;
    }

    public int getSommeRecue() {
        return sommeRecue;
    }

    public void setSommeRecue(int sommeRecue) {
        this.sommeRecue = sommeRecue;
    }

    public String getNomDuProprietaire() {
        return nomDuProprietaire;
    }

    public void setNomDuProprietaire(String nomDuProprietaire) {
        this.nomDuProprietaire = nomDuProprietaire;
    }

    public String getNomDuBenefficiaire() {
        return nomDuBenefficiaire;
    }

    public void setNomDuBenefficiaire(String nomDuBenefficiaire) {
        this.nomDuBenefficiaire = nomDuBenefficiaire;
    }
}
