package com.company.service;

import com.company.controller.FacilitateurDeTransaction;
import com.company.model.CompteBancaire;
import com.company.model.Customer;
import com.company.model.Opperations;
import com.company.model.Transfer;

import java.util.Scanner;

public class TransactionsServicesImpl implements TransactionsServices {

    Scanner clavier = new Scanner(System.in);
    private  Transfer transfer;
    private int montant;
    public TransactionsServicesImpl() {
    }

    @Override
    public int ajout() {
        CompteBancaire compte = new CompteBancaire();
        System.out.println("entrez la somme a ajouter");
       int montant1 =clavier.nextInt();
       compte.setAmount(100000);
       int rest = (compte.getAmount()+montant1);
        System.out.println("dans votre compte il ya maintenant"+rest);
        return rest;
    }



    @Override
    public int retrai() {

        CompteBancaire banq = new CompteBancaire();
        System.out.println("entrez la somme a ajouter");
        int montant2 =clavier.nextInt();
        banq.setAmount(100000);
        int rest2 = (int)(montant2  - banq.getAmount());
        System.out.println("dans votre compte il ya mintenant:"+rest2);
        return rest2;

    }

    @Override
    public Transfer envoi() {

        Transfer transfer = new Transfer();
        BankServiceImpl service = new BankServiceImpl();
        Customer customer = new Customer();
        System.out.println("entrez votre nom");
        transfer.setNomDuProprietaire(clavier.nextLine());
        System.out.println("entrez le numero de votre compte");
        transfer.setNumroDuCompteBenefficiare(clavier.nextLine());
        System.out.println("entrez la somme a envoyer");
        transfer.setSommeEnvoye(clavier.nextInt());
        System.out.println("entrez le nom du destinataire ");
        transfer.setNomDuBenefficiaire(clavier.nextLine());
        clavier.nextLine();
        System.out.println("votre transfer a ete effectue avec succes");
               return transfer;
    }

    @Override
    public Transfer reception() {

        Transfer transfer = new Transfer();
        System.out.println("entrez votre nom");
        transfer.setNomDuBenefficiaire(clavier.nextLine());
        System.out.println("entrez le numero de votre compte");
        transfer.setNumroDuCompteBenefficiare(clavier.nextLine());
        System.out.println("entrez la somme a recuperer");
        transfer.setSommeRecue(clavier.nextInt());
        System.out.println("entrez le nom de l envoyeur ");
        transfer.setNomDuProprietaire(clavier.nextLine());
        clavier.nextLine();
        System.out.println("vous avez recu la somme de "+transfer.getSommeRecue());
        return null;
    }
}
