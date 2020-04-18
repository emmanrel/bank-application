package com.company.service;

import com.company.model.Opperations;
import com.company.model.Transfer;

public interface TransactionsServices {

     int ajout();
     int retrai();
     Transfer envoi();
     Transfer reception();



}
