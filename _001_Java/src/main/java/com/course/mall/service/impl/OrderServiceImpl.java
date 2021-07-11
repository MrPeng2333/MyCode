package com.course.mall.service.impl;

import com.course.mall.entity.Order;
import com.course.mall.mapper.OrderMapper;
import com.course.mall.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wanjingmiao
 * @since 2021-07-10
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
