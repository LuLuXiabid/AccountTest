package com.changhong.dao;

import com.changhong.domain.Account;

import java.util.List;


/**
 *
 *
 * 持久层接口
 */
public interface IAccountDao {
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
    void deleteAccount();


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
