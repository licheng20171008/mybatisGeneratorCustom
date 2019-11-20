package com.yx.ssm.po;

import java.util.Date;

/**
 * 
 * 
 * @author licheng
 * 
 * @date 2017-11-14
 */
public class Firstnorm {
    /**
     * 一级分类ID
     */
    private Integer id;

    /**
     * 一级分类名称
     */
    private String normname;

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

    public String getNormname() {
        return normname;
    }

    public void setNormname(String normname) {
        this.normname = normname == null ? null : normname.trim();
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