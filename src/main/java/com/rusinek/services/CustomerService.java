package com.rusinek.services;

import com.rusinek.commands.CustomerForm;
import com.rusinek.domain.Customer;

import java.util.List;

public interface CustomerService extends CRUDService<Customer>{

    Customer saveOrUpdateCustomerForm(CustomerForm customerForm);
}
