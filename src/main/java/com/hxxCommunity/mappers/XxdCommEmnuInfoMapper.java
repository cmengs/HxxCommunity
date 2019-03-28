package com.hxxCommunity.mappers;

import com.hxxCommunity.models.XxdCommEmnuInfo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdCommEmnuInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_emnu_info
     *
     * @mbggenerated
     */
    @Delete({
        "delete from comm_emnu_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_emnu_info
     *
     * @mbggenerated
     */
    @Insert({
        "insert into comm_emnu_info (id, emnu_id, ",
        "emnu_value, emnu_state)",
        "values (#{id,jdbcType=INTEGER}, #{emnuId,jdbcType=VARCHAR}, ",
        "#{emnuValue,jdbcType=VARCHAR}, #{emnuState,jdbcType=CHAR})"
    })
    int insert(XxdCommEmnuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_emnu_info
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdCommEmnuInfoSqlProvider.class, method="insertSelective")
    int insertSelective(XxdCommEmnuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_emnu_info
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, emnu_id, emnu_value, emnu_state",
        "from comm_emnu_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="emnu_id", property="emnuId", jdbcType=JdbcType.VARCHAR),
        @Result(column="emnu_value", property="emnuValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="emnu_state", property="emnuState", jdbcType=JdbcType.CHAR)
    })
    XxdCommEmnuInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_emnu_info
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdCommEmnuInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdCommEmnuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_emnu_info
     *
     * @mbggenerated
     */
    @Update({
        "update comm_emnu_info",
        "set emnu_id = #{emnuId,jdbcType=VARCHAR},",
          "emnu_value = #{emnuValue,jdbcType=VARCHAR},",
          "emnu_state = #{emnuState,jdbcType=CHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdCommEmnuInfo record);
}