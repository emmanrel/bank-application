package com.company.model;



public class CompteBancaire {
    private String numero;
    private int amount;
    private Customer customer;

    public CompteBancaire() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "numero='" + numero + '\'' +
                ", amount=" + amount +
                '}';
    }
}
