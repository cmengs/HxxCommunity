package com.hxxCommunity.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.hxxCommunity.models.XxdCommGoodClass;

public class XxdCommGoodClassSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_good_class
     *
     * @mbggenerated
     */
    public String insertSelective(XxdCommGoodClass record) {
        BEGIN();
        INSERT_INTO("comm_good_class");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getClassid() != null) {
            VALUES("classid", "#{classid,jdbcType=VARCHAR}");
        }
        
        if (record.getClassname() != null) {
            VALUES("classname", "#{classname,jdbcType=VARCHAR}");
        }
        
        if (record.getParentid() != null) {
            VALUES("parentid", "#{parentid,jdbcType=VARCHAR}");
        }
        
        if (record.getSortNo() != null) {
            VALUES("sort_no", "#{sortNo,jdbcType=SMALLINT}");
        }
        
        if (record.getIsparent() != null) {
            VALUES("isparent", "#{isparent,jdbcType=CHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_good_class
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(XxdCommGoodClass record) {
        BEGIN();
        UPDATE("comm_good_class");
        
        if (record.getClassid() != null) {
            SET("classid = #{classid,jdbcType=VARCHAR}");
        }
        
        if (record.getClassname() != null) {
            SET("classname = #{classname,jdbcType=VARCHAR}");
        }
        
        if (record.getParentid() != null) {
            SET("parentid = #{parentid,jdbcType=VARCHAR}");
        }
        
        if (record.getSortNo() != null) {
            SET("sort_no = #{sortNo,jdbcType=SMALLINT}");
        }
        
        if (record.getIsparent() != null) {
            SET("isparent = #{isparent,jdbcType=CHAR}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}