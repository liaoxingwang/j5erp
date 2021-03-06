package com.j5erp.mapper;

import com.j5erp.entity.Customerwithmoneydetail;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface CustomerwithmoneydetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMERWITHMONEYDETAIL
     *
     * @mbggenerated
     */
    @Delete({
        "delete from CUSTOMERWITHMONEYDETAIL",
        "where BILLNO = #{billno,jdbcType=VARCHAR}",
          "and BILLTYPEID = #{billtypeid,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(@Param("billno") String billno, @Param("billtypeid") Short billtypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMERWITHMONEYDETAIL
     *
     * @mbggenerated
     */
    @Insert({
        "insert into CUSTOMERWITHMONEYDETAIL (BILLNO, BILLTYPEID, ",
        "DATEANDTIME, CUSID, ",
        "SOURCEMONEY, LEFTGETMONEY)",
        "values (#{billno,jdbcType=VARCHAR}, #{billtypeid,jdbcType=DECIMAL}, ",
        "#{dateandtime,jdbcType=TIMESTAMP}, #{cusid,jdbcType=VARCHAR}, ",
        "#{sourcemoney,jdbcType=DECIMAL}, #{leftgetmoney,jdbcType=DECIMAL})"
    })
    int insert(Customerwithmoneydetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMERWITHMONEYDETAIL
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "BILLNO, BILLTYPEID, DATEANDTIME, CUSID, SOURCEMONEY, LEFTGETMONEY",
        "from CUSTOMERWITHMONEYDETAIL",
        "where BILLNO = #{billno,jdbcType=VARCHAR}",
          "and BILLTYPEID = #{billtypeid,jdbcType=DECIMAL}"
    })
    @ConstructorArgs({
        @Arg(column="BILLNO", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="BILLTYPEID", javaType=Short.class, jdbcType=JdbcType.DECIMAL, id=true),
        @Arg(column="DATEANDTIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CUSID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SOURCEMONEY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="LEFTGETMONEY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL)
    })
    Customerwithmoneydetail selectByPrimaryKey(@Param("billno") String billno, @Param("billtypeid") Short billtypeid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMERWITHMONEYDETAIL
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "BILLNO, BILLTYPEID, DATEANDTIME, CUSID, SOURCEMONEY, LEFTGETMONEY",
        "from CUSTOMERWITHMONEYDETAIL"
    })
    @ConstructorArgs({
        @Arg(column="BILLNO", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="BILLTYPEID", javaType=Short.class, jdbcType=JdbcType.DECIMAL, id=true),
        @Arg(column="DATEANDTIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CUSID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="SOURCEMONEY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="LEFTGETMONEY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL)
    })
    List<Customerwithmoneydetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CUSTOMERWITHMONEYDETAIL
     *
     * @mbggenerated
     */
    @Update({
        "update CUSTOMERWITHMONEYDETAIL",
        "set DATEANDTIME = #{dateandtime,jdbcType=TIMESTAMP},",
          "CUSID = #{cusid,jdbcType=VARCHAR},",
          "SOURCEMONEY = #{sourcemoney,jdbcType=DECIMAL},",
          "LEFTGETMONEY = #{leftgetmoney,jdbcType=DECIMAL}",
        "where BILLNO = #{billno,jdbcType=VARCHAR}",
          "and BILLTYPEID = #{billtypeid,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(Customerwithmoneydetail record);
}