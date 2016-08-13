/*
 * Copyright (c) 2016. . The Km2Labs Project
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package com.km2labs.expenseview.service.account;

import com.km2labs.expenseview.rest.model.Account;
import com.km2labs.expenseview.rest.model.AccountTransaction;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by subhamtyagi on 2/18/16.
 */
@Service
public interface IAccountService {

    void addAccount(Account account);

    void deleteAccount(long accountId,String memberEmailId);

    long updateAccount(Account account);

    List<Account> getAllForMember(String memberEmailId);

    void addTransaction(AccountTransaction transaction);

    void updateTransaction(AccountTransaction transaction);

    void deleteTransaction(long transactionId);

    List<AccountTransaction> getAllAccountTransaction(long accountId);

}
