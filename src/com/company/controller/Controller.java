package com.company.controller;

import com.company.model.CompteBancaire;
import com.company.model.Customer;
import com.company.service.BankService;

public class Controller {

    private BankService bankService;
    

   

    public Controller(BankService bankService) {
    this.bankService = bankService;
    }

    public void Controller(BankService bankService) {
        this.bankService = bankService;
        
    }

    public Customer enregistrement(){
        return bankService.createAccount();
    }

    public Customer recherche(String criteria){
        return  bankService.searchAcount(criteria);
    }

    public void affiche() {
    }
}
    
