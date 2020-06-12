package com.qingcheng.entity;


import java.io.Serializable;
import java.util.List;

/**
 *
 * 分页结果的封装实体类
 * @author Hongliang Zhu
 * @create 2020-06-11 16:50
 */
public class PageResult<T> implements Serializable { //  泛型类 ： 可以封装任何数据的分页查询结果

    private Long total; // 总记录数

    private List<T> rows; // 数据

    public PageResult(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

}
