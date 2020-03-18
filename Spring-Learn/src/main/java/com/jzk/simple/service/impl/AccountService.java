package com.jzk.simple.service.impl;

import com.jzk.simple.dao.IAccountDao;
import com.jzk.simple.service.IAccountService;

/**
 * ClassName:AccountService
 * Package:com.jzk.simple.service.impl
 * Description:
 *
 * @Date:2020/3/17 17:17
 * @Author:JiangZhikuan
 */
public class AccountService implements IAccountService {

    private IAccountDao accountDao;

    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }
    public void query() {
        accountDao.queryAccount();
    }

    public void save() {
        accountDao.saveAccount();
    }

    public void update() {
        accountDao.updateAccount();
    }

    public void delete() {
        accountDao.deleteAccount();
    }
}
