package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CalendarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CalendarExample() {
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

        public Criteria andCalendarTitleIsNull() {
            addCriterion("calendar_title is null");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleIsNotNull() {
            addCriterion("calendar_title is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleEqualTo(String value) {
            addCriterion("calendar_title =", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleNotEqualTo(String value) {
            addCriterion("calendar_title <>", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleGreaterThan(String value) {
            addCriterion("calendar_title >", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleGreaterThanOrEqualTo(String value) {
            addCriterion("calendar_title >=", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleLessThan(String value) {
            addCriterion("calendar_title <", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleLessThanOrEqualTo(String value) {
            addCriterion("calendar_title <=", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleLike(String value) {
            addCriterion("calendar_title like", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleNotLike(String value) {
            addCriterion("calendar_title not like", value, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleIn(List<String> values) {
            addCriterion("calendar_title in", values, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleNotIn(List<String> values) {
            addCriterion("calendar_title not in", values, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleBetween(String value1, String value2) {
            addCriterion("calendar_title between", value1, value2, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTitleNotBetween(String value1, String value2) {
            addCriterion("calendar_title not between", value1, value2, "calendarTitle");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeStartIsNull() {
            addCriterion("calendar_time_start is null");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeStartIsNotNull() {
            addCriterion("calendar_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeStartEqualTo(Timestamp value) {
            addCriterion("calendar_time_start =", value, "calendarTimeStart");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeStartNotEqualTo(Timestamp value) {
            addCriterion("calendar_time_start <>", value, "calendarTimeStart");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeStartGreaterThan(Timestamp value) {
            addCriterion("calendar_time_start >", value, "calendarTimeStart");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeStartGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("calendar_time_start >=", value, "calendarTimeStart");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeStartLessThan(Timestamp value) {
            addCriterion("calendar_time_start <", value, "calendarTimeStart");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeStartLessThanOrEqualTo(Timestamp value) {
            addCriterion("calendar_time_start <=", value, "calendarTimeStart");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeStartIn(List<Timestamp> values) {
            addCriterion("calendar_time_start in", values, "calendarTimeStart");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeStartNotIn(List<Timestamp> values) {
            addCriterion("calendar_time_start not in", values, "calendarTimeStart");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeStartBetween(Timestamp value1, Timestamp value2) {
            addCriterion("calendar_time_start between", value1, value2, "calendarTimeStart");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeStartNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("calendar_time_start not between", value1, value2, "calendarTimeStart");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeEndIsNull() {
            addCriterion("calendar_time_end is null");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeEndIsNotNull() {
            addCriterion("calendar_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeEndEqualTo(Timestamp value) {
            addCriterion("calendar_time_end =", value, "calendarTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeEndNotEqualTo(Timestamp value) {
            addCriterion("calendar_time_end <>", value, "calendarTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeEndGreaterThan(Timestamp value) {
            addCriterion("calendar_time_end >", value, "calendarTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeEndGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("calendar_time_end >=", value, "calendarTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeEndLessThan(Timestamp value) {
            addCriterion("calendar_time_end <", value, "calendarTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeEndLessThanOrEqualTo(Timestamp value) {
            addCriterion("calendar_time_end <=", value, "calendarTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeEndIn(List<Timestamp> values) {
            addCriterion("calendar_time_end in", values, "calendarTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeEndNotIn(List<Timestamp> values) {
            addCriterion("calendar_time_end not in", values, "calendarTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeEndBetween(Timestamp value1, Timestamp value2) {
            addCriterion("calendar_time_end between", value1, value2, "calendarTimeEnd");
            return (Criteria) this;
        }

        public Criteria andCalendarTimeEndNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("calendar_time_end not between", value1, value2, "calendarTimeEnd");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(String value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(String value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(String value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(String value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(String value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(String value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLike(String value) {
            addCriterion("staff_id like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotLike(String value) {
            addCriterion("staff_id not like", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<String> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<String> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(String value1, String value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(String value1, String value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andCalendarDesIsNull() {
            addCriterion("calendar_des is null");
            return (Criteria) this;
        }

        public Criteria andCalendarDesIsNotNull() {
            addCriterion("calendar_des is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarDesEqualTo(String value) {
            addCriterion("calendar_des =", value, "calendarDes");
            return (Criteria) this;
        }

        public Criteria andCalendarDesNotEqualTo(String value) {
            addCriterion("calendar_des <>", value, "calendarDes");
            return (Criteria) this;
        }

        public Criteria andCalendarDesGreaterThan(String value) {
            addCriterion("calendar_des >", value, "calendarDes");
            return (Criteria) this;
        }

        public Criteria andCalendarDesGreaterThanOrEqualTo(String value) {
            addCriterion("calendar_des >=", value, "calendarDes");
            return (Criteria) this;
        }

        public Criteria andCalendarDesLessThan(String value) {
            addCriterion("calendar_des <", value, "calendarDes");
            return (Criteria) this;
        }

        public Criteria andCalendarDesLessThanOrEqualTo(String value) {
            addCriterion("calendar_des <=", value, "calendarDes");
            return (Criteria) this;
        }

        public Criteria andCalendarDesLike(String value) {
            addCriterion("calendar_des like", value, "calendarDes");
            return (Criteria) this;
        }

        public Criteria andCalendarDesNotLike(String value) {
            addCriterion("calendar_des not like", value, "calendarDes");
            return (Criteria) this;
        }

        public Criteria andCalendarDesIn(List<String> values) {
            addCriterion("calendar_des in", values, "calendarDes");
            return (Criteria) this;
        }

        public Criteria andCalendarDesNotIn(List<String> values) {
            addCriterion("calendar_des not in", values, "calendarDes");
            return (Criteria) this;
        }

        public Criteria andCalendarDesBetween(String value1, String value2) {
            addCriterion("calendar_des between", value1, value2, "calendarDes");
            return (Criteria) this;
        }

        public Criteria andCalendarDesNotBetween(String value1, String value2) {
            addCriterion("calendar_des not between", value1, value2, "calendarDes");
            return (Criteria) this;
        }

        public Criteria andCalendarStateIsNull() {
            addCriterion("calendar_state is null");
            return (Criteria) this;
        }

        public Criteria andCalendarStateIsNotNull() {
            addCriterion("calendar_state is not null");
            return (Criteria) this;
        }

        public Criteria andCalendarStateEqualTo(Integer value) {
            addCriterion("calendar_state =", value, "calendarState");
            return (Criteria) this;
        }

        public Criteria andCalendarStateNotEqualTo(Integer value) {
            addCriterion("calendar_state <>", value, "calendarState");
            return (Criteria) this;
        }

        public Criteria andCalendarStateGreaterThan(Integer value) {
            addCriterion("calendar_state >", value, "calendarState");
            return (Criteria) this;
        }

        public Criteria andCalendarStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("calendar_state >=", value, "calendarState");
            return (Criteria) this;
        }

        public Criteria andCalendarStateLessThan(Integer value) {
            addCriterion("calendar_state <", value, "calendarState");
            return (Criteria) this;
        }

        public Criteria andCalendarStateLessThanOrEqualTo(Integer value) {
            addCriterion("calendar_state <=", value, "calendarState");
            return (Criteria) this;
        }

        public Criteria andCalendarStateIn(List<Integer> values) {
            addCriterion("calendar_state in", values, "calendarState");
            return (Criteria) this;
        }

        public Criteria andCalendarStateNotIn(List<Integer> values) {
            addCriterion("calendar_state not in", values, "calendarState");
            return (Criteria) this;
        }

        public Criteria andCalendarStateBetween(Integer value1, Integer value2) {
            addCriterion("calendar_state between", value1, value2, "calendarState");
            return (Criteria) this;
        }

        public Criteria andCalendarStateNotBetween(Integer value1, Integer value2) {
            addCriterion("calendar_state not between", value1, value2, "calendarState");
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