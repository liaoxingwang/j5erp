package com.j5erp.service;

import com.j5erp.entity.Saleorder;

/**
 * 销售订单 serviceInterface
 * author wjw
 */
public interface SaleOrderService {
    public Saleorder querySaleOrderByPage(Integer pageNow);
}
