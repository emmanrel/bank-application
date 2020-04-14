package com.company.view;

import com.company.controller.FacilitateurDeTransaction;
import com.company.service.TransactionsServices;
import com.company.service.TransactionsServicesImpl;

import java.util.Scanner;

public class LienBancaire {
    private int numeroChoisi;


    Scanner clavier = new Scanner(System.in);

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
              System.out.println("menue Transaction\n" +
                      "1-Opperations\n" +
                      "2-Transfer");

              System.out.println("entrez un chifre entre 1 et 4 pour faire le choix et appuyez 5 pour sortir");
              numeroChoisi = clavier.nextInt();
              switch (numeroChoisi){
                  case 1:

                      faciliteur.ajouter();
                      break;
                  case 2:
                      System.out.println("entrez la somme a retrancher");
                      faciliteur.retirer();
                      break;
                  case 3:

                      faciliteur.envoyer();
                      break;
                  case 4:

                      faciliteur.recevoir();
                      break;
                  case 5:

                      System.exit(0);
                      break;
                  default:
                      System.out.println(" erreur entrez un chiffre de 1 a 5");

              }
          }while (numeroChoisi>0 && numeroChoisi<=5);



}


}
