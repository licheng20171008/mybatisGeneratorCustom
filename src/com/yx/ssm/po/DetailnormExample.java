package com.yx.ssm.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DetailnormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailnormExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * 
     * 
     * @author licheng
     * 
     * @date 2017-11-14
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFirstnormidIsNull() {
            addCriterion("firstnormid is null");
            return (Criteria) this;
        }

        public Criteria andFirstnormidIsNotNull() {
            addCriterion("firstnormid is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnormidEqualTo(Integer value) {
            addCriterion("firstnormid =", value, "firstnormid");
            return (Criteria) this;
        }

        public Criteria andFirstnormidNotEqualTo(Integer value) {
            addCriterion("firstnormid <>", value, "firstnormid");
            return (Criteria) this;
        }

        public Criteria andFirstnormidGreaterThan(Integer value) {
            addCriterion("firstnormid >", value, "firstnormid");
            return (Criteria) this;
        }

        public Criteria andFirstnormidGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstnormid >=", value, "firstnormid");
            return (Criteria) this;
        }

        public Criteria andFirstnormidLessThan(Integer value) {
            addCriterion("firstnormid <", value, "firstnormid");
            return (Criteria) this;
        }

        public Criteria andFirstnormidLessThanOrEqualTo(Integer value) {
            addCriterion("firstnormid <=", value, "firstnormid");
            return (Criteria) this;
        }

        public Criteria andFirstnormidIn(List<Integer> values) {
            addCriterion("firstnormid in", values, "firstnormid");
            return (Criteria) this;
        }

        public Criteria andFirstnormidNotIn(List<Integer> values) {
            addCriterion("firstnormid not in", values, "firstnormid");
            return (Criteria) this;
        }

        public Criteria andFirstnormidBetween(Integer value1, Integer value2) {
            addCriterion("firstnormid between", value1, value2, "firstnormid");
            return (Criteria) this;
        }

        public Criteria andFirstnormidNotBetween(Integer value1, Integer value2) {
            addCriterion("firstnormid not between", value1, value2, "firstnormid");
            return (Criteria) this;
        }

        public Criteria andSecondnormidIsNull() {
            addCriterion("secondnormid is null");
            return (Criteria) this;
        }

        public Criteria andSecondnormidIsNotNull() {
            addCriterion("secondnormid is not null");
            return (Criteria) this;
        }

        public Criteria andSecondnormidEqualTo(Integer value) {
            addCriterion("secondnormid =", value, "secondnormid");
            return (Criteria) this;
        }

        public Criteria andSecondnormidNotEqualTo(Integer value) {
            addCriterion("secondnormid <>", value, "secondnormid");
            return (Criteria) this;
        }

        public Criteria andSecondnormidGreaterThan(Integer value) {
            addCriterion("secondnormid >", value, "secondnormid");
            return (Criteria) this;
        }

        public Criteria andSecondnormidGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondnormid >=", value, "secondnormid");
            return (Criteria) this;
        }

        public Criteria andSecondnormidLessThan(Integer value) {
            addCriterion("secondnormid <", value, "secondnormid");
            return (Criteria) this;
        }

        public Criteria andSecondnormidLessThanOrEqualTo(Integer value) {
            addCriterion("secondnormid <=", value, "secondnormid");
            return (Criteria) this;
        }

        public Criteria andSecondnormidIn(List<Integer> values) {
            addCriterion("secondnormid in", values, "secondnormid");
            return (Criteria) this;
        }

        public Criteria andSecondnormidNotIn(List<Integer> values) {
            addCriterion("secondnormid not in", values, "secondnormid");
            return (Criteria) this;
        }

        public Criteria andSecondnormidBetween(Integer value1, Integer value2) {
            addCriterion("secondnormid between", value1, value2, "secondnormid");
            return (Criteria) this;
        }

        public Criteria andSecondnormidNotBetween(Integer value1, Integer value2) {
            addCriterion("secondnormid not between", value1, value2, "secondnormid");
            return (Criteria) this;
        }

        public Criteria andNormidIsNull() {
            addCriterion("normid is null");
            return (Criteria) this;
        }

        public Criteria andNormidIsNotNull() {
            addCriterion("normid is not null");
            return (Criteria) this;
        }

        public Criteria andNormidEqualTo(String value) {
            addCriterion("normid =", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidNotEqualTo(String value) {
            addCriterion("normid <>", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidGreaterThan(String value) {
            addCriterion("normid >", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidGreaterThanOrEqualTo(String value) {
            addCriterion("normid >=", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidLessThan(String value) {
            addCriterion("normid <", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidLessThanOrEqualTo(String value) {
            addCriterion("normid <=", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidLike(String value) {
            addCriterion("normid like", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidNotLike(String value) {
            addCriterion("normid not like", value, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidIn(List<String> values) {
            addCriterion("normid in", values, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidNotIn(List<String> values) {
            addCriterion("normid not in", values, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidBetween(String value1, String value2) {
            addCriterion("normid between", value1, value2, "normid");
            return (Criteria) this;
        }

        public Criteria andNormidNotBetween(String value1, String value2) {
            addCriterion("normid not between", value1, value2, "normid");
            return (Criteria) this;
        }

        public Criteria andNormnameIsNull() {
            addCriterion("normname is null");
            return (Criteria) this;
        }

        public Criteria andNormnameIsNotNull() {
            addCriterion("normname is not null");
            return (Criteria) this;
        }

        public Criteria andNormnameEqualTo(String value) {
            addCriterion("normname =", value, "normname");
            return (Criteria) this;
        }

        public Criteria andNormnameNotEqualTo(String value) {
            addCriterion("normname <>", value, "normname");
            return (Criteria) this;
        }

        public Criteria andNormnameGreaterThan(String value) {
            addCriterion("normname >", value, "normname");
            return (Criteria) this;
        }

        public Criteria andNormnameGreaterThanOrEqualTo(String value) {
            addCriterion("normname >=", value, "normname");
            return (Criteria) this;
        }

        public Criteria andNormnameLessThan(String value) {
            addCriterion("normname <", value, "normname");
            return (Criteria) this;
        }

        public Criteria andNormnameLessThanOrEqualTo(String value) {
            addCriterion("normname <=", value, "normname");
            return (Criteria) this;
        }

        public Criteria andNormnameLike(String value) {
            addCriterion("normname like", value, "normname");
            return (Criteria) this;
        }

        public Criteria andNormnameNotLike(String value) {
            addCriterion("normname not like", value, "normname");
            return (Criteria) this;
        }

        public Criteria andNormnameIn(List<String> values) {
            addCriterion("normname in", values, "normname");
            return (Criteria) this;
        }

        public Criteria andNormnameNotIn(List<String> values) {
            addCriterion("normname not in", values, "normname");
            return (Criteria) this;
        }

        public Criteria andNormnameBetween(String value1, String value2) {
            addCriterion("normname between", value1, value2, "normname");
            return (Criteria) this;
        }

        public Criteria andNormnameNotBetween(String value1, String value2) {
            addCriterion("normname not between", value1, value2, "normname");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionIsNull() {
            addCriterion("normdescription is null");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionIsNotNull() {
            addCriterion("normdescription is not null");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionEqualTo(String value) {
            addCriterion("normdescription =", value, "normdescription");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionNotEqualTo(String value) {
            addCriterion("normdescription <>", value, "normdescription");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionGreaterThan(String value) {
            addCriterion("normdescription >", value, "normdescription");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("normdescription >=", value, "normdescription");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionLessThan(String value) {
            addCriterion("normdescription <", value, "normdescription");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionLessThanOrEqualTo(String value) {
            addCriterion("normdescription <=", value, "normdescription");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionLike(String value) {
            addCriterion("normdescription like", value, "normdescription");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionNotLike(String value) {
            addCriterion("normdescription not like", value, "normdescription");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionIn(List<String> values) {
            addCriterion("normdescription in", values, "normdescription");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionNotIn(List<String> values) {
            addCriterion("normdescription not in", values, "normdescription");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionBetween(String value1, String value2) {
            addCriterion("normdescription between", value1, value2, "normdescription");
            return (Criteria) this;
        }

        public Criteria andNormdescriptionNotBetween(String value1, String value2) {
            addCriterion("normdescription not between", value1, value2, "normdescription");
            return (Criteria) this;
        }

        public Criteria andNormformulaIsNull() {
            addCriterion("normformula is null");
            return (Criteria) this;
        }

        public Criteria andNormformulaIsNotNull() {
            addCriterion("normformula is not null");
            return (Criteria) this;
        }

        public Criteria andNormformulaEqualTo(String value) {
            addCriterion("normformula =", value, "normformula");
            return (Criteria) this;
        }

        public Criteria andNormformulaNotEqualTo(String value) {
            addCriterion("normformula <>", value, "normformula");
            return (Criteria) this;
        }

        public Criteria andNormformulaGreaterThan(String value) {
            addCriterion("normformula >", value, "normformula");
            return (Criteria) this;
        }

        public Criteria andNormformulaGreaterThanOrEqualTo(String value) {
            addCriterion("normformula >=", value, "normformula");
            return (Criteria) this;
        }

        public Criteria andNormformulaLessThan(String value) {
            addCriterion("normformula <", value, "normformula");
            return (Criteria) this;
        }

        public Criteria andNormformulaLessThanOrEqualTo(String value) {
            addCriterion("normformula <=", value, "normformula");
            return (Criteria) this;
        }

        public Criteria andNormformulaLike(String value) {
            addCriterion("normformula like", value, "normformula");
            return (Criteria) this;
        }

        public Criteria andNormformulaNotLike(String value) {
            addCriterion("normformula not like", value, "normformula");
            return (Criteria) this;
        }

        public Criteria andNormformulaIn(List<String> values) {
            addCriterion("normformula in", values, "normformula");
            return (Criteria) this;
        }

        public Criteria andNormformulaNotIn(List<String> values) {
            addCriterion("normformula not in", values, "normformula");
            return (Criteria) this;
        }

        public Criteria andNormformulaBetween(String value1, String value2) {
            addCriterion("normformula between", value1, value2, "normformula");
            return (Criteria) this;
        }

        public Criteria andNormformulaNotBetween(String value1, String value2) {
            addCriterion("normformula not between", value1, value2, "normformula");
            return (Criteria) this;
        }

        public Criteria andComputingcycleIsNull() {
            addCriterion("computingcycle is null");
            return (Criteria) this;
        }

        public Criteria andComputingcycleIsNotNull() {
            addCriterion("computingcycle is not null");
            return (Criteria) this;
        }

        public Criteria andComputingcycleEqualTo(Float value) {
            addCriterion("computingcycle =", value, "computingcycle");
            return (Criteria) this;
        }

        public Criteria andComputingcycleNotEqualTo(Float value) {
            addCriterion("computingcycle <>", value, "computingcycle");
            return (Criteria) this;
        }

        public Criteria andComputingcycleGreaterThan(Float value) {
            addCriterion("computingcycle >", value, "computingcycle");
            return (Criteria) this;
        }

        public Criteria andComputingcycleGreaterThanOrEqualTo(Float value) {
            addCriterion("computingcycle >=", value, "computingcycle");
            return (Criteria) this;
        }

        public Criteria andComputingcycleLessThan(Float value) {
            addCriterion("computingcycle <", value, "computingcycle");
            return (Criteria) this;
        }

        public Criteria andComputingcycleLessThanOrEqualTo(Float value) {
            addCriterion("computingcycle <=", value, "computingcycle");
            return (Criteria) this;
        }

        public Criteria andComputingcycleIn(List<Float> values) {
            addCriterion("computingcycle in", values, "computingcycle");
            return (Criteria) this;
        }

        public Criteria andComputingcycleNotIn(List<Float> values) {
            addCriterion("computingcycle not in", values, "computingcycle");
            return (Criteria) this;
        }

        public Criteria andComputingcycleBetween(Float value1, Float value2) {
            addCriterion("computingcycle between", value1, value2, "computingcycle");
            return (Criteria) this;
        }

        public Criteria andComputingcycleNotBetween(Float value1, Float value2) {
            addCriterion("computingcycle not between", value1, value2, "computingcycle");
            return (Criteria) this;
        }

        public Criteria andCycleunitIsNull() {
            addCriterion("cycleunit is null");
            return (Criteria) this;
        }

        public Criteria andCycleunitIsNotNull() {
            addCriterion("cycleunit is not null");
            return (Criteria) this;
        }

        public Criteria andCycleunitEqualTo(String value) {
            addCriterion("cycleunit =", value, "cycleunit");
            return (Criteria) this;
        }

        public Criteria andCycleunitNotEqualTo(String value) {
            addCriterion("cycleunit <>", value, "cycleunit");
            return (Criteria) this;
        }

        public Criteria andCycleunitGreaterThan(String value) {
            addCriterion("cycleunit >", value, "cycleunit");
            return (Criteria) this;
        }

        public Criteria andCycleunitGreaterThanOrEqualTo(String value) {
            addCriterion("cycleunit >=", value, "cycleunit");
            return (Criteria) this;
        }

        public Criteria andCycleunitLessThan(String value) {
            addCriterion("cycleunit <", value, "cycleunit");
            return (Criteria) this;
        }

        public Criteria andCycleunitLessThanOrEqualTo(String value) {
            addCriterion("cycleunit <=", value, "cycleunit");
            return (Criteria) this;
        }

        public Criteria andCycleunitLike(String value) {
            addCriterion("cycleunit like", value, "cycleunit");
            return (Criteria) this;
        }

        public Criteria andCycleunitNotLike(String value) {
            addCriterion("cycleunit not like", value, "cycleunit");
            return (Criteria) this;
        }

        public Criteria andCycleunitIn(List<String> values) {
            addCriterion("cycleunit in", values, "cycleunit");
            return (Criteria) this;
        }

        public Criteria andCycleunitNotIn(List<String> values) {
            addCriterion("cycleunit not in", values, "cycleunit");
            return (Criteria) this;
        }

        public Criteria andCycleunitBetween(String value1, String value2) {
            addCriterion("cycleunit between", value1, value2, "cycleunit");
            return (Criteria) this;
        }

        public Criteria andCycleunitNotBetween(String value1, String value2) {
            addCriterion("cycleunit not between", value1, value2, "cycleunit");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNull() {
            addCriterion("departmentid is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("departmentid is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("departmentid =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("departmentid <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("departmentid >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("departmentid >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("departmentid <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("departmentid <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("departmentid in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("departmentid not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("departmentid between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("departmentid not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andAbatetimeIsNull() {
            addCriterion("abatetime is null");
            return (Criteria) this;
        }

        public Criteria andAbatetimeIsNotNull() {
            addCriterion("abatetime is not null");
            return (Criteria) this;
        }

        public Criteria andAbatetimeEqualTo(Date value) {
            addCriterion("abatetime =", value, "abatetime");
            return (Criteria) this;
        }

        public Criteria andAbatetimeNotEqualTo(Date value) {
            addCriterion("abatetime <>", value, "abatetime");
            return (Criteria) this;
        }

        public Criteria andAbatetimeGreaterThan(Date value) {
            addCriterion("abatetime >", value, "abatetime");
            return (Criteria) this;
        }

        public Criteria andAbatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("abatetime >=", value, "abatetime");
            return (Criteria) this;
        }

        public Criteria andAbatetimeLessThan(Date value) {
            addCriterion("abatetime <", value, "abatetime");
            return (Criteria) this;
        }

        public Criteria andAbatetimeLessThanOrEqualTo(Date value) {
            addCriterion("abatetime <=", value, "abatetime");
            return (Criteria) this;
        }

        public Criteria andAbatetimeIn(List<Date> values) {
            addCriterion("abatetime in", values, "abatetime");
            return (Criteria) this;
        }

        public Criteria andAbatetimeNotIn(List<Date> values) {
            addCriterion("abatetime not in", values, "abatetime");
            return (Criteria) this;
        }

        public Criteria andAbatetimeBetween(Date value1, Date value2) {
            addCriterion("abatetime between", value1, value2, "abatetime");
            return (Criteria) this;
        }

        public Criteria andAbatetimeNotBetween(Date value1, Date value2) {
            addCriterion("abatetime not between", value1, value2, "abatetime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author licheng
     * 
     * @date 2017-11-14
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}