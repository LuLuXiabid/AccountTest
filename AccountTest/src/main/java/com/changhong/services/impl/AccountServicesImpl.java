package com.changhong.services.impl;

import com.changhong.dao.IAccountDao;
import com.changhong.domain.Account;
import com.changhong.services.IAccountServices;

import java.util.List;


/**
 *
 * 业务层实现类
 */
public class AccountServicesImpl implements IAccountServices {

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public IAccountDao accountDao;

    public List<Account> findAllAccount() {
        return accountDao.findAllAccount();
    }

    public Account findOneAccount(int id) {
        return accountDao.findOneAccount(id);
    }

    public void deleteAccount(int id) {
        accountDao.deleteAccount();
    }

    public void updataAccount(Account account) {
        accountDao.updataAccount(account);

    }

    public Account alterOneAccount(Account account) {
        return accountDao.alterOneAccount(account);
    }
}
