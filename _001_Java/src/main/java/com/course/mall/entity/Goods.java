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
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private BigDecimal price;

    private Long saleCount;

    private String image;

    private String seller;

    /**
     * 审核状态：0-待审核，1-审核通过，2-审核不通过
     */
    private Boolean auditState;

    /**
     * 是否上架：0-下架，1-上架
     */
    private Boolean available;


}
