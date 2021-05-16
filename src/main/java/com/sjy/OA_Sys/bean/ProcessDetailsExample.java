package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ProcessDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcessDetailsExample() {
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

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(Integer value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(Integer value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(Integer value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(Integer value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(Integer value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<Integer> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<Integer> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(Integer value1, Integer value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("process_id not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessStageIsNull() {
            addCriterion("process_stage is null");
            return (Criteria) this;
        }

        public Criteria andProcessStageIsNotNull() {
            addCriterion("process_stage is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStageEqualTo(Integer value) {
            addCriterion("process_stage =", value, "processStage");
            return (Criteria) this;
        }

        public Criteria andProcessStageNotEqualTo(Integer value) {
            addCriterion("process_stage <>", value, "processStage");
            return (Criteria) this;
        }

        public Criteria andProcessStageGreaterThan(Integer value) {
            addCriterion("process_stage >", value, "processStage");
            return (Criteria) this;
        }

        public Criteria andProcessStageGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_stage >=", value, "processStage");
            return (Criteria) this;
        }

        public Criteria andProcessStageLessThan(Integer value) {
            addCriterion("process_stage <", value, "processStage");
            return (Criteria) this;
        }

        public Criteria andProcessStageLessThanOrEqualTo(Integer value) {
            addCriterion("process_stage <=", value, "processStage");
            return (Criteria) this;
        }

        public Criteria andProcessStageIn(List<Integer> values) {
            addCriterion("process_stage in", values, "processStage");
            return (Criteria) this;
        }

        public Criteria andProcessStageNotIn(List<Integer> values) {
            addCriterion("process_stage not in", values, "processStage");
            return (Criteria) this;
        }

        public Criteria andProcessStageBetween(Integer value1, Integer value2) {
            addCriterion("process_stage between", value1, value2, "processStage");
            return (Criteria) this;
        }

        public Criteria andProcessStageNotBetween(Integer value1, Integer value2) {
            addCriterion("process_stage not between", value1, value2, "processStage");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffIsNull() {
            addCriterion("approved_staff is null");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffIsNotNull() {
            addCriterion("approved_staff is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffEqualTo(String value) {
            addCriterion("approved_staff =", value, "approvedStaff");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffNotEqualTo(String value) {
            addCriterion("approved_staff <>", value, "approvedStaff");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffGreaterThan(String value) {
            addCriterion("approved_staff >", value, "approvedStaff");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffGreaterThanOrEqualTo(String value) {
            addCriterion("approved_staff >=", value, "approvedStaff");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffLessThan(String value) {
            addCriterion("approved_staff <", value, "approvedStaff");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffLessThanOrEqualTo(String value) {
            addCriterion("approved_staff <=", value, "approvedStaff");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffLike(String value) {
            addCriterion("approved_staff like", value, "approvedStaff");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffNotLike(String value) {
            addCriterion("approved_staff not like", value, "approvedStaff");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffIn(List<String> values) {
            addCriterion("approved_staff in", values, "approvedStaff");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffNotIn(List<String> values) {
            addCriterion("approved_staff not in", values, "approvedStaff");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffBetween(String value1, String value2) {
            addCriterion("approved_staff between", value1, value2, "approvedStaff");
            return (Criteria) this;
        }

        public Criteria andApprovedStaffNotBetween(String value1, String value2) {
            addCriterion("approved_staff not between", value1, value2, "approvedStaff");
            return (Criteria) this;
        }

        public Criteria andApprovedResultIsNull() {
            addCriterion("approved_result is null");
            return (Criteria) this;
        }

        public Criteria andApprovedResultIsNotNull() {
            addCriterion("approved_result is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedResultEqualTo(Integer value) {
            addCriterion("approved_result =", value, "approvedResult");
            return (Criteria) this;
        }

        public Criteria andApprovedResultNotEqualTo(Integer value) {
            addCriterion("approved_result <>", value, "approvedResult");
            return (Criteria) this;
        }

        public Criteria andApprovedResultGreaterThan(Integer value) {
            addCriterion("approved_result >", value, "approvedResult");
            return (Criteria) this;
        }

        public Criteria andApprovedResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("approved_result >=", value, "approvedResult");
            return (Criteria) this;
        }

        public Criteria andApprovedResultLessThan(Integer value) {
            addCriterion("approved_result <", value, "approvedResult");
            return (Criteria) this;
        }

        public Criteria andApprovedResultLessThanOrEqualTo(Integer value) {
            addCriterion("approved_result <=", value, "approvedResult");
            return (Criteria) this;
        }

        public Criteria andApprovedResultIn(List<Integer> values) {
            addCriterion("approved_result in", values, "approvedResult");
            return (Criteria) this;
        }

        public Criteria andApprovedResultNotIn(List<Integer> values) {
            addCriterion("approved_result not in", values, "approvedResult");
            return (Criteria) this;
        }

        public Criteria andApprovedResultBetween(Integer value1, Integer value2) {
            addCriterion("approved_result between", value1, value2, "approvedResult");
            return (Criteria) this;
        }

        public Criteria andApprovedResultNotBetween(Integer value1, Integer value2) {
            addCriterion("approved_result not between", value1, value2, "approvedResult");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeIsNull() {
            addCriterion("approved_time is null");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeIsNotNull() {
            addCriterion("approved_time is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeEqualTo(Timestamp value) {
            addCriterion("approved_time =", value, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeNotEqualTo(Timestamp value) {
            addCriterion("approved_time <>", value, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeGreaterThan(Timestamp value) {
            addCriterion("approved_time >", value, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("approved_time >=", value, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeLessThan(Timestamp value) {
            addCriterion("approved_time <", value, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("approved_time <=", value, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeIn(List<Timestamp> values) {
            addCriterion("approved_time in", values, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeNotIn(List<Timestamp> values) {
            addCriterion("approved_time not in", values, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("approved_time between", value1, value2, "approvedTime");
            return (Criteria) this;
        }

        public Criteria andApprovedTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("approved_time not between", value1, value2, "approvedTime");
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