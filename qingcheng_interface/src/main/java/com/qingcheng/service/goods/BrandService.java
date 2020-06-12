package com.qingcheng.service.goods;

import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.goods.Brand;

import java.util.List;

/**
 * 对商标的服务接口
 * @author Hongliang Zhu
 * @create 2020-06-11 15:42
 */
public interface BrandService{

    /**
     * 查询所有商标
     * @return
     */
    public List<Brand> findAll();


    /**
     * 查询分页的结果
     * @param page 第几页
     * @param size 每页的记录数
     * @return
     */
    public PageResult<Brand> findPage(int page, int size);

}
