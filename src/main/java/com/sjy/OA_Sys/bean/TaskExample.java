package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartIsNull() {
            addCriterion("task_time_start is null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartIsNotNull() {
            addCriterion("task_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartEqualTo(Timestamp value) {
            addCriterion("task_time_start =", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartNotEqualTo(Timestamp value) {
            addCriterion("task_time_start <>", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartGreaterThan(Timestamp value) {
            addCriterion("task_time_start >", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("task_time_start >=", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartLessThan(Timestamp value) {
            addCriterion("task_time_start <", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartLessThanOrEqualTo(Timestamp value) {
            addCriterion("task_time_start <=", value, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartIn(List<Timestamp> values) {
            addCriterion("task_time_start in", values, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartNotIn(List<Timestamp> values) {
            addCriterion("task_time_start not in", values, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartBetween(Timestamp value1, Timestamp value2) {
            addCriterion("task_time_start between", value1, value2, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeStartNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("task_time_start not between", value1, value2, "taskTimeStart");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndIsNull() {
            addCriterion("task_time_end is null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndIsNotNull() {
            addCriterion("task_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndEqualTo(Timestamp value) {
            addCriterion("task_time_end =", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndNotEqualTo(Timestamp value) {
            addCriterion("task_time_end <>", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndGreaterThan(Timestamp value) {
            addCriterion("task_time_end >", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("task_time_end >=", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndLessThan(Timestamp value) {
            addCriterion("task_time_end <", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndLessThanOrEqualTo(Timestamp value) {
            addCriterion("task_time_end <=", value, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndIn(List<Timestamp> values) {
            addCriterion("task_time_end in", values, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndNotIn(List<Timestamp> values) {
            addCriterion("task_time_end not in", values, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndBetween(Timestamp value1, Timestamp value2) {
            addCriterion("task_time_end between", value1, value2, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskTimeEndNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("task_time_end not between", value1, value2, "taskTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressIsNull() {
            addCriterion("task_rate_progress is null");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressIsNotNull() {
            addCriterion("task_rate_progress is not null");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressEqualTo(String value) {
            addCriterion("task_rate_progress =", value, "taskRateProgress");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressNotEqualTo(String value) {
            addCriterion("task_rate_progress <>", value, "taskRateProgress");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressGreaterThan(String value) {
            addCriterion("task_rate_progress >", value, "taskRateProgress");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressGreaterThanOrEqualTo(String value) {
            addCriterion("task_rate_progress >=", value, "taskRateProgress");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressLessThan(String value) {
            addCriterion("task_rate_progress <", value, "taskRateProgress");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressLessThanOrEqualTo(String value) {
            addCriterion("task_rate_progress <=", value, "taskRateProgress");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressLike(String value) {
            addCriterion("task_rate_progress like", value, "taskRateProgress");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressNotLike(String value) {
            addCriterion("task_rate_progress not like", value, "taskRateProgress");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressIn(List<String> values) {
            addCriterion("task_rate_progress in", values, "taskRateProgress");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressNotIn(List<String> values) {
            addCriterion("task_rate_progress not in", values, "taskRateProgress");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressBetween(String value1, String value2) {
            addCriterion("task_rate_progress between", value1, value2, "taskRateProgress");
            return (Criteria) this;
        }

        public Criteria andTaskRateProgressNotBetween(String value1, String value2) {
            addCriterion("task_rate_progress not between", value1, value2, "taskRateProgress");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNull() {
            addCriterion("task_state is null");
            return (Criteria) this;
        }

        public Criteria andTaskStateIsNotNull() {
            addCriterion("task_state is not null");
            return (Criteria) this;
        }

        public Criteria andTaskStateEqualTo(Integer value) {
            addCriterion("task_state =", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotEqualTo(Integer value) {
            addCriterion("task_state <>", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThan(Integer value) {
            addCriterion("task_state >", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_state >=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThan(Integer value) {
            addCriterion("task_state <", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateLessThanOrEqualTo(Integer value) {
            addCriterion("task_state <=", value, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateIn(List<Integer> values) {
            addCriterion("task_state in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotIn(List<Integer> values) {
            addCriterion("task_state not in", values, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateBetween(Integer value1, Integer value2) {
            addCriterion("task_state between", value1, value2, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskStateNotBetween(Integer value1, Integer value2) {
            addCriterion("task_state not between", value1, value2, "taskState");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdIsNull() {
            addCriterion("task_group_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdIsNotNull() {
            addCriterion("task_group_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdEqualTo(String value) {
            addCriterion("task_group_id =", value, "taskGroupId");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdNotEqualTo(String value) {
            addCriterion("task_group_id <>", value, "taskGroupId");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdGreaterThan(String value) {
            addCriterion("task_group_id >", value, "taskGroupId");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_group_id >=", value, "taskGroupId");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdLessThan(String value) {
            addCriterion("task_group_id <", value, "taskGroupId");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdLessThanOrEqualTo(String value) {
            addCriterion("task_group_id <=", value, "taskGroupId");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdLike(String value) {
            addCriterion("task_group_id like", value, "taskGroupId");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdNotLike(String value) {
            addCriterion("task_group_id not like", value, "taskGroupId");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdIn(List<String> values) {
            addCriterion("task_group_id in", values, "taskGroupId");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdNotIn(List<String> values) {
            addCriterion("task_group_id not in", values, "taskGroupId");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdBetween(String value1, String value2) {
            addCriterion("task_group_id between", value1, value2, "taskGroupId");
            return (Criteria) this;
        }

        public Criteria andTaskGroupIdNotBetween(String value1, String value2) {
            addCriterion("task_group_id not between", value1, value2, "taskGroupId");
            return (Criteria) this;
        }

        public Criteria andProIdIsNull() {
            addCriterion("pro_id is null");
            return (Criteria) this;
        }

        public Criteria andProIdIsNotNull() {
            addCriterion("pro_id is not null");
            return (Criteria) this;
        }

        public Criteria andProIdEqualTo(String value) {
            addCriterion("pro_id =", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotEqualTo(String value) {
            addCriterion("pro_id <>", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThan(String value) {
            addCriterion("pro_id >", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdGreaterThanOrEqualTo(String value) {
            addCriterion("pro_id >=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThan(String value) {
            addCriterion("pro_id <", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLessThanOrEqualTo(String value) {
            addCriterion("pro_id <=", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdLike(String value) {
            addCriterion("pro_id like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotLike(String value) {
            addCriterion("pro_id not like", value, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdIn(List<String> values) {
            addCriterion("pro_id in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotIn(List<String> values) {
            addCriterion("pro_id not in", values, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdBetween(String value1, String value2) {
            addCriterion("pro_id between", value1, value2, "proId");
            return (Criteria) this;
        }

        public Criteria andProIdNotBetween(String value1, String value2) {
            addCriterion("pro_id not between", value1, value2, "proId");
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