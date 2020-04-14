package com.company.view;

import com.company.controller.Controller;
import com.company.controller.FacilitateurDeTransaction;
import com.company.service.BankService;
import com.company.service.BankServiceImpl;
import com.company.service.TransactionsServices;
import com.company.service.TransactionsServicesImpl;

import java.util.Scanner;

public class View {


Scanner clavier = new Scanner(System.in);

    BankService bankService = new BankServiceImpl();



    Controller controller = new Controller(bankService);

    LienBancaire lien = new LienBancaire();



    public void request(){
    int nb;
    do{
        System.out.println("menue\n" +
                "1-enregistrement\n" +
                "2-recherche\n" +
                "3-lister\n"+
                    "4-Transaction");

        System.out.println("entrrez un chiffre de 1 a 4 pour choisir le menue");
        nb = clavier.nextInt();

        if (nb>0 && nb<=4);
        switch (nb) {

            case 1:
                System.out.println("vous avez choisi l enregistrement");
                controller.enregistrement();
                break;
            case 2:
                clavier.nextLine();
                System.out.print("Saisissez le mot a rechercher: ");
                String search = clavier.nextLine();

                if (controller.recherche(search)!= null)
                    System.out.println("Le client trouve est :" + controller.recherche(search));

                break;
            case 3:
                System.out.println("vous avez choisi lister");
                controller.affiche();
                break;
            case 4:
                System.out.println("vous avez choisi Transactions");
                lien.presenter();
                break;
            default:
                System.out.println("erreur entrez soit 1 ou 2 ou 3 ou 4");

        }
    }while(nb>0 && nb <= 4);

}





    }














