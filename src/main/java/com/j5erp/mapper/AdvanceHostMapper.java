package com.j5erp.mapper;

import com.j5erp.entity.AdvanceHost;
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

public interface AdvanceHostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADVANCE_HOST
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ADVANCE_HOST",
        "where AHID = #{ahid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String ahid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADVANCE_HOST
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ADVANCE_HOST (AHID, AHDATE, ",
        "SUPPLIERSID, CURRENCYID, ",
        "AHCLEARINGONE, AHCLEARINGTOW, ",
        "AHCLEARINGTHREE, AHEXCHANGERATE, ",
        "AHDISCOUNTRATE, AHDEPT, ",
        "AHMAKINGNAME, AHVERIFIER, ",
        "AHREVIEWSTATE, AHREVIEWDATE, ",
        "AHREMARK, TESTA, ",
        "TESTB)",
        "values (#{ahid,jdbcType=VARCHAR}, #{ahdate,jdbcType=TIMESTAMP}, ",
        "#{suppliersid,jdbcType=VARCHAR}, #{currencyid,jdbcType=VARCHAR}, ",
        "#{ahclearingone,jdbcType=DECIMAL}, #{ahclearingtow,jdbcType=DECIMAL}, ",
        "#{ahclearingthree,jdbcType=DECIMAL}, #{ahexchangerate,jdbcType=DECIMAL}, ",
        "#{ahdiscountrate,jdbcType=DECIMAL}, #{ahdept,jdbcType=VARCHAR}, ",
        "#{ahmakingname,jdbcType=VARCHAR}, #{ahverifier,jdbcType=VARCHAR}, ",
        "#{ahreviewstate,jdbcType=CHAR}, #{ahreviewdate,jdbcType=TIMESTAMP}, ",
        "#{ahremark,jdbcType=VARCHAR}, #{testa,jdbcType=VARCHAR}, ",
        "#{testb,jdbcType=VARCHAR})"
    })
    int insert(AdvanceHost record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADVANCE_HOST
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "AHID, AHDATE, SUPPLIERSID, CURRENCYID, AHCLEARINGONE, AHCLEARINGTOW, AHCLEARINGTHREE, ",
        "AHEXCHANGERATE, AHDISCOUNTRATE, AHDEPT, AHMAKINGNAME, AHVERIFIER, AHREVIEWSTATE, ",
        "AHREVIEWDATE, AHREMARK, TESTA, TESTB",
        "from ADVANCE_HOST",
        "where AHID = #{ahid,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="AHID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="AHDATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="SUPPLIERSID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CURRENCYID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="AHCLEARINGONE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="AHCLEARINGTOW", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="AHCLEARINGTHREE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="AHEXCHANGERATE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="AHDISCOUNTRATE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="AHDEPT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="AHMAKINGNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="AHVERIFIER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="AHREVIEWSTATE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="AHREVIEWDATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="AHREMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TESTA", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TESTB", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    AdvanceHost selectByPrimaryKey(String ahid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADVANCE_HOST
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "AHID, AHDATE, SUPPLIERSID, CURRENCYID, AHCLEARINGONE, AHCLEARINGTOW, AHCLEARINGTHREE, ",
        "AHEXCHANGERATE, AHDISCOUNTRATE, AHDEPT, AHMAKINGNAME, AHVERIFIER, AHREVIEWSTATE, ",
        "AHREVIEWDATE, AHREMARK, TESTA, TESTB",
        "from ADVANCE_HOST"
    })
    @ConstructorArgs({
        @Arg(column="AHID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="AHDATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="SUPPLIERSID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CURRENCYID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="AHCLEARINGONE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="AHCLEARINGTOW", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="AHCLEARINGTHREE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="AHEXCHANGERATE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="AHDISCOUNTRATE", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="AHDEPT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="AHMAKINGNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="AHVERIFIER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="AHREVIEWSTATE", javaType=String.class, jdbcType=JdbcType.CHAR),
        @Arg(column="AHREVIEWDATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="AHREMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TESTA", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TESTB", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<AdvanceHost> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADVANCE_HOST
     *
     * @mbggenerated
     */
    @Update({
        "update ADVANCE_HOST",
        "set AHDATE = #{ahdate,jdbcType=TIMESTAMP},",
          "SUPPLIERSID = #{suppliersid,jdbcType=VARCHAR},",
          "CURRENCYID = #{currencyid,jdbcType=VARCHAR},",
          "AHCLEARINGONE = #{ahclearingone,jdbcType=DECIMAL},",
          "AHCLEARINGTOW = #{ahclearingtow,jdbcType=DECIMAL},",
          "AHCLEARINGTHREE = #{ahclearingthree,jdbcType=DECIMAL},",
          "AHEXCHANGERATE = #{ahexchangerate,jdbcType=DECIMAL},",
          "AHDISCOUNTRATE = #{ahdiscountrate,jdbcType=DECIMAL},",
          "AHDEPT = #{ahdept,jdbcType=VARCHAR},",
          "AHMAKINGNAME = #{ahmakingname,jdbcType=VARCHAR},",
          "AHVERIFIER = #{ahverifier,jdbcType=VARCHAR},",
          "AHREVIEWSTATE = #{ahreviewstate,jdbcType=CHAR},",
          "AHREVIEWDATE = #{ahreviewdate,jdbcType=TIMESTAMP},",
          "AHREMARK = #{ahremark,jdbcType=VARCHAR},",
          "TESTA = #{testa,jdbcType=VARCHAR},",
          "TESTB = #{testb,jdbcType=VARCHAR}",
        "where AHID = #{ahid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(AdvanceHost record);
}