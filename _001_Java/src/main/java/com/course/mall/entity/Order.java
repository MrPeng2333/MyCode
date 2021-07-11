package com.course.mall.entity;

import java.math.BigDecimal;
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
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long goodsId;

    private Integer buyCount;

    private BigDecimal payment;

    /**
     * 支付状态：0-未支付，1-已支付
     */
    private Boolean payState;

    /**
     * 订单状态：0-取消，1-正常
     */
    private Boolean orderState;

    private String user;

    private String seller;


}
