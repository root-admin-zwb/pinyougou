package com.pinyougou.sellergoods.service;

import com.pinyougou.entity.PageResult;
import com.pinyougou.pojo.TbBrand;

import java.util.List;
import java.util.Map;

public interface BrandService {
    //查询列表
    List<TbBrand> findAll();

    //分页
    PageResult findPage(int pageNum, int pageSize);

    //增加
    public void add(TbBrand brand);

    //修改
    public void update(TbBrand brand);

    //回显
    public TbBrand findOne(Long id);

    //批量删除
    public void delete(Long[] ids);

    //模糊
    public PageResult findPage(TbBrand brand, int pageNum,int pageSize);

    //返回下拉列表数据
    public List<Map> selectOptionList();
}
