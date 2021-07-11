package com.course.mall.controller;


import com.course.mall.entity.Goods;
import com.course.mall.service.IGoodsService;
import com.course.mall.service.ISellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wanjingmiao
 * @since 2021-07-10
 */
@RestController
@RequestMapping("/mall/seller")
public class SellerController {
    @Autowired
    private IGoodsService iGoodsService;

    @RequestMapping("/post")
    public ResultPostGoods postGoods(@RequestBody Goods goods) {
        boolean res = iGoodsService.save(goods);

    }
}

