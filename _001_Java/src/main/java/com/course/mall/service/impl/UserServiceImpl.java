package com.course.mall.service.impl;

import com.course.mall.entity.User;
import com.course.mall.mapper.UserMapper;
import com.course.mall.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
