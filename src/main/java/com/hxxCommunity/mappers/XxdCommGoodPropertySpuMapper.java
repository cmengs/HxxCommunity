package com.hxxCommunity.mappers;

import com.hxxCommunity.models.XxdCommGoodPropertySpu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdCommGoodPropertySpuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_good_property_spu
     *
     * @mbggenerated
     */
    @Delete({
        "delete from comm_good_property_spu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_good_property_spu
     *
     * @mbggenerated
     */
    @Insert({
        "insert into comm_good_property_spu (id, good_id, ",
        "spu_id)",
        "values (#{id,jdbcType=INTEGER}, #{goodId,jdbcType=VARCHAR}, ",
        "#{spuId,jdbcType=INTEGER})"
    })
    int insert(XxdCommGoodPropertySpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_good_property_spu
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdCommGoodPropertySpuSqlProvider.class, method="insertSelective")
    int insertSelective(XxdCommGoodPropertySpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_good_property_spu
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, good_id, spu_id",
        "from comm_good_property_spu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="good_id", property="goodId", jdbcType=JdbcType.VARCHAR),
        @Result(column="spu_id", property="spuId", jdbcType=JdbcType.INTEGER)
    })
    XxdCommGoodPropertySpu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_good_property_spu
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdCommGoodPropertySpuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdCommGoodPropertySpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_good_property_spu
     *
     * @mbggenerated
     */
    @Update({
        "update comm_good_property_spu",
        "set good_id = #{goodId,jdbcType=VARCHAR},",
          "spu_id = #{spuId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdCommGoodPropertySpu record);
}