package com.j5erp.mapper;

import com.j5erp.entity.Estimatemoneybill;
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

public interface EstimatemoneybillMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ESTIMATEMONEYBILL
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ESTIMATEMONEYBILL",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ESTIMATEMONEYBILL
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ESTIMATEMONEYBILL (ID, DATEANDTIME, ",
        "CUSID, COINTYPE, ",
        "OVERTIME, PAITIES, ",
        "TRANSFER, DRAFT, ",
        "OTHERWAY, REMARK, ",
        "DANDNAME, CANDNAME, ",
        "MANDNAME)",
        "values (#{id,jdbcType=VARCHAR}, #{dateandtime,jdbcType=TIMESTAMP}, ",
        "#{cusid,jdbcType=VARCHAR}, #{cointype,jdbcType=VARCHAR}, ",
        "#{overtime,jdbcType=TIMESTAMP}, #{paities,jdbcType=DECIMAL}, ",
        "#{transfer,jdbcType=DECIMAL}, #{draft,jdbcType=DECIMAL}, ",
        "#{otherway,jdbcType=DECIMAL}, #{remark,jdbcType=VARCHAR}, ",
        "#{dandname,jdbcType=VARCHAR}, #{candname,jdbcType=VARCHAR}, ",
        "#{mandname,jdbcType=VARCHAR})"
    })
    int insert(Estimatemoneybill record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ESTIMATEMONEYBILL
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, DATEANDTIME, CUSID, COINTYPE, OVERTIME, PAITIES, TRANSFER, DRAFT, OTHERWAY, ",
        "REMARK, DANDNAME, CANDNAME, MANDNAME",
        "from ESTIMATEMONEYBILL",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="ID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="DATEANDTIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CUSID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="COINTYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="OVERTIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PAITIES", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TRANSFER", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="DRAFT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="OTHERWAY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="REMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="DANDNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CANDNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MANDNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    Estimatemoneybill selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ESTIMATEMONEYBILL
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, DATEANDTIME, CUSID, COINTYPE, OVERTIME, PAITIES, TRANSFER, DRAFT, OTHERWAY, ",
        "REMARK, DANDNAME, CANDNAME, MANDNAME",
        "from ESTIMATEMONEYBILL"
    })
    @ConstructorArgs({
        @Arg(column="ID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="DATEANDTIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="CUSID", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="COINTYPE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="OVERTIME", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PAITIES", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="TRANSFER", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="DRAFT", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="OTHERWAY", javaType=BigDecimal.class, jdbcType=JdbcType.DECIMAL),
        @Arg(column="REMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="DANDNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="CANDNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="MANDNAME", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<Estimatemoneybill> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ESTIMATEMONEYBILL
     *
     * @mbggenerated
     */
    @Update({
        "update ESTIMATEMONEYBILL",
        "set DATEANDTIME = #{dateandtime,jdbcType=TIMESTAMP},",
          "CUSID = #{cusid,jdbcType=VARCHAR},",
          "COINTYPE = #{cointype,jdbcType=VARCHAR},",
          "OVERTIME = #{overtime,jdbcType=TIMESTAMP},",
          "PAITIES = #{paities,jdbcType=DECIMAL},",
          "TRANSFER = #{transfer,jdbcType=DECIMAL},",
          "DRAFT = #{draft,jdbcType=DECIMAL},",
          "OTHERWAY = #{otherway,jdbcType=DECIMAL},",
          "REMARK = #{remark,jdbcType=VARCHAR},",
          "DANDNAME = #{dandname,jdbcType=VARCHAR},",
          "CANDNAME = #{candname,jdbcType=VARCHAR},",
          "MANDNAME = #{mandname,jdbcType=VARCHAR}",
        "where ID = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Estimatemoneybill record);
}