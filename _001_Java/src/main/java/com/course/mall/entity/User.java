package com.course.mall.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author wanjingmiao
 * @since 2021-07-10
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private String nickName;

    private String phone;

    /**
     * 账号状态：0-冻结，1-正常
     */
    private Boolean state;

    /**
     * 管理员标识：0-普通用户，1-管理员
     */
    private Boolean role;

    private String salt;


}
