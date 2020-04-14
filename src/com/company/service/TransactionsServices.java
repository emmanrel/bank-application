package com.company.service;

import com.company.model.Opperations;
import com.company.model.Transfer;

public interface TransactionsServices {

     int ajout(int criteria);
     int retrai(int criteria);
     Transfer envoi();
     Transfer reception();



}
