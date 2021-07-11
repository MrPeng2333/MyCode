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
public class Seller implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;

    private String password;

    private String salt;

    private String shopName;

    private String shopAddress;

    private String account;

    private String phone;

    /**
     * 账号状态：0-冻结，1-正常
     */
    private Boolean state;


}
