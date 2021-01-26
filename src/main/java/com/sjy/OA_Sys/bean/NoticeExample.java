package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNoticeStaffSendIsNull() {
            addCriterion("notice_staff_send is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffSendIsNotNull() {
            addCriterion("notice_staff_send is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffSendEqualTo(Integer value) {
            addCriterion("notice_staff_send =", value, "noticeStaffSend");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffSendNotEqualTo(Integer value) {
            addCriterion("notice_staff_send <>", value, "noticeStaffSend");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffSendGreaterThan(Integer value) {
            addCriterion("notice_staff_send >", value, "noticeStaffSend");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffSendGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_staff_send >=", value, "noticeStaffSend");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffSendLessThan(Integer value) {
            addCriterion("notice_staff_send <", value, "noticeStaffSend");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffSendLessThanOrEqualTo(Integer value) {
            addCriterion("notice_staff_send <=", value, "noticeStaffSend");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffSendIn(List<Integer> values) {
            addCriterion("notice_staff_send in", values, "noticeStaffSend");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffSendNotIn(List<Integer> values) {
            addCriterion("notice_staff_send not in", values, "noticeStaffSend");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffSendBetween(Integer value1, Integer value2) {
            addCriterion("notice_staff_send between", value1, value2, "noticeStaffSend");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffSendNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_staff_send not between", value1, value2, "noticeStaffSend");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffAddresseeIsNull() {
            addCriterion("notice_staff_addressee is null");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffAddresseeIsNotNull() {
            addCriterion("notice_staff_addressee is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffAddresseeEqualTo(Integer value) {
            addCriterion("notice_staff_addressee =", value, "noticeStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffAddresseeNotEqualTo(Integer value) {
            addCriterion("notice_staff_addressee <>", value, "noticeStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffAddresseeGreaterThan(Integer value) {
            addCriterion("notice_staff_addressee >", value, "noticeStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffAddresseeGreaterThanOrEqualTo(Integer value) {
            addCriterion("notice_staff_addressee >=", value, "noticeStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffAddresseeLessThan(Integer value) {
            addCriterion("notice_staff_addressee <", value, "noticeStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffAddresseeLessThanOrEqualTo(Integer value) {
            addCriterion("notice_staff_addressee <=", value, "noticeStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffAddresseeIn(List<Integer> values) {
            addCriterion("notice_staff_addressee in", values, "noticeStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffAddresseeNotIn(List<Integer> values) {
            addCriterion("notice_staff_addressee not in", values, "noticeStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffAddresseeBetween(Integer value1, Integer value2) {
            addCriterion("notice_staff_addressee between", value1, value2, "noticeStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andNoticeStaffAddresseeNotBetween(Integer value1, Integer value2) {
            addCriterion("notice_staff_addressee not between", value1, value2, "noticeStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNull() {
            addCriterion("notice_title is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIsNotNull() {
            addCriterion("notice_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleEqualTo(String value) {
            addCriterion("notice_title =", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotEqualTo(String value) {
            addCriterion("notice_title <>", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThan(String value) {
            addCriterion("notice_title >", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleGreaterThanOrEqualTo(String value) {
            addCriterion("notice_title >=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThan(String value) {
            addCriterion("notice_title <", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLessThanOrEqualTo(String value) {
            addCriterion("notice_title <=", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleLike(String value) {
            addCriterion("notice_title like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotLike(String value) {
            addCriterion("notice_title not like", value, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleIn(List<String> values) {
            addCriterion("notice_title in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotIn(List<String> values) {
            addCriterion("notice_title not in", values, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleBetween(String value1, String value2) {
            addCriterion("notice_title between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTitleNotBetween(String value1, String value2) {
            addCriterion("notice_title not between", value1, value2, "noticeTitle");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNull() {
            addCriterion("notice_time is null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIsNotNull() {
            addCriterion("notice_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeEqualTo(Timestamp value) {
            addCriterion("notice_time =", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotEqualTo(Timestamp value) {
            addCriterion("notice_time <>", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThan(Timestamp value) {
            addCriterion("notice_time >", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("notice_time >=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThan(Timestamp value) {
            addCriterion("notice_time <", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("notice_time <=", value, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeIn(List<Timestamp> values) {
            addCriterion("notice_time in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotIn(List<Timestamp> values) {
            addCriterion("notice_time not in", values, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("notice_time between", value1, value2, "noticeTime");
            return (Criteria) this;
        }

        public Criteria andNoticeTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("notice_time not between", value1, value2, "noticeTime");
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