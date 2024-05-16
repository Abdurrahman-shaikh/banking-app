package com.azmi.bankingapp.mapper;

import com.azmi.bankingapp.dto.AccountDto;
import com.azmi.bankingapp.entity.Account;

public class AccountMapper {

    public static Account mapAccount(AccountDto accountDto) {
        Account newAccount = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
                );

        return newAccount;
    }

    public static AccountDto mapAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );

        return accountDto;
    }
}
