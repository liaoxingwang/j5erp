package com.j5erp.mapper;

import com.j5erp.entity.RecordOfFormalSchooling;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface RecordOfFormalSchoolingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECORD_OF_FORMAL_SCHOOLING
     *
     * @mbggenerated
     */
    @Delete({
        "delete from RECORD_OF_FORMAL_SCHOOLING",
        "where ROFSID = #{rofsid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String rofsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECORD_OF_FORMAL_SCHOOLING
     *
     * @mbggenerated
     */
    @Insert({
        "insert into RECORD_OF_FORMAL_SCHOOLING (ROFSID, ROFSCN_NAME)",
        "values (#{rofsid,jdbcType=VARCHAR}, #{rofscnName,jdbcType=VARCHAR})"
    })
    int insert(RecordOfFormalSchooling record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECORD_OF_FORMAL_SCHOOLING
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ROFSID, ROFSCN_NAME",
        "from RECORD_OF_FORMAL_SCHOOLING",
        "where ROFSID = #{rofsid,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="ROFSID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="ROFSCN_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    RecordOfFormalSchooling selectByPrimaryKey(String rofsid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECORD_OF_FORMAL_SCHOOLING
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ROFSID, ROFSCN_NAME",
        "from RECORD_OF_FORMAL_SCHOOLING"
    })
    @ConstructorArgs({
        @Arg(column="ROFSID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="ROFSCN_NAME", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<RecordOfFormalSchooling> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table RECORD_OF_FORMAL_SCHOOLING
     *
     * @mbggenerated
     */
    @Update({
        "update RECORD_OF_FORMAL_SCHOOLING",
        "set ROFSCN_NAME = #{rofscnName,jdbcType=VARCHAR}",
        "where ROFSID = #{rofsid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(RecordOfFormalSchooling record);
}