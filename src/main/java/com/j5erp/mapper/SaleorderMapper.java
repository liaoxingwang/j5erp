package com.j5erp.mapper;

import com.j5erp.entity.Saleorder;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface SaleorderMapper {
/*
   @Select("select * from saleorder as s,saleorderdetail as sd where s.id = sd.soid and s.id in (select * from saleorder limit 0,#{pageNow})")
*/
    @Select("select * from userfive.saleorder")
    Saleorder queryOneByPage(Integer pageNow);
}