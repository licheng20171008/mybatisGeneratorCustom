package com.yx.ssm.po;

import java.util.Date;

/**
 * 
 * 
 * @author licheng
 * 
 * @date 2017-11-14
 */
public class Department {
    /**
     * 部门ID
     */
    private Integer id;

    /**
     * 部门名称
     */
    private String dpname;

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

    public String getDpname() {
        return dpname;
    }

    public void setDpname(String dpname) {
        this.dpname = dpname == null ? null : dpname.trim();
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