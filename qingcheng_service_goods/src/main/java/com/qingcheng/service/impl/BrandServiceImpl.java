package com.qingcheng.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qingcheng.dao.BrandMapper;
import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.goods.Brand;
import com.qingcheng.service.goods.BrandService;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.SimpleTimeZone;

/**
 * 品牌服务的具体实现类
 * @author Hongliang Zhu
 * @create 2020-06-11 15:44
 */
@Service  // dubbo 类里面的Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper; //  需要调用品牌的数据访问层


    @Override
    public List<Brand> findAll() {
        return brandMapper.selectAll();  // 查询全部
    }

    @Override
    public PageResult<Brand> findPage(int page, int size) {
        PageHelper.startPage(page, size);
        Page<Brand> pageResult = (Page<Brand>) brandMapper.selectAll();
        return new PageResult<>(pageResult.getTotal(), pageResult.getResult());
    }
}
