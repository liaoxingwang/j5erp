package com.j5erp.mapper;

import com.j5erp.entity.Check1;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface Check1Mapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHECK1
     *
     * @mbggenerated
     */
    @Delete({
        "delete from CHECK1",
        "where PDNUMBERS = #{pdnumbers,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String pdnumbers);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHECK1
     *
     * @mbggenerated
     */
    @Insert({
        "insert into CHECK1 (PDNUMBERS, PDWAREHOUSE, ",
        "PDDATE, PDPERSONNEL, ",
        "PDZDPERSONNEL, PDDEPARTMENT, ",
        "PDRECHECKNUMBER, PDCOLUMN1, ",
        "PDCOLUMN2, PDREMARK, ",
        "PDEXAMINESTATUS)",
        "values (#{pdnumbers,jdbcType=VARCHAR}, #{pdwarehouse,jdbcType=VARCHAR}, ",
        "#{pddate,jdbcType=TIMESTAMP}, #{pdpersonnel,jdbcType=VARCHAR}, ",
        "#{pdzdpersonnel,jdbcType=VARCHAR}, #{pddepartment,jdbcType=VARCHAR}, ",
        "#{pdrechecknumber,jdbcType=VARCHAR}, #{pdcolumn1,jdbcType=VARCHAR}, ",
        "#{pdcolumn2,jdbcType=VARCHAR}, #{pdremark,jdbcType=VARCHAR}, ",
        "#{pdexaminestatus,jdbcType=DECIMAL})"
    })
    int insert(Check1 record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHECK1
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "PDNUMBERS, PDWAREHOUSE, PDDATE, PDPERSONNEL, PDZDPERSONNEL, PDDEPARTMENT, PDRECHECKNUMBER, ",
        "PDCOLUMN1, PDCOLUMN2, PDREMARK, PDEXAMINESTATUS",
        "from CHECK1",
        "where PDNUMBERS = #{pdnumbers,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="PDNUMBERS", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="PDWAREHOUSE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDDATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PDPERSONNEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDZDPERSONNEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDDEPARTMENT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDRECHECKNUMBER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDCOLUMN1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDCOLUMN2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDREMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDEXAMINESTATUS", javaType=Short.class, jdbcType=JdbcType.DECIMAL)
    })
    Check1 selectByPrimaryKey(String pdnumbers);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHECK1
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "PDNUMBERS, PDWAREHOUSE, PDDATE, PDPERSONNEL, PDZDPERSONNEL, PDDEPARTMENT, PDRECHECKNUMBER, ",
        "PDCOLUMN1, PDCOLUMN2, PDREMARK, PDEXAMINESTATUS",
        "from CHECK1"
    })
    @ConstructorArgs({
        @Arg(column="PDNUMBERS", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="PDWAREHOUSE", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDDATE", javaType=Date.class, jdbcType=JdbcType.TIMESTAMP),
        @Arg(column="PDPERSONNEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDZDPERSONNEL", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDDEPARTMENT", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDRECHECKNUMBER", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDCOLUMN1", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDCOLUMN2", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDREMARK", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="PDEXAMINESTATUS", javaType=Short.class, jdbcType=JdbcType.DECIMAL)
    })
    List<Check1> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CHECK1
     *
     * @mbggenerated
     */
    @Update({
        "update CHECK1",
        "set PDWAREHOUSE = #{pdwarehouse,jdbcType=VARCHAR},",
          "PDDATE = #{pddate,jdbcType=TIMESTAMP},",
          "PDPERSONNEL = #{pdpersonnel,jdbcType=VARCHAR},",
          "PDZDPERSONNEL = #{pdzdpersonnel,jdbcType=VARCHAR},",
          "PDDEPARTMENT = #{pddepartment,jdbcType=VARCHAR},",
          "PDRECHECKNUMBER = #{pdrechecknumber,jdbcType=VARCHAR},",
          "PDCOLUMN1 = #{pdcolumn1,jdbcType=VARCHAR},",
          "PDCOLUMN2 = #{pdcolumn2,jdbcType=VARCHAR},",
          "PDREMARK = #{pdremark,jdbcType=VARCHAR},",
          "PDEXAMINESTATUS = #{pdexaminestatus,jdbcType=DECIMAL}",
        "where PDNUMBERS = #{pdnumbers,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Check1 record);
}