package com.j5erp.mapper;

import com.j5erp.entity.UnitOfMeasure;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface UnitOfMeasureMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIT_OF_MEASURE
     *
     * @mbggenerated
     */
    @Delete({
        "delete from UNIT_OF_MEASURE",
        "where UNITID = #{unitid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String unitid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIT_OF_MEASURE
     *
     * @mbggenerated
     */
    @Insert({
        "insert into UNIT_OF_MEASURE (UNITID, UNITCN_NAME, ",
        "REMARK)",
        "values (#{unitid,jdbcType=VARCHAR}, #{unitcnName,jdbcType=VARCHAR}, ",
        "#{remark,jdbcType=VARCHAR})"
    })
    int insert(UnitOfMeasure record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIT_OF_MEASURE
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "UNITID, UNITCN_NAME, REMARK",
        "from UNIT_OF_MEASURE",
        "where UNITID = #{unitid,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="UNITID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="UNITCN_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="REMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    UnitOfMeasure selectByPrimaryKey(String unitid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIT_OF_MEASURE
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "UNITID, UNITCN_NAME, REMARK",
        "from UNIT_OF_MEASURE"
    })
    @ConstructorArgs({
        @Arg(column="UNITID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="UNITCN_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="REMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<UnitOfMeasure> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNIT_OF_MEASURE
     *
     * @mbggenerated
     */
    @Update({
        "update UNIT_OF_MEASURE",
        "set UNITCN_NAME = #{unitcnName,jdbcType=VARCHAR},",
          "REMARK = #{remark,jdbcType=VARCHAR}",
        "where UNITID = #{unitid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(UnitOfMeasure record);
}