package com.j5erp.controller;

import com.j5erp.entity.Saleorder;
import com.j5erp.service.SaleOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SaleOrderController {

    @Autowired
    SaleOrderService service;

    @RequestMapping("/querySaleOrderByPage")
    @ResponseBody
    public Saleorder querySaleOrderByPage(Integer pageNow){

        Saleorder saleorder = service.querySaleOrderByPage(pageNow);
        System.out.print(saleorder.getDlist().size());
        return service.querySaleOrderByPage(pageNow);
    }
}
