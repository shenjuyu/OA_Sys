package com.sjy.OA_Sys.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class StaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffExample() {
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

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Integer value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Integer value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Integer value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Integer value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Integer> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Integer> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffPwdIsNull() {
            addCriterion("staff_pwd is null");
            return (Criteria) this;
        }

        public Criteria andStaffPwdIsNotNull() {
            addCriterion("staff_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPwdEqualTo(String value) {
            addCriterion("staff_pwd =", value, "staffPwd");
            return (Criteria) this;
        }

        public Criteria andStaffPwdNotEqualTo(String value) {
            addCriterion("staff_pwd <>", value, "staffPwd");
            return (Criteria) this;
        }

        public Criteria andStaffPwdGreaterThan(String value) {
            addCriterion("staff_pwd >", value, "staffPwd");
            return (Criteria) this;
        }

        public Criteria andStaffPwdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_pwd >=", value, "staffPwd");
            return (Criteria) this;
        }

        public Criteria andStaffPwdLessThan(String value) {
            addCriterion("staff_pwd <", value, "staffPwd");
            return (Criteria) this;
        }

        public Criteria andStaffPwdLessThanOrEqualTo(String value) {
            addCriterion("staff_pwd <=", value, "staffPwd");
            return (Criteria) this;
        }

        public Criteria andStaffPwdLike(String value) {
            addCriterion("staff_pwd like", value, "staffPwd");
            return (Criteria) this;
        }

        public Criteria andStaffPwdNotLike(String value) {
            addCriterion("staff_pwd not like", value, "staffPwd");
            return (Criteria) this;
        }

        public Criteria andStaffPwdIn(List<String> values) {
            addCriterion("staff_pwd in", values, "staffPwd");
            return (Criteria) this;
        }

        public Criteria andStaffPwdNotIn(List<String> values) {
            addCriterion("staff_pwd not in", values, "staffPwd");
            return (Criteria) this;
        }

        public Criteria andStaffPwdBetween(String value1, String value2) {
            addCriterion("staff_pwd between", value1, value2, "staffPwd");
            return (Criteria) this;
        }

        public Criteria andStaffPwdNotBetween(String value1, String value2) {
            addCriterion("staff_pwd not between", value1, value2, "staffPwd");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffBirthIsNull() {
            addCriterion("staff_birth is null");
            return (Criteria) this;
        }

        public Criteria andStaffBirthIsNotNull() {
            addCriterion("staff_birth is not null");
            return (Criteria) this;
        }

        public Criteria andStaffBirthEqualTo(Timestamp value) {
            addCriterion("staff_birth =", value, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthNotEqualTo(Timestamp value) {
            addCriterion("staff_birth <>", value, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthGreaterThan(Timestamp value) {
            addCriterion("staff_birth >", value, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("staff_birth >=", value, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthLessThan(Timestamp value) {
            addCriterion("staff_birth <", value, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthLessThanOrEqualTo(Timestamp value) {
            addCriterion("staff_birth <=", value, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthIn(List<Timestamp> values) {
            addCriterion("staff_birth in", values, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthNotIn(List<Timestamp> values) {
            addCriterion("staff_birth not in", values, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthBetween(Timestamp value1, Timestamp value2) {
            addCriterion("staff_birth between", value1, value2, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffBirthNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("staff_birth not between", value1, value2, "staffBirth");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardIsNull() {
            addCriterion("staff_id_card is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardIsNotNull() {
            addCriterion("staff_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardEqualTo(String value) {
            addCriterion("staff_id_card =", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardNotEqualTo(String value) {
            addCriterion("staff_id_card <>", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardGreaterThan(String value) {
            addCriterion("staff_id_card >", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id_card >=", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardLessThan(String value) {
            addCriterion("staff_id_card <", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardLessThanOrEqualTo(String value) {
            addCriterion("staff_id_card <=", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardLike(String value) {
            addCriterion("staff_id_card like", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardNotLike(String value) {
            addCriterion("staff_id_card not like", value, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardIn(List<String> values) {
            addCriterion("staff_id_card in", values, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardNotIn(List<String> values) {
            addCriterion("staff_id_card not in", values, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardBetween(String value1, String value2) {
            addCriterion("staff_id_card between", value1, value2, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffIdCardNotBetween(String value1, String value2) {
            addCriterion("staff_id_card not between", value1, value2, "staffIdCard");
            return (Criteria) this;
        }

        public Criteria andStaffTelIsNull() {
            addCriterion("staff_tel is null");
            return (Criteria) this;
        }

        public Criteria andStaffTelIsNotNull() {
            addCriterion("staff_tel is not null");
            return (Criteria) this;
        }

        public Criteria andStaffTelEqualTo(String value) {
            addCriterion("staff_tel =", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotEqualTo(String value) {
            addCriterion("staff_tel <>", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelGreaterThan(String value) {
            addCriterion("staff_tel >", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelGreaterThanOrEqualTo(String value) {
            addCriterion("staff_tel >=", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelLessThan(String value) {
            addCriterion("staff_tel <", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelLessThanOrEqualTo(String value) {
            addCriterion("staff_tel <=", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelLike(String value) {
            addCriterion("staff_tel like", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotLike(String value) {
            addCriterion("staff_tel not like", value, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelIn(List<String> values) {
            addCriterion("staff_tel in", values, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotIn(List<String> values) {
            addCriterion("staff_tel not in", values, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelBetween(String value1, String value2) {
            addCriterion("staff_tel between", value1, value2, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffTelNotBetween(String value1, String value2) {
            addCriterion("staff_tel not between", value1, value2, "staffTel");
            return (Criteria) this;
        }

        public Criteria andStaffEmailIsNull() {
            addCriterion("staff_email is null");
            return (Criteria) this;
        }

        public Criteria andStaffEmailIsNotNull() {
            addCriterion("staff_email is not null");
            return (Criteria) this;
        }

        public Criteria andStaffEmailEqualTo(String value) {
            addCriterion("staff_email =", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailNotEqualTo(String value) {
            addCriterion("staff_email <>", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailGreaterThan(String value) {
            addCriterion("staff_email >", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailGreaterThanOrEqualTo(String value) {
            addCriterion("staff_email >=", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailLessThan(String value) {
            addCriterion("staff_email <", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailLessThanOrEqualTo(String value) {
            addCriterion("staff_email <=", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailLike(String value) {
            addCriterion("staff_email like", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailNotLike(String value) {
            addCriterion("staff_email not like", value, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailIn(List<String> values) {
            addCriterion("staff_email in", values, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailNotIn(List<String> values) {
            addCriterion("staff_email not in", values, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailBetween(String value1, String value2) {
            addCriterion("staff_email between", value1, value2, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffEmailNotBetween(String value1, String value2) {
            addCriterion("staff_email not between", value1, value2, "staffEmail");
            return (Criteria) this;
        }

        public Criteria andStaffAddrIsNull() {
            addCriterion("staff_addr is null");
            return (Criteria) this;
        }

        public Criteria andStaffAddrIsNotNull() {
            addCriterion("staff_addr is not null");
            return (Criteria) this;
        }

        public Criteria andStaffAddrEqualTo(String value) {
            addCriterion("staff_addr =", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrNotEqualTo(String value) {
            addCriterion("staff_addr <>", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrGreaterThan(String value) {
            addCriterion("staff_addr >", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrGreaterThanOrEqualTo(String value) {
            addCriterion("staff_addr >=", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrLessThan(String value) {
            addCriterion("staff_addr <", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrLessThanOrEqualTo(String value) {
            addCriterion("staff_addr <=", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrLike(String value) {
            addCriterion("staff_addr like", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrNotLike(String value) {
            addCriterion("staff_addr not like", value, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrIn(List<String> values) {
            addCriterion("staff_addr in", values, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrNotIn(List<String> values) {
            addCriterion("staff_addr not in", values, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrBetween(String value1, String value2) {
            addCriterion("staff_addr between", value1, value2, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffAddrNotBetween(String value1, String value2) {
            addCriterion("staff_addr not between", value1, value2, "staffAddr");
            return (Criteria) this;
        }

        public Criteria andStaffImgIsNull() {
            addCriterion("staff_img is null");
            return (Criteria) this;
        }

        public Criteria andStaffImgIsNotNull() {
            addCriterion("staff_img is not null");
            return (Criteria) this;
        }

        public Criteria andStaffImgEqualTo(String value) {
            addCriterion("staff_img =", value, "staffImg");
            return (Criteria) this;
        }

        public Criteria andStaffImgNotEqualTo(String value) {
            addCriterion("staff_img <>", value, "staffImg");
            return (Criteria) this;
        }

        public Criteria andStaffImgGreaterThan(String value) {
            addCriterion("staff_img >", value, "staffImg");
            return (Criteria) this;
        }

        public Criteria andStaffImgGreaterThanOrEqualTo(String value) {
            addCriterion("staff_img >=", value, "staffImg");
            return (Criteria) this;
        }

        public Criteria andStaffImgLessThan(String value) {
            addCriterion("staff_img <", value, "staffImg");
            return (Criteria) this;
        }

        public Criteria andStaffImgLessThanOrEqualTo(String value) {
            addCriterion("staff_img <=", value, "staffImg");
            return (Criteria) this;
        }

        public Criteria andStaffImgLike(String value) {
            addCriterion("staff_img like", value, "staffImg");
            return (Criteria) this;
        }

        public Criteria andStaffImgNotLike(String value) {
            addCriterion("staff_img not like", value, "staffImg");
            return (Criteria) this;
        }

        public Criteria andStaffImgIn(List<String> values) {
            addCriterion("staff_img in", values, "staffImg");
            return (Criteria) this;
        }

        public Criteria andStaffImgNotIn(List<String> values) {
            addCriterion("staff_img not in", values, "staffImg");
            return (Criteria) this;
        }

        public Criteria andStaffImgBetween(String value1, String value2) {
            addCriterion("staff_img between", value1, value2, "staffImg");
            return (Criteria) this;
        }

        public Criteria andStaffImgNotBetween(String value1, String value2) {
            addCriterion("staff_img not between", value1, value2, "staffImg");
            return (Criteria) this;
        }

        public Criteria andStaffWagesIsNull() {
            addCriterion("staff_wages is null");
            return (Criteria) this;
        }

        public Criteria andStaffWagesIsNotNull() {
            addCriterion("staff_wages is not null");
            return (Criteria) this;
        }

        public Criteria andStaffWagesEqualTo(BigDecimal value) {
            addCriterion("staff_wages =", value, "staffWages");
            return (Criteria) this;
        }

        public Criteria andStaffWagesNotEqualTo(BigDecimal value) {
            addCriterion("staff_wages <>", value, "staffWages");
            return (Criteria) this;
        }

        public Criteria andStaffWagesGreaterThan(BigDecimal value) {
            addCriterion("staff_wages >", value, "staffWages");
            return (Criteria) this;
        }

        public Criteria andStaffWagesGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("staff_wages >=", value, "staffWages");
            return (Criteria) this;
        }

        public Criteria andStaffWagesLessThan(BigDecimal value) {
            addCriterion("staff_wages <", value, "staffWages");
            return (Criteria) this;
        }

        public Criteria andStaffWagesLessThanOrEqualTo(BigDecimal value) {
            addCriterion("staff_wages <=", value, "staffWages");
            return (Criteria) this;
        }

        public Criteria andStaffWagesIn(List<BigDecimal> values) {
            addCriterion("staff_wages in", values, "staffWages");
            return (Criteria) this;
        }

        public Criteria andStaffWagesNotIn(List<BigDecimal> values) {
            addCriterion("staff_wages not in", values, "staffWages");
            return (Criteria) this;
        }

        public Criteria andStaffWagesBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("staff_wages between", value1, value2, "staffWages");
            return (Criteria) this;
        }

        public Criteria andStaffWagesNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("staff_wages not between", value1, value2, "staffWages");
            return (Criteria) this;
        }

        public Criteria andStaffStateIsNull() {
            addCriterion("staff_state is null");
            return (Criteria) this;
        }

        public Criteria andStaffStateIsNotNull() {
            addCriterion("staff_state is not null");
            return (Criteria) this;
        }

        public Criteria andStaffStateEqualTo(Integer value) {
            addCriterion("staff_state =", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotEqualTo(Integer value) {
            addCriterion("staff_state <>", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateGreaterThan(Integer value) {
            addCriterion("staff_state >", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_state >=", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLessThan(Integer value) {
            addCriterion("staff_state <", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateLessThanOrEqualTo(Integer value) {
            addCriterion("staff_state <=", value, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateIn(List<Integer> values) {
            addCriterion("staff_state in", values, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotIn(List<Integer> values) {
            addCriterion("staff_state not in", values, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateBetween(Integer value1, Integer value2) {
            addCriterion("staff_state between", value1, value2, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffStateNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_state not between", value1, value2, "staffState");
            return (Criteria) this;
        }

        public Criteria andStaffPowerIsNull() {
            addCriterion("staff_power is null");
            return (Criteria) this;
        }

        public Criteria andStaffPowerIsNotNull() {
            addCriterion("staff_power is not null");
            return (Criteria) this;
        }

        public Criteria andStaffPowerEqualTo(Integer value) {
            addCriterion("staff_power =", value, "staffPower");
            return (Criteria) this;
        }

        public Criteria andStaffPowerNotEqualTo(Integer value) {
            addCriterion("staff_power <>", value, "staffPower");
            return (Criteria) this;
        }

        public Criteria andStaffPowerGreaterThan(Integer value) {
            addCriterion("staff_power >", value, "staffPower");
            return (Criteria) this;
        }

        public Criteria andStaffPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("staff_power >=", value, "staffPower");
            return (Criteria) this;
        }

        public Criteria andStaffPowerLessThan(Integer value) {
            addCriterion("staff_power <", value, "staffPower");
            return (Criteria) this;
        }

        public Criteria andStaffPowerLessThanOrEqualTo(Integer value) {
            addCriterion("staff_power <=", value, "staffPower");
            return (Criteria) this;
        }

        public Criteria andStaffPowerIn(List<Integer> values) {
            addCriterion("staff_power in", values, "staffPower");
            return (Criteria) this;
        }

        public Criteria andStaffPowerNotIn(List<Integer> values) {
            addCriterion("staff_power not in", values, "staffPower");
            return (Criteria) this;
        }

        public Criteria andStaffPowerBetween(Integer value1, Integer value2) {
            addCriterion("staff_power between", value1, value2, "staffPower");
            return (Criteria) this;
        }

        public Criteria andStaffPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("staff_power not between", value1, value2, "staffPower");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNull() {
            addCriterion("depart_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartIdIsNotNull() {
            addCriterion("depart_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartIdEqualTo(Integer value) {
            addCriterion("depart_id =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(Integer value) {
            addCriterion("depart_id <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(Integer value) {
            addCriterion("depart_id >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("depart_id >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(Integer value) {
            addCriterion("depart_id <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(Integer value) {
            addCriterion("depart_id <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<Integer> values) {
            addCriterion("depart_id in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<Integer> values) {
            addCriterion("depart_id not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(Integer value1, Integer value2) {
            addCriterion("depart_id between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("depart_id not between", value1, value2, "departId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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