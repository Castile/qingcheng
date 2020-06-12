package com.qingcheng.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qingcheng.entity.PageResult;
import com.qingcheng.pojo.goods.Brand;
import com.qingcheng.service.goods.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Web 层调用服务层  品牌管理的控制类
 * @author Hongliang Zhu
 * @create 2020-06-11 15:48
 */
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Reference  // @Reference注入的是分布式中的远程服务对象，@Resource和@Autowired注入的是本地spring容器中的对象。
    private BrandService brandService;

    @RequestMapping("/findAll")
    public List<Brand> findAll(){
        return brandService.findAll();
    }

    @GetMapping("/findPage")
    public PageResult<Brand> findPage(int page, int size){
        return brandService.findPage(page, size);
    }

}
