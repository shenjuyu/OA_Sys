package com.sjy.OA_Sys.bean;

import java.util.ArrayList;
import java.util.List;

public class StaffRankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffRankExample() {
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

        public Criteria andRankIdIsNull() {
            addCriterion("rank_id is null");
            return (Criteria) this;
        }

        public Criteria andRankIdIsNotNull() {
            addCriterion("rank_id is not null");
            return (Criteria) this;
        }

        public Criteria andRankIdEqualTo(Integer value) {
            addCriterion("rank_id =", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotEqualTo(Integer value) {
            addCriterion("rank_id <>", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdGreaterThan(Integer value) {
            addCriterion("rank_id >", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_id >=", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdLessThan(Integer value) {
            addCriterion("rank_id <", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdLessThanOrEqualTo(Integer value) {
            addCriterion("rank_id <=", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdIn(List<Integer> values) {
            addCriterion("rank_id in", values, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotIn(List<Integer> values) {
            addCriterion("rank_id not in", values, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdBetween(Integer value1, Integer value2) {
            addCriterion("rank_id between", value1, value2, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_id not between", value1, value2, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankSequenceIsNull() {
            addCriterion("rank_sequence is null");
            return (Criteria) this;
        }

        public Criteria andRankSequenceIsNotNull() {
            addCriterion("rank_sequence is not null");
            return (Criteria) this;
        }

        public Criteria andRankSequenceEqualTo(String value) {
            addCriterion("rank_sequence =", value, "rankSequence");
            return (Criteria) this;
        }

        public Criteria andRankSequenceNotEqualTo(String value) {
            addCriterion("rank_sequence <>", value, "rankSequence");
            return (Criteria) this;
        }

        public Criteria andRankSequenceGreaterThan(String value) {
            addCriterion("rank_sequence >", value, "rankSequence");
            return (Criteria) this;
        }

        public Criteria andRankSequenceGreaterThanOrEqualTo(String value) {
            addCriterion("rank_sequence >=", value, "rankSequence");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLessThan(String value) {
            addCriterion("rank_sequence <", value, "rankSequence");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLessThanOrEqualTo(String value) {
            addCriterion("rank_sequence <=", value, "rankSequence");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLike(String value) {
            addCriterion("rank_sequence like", value, "rankSequence");
            return (Criteria) this;
        }

        public Criteria andRankSequenceNotLike(String value) {
            addCriterion("rank_sequence not like", value, "rankSequence");
            return (Criteria) this;
        }

        public Criteria andRankSequenceIn(List<String> values) {
            addCriterion("rank_sequence in", values, "rankSequence");
            return (Criteria) this;
        }

        public Criteria andRankSequenceNotIn(List<String> values) {
            addCriterion("rank_sequence not in", values, "rankSequence");
            return (Criteria) this;
        }

        public Criteria andRankSequenceBetween(String value1, String value2) {
            addCriterion("rank_sequence between", value1, value2, "rankSequence");
            return (Criteria) this;
        }

        public Criteria andRankSequenceNotBetween(String value1, String value2) {
            addCriterion("rank_sequence not between", value1, value2, "rankSequence");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLevelIsNull() {
            addCriterion("rank_sequence_level is null");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLevelIsNotNull() {
            addCriterion("rank_sequence_level is not null");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLevelEqualTo(Integer value) {
            addCriterion("rank_sequence_level =", value, "rankSequenceLevel");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLevelNotEqualTo(Integer value) {
            addCriterion("rank_sequence_level <>", value, "rankSequenceLevel");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLevelGreaterThan(Integer value) {
            addCriterion("rank_sequence_level >", value, "rankSequenceLevel");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_sequence_level >=", value, "rankSequenceLevel");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLevelLessThan(Integer value) {
            addCriterion("rank_sequence_level <", value, "rankSequenceLevel");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLevelLessThanOrEqualTo(Integer value) {
            addCriterion("rank_sequence_level <=", value, "rankSequenceLevel");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLevelIn(List<Integer> values) {
            addCriterion("rank_sequence_level in", values, "rankSequenceLevel");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLevelNotIn(List<Integer> values) {
            addCriterion("rank_sequence_level not in", values, "rankSequenceLevel");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLevelBetween(Integer value1, Integer value2) {
            addCriterion("rank_sequence_level between", value1, value2, "rankSequenceLevel");
            return (Criteria) this;
        }

        public Criteria andRankSequenceLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_sequence_level not between", value1, value2, "rankSequenceLevel");
            return (Criteria) this;
        }

        public Criteria andRankNameIsNull() {
            addCriterion("rank_name is null");
            return (Criteria) this;
        }

        public Criteria andRankNameIsNotNull() {
            addCriterion("rank_name is not null");
            return (Criteria) this;
        }

        public Criteria andRankNameEqualTo(String value) {
            addCriterion("rank_name =", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotEqualTo(String value) {
            addCriterion("rank_name <>", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameGreaterThan(String value) {
            addCriterion("rank_name >", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameGreaterThanOrEqualTo(String value) {
            addCriterion("rank_name >=", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameLessThan(String value) {
            addCriterion("rank_name <", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameLessThanOrEqualTo(String value) {
            addCriterion("rank_name <=", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameLike(String value) {
            addCriterion("rank_name like", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotLike(String value) {
            addCriterion("rank_name not like", value, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameIn(List<String> values) {
            addCriterion("rank_name in", values, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotIn(List<String> values) {
            addCriterion("rank_name not in", values, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameBetween(String value1, String value2) {
            addCriterion("rank_name between", value1, value2, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankNameNotBetween(String value1, String value2) {
            addCriterion("rank_name not between", value1, value2, "rankName");
            return (Criteria) this;
        }

        public Criteria andRankStateIsNull() {
            addCriterion("rank_state is null");
            return (Criteria) this;
        }

        public Criteria andRankStateIsNotNull() {
            addCriterion("rank_state is not null");
            return (Criteria) this;
        }

        public Criteria andRankStateEqualTo(Integer value) {
            addCriterion("rank_state =", value, "rankState");
            return (Criteria) this;
        }

        public Criteria andRankStateNotEqualTo(Integer value) {
            addCriterion("rank_state <>", value, "rankState");
            return (Criteria) this;
        }

        public Criteria andRankStateGreaterThan(Integer value) {
            addCriterion("rank_state >", value, "rankState");
            return (Criteria) this;
        }

        public Criteria andRankStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_state >=", value, "rankState");
            return (Criteria) this;
        }

        public Criteria andRankStateLessThan(Integer value) {
            addCriterion("rank_state <", value, "rankState");
            return (Criteria) this;
        }

        public Criteria andRankStateLessThanOrEqualTo(Integer value) {
            addCriterion("rank_state <=", value, "rankState");
            return (Criteria) this;
        }

        public Criteria andRankStateIn(List<Integer> values) {
            addCriterion("rank_state in", values, "rankState");
            return (Criteria) this;
        }

        public Criteria andRankStateNotIn(List<Integer> values) {
            addCriterion("rank_state not in", values, "rankState");
            return (Criteria) this;
        }

        public Criteria andRankStateBetween(Integer value1, Integer value2) {
            addCriterion("rank_state between", value1, value2, "rankState");
            return (Criteria) this;
        }

        public Criteria andRankStateNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_state not between", value1, value2, "rankState");
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