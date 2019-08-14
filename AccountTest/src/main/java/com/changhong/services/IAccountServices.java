package com.changhong.services;

import com.changhong.domain.Account;

import java.util.List;

/**
 *
 * 业务层接口
 */
public interface IAccountServices {


    /**
     * 查询所有
     *
     */
    List<Account> findAllAccount();


    /**
     *
     * 查询一个
     */
    Account findOneAccount(int id);



    /**
     * 删除一条数据
     *
     */
    void deleteAccount(int id);


    /**
     * 更新数据
     * @param account
     */
    void  updataAccount(Account account);



    /**
     *
     * 修改一条数据
     * @param account
     * @return
     */
    Account  alterOneAccount(Account account);


}
