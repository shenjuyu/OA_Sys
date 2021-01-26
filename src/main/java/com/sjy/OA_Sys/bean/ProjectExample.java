package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(Integer value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(Integer value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(Integer value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(Integer value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(Integer value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<Integer> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<Integer> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(Integer value1, Integer value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
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

        public Criteria andProNaemIsNull() {
            addCriterion("pro_naem is null");
            return (Criteria) this;
        }

        public Criteria andProNaemIsNotNull() {
            addCriterion("pro_naem is not null");
            return (Criteria) this;
        }

        public Criteria andProNaemEqualTo(String value) {
            addCriterion("pro_naem =", value, "proNaem");
            return (Criteria) this;
        }

        public Criteria andProNaemNotEqualTo(String value) {
            addCriterion("pro_naem <>", value, "proNaem");
            return (Criteria) this;
        }

        public Criteria andProNaemGreaterThan(String value) {
            addCriterion("pro_naem >", value, "proNaem");
            return (Criteria) this;
        }

        public Criteria andProNaemGreaterThanOrEqualTo(String value) {
            addCriterion("pro_naem >=", value, "proNaem");
            return (Criteria) this;
        }

        public Criteria andProNaemLessThan(String value) {
            addCriterion("pro_naem <", value, "proNaem");
            return (Criteria) this;
        }

        public Criteria andProNaemLessThanOrEqualTo(String value) {
            addCriterion("pro_naem <=", value, "proNaem");
            return (Criteria) this;
        }

        public Criteria andProNaemLike(String value) {
            addCriterion("pro_naem like", value, "proNaem");
            return (Criteria) this;
        }

        public Criteria andProNaemNotLike(String value) {
            addCriterion("pro_naem not like", value, "proNaem");
            return (Criteria) this;
        }

        public Criteria andProNaemIn(List<String> values) {
            addCriterion("pro_naem in", values, "proNaem");
            return (Criteria) this;
        }

        public Criteria andProNaemNotIn(List<String> values) {
            addCriterion("pro_naem not in", values, "proNaem");
            return (Criteria) this;
        }

        public Criteria andProNaemBetween(String value1, String value2) {
            addCriterion("pro_naem between", value1, value2, "proNaem");
            return (Criteria) this;
        }

        public Criteria andProNaemNotBetween(String value1, String value2) {
            addCriterion("pro_naem not between", value1, value2, "proNaem");
            return (Criteria) this;
        }

        public Criteria andProTimeCreIsNull() {
            addCriterion("pro_time_cre is null");
            return (Criteria) this;
        }

        public Criteria andProTimeCreIsNotNull() {
            addCriterion("pro_time_cre is not null");
            return (Criteria) this;
        }

        public Criteria andProTimeCreEqualTo(Timestamp value) {
            addCriterion("pro_time_cre =", value, "proTimeCre");
            return (Criteria) this;
        }

        public Criteria andProTimeCreNotEqualTo(Timestamp value) {
            addCriterion("pro_time_cre <>", value, "proTimeCre");
            return (Criteria) this;
        }

        public Criteria andProTimeCreGreaterThan(Timestamp value) {
            addCriterion("pro_time_cre >", value, "proTimeCre");
            return (Criteria) this;
        }

        public Criteria andProTimeCreGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("pro_time_cre >=", value, "proTimeCre");
            return (Criteria) this;
        }

        public Criteria andProTimeCreLessThan(Timestamp value) {
            addCriterion("pro_time_cre <", value, "proTimeCre");
            return (Criteria) this;
        }

        public Criteria andProTimeCreLessThanOrEqualTo(Timestamp value) {
            addCriterion("pro_time_cre <=", value, "proTimeCre");
            return (Criteria) this;
        }

        public Criteria andProTimeCreIn(List<Timestamp> values) {
            addCriterion("pro_time_cre in", values, "proTimeCre");
            return (Criteria) this;
        }

        public Criteria andProTimeCreNotIn(List<Timestamp> values) {
            addCriterion("pro_time_cre not in", values, "proTimeCre");
            return (Criteria) this;
        }

        public Criteria andProTimeCreBetween(Timestamp value1, Timestamp value2) {
            addCriterion("pro_time_cre between", value1, value2, "proTimeCre");
            return (Criteria) this;
        }

        public Criteria andProTimeCreNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("pro_time_cre not between", value1, value2, "proTimeCre");
            return (Criteria) this;
        }

        public Criteria andProTimeStartIsNull() {
            addCriterion("pro_time_start is null");
            return (Criteria) this;
        }

        public Criteria andProTimeStartIsNotNull() {
            addCriterion("pro_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andProTimeStartEqualTo(Timestamp value) {
            addCriterion("pro_time_start =", value, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartNotEqualTo(Timestamp value) {
            addCriterion("pro_time_start <>", value, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartGreaterThan(Timestamp value) {
            addCriterion("pro_time_start >", value, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("pro_time_start >=", value, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartLessThan(Timestamp value) {
            addCriterion("pro_time_start <", value, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartLessThanOrEqualTo(Timestamp value) {
            addCriterion("pro_time_start <=", value, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartIn(List<Timestamp> values) {
            addCriterion("pro_time_start in", values, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartNotIn(List<Timestamp> values) {
            addCriterion("pro_time_start not in", values, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartBetween(Timestamp value1, Timestamp value2) {
            addCriterion("pro_time_start between", value1, value2, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("pro_time_start not between", value1, value2, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeEndIsNull() {
            addCriterion("pro_time_end is null");
            return (Criteria) this;
        }

        public Criteria andProTimeEndIsNotNull() {
            addCriterion("pro_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andProTimeEndEqualTo(Timestamp value) {
            addCriterion("pro_time_end =", value, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndNotEqualTo(Timestamp value) {
            addCriterion("pro_time_end <>", value, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndGreaterThan(Timestamp value) {
            addCriterion("pro_time_end >", value, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("pro_time_end >=", value, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndLessThan(Timestamp value) {
            addCriterion("pro_time_end <", value, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndLessThanOrEqualTo(Timestamp value) {
            addCriterion("pro_time_end <=", value, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndIn(List<Timestamp> values) {
            addCriterion("pro_time_end in", values, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndNotIn(List<Timestamp> values) {
            addCriterion("pro_time_end not in", values, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndBetween(Timestamp value1, Timestamp value2) {
            addCriterion("pro_time_end between", value1, value2, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("pro_time_end not between", value1, value2, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProRateProgressIsNull() {
            addCriterion("pro_rate_progress is null");
            return (Criteria) this;
        }

        public Criteria andProRateProgressIsNotNull() {
            addCriterion("pro_rate_progress is not null");
            return (Criteria) this;
        }

        public Criteria andProRateProgressEqualTo(String value) {
            addCriterion("pro_rate_progress =", value, "proRateProgress");
            return (Criteria) this;
        }

        public Criteria andProRateProgressNotEqualTo(String value) {
            addCriterion("pro_rate_progress <>", value, "proRateProgress");
            return (Criteria) this;
        }

        public Criteria andProRateProgressGreaterThan(String value) {
            addCriterion("pro_rate_progress >", value, "proRateProgress");
            return (Criteria) this;
        }

        public Criteria andProRateProgressGreaterThanOrEqualTo(String value) {
            addCriterion("pro_rate_progress >=", value, "proRateProgress");
            return (Criteria) this;
        }

        public Criteria andProRateProgressLessThan(String value) {
            addCriterion("pro_rate_progress <", value, "proRateProgress");
            return (Criteria) this;
        }

        public Criteria andProRateProgressLessThanOrEqualTo(String value) {
            addCriterion("pro_rate_progress <=", value, "proRateProgress");
            return (Criteria) this;
        }

        public Criteria andProRateProgressLike(String value) {
            addCriterion("pro_rate_progress like", value, "proRateProgress");
            return (Criteria) this;
        }

        public Criteria andProRateProgressNotLike(String value) {
            addCriterion("pro_rate_progress not like", value, "proRateProgress");
            return (Criteria) this;
        }

        public Criteria andProRateProgressIn(List<String> values) {
            addCriterion("pro_rate_progress in", values, "proRateProgress");
            return (Criteria) this;
        }

        public Criteria andProRateProgressNotIn(List<String> values) {
            addCriterion("pro_rate_progress not in", values, "proRateProgress");
            return (Criteria) this;
        }

        public Criteria andProRateProgressBetween(String value1, String value2) {
            addCriterion("pro_rate_progress between", value1, value2, "proRateProgress");
            return (Criteria) this;
        }

        public Criteria andProRateProgressNotBetween(String value1, String value2) {
            addCriterion("pro_rate_progress not between", value1, value2, "proRateProgress");
            return (Criteria) this;
        }

        public Criteria andProStateIsNull() {
            addCriterion("pro_state is null");
            return (Criteria) this;
        }

        public Criteria andProStateIsNotNull() {
            addCriterion("pro_state is not null");
            return (Criteria) this;
        }

        public Criteria andProStateEqualTo(Integer value) {
            addCriterion("pro_state =", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateNotEqualTo(Integer value) {
            addCriterion("pro_state <>", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateGreaterThan(Integer value) {
            addCriterion("pro_state >", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pro_state >=", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateLessThan(Integer value) {
            addCriterion("pro_state <", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateLessThanOrEqualTo(Integer value) {
            addCriterion("pro_state <=", value, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateIn(List<Integer> values) {
            addCriterion("pro_state in", values, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateNotIn(List<Integer> values) {
            addCriterion("pro_state not in", values, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateBetween(Integer value1, Integer value2) {
            addCriterion("pro_state between", value1, value2, "proState");
            return (Criteria) this;
        }

        public Criteria andProStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pro_state not between", value1, value2, "proState");
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