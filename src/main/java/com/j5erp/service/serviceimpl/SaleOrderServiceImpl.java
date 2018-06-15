package com.j5erp.service.serviceimpl;

import com.j5erp.entity.Saleorder;
import com.j5erp.mapper.SaleorderMapper;
import com.j5erp.service.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SaleOrderService")
public class SaleOrderServiceImpl implements SaleOrderService {

    @Autowired
    SaleorderMapper mapper;

    @Override
    public Saleorder querySaleOrderByPage(Integer pageNow) {
        return mapper.queryOneByPage(pageNow);
    }
}
