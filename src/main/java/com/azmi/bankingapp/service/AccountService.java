package com.azmi.bankingapp.service;

import com.azmi.bankingapp.dto.AccountDto;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);
    AccountDto deposit(Long id, Double amount);
    AccountDto withdraw(Long id, Double amount);
    List<AccountDto> getAllAccount();
    void deleteAccount(Long id);
    AccountDto addAccount(AccountDto accountId);
    AccountDto getAccountById(Long id);
}
