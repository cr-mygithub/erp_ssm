package com.testDept;

import com.erp.mapper.GoodsMapper;
import com.erp.pojo.Goods;
import com.erp.pojo.GoodsExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class testMapper {
    @Autowired
    private GoodsMapper goodsMapper;
    @Test
    public void test01() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring/applicationContext-dao.xml");
        GoodsMapper goodsMapper = ctx.getBean("goodsMapper", GoodsMapper.class);
        GoodsExample goodsExample =new GoodsExample();
        GoodsExample.Criteria criteria = goodsExample.createCriteria();
        criteria.andNameLike("%衣%");
        List<Goods> goods=goodsMapper.selectByExample(goodsExample);
        System.out.println(goods);

    }

    }
