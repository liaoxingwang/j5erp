package com.j5erp.mapper;

import com.j5erp.entity.ClientCategory;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface ClientCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLIENT_CATEGORY
     *
     * @mbggenerated
     */
    @Delete({
        "delete from CLIENT_CATEGORY",
        "where CATEGORYID = #{categoryid,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String categoryid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLIENT_CATEGORY
     *
     * @mbggenerated
     */
    @Insert({
        "insert into CLIENT_CATEGORY (CATEGORYID, CATEGORYNC, ",
        "REMARKS)",
        "values (#{categoryid,jdbcType=VARCHAR}, #{categorync,jdbcType=VARCHAR}, ",
        "#{remarks,jdbcType=VARCHAR})"
    })
    int insert(ClientCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLIENT_CATEGORY
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "CATEGORYID, CATEGORYNC, REMARKS",
        "from CLIENT_CATEGORY",
        "where CATEGORYID = #{categoryid,jdbcType=VARCHAR}"
    })
    @ConstructorArgs({
        @Arg(column="CATEGORYID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="CATEGORYNC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="REMARKS", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    ClientCategory selectByPrimaryKey(String categoryid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLIENT_CATEGORY
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "CATEGORYID, CATEGORYNC, REMARKS",
        "from CLIENT_CATEGORY"
    })
    @ConstructorArgs({
        @Arg(column="CATEGORYID", javaType=String.class, jdbcType=JdbcType.VARCHAR, id=true),
        @Arg(column="CATEGORYNC", javaType=String.class, jdbcType=JdbcType.VARCHAR),
        @Arg(column="REMARKS", javaType=String.class, jdbcType=JdbcType.VARCHAR)
    })
    List<ClientCategory> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CLIENT_CATEGORY
     *
     * @mbggenerated
     */
    @Update({
        "update CLIENT_CATEGORY",
        "set CATEGORYNC = #{categorync,jdbcType=VARCHAR},",
          "REMARKS = #{remarks,jdbcType=VARCHAR}",
        "where CATEGORYID = #{categoryid,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(ClientCategory record);
}