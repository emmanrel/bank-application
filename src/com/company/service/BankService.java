package com.company.service;


import com.company.model.CompteBancaire;
import com.company.model.Customer;

import java.util.List;

public interface BankService {
    Customer createAccount();
    Customer searchAcount(String criteria);
    void getAlllCustomers();
}
