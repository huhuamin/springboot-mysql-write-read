package com.huhuamin.study.springbootmysqlwriteread.mybatis;

import java.util.List;

/**
 * @Author: Huhuamin
 * @Date: 2020/2/28 10:56
 * @Description: 数据库层抽象接口
 */

public interface MapperDb<T,K> {
    /**
     * 根据主键删除
     *
     * @param id
     * @return
     */
    int deleteByPrimaryKey(K id);

    /**
     * 选择性插入
     *
     * @param record
     * @return
     */
    int insertSelective(T record);

    /**
     * 选择性查找 返回单个
     *
     * @param record
     * @return
     */
    T selectSelectiveOne(T record);

    /**
     * 选择性查找 返回单个 集合
     *
     * @param record
     * @return
     */
    List<T> selectSelectiveList(T record);

    /**
     * 根据主键查找
     *
     * @param id
     * @return
     */
    T selectByPrimaryKey(K id);

    /**
     * 根据主键选择性更新
     *
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(T record);

}
