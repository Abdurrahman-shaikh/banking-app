package com.azmi.bankingapp.service.impl;


import com.azmi.bankingapp.dto.AccountDto;
import com.azmi.bankingapp.entity.Account;
import com.azmi.bankingapp.mapper.AccountMapper;
import com.azmi.bankingapp.reposetory.AccountRepository;
import com.azmi.bankingapp.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapAccountDto(savedAccount);
    }
}
