package com.mmt.shubh.repository.account;

import com.mmt.shubh.entity.AccountEntity;
import com.mmt.shubh.entity.AccountTransactionEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by subhamtyagi on 2/18/16.
 */
@Service
public interface IAccountRepository {
    long addAccount(AccountEntity accountEntity);

    void deleteAccount(long accountId,String memberEmailId);

    long updateAccount(AccountEntity account);

    List<AccountEntity> getAllForMember(String memberEmailId);

    void addTransaction(AccountTransactionEntity transaction);

    void updateTransaction(AccountTransactionEntity transaction);

    void deleteTransaction(long transactionId);

    List<AccountTransactionEntity> getAllAccountTransaction(long accountId);

    long addAccount(String memberEmailId, AccountEntity account);
}
