package com.jzk.simple.dao.impl;

import com.jzk.simple.dao.IAccountDao;

/**
 * ClassName:AccountDao
 * Package:com.jzk.simple.dao.impl
 * Description:
 *
 * @Date:2020/3/17 17:15
 * @Author:JiangZhikuan
 */
public class AccountDao implements IAccountDao  {
    public void queryAccount() {
        System.out.println("查询");
    }

    public void saveAccount() {
        System.out.println("保存");
    }

    public void updateAccount() {
        System.out.println("修改");
    }

    public void deleteAccount() {
        System.out.println("删除");
    }
}
