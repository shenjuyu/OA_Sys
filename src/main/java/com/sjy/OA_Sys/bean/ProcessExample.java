package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcessExample() {
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

        public Criteria andProcessTypeIsNull() {
            addCriterion("process_type is null");
            return (Criteria) this;
        }

        public Criteria andProcessTypeIsNotNull() {
            addCriterion("process_type is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTypeEqualTo(Integer value) {
            addCriterion("process_type =", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeNotEqualTo(Integer value) {
            addCriterion("process_type <>", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeGreaterThan(Integer value) {
            addCriterion("process_type >", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_type >=", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeLessThan(Integer value) {
            addCriterion("process_type <", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeLessThanOrEqualTo(Integer value) {
            addCriterion("process_type <=", value, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeIn(List<Integer> values) {
            addCriterion("process_type in", values, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeNotIn(List<Integer> values) {
            addCriterion("process_type not in", values, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeBetween(Integer value1, Integer value2) {
            addCriterion("process_type between", value1, value2, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("process_type not between", value1, value2, "processType");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantIsNull() {
            addCriterion("process_applicant is null");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantIsNotNull() {
            addCriterion("process_applicant is not null");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantEqualTo(String value) {
            addCriterion("process_applicant =", value, "processApplicant");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantNotEqualTo(String value) {
            addCriterion("process_applicant <>", value, "processApplicant");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantGreaterThan(String value) {
            addCriterion("process_applicant >", value, "processApplicant");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantGreaterThanOrEqualTo(String value) {
            addCriterion("process_applicant >=", value, "processApplicant");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantLessThan(String value) {
            addCriterion("process_applicant <", value, "processApplicant");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantLessThanOrEqualTo(String value) {
            addCriterion("process_applicant <=", value, "processApplicant");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantLike(String value) {
            addCriterion("process_applicant like", value, "processApplicant");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantNotLike(String value) {
            addCriterion("process_applicant not like", value, "processApplicant");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantIn(List<String> values) {
            addCriterion("process_applicant in", values, "processApplicant");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantNotIn(List<String> values) {
            addCriterion("process_applicant not in", values, "processApplicant");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantBetween(String value1, String value2) {
            addCriterion("process_applicant between", value1, value2, "processApplicant");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantNotBetween(String value1, String value2) {
            addCriterion("process_applicant not between", value1, value2, "processApplicant");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantTimeIsNull() {
            addCriterion("process_applicant_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantTimeIsNotNull() {
            addCriterion("process_applicant_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantTimeEqualTo(Timestamp value) {
            addCriterion("process_applicant_time =", value, "processApplicantTime");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantTimeNotEqualTo(Timestamp value) {
            addCriterion("process_applicant_time <>", value, "processApplicantTime");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantTimeGreaterThan(Timestamp value) {
            addCriterion("process_applicant_time >", value, "processApplicantTime");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("process_applicant_time >=", value, "processApplicantTime");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantTimeLessThan(Timestamp value) {
            addCriterion("process_applicant_time <", value, "processApplicantTime");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("process_applicant_time <=", value, "processApplicantTime");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantTimeIn(List<Timestamp> values) {
            addCriterion("process_applicant_time in", values, "processApplicantTime");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantTimeNotIn(List<Timestamp> values) {
            addCriterion("process_applicant_time not in", values, "processApplicantTime");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("process_applicant_time between", value1, value2, "processApplicantTime");
            return (Criteria) this;
        }

        public Criteria andProcessApplicantTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("process_applicant_time not between", value1, value2, "processApplicantTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeIsNull() {
            addCriterion("process_start_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeIsNotNull() {
            addCriterion("process_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeEqualTo(Timestamp value) {
            addCriterion("process_start_time =", value, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeNotEqualTo(Timestamp value) {
            addCriterion("process_start_time <>", value, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeGreaterThan(Timestamp value) {
            addCriterion("process_start_time >", value, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("process_start_time >=", value, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeLessThan(Timestamp value) {
            addCriterion("process_start_time <", value, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("process_start_time <=", value, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeIn(List<Timestamp> values) {
            addCriterion("process_start_time in", values, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeNotIn(List<Timestamp> values) {
            addCriterion("process_start_time not in", values, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("process_start_time between", value1, value2, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("process_start_time not between", value1, value2, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeIsNull() {
            addCriterion("process_end_time is null");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeIsNotNull() {
            addCriterion("process_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeEqualTo(Timestamp value) {
            addCriterion("process_end_time =", value, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeNotEqualTo(Timestamp value) {
            addCriterion("process_end_time <>", value, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeGreaterThan(Timestamp value) {
            addCriterion("process_end_time >", value, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("process_end_time >=", value, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeLessThan(Timestamp value) {
            addCriterion("process_end_time <", value, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("process_end_time <=", value, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeIn(List<Timestamp> values) {
            addCriterion("process_end_time in", values, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeNotIn(List<Timestamp> values) {
            addCriterion("process_end_time not in", values, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("process_end_time between", value1, value2, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("process_end_time not between", value1, value2, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffIsNull() {
            addCriterion("process_task_to_staff is null");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffIsNotNull() {
            addCriterion("process_task_to_staff is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffEqualTo(String value) {
            addCriterion("process_task_to_staff =", value, "processTaskToStaff");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffNotEqualTo(String value) {
            addCriterion("process_task_to_staff <>", value, "processTaskToStaff");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffGreaterThan(String value) {
            addCriterion("process_task_to_staff >", value, "processTaskToStaff");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffGreaterThanOrEqualTo(String value) {
            addCriterion("process_task_to_staff >=", value, "processTaskToStaff");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffLessThan(String value) {
            addCriterion("process_task_to_staff <", value, "processTaskToStaff");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffLessThanOrEqualTo(String value) {
            addCriterion("process_task_to_staff <=", value, "processTaskToStaff");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffLike(String value) {
            addCriterion("process_task_to_staff like", value, "processTaskToStaff");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffNotLike(String value) {
            addCriterion("process_task_to_staff not like", value, "processTaskToStaff");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffIn(List<String> values) {
            addCriterion("process_task_to_staff in", values, "processTaskToStaff");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffNotIn(List<String> values) {
            addCriterion("process_task_to_staff not in", values, "processTaskToStaff");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffBetween(String value1, String value2) {
            addCriterion("process_task_to_staff between", value1, value2, "processTaskToStaff");
            return (Criteria) this;
        }

        public Criteria andProcessTaskToStaffNotBetween(String value1, String value2) {
            addCriterion("process_task_to_staff not between", value1, value2, "processTaskToStaff");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseIsNull() {
            addCriterion("process_task_supervise is null");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseIsNotNull() {
            addCriterion("process_task_supervise is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseEqualTo(String value) {
            addCriterion("process_task_supervise =", value, "processTaskSupervise");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseNotEqualTo(String value) {
            addCriterion("process_task_supervise <>", value, "processTaskSupervise");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseGreaterThan(String value) {
            addCriterion("process_task_supervise >", value, "processTaskSupervise");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseGreaterThanOrEqualTo(String value) {
            addCriterion("process_task_supervise >=", value, "processTaskSupervise");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseLessThan(String value) {
            addCriterion("process_task_supervise <", value, "processTaskSupervise");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseLessThanOrEqualTo(String value) {
            addCriterion("process_task_supervise <=", value, "processTaskSupervise");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseLike(String value) {
            addCriterion("process_task_supervise like", value, "processTaskSupervise");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseNotLike(String value) {
            addCriterion("process_task_supervise not like", value, "processTaskSupervise");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseIn(List<String> values) {
            addCriterion("process_task_supervise in", values, "processTaskSupervise");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseNotIn(List<String> values) {
            addCriterion("process_task_supervise not in", values, "processTaskSupervise");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseBetween(String value1, String value2) {
            addCriterion("process_task_supervise between", value1, value2, "processTaskSupervise");
            return (Criteria) this;
        }

        public Criteria andProcessTaskSuperviseNotBetween(String value1, String value2) {
            addCriterion("process_task_supervise not between", value1, value2, "processTaskSupervise");
            return (Criteria) this;
        }

        public Criteria andProcessFinishIsNull() {
            addCriterion("process_finish is null");
            return (Criteria) this;
        }

        public Criteria andProcessFinishIsNotNull() {
            addCriterion("process_finish is not null");
            return (Criteria) this;
        }

        public Criteria andProcessFinishEqualTo(Integer value) {
            addCriterion("process_finish =", value, "processFinish");
            return (Criteria) this;
        }

        public Criteria andProcessFinishNotEqualTo(Integer value) {
            addCriterion("process_finish <>", value, "processFinish");
            return (Criteria) this;
        }

        public Criteria andProcessFinishGreaterThan(Integer value) {
            addCriterion("process_finish >", value, "processFinish");
            return (Criteria) this;
        }

        public Criteria andProcessFinishGreaterThanOrEqualTo(Integer value) {
            addCriterion("process_finish >=", value, "processFinish");
            return (Criteria) this;
        }

        public Criteria andProcessFinishLessThan(Integer value) {
            addCriterion("process_finish <", value, "processFinish");
            return (Criteria) this;
        }

        public Criteria andProcessFinishLessThanOrEqualTo(Integer value) {
            addCriterion("process_finish <=", value, "processFinish");
            return (Criteria) this;
        }

        public Criteria andProcessFinishIn(List<Integer> values) {
            addCriterion("process_finish in", values, "processFinish");
            return (Criteria) this;
        }

        public Criteria andProcessFinishNotIn(List<Integer> values) {
            addCriterion("process_finish not in", values, "processFinish");
            return (Criteria) this;
        }

        public Criteria andProcessFinishBetween(Integer value1, Integer value2) {
            addCriterion("process_finish between", value1, value2, "processFinish");
            return (Criteria) this;
        }

        public Criteria andProcessFinishNotBetween(Integer value1, Integer value2) {
            addCriterion("process_finish not between", value1, value2, "processFinish");
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