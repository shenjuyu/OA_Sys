package com.sjy.OA_Sys.bean;

import java.util.ArrayList;
import java.sql.Timestamp;
import java.util.List;

public class AttSheetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AttSheetExample() {
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

        public Criteria andAttSheetTimeStartIsNull() {
            addCriterion("att_sheet_time_start is null");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeStartIsNotNull() {
            addCriterion("att_sheet_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeStartEqualTo(Timestamp value) {
            addCriterion("att_sheet_time_start =", value, "attSheetTimeStart");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeStartNotEqualTo(Timestamp value) {
            addCriterion("att_sheet_time_start <>", value, "attSheetTimeStart");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeStartGreaterThan(Timestamp value) {
            addCriterion("att_sheet_time_start >", value, "attSheetTimeStart");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeStartGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("att_sheet_time_start >=", value, "attSheetTimeStart");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeStartLessThan(Timestamp value) {
            addCriterion("att_sheet_time_start <", value, "attSheetTimeStart");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeStartLessThanOrEqualTo(Timestamp value) {
            addCriterion("att_sheet_time_start <=", value, "attSheetTimeStart");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeStartIn(List<Timestamp> values) {
            addCriterion("att_sheet_time_start in", values, "attSheetTimeStart");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeStartNotIn(List<Timestamp> values) {
            addCriterion("att_sheet_time_start not in", values, "attSheetTimeStart");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeStartBetween(Timestamp value1, Timestamp value2) {
            addCriterion("att_sheet_time_start between", value1, value2, "attSheetTimeStart");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeStartNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("att_sheet_time_start not between", value1, value2, "attSheetTimeStart");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeEndIsNull() {
            addCriterion("att_sheet_time_end is null");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeEndIsNotNull() {
            addCriterion("att_sheet_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeEndEqualTo(Timestamp value) {
            addCriterion("att_sheet_time_end =", value, "attSheetTimeEnd");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeEndNotEqualTo(Timestamp value) {
            addCriterion("att_sheet_time_end <>", value, "attSheetTimeEnd");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeEndGreaterThan(Timestamp value) {
            addCriterion("att_sheet_time_end >", value, "attSheetTimeEnd");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeEndGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("att_sheet_time_end >=", value, "attSheetTimeEnd");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeEndLessThan(Timestamp value) {
            addCriterion("att_sheet_time_end <", value, "attSheetTimeEnd");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeEndLessThanOrEqualTo(Timestamp value) {
            addCriterion("att_sheet_time_end <=", value, "attSheetTimeEnd");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeEndIn(List<Timestamp> values) {
            addCriterion("att_sheet_time_end in", values, "attSheetTimeEnd");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeEndNotIn(List<Timestamp> values) {
            addCriterion("att_sheet_time_end not in", values, "attSheetTimeEnd");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeEndBetween(Timestamp value1, Timestamp value2) {
            addCriterion("att_sheet_time_end between", value1, value2, "attSheetTimeEnd");
            return (Criteria) this;
        }

        public Criteria andAttSheetTimeEndNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("att_sheet_time_end not between", value1, value2, "attSheetTimeEnd");
            return (Criteria) this;
        }

        public Criteria andAttSheetSituationIsNull() {
            addCriterion("att_sheet_situation is null");
            return (Criteria) this;
        }

        public Criteria andAttSheetSituationIsNotNull() {
            addCriterion("att_sheet_situation is not null");
            return (Criteria) this;
        }

        public Criteria andAttSheetSituationEqualTo(Integer value) {
            addCriterion("att_sheet_situation =", value, "attSheetSituation");
            return (Criteria) this;
        }

        public Criteria andAttSheetSituationNotEqualTo(Integer value) {
            addCriterion("att_sheet_situation <>", value, "attSheetSituation");
            return (Criteria) this;
        }

        public Criteria andAttSheetSituationGreaterThan(Integer value) {
            addCriterion("att_sheet_situation >", value, "attSheetSituation");
            return (Criteria) this;
        }

        public Criteria andAttSheetSituationGreaterThanOrEqualTo(Integer value) {
            addCriterion("att_sheet_situation >=", value, "attSheetSituation");
            return (Criteria) this;
        }

        public Criteria andAttSheetSituationLessThan(Integer value) {
            addCriterion("att_sheet_situation <", value, "attSheetSituation");
            return (Criteria) this;
        }

        public Criteria andAttSheetSituationLessThanOrEqualTo(Integer value) {
            addCriterion("att_sheet_situation <=", value, "attSheetSituation");
            return (Criteria) this;
        }

        public Criteria andAttSheetSituationIn(List<Integer> values) {
            addCriterion("att_sheet_situation in", values, "attSheetSituation");
            return (Criteria) this;
        }

        public Criteria andAttSheetSituationNotIn(List<Integer> values) {
            addCriterion("att_sheet_situation not in", values, "attSheetSituation");
            return (Criteria) this;
        }

        public Criteria andAttSheetSituationBetween(Integer value1, Integer value2) {
            addCriterion("att_sheet_situation between", value1, value2, "attSheetSituation");
            return (Criteria) this;
        }

        public Criteria andAttSheetSituationNotBetween(Integer value1, Integer value2) {
            addCriterion("att_sheet_situation not between", value1, value2, "attSheetSituation");
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