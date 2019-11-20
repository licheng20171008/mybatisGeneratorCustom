package com.yx.ssm.po;

import java.util.Date;

/**
 * 
 * 
 * @author licheng
 * 
 * @date 2017-11-14
 */
public class Detailnorm {
    /**
     * 指标ID
     */
    private Integer id;

    /**
     * 一级分类
     */
    private Integer firstnormid;

    /**
     * 二级分类
     */
    private Integer secondnormid;

    /**
     * 指标编号
     */
    private String normid;

    /**
     * 指标名称
     */
    private String normname;

    /**
     * 指标定义
     */
    private String normdescription;

    /**
     * 计算公式
     */
    private String normformula;

    /**
     * 统计周期
     */
    private Float computingcycle;

    /**
     * 周期单位
     */
    private String cycleunit;

    /**
     * 部门
     */
    private Integer departmentid;

    /**
     * 备注
     */
    private String remark;

    /**
     * 冻结日期
     */
    private Date abatetime;

    /**
     * 创建日期
     */
    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFirstnormid() {
        return firstnormid;
    }

    public void setFirstnormid(Integer firstnormid) {
        this.firstnormid = firstnormid;
    }

    public Integer getSecondnormid() {
        return secondnormid;
    }

    public void setSecondnormid(Integer secondnormid) {
        this.secondnormid = secondnormid;
    }

    public String getNormid() {
        return normid;
    }

    public void setNormid(String normid) {
        this.normid = normid == null ? null : normid.trim();
    }

    public String getNormname() {
        return normname;
    }

    public void setNormname(String normname) {
        this.normname = normname == null ? null : normname.trim();
    }

    public String getNormdescription() {
        return normdescription;
    }

    public void setNormdescription(String normdescription) {
        this.normdescription = normdescription == null ? null : normdescription.trim();
    }

    public String getNormformula() {
        return normformula;
    }

    public void setNormformula(String normformula) {
        this.normformula = normformula == null ? null : normformula.trim();
    }

    public Float getComputingcycle() {
        return computingcycle;
    }

    public void setComputingcycle(Float computingcycle) {
        this.computingcycle = computingcycle;
    }

    public String getCycleunit() {
        return cycleunit;
    }

    public void setCycleunit(String cycleunit) {
        this.cycleunit = cycleunit == null ? null : cycleunit.trim();
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getAbatetime() {
        return abatetime;
    }

    public void setAbatetime(Date abatetime) {
        this.abatetime = abatetime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}