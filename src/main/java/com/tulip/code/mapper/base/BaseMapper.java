package com.tulip.code.mapper.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BaseMapper<T> {
    /**
     * 删除
     *
     * @param id
     * @return
     */
    void deleteByPrimaryKey(String id) throws Exception;

    /**
     * 新增
     *
     * @param t
     * @return
     */
    void insert(T t) throws Exception;

    /**
     * 新增，为空的不新增
     *
     * @param t
     * @return
     */
    void insertSelective(T t) throws Exception;

    /**
     * 根据主键查询
     *
     * @param id
     * @return
     */
    T selectByPrimaryKey(String id) throws Exception;

    /**
     * 是否带有clob更新，为空的不更新
     *
     * @param t
     * @return
     */
    void updateByPrimaryKeyWithBLOBs(T t) throws Exception;

    /**
     * 根据主键更新，为空的不更新
     *
     * @param t
     * @return
     */

    void updateByPrimaryKeySelective(T t) throws Exception;

    /**
     * 根据主键更新
     *
     * @param t
     * @return
     */
    void updateByPrimaryKey(T t) throws Exception;

    /**
     * 分页查询-查列表
     *
     * @param condition
     * @return
     * @throws Exception
     */
    List<T> getListForPager(Map<String, Object> condition) throws Exception;

    /**
     * 查询所有数据
     *
     * @return
     * @throws Exception
     */
    List<T> getListAll(String order) throws Exception;

    /**
     * 根据查询条件获取列表数据，只允许and拼接
     *
     * @param condition
     * @return
     * @throws Exception
     */
    List<T> getListByParams(@Param("condition") Map<String, Object> condition) throws Exception;
}
