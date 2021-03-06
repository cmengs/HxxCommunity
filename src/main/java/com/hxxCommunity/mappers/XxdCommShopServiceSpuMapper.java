package com.hxxCommunity.mappers;

import com.hxxCommunity.models.XxdCommShopServiceSpu;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface XxdCommShopServiceSpuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_shop_service_spu
     *
     * @mbggenerated
     */
    @Delete({
        "delete from comm_shop_service_spu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_shop_service_spu
     *
     * @mbggenerated
     */
    @Insert({
        "insert into comm_shop_service_spu (id, good_id, ",
        "spu_id)",
        "values (#{id,jdbcType=INTEGER}, #{goodId,jdbcType=INTEGER}, ",
        "#{spuId,jdbcType=INTEGER})"
    })
    int insert(XxdCommShopServiceSpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_shop_service_spu
     *
     * @mbggenerated
     */
    @InsertProvider(type=XxdCommShopServiceSpuSqlProvider.class, method="insertSelective")
    int insertSelective(XxdCommShopServiceSpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_shop_service_spu
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, good_id, spu_id",
        "from comm_shop_service_spu",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="good_id", property="goodId", jdbcType=JdbcType.INTEGER),
        @Result(column="spu_id", property="spuId", jdbcType=JdbcType.INTEGER)
    })
    XxdCommShopServiceSpu selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_shop_service_spu
     *
     * @mbggenerated
     */
    @UpdateProvider(type=XxdCommShopServiceSpuSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(XxdCommShopServiceSpu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_shop_service_spu
     *
     * @mbggenerated
     */
    @Update({
        "update comm_shop_service_spu",
        "set good_id = #{goodId,jdbcType=INTEGER},",
          "spu_id = #{spuId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(XxdCommShopServiceSpu record);
}