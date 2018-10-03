package com.varuni.bank.service;

import com.varuni.bank.exceptions.InvalidDetailsException;
import com.varuni.bank.exceptions.PasswordDetailsWrongException;
import com.varuni.bank.exceptions.UserNotFoundException;
import com.varuni.bank.model.Customer;

public interface CustomerService {
	public Customer authenticate(Customer customer) throws UserNotFoundException;
	public Customer updateProfile(Customer customer) throws InvalidDetailsException;
	public boolean updatePassword(Customer customer, String oldPassword, String newPassword) throws PasswordDetailsWrongException;

}
