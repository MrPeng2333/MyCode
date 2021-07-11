package com.course.mall.controller;


import com.course.mall.entity.Goods;
import com.course.mall.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wanjingmiao
 * @since 2021-07-10
 */
@RestController
@RequestMapping("/mall/goods")
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;

    @GetMapping("/list")
    public List<Goods> getGoods() {
        return goodsService.list();
    }

}

