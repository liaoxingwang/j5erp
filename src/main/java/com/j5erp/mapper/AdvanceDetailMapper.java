package com.j5erp.mapper;

import com.j5erp.entity.AdvanceDetail;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface AdvanceDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADVANCE_DETAIL
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ADVANCE_DETAIL",
        "where ADID = #{adid,jdbcType=VARCHAR}",
          "and ADLINE = #{adline,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(@Param("adid") String adid, @Param("adline") Long adline);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADVANCE_DETAIL
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ADVANCE_DETAIL (ADID, ADLINE, ",
        "ADMONEY, ADSINGLE, ",
        "ADSOURCE, ADSUMMARY, ",
        "TESTA, TESTB)",
        "values (#{adid,jdbcType=VARCHAR}, #{adline,jdbcType=DECIMAL}, ",
        "#{admoney,jdbcType=DECIMAL}, #{adsingle,jdbcType=VARCHAR}, ",
        "#{adsource,jdbcType=DECIMAL}, #{adsummary,jdbcType=VARCHAR}, ",
        "#{testa,jdbcType=VARCHAR}, #{testb,jdbcType=VARCHAR})"
    })
    int insert(AdvanceDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADVANCE_DETAIL
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ADID, ADLINE, ADMONEY, ADSINGLE, ADSOURCE, ADSUMMARY, TESTA, TESTB",
        "from ADVANCE_DETAIL",
        "where ADID = #{adid,jdbcType=VARCHAR}",
          "and ADLINE = #{adline,jdbcType=DECIMAL}"
    })
    @ConstructorArgs({
        @Arg(column="ADID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="ADLINE", javaType=Long.class, jdbcType=JdbcType.DECIMAL, id=true),
        @Arg(column="ADMONEY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ADSINGLE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ADSOURCE", javaType=Long.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ADSUMMARY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TESTA", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TESTB", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    AdvanceDetail selectByPrimaryKey(@Param("adid") String adid, @Param("adline") Long adline);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADVANCE_DETAIL
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ADID, ADLINE, ADMONEY, ADSINGLE, ADSOURCE, ADSUMMARY, TESTA, TESTB",
        "from ADVANCE_DETAIL"
    })
    @ConstructorArgs({
        @Arg(column="ADID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="ADLINE", javaType=Long.class, jdbcType=JdbcType.DECIMAL, id=true),
        @Arg(column="ADMONEY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ADSINGLE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="ADSOURCE", javaType=Long.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="ADSUMMARY", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TESTA", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="TESTB", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<AdvanceDetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ADVANCE_DETAIL
     *
     * @mbggenerated
     */
    @Update({
        "update ADVANCE_DETAIL",
        "set ADMONEY = #{admoney,jdbcType=DECIMAL},",
          "ADSINGLE = #{adsingle,jdbcType=VARCHAR},",
          "ADSOURCE = #{adsource,jdbcType=DECIMAL},",
          "ADSUMMARY = #{adsummary,jdbcType=VARCHAR},",
          "TESTA = #{testa,jdbcType=VARCHAR},",
          "TESTB = #{testb,jdbcType=VARCHAR}",
        "where ADID = #{adid,jdbcType=VARCHAR}",
          "and ADLINE = #{adline,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(AdvanceDetail record);
}