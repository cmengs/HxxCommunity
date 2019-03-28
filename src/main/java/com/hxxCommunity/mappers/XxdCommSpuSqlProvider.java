package com.hxxCommunity.mappers;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import com.hxxCommunity.models.XxdCommSpu;

public class XxdCommSpuSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_spu
     *
     * @mbggenerated
     */
    public String insertSelective(XxdCommSpu record) {
        BEGIN();
        INSERT_INTO("comm_spu");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getName() != null) {
            VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getParentid() != null) {
            VALUES("parentid", "#{parentid,jdbcType=INTEGER}");
        }
        
        if (record.getChildid() != null) {
            VALUES("childid", "#{childid,jdbcType=INTEGER}");
        }
        
        if (record.getIscolor() != null) {
            VALUES("iscolor", "#{iscolor,jdbcType=CHAR}");
        }
        
        if (record.getIsenum() != null) {
            VALUES("isenum", "#{isenum,jdbcType=CHAR}");
        }
        
        if (record.getIsinput() != null) {
            VALUES("isinput", "#{isinput,jdbcType=CHAR}");
        }
        
        if (record.getIsprimary() != null) {
            VALUES("isprimary", "#{isprimary,jdbcType=CHAR}");
        }
        
        if (record.getIssale() != null) {
            VALUES("issale", "#{issale,jdbcType=CHAR}");
        }
        
        if (record.getStat() != null) {
            VALUES("stat", "#{stat,jdbcType=CHAR}");
        }
        
        if (record.getSortNo() != null) {
            VALUES("sort_no", "#{sortNo,jdbcType=SMALLINT}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table comm_spu
     *
     * @mbggenerated
     */
    public String updateByPrimaryKeySelective(XxdCommSpu record) {
        BEGIN();
        UPDATE("comm_spu");
        
        if (record.getName() != null) {
            SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getParentid() != null) {
            SET("parentid = #{parentid,jdbcType=INTEGER}");
        }
        
        if (record.getChildid() != null) {
            SET("childid = #{childid,jdbcType=INTEGER}");
        }
        
        if (record.getIscolor() != null) {
            SET("iscolor = #{iscolor,jdbcType=CHAR}");
        }
        
        if (record.getIsenum() != null) {
            SET("isenum = #{isenum,jdbcType=CHAR}");
        }
        
        if (record.getIsinput() != null) {
            SET("isinput = #{isinput,jdbcType=CHAR}");
        }
        
        if (record.getIsprimary() != null) {
            SET("isprimary = #{isprimary,jdbcType=CHAR}");
        }
        
        if (record.getIssale() != null) {
            SET("issale = #{issale,jdbcType=CHAR}");
        }
        
        if (record.getStat() != null) {
            SET("stat = #{stat,jdbcType=CHAR}");
        }
        
        if (record.getSortNo() != null) {
            SET("sort_no = #{sortNo,jdbcType=SMALLINT}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }
}