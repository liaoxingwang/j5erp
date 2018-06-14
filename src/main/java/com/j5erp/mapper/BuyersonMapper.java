package com.j5erp.mapper;

import com.j5erp.entity.Buyerson;
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

public interface BuyersonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BUYERSON
     *
     * @mbggenerated
     */
    @Delete({
        "delete from BUYERSON",
        "where ID = #{id,jdbcType=VARCHAR}",
          "and LINE = #{line,jdbcType=DECIMAL}",
          "and FID = #{fid,jdbcType=VARCHAR}",
          "and WID = #{wid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(@Param("id") String id, @Param("line") Integer line, @Param("fid") String fid, @Param("wid") String wid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BUYERSON
     *
     * @mbggenerated
     */
    @Insert({
        "insert into BUYERSON (ID, LINE, ",
        "FID, WID, FROMID, ",
        "FROMTYPE, PRICE, ",
        "NUM, TIME, NOTNUM, ",
        "MONEY, TARIFF, TARIFFMONEY, ",
        "MONEYTARIFF, GIFT, ",
        "REMARK, COLUMNSTATE, ",
        "COLUMN1, COLUMN2, ",
        "COLUMN3)",
        "values (#{id,jdbcType=VARCHAR}, #{line,jdbcType=DECIMAL}, ",
        "#{fid,jdbcType=VARCHAR}, #{wid,jdbcType=VARCHAR}, #{fromid,jdbcType=VARCHAR}, ",
        "#{fromtype,jdbcType=VARCHAR}, #{price,jdbcType=DECIMAL}, ",
        "#{num,jdbcType=DECIMAL}, #{time,jdbcType=TIMESTAMP}, #{notnum,jdbcType=DECIMAL}, ",
        "#{money,jdbcType=DECIMAL}, #{tariff,jdbcType=DECIMAL}, #{tariffmoney,jdbcType=DECIMAL}, ",
        "#{moneytariff,jdbcType=DECIMAL}, #{gift,jdbcType=DECIMAL}, ",
        "#{remark,jdbcType=VARCHAR}, #{columnstate,jdbcType=DECIMAL}, ",
        "#{column1,jdbcType=VARCHAR}, #{column2,jdbcType=VARCHAR}, ",
        "#{column3,jdbcType=VARCHAR})"
    })
    int insert(Buyerson record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BUYERSON
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, LINE, FID, WID, FROMID, FROMTYPE, PRICE, NUM, TIME, NOTNUM, MONEY, TARIFF, ",
        "TARIFFMONEY, MONEYTARIFF, GIFT, REMARK, COLUMNSTATE, COLUMN1, COLUMN2, COLUMN3",
        "from BUYERSON",
        "where ID = #{id,jdbcType=VARCHAR}",
          "and LINE = #{line,jdbcType=DECIMAL}",
          "and FID = #{fid,jdbcType=VARCHAR}",
          "and WID = #{wid,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="ID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="LINE", javaType=Integer.class, jdbcType=JdbcType.DECIMAL, id=true),
        @Arg(column="FID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="WID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="FROMID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="FROMTYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PRICE", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="NUM", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="NOTNUM", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="MONEY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TARIFF", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TARIFFMONEY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="MONEYTARIFF", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="GIFT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="REMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="COLUMNSTATE", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="COLUMN1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="COLUMN2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="COLUMN3", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Buyerson selectByPrimaryKey(@Param("id") String id, @Param("line") Integer line, @Param("fid") String fid, @Param("wid") String wid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BUYERSON
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, LINE, FID, WID, FROMID, FROMTYPE, PRICE, NUM, TIME, NOTNUM, MONEY, TARIFF, ",
        "TARIFFMONEY, MONEYTARIFF, GIFT, REMARK, COLUMNSTATE, COLUMN1, COLUMN2, COLUMN3",
        "from BUYERSON"
    })
    @ConstructorArgs({
        @Arg(column="ID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="LINE", javaType=Integer.class, jdbcType=JdbcType.DECIMAL, id=true),
        @Arg(column="FID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="WID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="FROMID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="FROMTYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PRICE", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="NUM", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="NOTNUM", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="MONEY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TARIFF", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TARIFFMONEY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="MONEYTARIFF", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="GIFT", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="REMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="COLUMNSTATE", javaType=Integer.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="COLUMN1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="COLUMN2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="COLUMN3", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Buyerson> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BUYERSON
     *
     * @mbggenerated
     */
    @Update({
        "update BUYERSON",
        "set FROMID = #{fromid,jdbcType=VARCHAR},",
          "FROMTYPE = #{fromtype,jdbcType=VARCHAR},",
          "PRICE = #{price,jdbcType=DECIMAL},",
          "NUM = #{num,jdbcType=DECIMAL},",
          "TIME = #{time,jdbcType=TIMESTAMP},",
          "NOTNUM = #{notnum,jdbcType=DECIMAL},",
          "MONEY = #{money,jdbcType=DECIMAL},",
          "TARIFF = #{tariff,jdbcType=DECIMAL},",
          "TARIFFMONEY = #{tariffmoney,jdbcType=DECIMAL},",
          "MONEYTARIFF = #{moneytariff,jdbcType=DECIMAL},",
          "GIFT = #{gift,jdbcType=DECIMAL},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "COLUMNSTATE = #{columnstate,jdbcType=DECIMAL},",
          "COLUMN1 = #{column1,jdbcType=VARCHAR},",
          "COLUMN2 = #{column2,jdbcType=VARCHAR},",
          "COLUMN3 = #{column3,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}",
          "and LINE = #{line,jdbcType=DECIMAL}",
          "and FID = #{fid,jdbcType=VARCHAR}",
          "and WID = #{wid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Buyerson record);
}