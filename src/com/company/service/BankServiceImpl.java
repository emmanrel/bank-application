package com.company.service;

import com.company.model.CompteBancaire;
import com.company.model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankServiceImpl implements BankService {

    private List<Customer> list = new ArrayList<>();

    @Override
    public Customer createAccount() {
        Scanner clavier = new Scanner(System.in);

        Customer customer = new Customer();

        System.out.println("entrez votre nom");
        customer.setNom(clavier.nextLine());

        System.out.println("entrez votre prenom");
        customer.setPrenom(clavier.nextLine());

        System.out.println("entrez votre annee de naissance");
        customer.setBirthday(clavier.nextLine());

        System.out.println("entrez votre numero de telephone");
        customer.setPhone(clavier.nextLine());

        CompteBancaire compteBancaire = new CompteBancaire();

        compteBancaire.setAmount(100000);

        int nubCompote = (int) (Math.random() * 10000000) + 10000000;

        compteBancaire.setNumero(String.valueOf(nubCompote));

        customer.setCompteBancaire(compteBancaire);

        list.add(customer);

        System.out.println(customer);

        return customer;
    }

    @Override
    public Customer searchAcount(String criteria) {
        Customer customer = null;
        if (!list.isEmpty()){
            for (int i  = 0 ; i< list.size(); i++){
                if (list.get(i).getNom().equals(criteria)
                        || list.get(i).getBirthday().equals(criteria)|| list.get(i).getCompteBancaire().getNumero().equals(criteria)){
                    customer = list.get(i);
                }else{
                    System.out.println("votre recherche n a rien donne");
                }
            }
        }else{
            System.out.println("Il n'y a aucun client dans cette banque");
        }
        return customer;
    }

    @Override
    public void getAlllCustomers() {
        list.forEach(System.out::println);
    }
}
