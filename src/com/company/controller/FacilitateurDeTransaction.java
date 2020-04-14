package com.company.controller;

import com.company.model.Opperations;
import com.company.model.Transfer;
import com.company.service.TransactionsServices;
import com.company.service.TransactionsServicesImpl;

import java.util.Scanner;

public class FacilitateurDeTransaction {


   TransactionsServices transactions ;
    Scanner clavier = new Scanner(System.in);

    public FacilitateurDeTransaction(TransactionsServices changement) {
    this.transactions = changement;
    }

    public int ajouter(){
        return transactions.ajout(0);
    }

    public int retirer(){
        return transactions.retrai(clavier.nextInt());
    }
    public Transfer envoyer(){
      return transactions.envoi();
    }
    public Transfer recevoir(){
        return transactions.reception();
    }
}
