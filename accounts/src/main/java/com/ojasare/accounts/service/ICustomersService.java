package com.ojasare.accounts.service;

import com.ojasare.accounts.dto.CustomerDetailsDto;

public interface ICustomersService {

    /**
     * @param  mobileNumber - Input Mobile Number
     * @return  Customer Details based on a given Mobile Number
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
