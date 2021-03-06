package com.sjy.OA_Sys.bean;

import java.util.ArrayList;
import java.util.List;

public class TaskGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskGroupExample() {
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

        public Criteria andTaskGroupNameIsNull() {
            addCriterion("task_group_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameIsNotNull() {
            addCriterion("task_group_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameEqualTo(String value) {
            addCriterion("task_group_name =", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameNotEqualTo(String value) {
            addCriterion("task_group_name <>", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameGreaterThan(String value) {
            addCriterion("task_group_name >", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_group_name >=", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameLessThan(String value) {
            addCriterion("task_group_name <", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameLessThanOrEqualTo(String value) {
            addCriterion("task_group_name <=", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameLike(String value) {
            addCriterion("task_group_name like", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameNotLike(String value) {
            addCriterion("task_group_name not like", value, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameIn(List<String> values) {
            addCriterion("task_group_name in", values, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameNotIn(List<String> values) {
            addCriterion("task_group_name not in", values, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameBetween(String value1, String value2) {
            addCriterion("task_group_name between", value1, value2, "taskGroupName");
            return (Criteria) this;
        }

        public Criteria andTaskGroupNameNotBetween(String value1, String value2) {
            addCriterion("task_group_name not between", value1, value2, "taskGroupName");
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

        public Criteria andTaskGroupPowerIsNull() {
            addCriterion("task_group_power is null");
            return (Criteria) this;
        }

        public Criteria andTaskGroupPowerIsNotNull() {
            addCriterion("task_group_power is not null");
            return (Criteria) this;
        }

        public Criteria andTaskGroupPowerEqualTo(Integer value) {
            addCriterion("task_group_power =", value, "taskGroupPower");
            return (Criteria) this;
        }

        public Criteria andTaskGroupPowerNotEqualTo(Integer value) {
            addCriterion("task_group_power <>", value, "taskGroupPower");
            return (Criteria) this;
        }

        public Criteria andTaskGroupPowerGreaterThan(Integer value) {
            addCriterion("task_group_power >", value, "taskGroupPower");
            return (Criteria) this;
        }

        public Criteria andTaskGroupPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_group_power >=", value, "taskGroupPower");
            return (Criteria) this;
        }

        public Criteria andTaskGroupPowerLessThan(Integer value) {
            addCriterion("task_group_power <", value, "taskGroupPower");
            return (Criteria) this;
        }

        public Criteria andTaskGroupPowerLessThanOrEqualTo(Integer value) {
            addCriterion("task_group_power <=", value, "taskGroupPower");
            return (Criteria) this;
        }

        public Criteria andTaskGroupPowerIn(List<Integer> values) {
            addCriterion("task_group_power in", values, "taskGroupPower");
            return (Criteria) this;
        }

        public Criteria andTaskGroupPowerNotIn(List<Integer> values) {
            addCriterion("task_group_power not in", values, "taskGroupPower");
            return (Criteria) this;
        }

        public Criteria andTaskGroupPowerBetween(Integer value1, Integer value2) {
            addCriterion("task_group_power between", value1, value2, "taskGroupPower");
            return (Criteria) this;
        }

        public Criteria andTaskGroupPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("task_group_power not between", value1, value2, "taskGroupPower");
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