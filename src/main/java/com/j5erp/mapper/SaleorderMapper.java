package com.j5erp.mapper;

import com.j5erp.entity.Saleorder;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.j5erp.entity.Saleorderdetail;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SaleorderMapper {

    public Saleorder queryOneByPage(@Param("pageNow") Integer pageNow);

    public  List<Saleorderdetail> querySDById(@Param("id") Integer id);
}