package com.ojasare.accounts.service;

import com.ojasare.accounts.dto.CustomerDto;

public interface IAccountsService {

    /**
     *
     * @param customerDto - CustomerDto Object
     * */
    void createAccount(CustomerDto customerDto);

    /**
     * @param  mobileNumber - Input Mobile Number
     * @return  Account's Details based on a given Mobile Number
     */
    CustomerDto fetchAccount(String mobileNumber);


    /**
     * @param customerDto - CustomerDto Object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     * @param mobileNumber - Input Mobile Number
     * @return boolean indicating if the delete of Account details is successful or not
    */
    boolean deleteAccount(String mobileNumber);

}
