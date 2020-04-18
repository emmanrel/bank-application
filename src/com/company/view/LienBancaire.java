package com.company.view;

import com.company.controller.FacilitateurDeTransaction;
import com.company.model.Customer;
import com.company.service.BankServiceImpl;
import com.company.service.TransactionsServices;
import com.company.service.TransactionsServicesImpl;

import java.util.Scanner;

public class LienBancaire {
    private int numeroChoisi;


    Scanner clavier = new Scanner(System.in);
    private String criteria;

    public LienBancaire() {
    }

    public int getNumeroChoisi() {
        return numeroChoisi;
    }

    public void setNumeroChoisi(int numeroChoisi) {
        this.numeroChoisi = numeroChoisi;
    }

    TransactionsServices element = new TransactionsServicesImpl();
    FacilitateurDeTransaction faciliteur = new FacilitateurDeTransaction(element);


    public void presenter() {


          do{
              BankServiceImpl bank = new BankServiceImpl();
                Customer customer = new Customer();


              System.out.println("menue Transaction\n" +
                      "1-Creer un compte\n" +
                      "2-Recherche du compte\n"+
                      "3-opperations bancires\n"+
                      "4-Transactions bancaires");

              System.out.println("entrez un chifre entre 1 et 6 pour faire le choix et appuyez 7 pour sortir");
              numeroChoisi = clavier.nextInt();
              switch (numeroChoisi){
                  case 1:

                      bank.createAccount();
                      break;
                  case 2:

                       bank.searchAcount(criteria);

                      break;
                  case 3:

                      faciliteur.ajouter();
                      break;
                  case 4:

                      faciliteur.retirer();
                      break;
                  case 5:

                      faciliteur.envoyer();
                      break;
                  case 6:
                      faciliteur.recevoir();

                      break; case 7:

                      System.exit(0);
                      break;
                  default:
                      System.out.println(" erreur entrez un chiffre de 1 a 8");

              }
          }while (numeroChoisi>0 && numeroChoisi<=7);



}


}
