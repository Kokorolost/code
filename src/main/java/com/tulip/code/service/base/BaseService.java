package com.tulip.code.service.base;

import com.github.pagehelper.PageInfo;
import com.tulip.code.utils.model.PageData;

import java.util.List;
import java.util.Map;

/**
 * Time：2018-3-15 下午2:10:57
 *
 * @author yangfan
 */
public interface BaseService<T> {
    /**
     * 保存对象
     *
     * @param t
     * @throws Exception
     */
    void save(T t) throws Exception;

    /**
     * 保存对象
     *
     * @param t
     * @throws Exception
     */
    void saveSelective(T t) throws Exception;

    /**
     * 更新对象
     *
     * @param t
     * @throws Exception
     */
    void update(T t) throws Exception;

    /**
     * 更新对象，不为null更新
     *
     * @param t
     * @throws Exception
     */
    void updateSelective(T t) throws Exception;

    /**
     * 删除对象
     *
     * @param id
     * @throws Exception
     */
    void deleteById(String id) throws Exception;

    /**
     * 根据主键查询对象
     *
     * @param id
     * @return
     * @throws Exception
     */
    T getById(String id) throws Exception;

    /**
     * 获取所有数据
     *
     * @param order
     * @return
     * @throws Exception
     */
    List<T> getListAll(String order) throws Exception;

    /**
     * 分页查询
     *
     * @param condition
     * @param pageData
     * @return
     * @throws Exception
     */
    PageInfo<T> getPageInfo(Map<String, Object> condition, PageData pageData) throws Exception;
}
