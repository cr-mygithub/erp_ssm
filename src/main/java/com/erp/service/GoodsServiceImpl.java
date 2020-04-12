package com.erp.service;

import com.erp.mapper.GoodsMapper;
import com.erp.pojo.Goods;
import com.erp.pojo.GoodsExample;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> selectByExample(Goods goods,int pageNum,int pageSize) {
        //查询之前设置分页，自动进行查询
        PageHelper.startPage(pageNum,pageSize);
        GoodsExample goodsExample=new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        if(goods.getName()!=null){
            criteria.andNameLike("%"+goods.getName()+"%");
        }
        return  goodsMapper.selectByExample(goodsExample);
    }
}
