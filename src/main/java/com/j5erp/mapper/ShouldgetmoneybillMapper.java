package com.j5erp.mapper;

import com.j5erp.entity.Shouldgetmoneybill;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface ShouldgetmoneybillMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOULDGETMONEYBILL
     *
     * @mbggenerated
     */
    @Delete({
        "delete from SHOULDGETMONEYBILL",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOULDGETMONEYBILL
     *
     * @mbggenerated
     */
    @Insert({
        "insert into SHOULDGETMONEYBILL (ID, DATEANDTIME, ",
        "CUSID, COINTYPE, ",
        "OVERTIME, DISCOUNT, ",
        "PAITIES, TRANSFER, ",
        "DRAFT, OTHERWAY, ",
        "DANDNAME, CANDNAME, ",
        "MANDNAME, REMARK)",
        "values (#{id,jdbcType=VARCHAR}, #{dateandtime,jdbcType=TIMESTAMP}, ",
        "#{cusid,jdbcType=VARCHAR}, #{cointype,jdbcType=VARCHAR}, ",
        "#{overtime,jdbcType=TIMESTAMP}, #{discount,jdbcType=DECIMAL}, ",
        "#{paities,jdbcType=DECIMAL}, #{transfer,jdbcType=DECIMAL}, ",
        "#{draft,jdbcType=DECIMAL}, #{otherway,jdbcType=DECIMAL}, ",
        "#{dandname,jdbcType=VARCHAR}, #{candname,jdbcType=VARCHAR}, ",
        "#{mandname,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(Shouldgetmoneybill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOULDGETMONEYBILL
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, DATEANDTIME, CUSID, COINTYPE, OVERTIME, DISCOUNT, PAITIES, TRANSFER, DRAFT, ",
        "OTHERWAY, DANDNAME, CANDNAME, MANDNAME, REMARK",
        "from SHOULDGETMONEYBILL",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="ID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="DATEANDTIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CUSID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="COINTYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="OVERTIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="DISCOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="PAITIES", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TRANSFER", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="DRAFT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="OTHERWAY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="DANDNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CANDNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MANDNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="REMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Shouldgetmoneybill selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOULDGETMONEYBILL
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, DATEANDTIME, CUSID, COINTYPE, OVERTIME, DISCOUNT, PAITIES, TRANSFER, DRAFT, ",
        "OTHERWAY, DANDNAME, CANDNAME, MANDNAME, REMARK",
        "from SHOULDGETMONEYBILL"
    })
    @ConstructorArgs({
        @Arg(column="ID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="DATEANDTIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CUSID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="COINTYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="OVERTIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="DISCOUNT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="PAITIES", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TRANSFER", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="DRAFT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="OTHERWAY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="DANDNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CANDNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MANDNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="REMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Shouldgetmoneybill> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SHOULDGETMONEYBILL
     *
     * @mbggenerated
     */
    @Update({
        "update SHOULDGETMONEYBILL",
        "set DATEANDTIME = #{dateandtime,jdbcType=TIMESTAMP},",
          "CUSID = #{cusid,jdbcType=VARCHAR},",
          "COINTYPE = #{cointype,jdbcType=VARCHAR},",
          "OVERTIME = #{overtime,jdbcType=TIMESTAMP},",
          "DISCOUNT = #{discount,jdbcType=DECIMAL},",
          "PAITIES = #{paities,jdbcType=DECIMAL},",
          "TRANSFER = #{transfer,jdbcType=DECIMAL},",
          "DRAFT = #{draft,jdbcType=DECIMAL},",
          "OTHERWAY = #{otherway,jdbcType=DECIMAL},",
          "DANDNAME = #{dandname,jdbcType=VARCHAR},",
          "CANDNAME = #{candname,jdbcType=VARCHAR},",
          "MANDNAME = #{mandname,jdbcType=VARCHAR},",
          "REMARK = #{remark,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Shouldgetmoneybill record);
}