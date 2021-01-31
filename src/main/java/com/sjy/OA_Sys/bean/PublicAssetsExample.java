package com.sjy.OA_Sys.bean;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class PublicAssetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PublicAssetsExample() {
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

        public Criteria andPubassIdIsNull() {
            addCriterion("pubass_id is null");
            return (Criteria) this;
        }

        public Criteria andPubassIdIsNotNull() {
            addCriterion("pubass_id is not null");
            return (Criteria) this;
        }

        public Criteria andPubassIdEqualTo(String value) {
            addCriterion("pubass_id =", value, "pubassId");
            return (Criteria) this;
        }

        public Criteria andPubassIdNotEqualTo(String value) {
            addCriterion("pubass_id <>", value, "pubassId");
            return (Criteria) this;
        }

        public Criteria andPubassIdGreaterThan(String value) {
            addCriterion("pubass_id >", value, "pubassId");
            return (Criteria) this;
        }

        public Criteria andPubassIdGreaterThanOrEqualTo(String value) {
            addCriterion("pubass_id >=", value, "pubassId");
            return (Criteria) this;
        }

        public Criteria andPubassIdLessThan(String value) {
            addCriterion("pubass_id <", value, "pubassId");
            return (Criteria) this;
        }

        public Criteria andPubassIdLessThanOrEqualTo(String value) {
            addCriterion("pubass_id <=", value, "pubassId");
            return (Criteria) this;
        }

        public Criteria andPubassIdLike(String value) {
            addCriterion("pubass_id like", value, "pubassId");
            return (Criteria) this;
        }

        public Criteria andPubassIdNotLike(String value) {
            addCriterion("pubass_id not like", value, "pubassId");
            return (Criteria) this;
        }

        public Criteria andPubassIdIn(List<String> values) {
            addCriterion("pubass_id in", values, "pubassId");
            return (Criteria) this;
        }

        public Criteria andPubassIdNotIn(List<String> values) {
            addCriterion("pubass_id not in", values, "pubassId");
            return (Criteria) this;
        }

        public Criteria andPubassIdBetween(String value1, String value2) {
            addCriterion("pubass_id between", value1, value2, "pubassId");
            return (Criteria) this;
        }

        public Criteria andPubassIdNotBetween(String value1, String value2) {
            addCriterion("pubass_id not between", value1, value2, "pubassId");
            return (Criteria) this;
        }

        public Criteria andPubassNameIsNull() {
            addCriterion("pubass_name is null");
            return (Criteria) this;
        }

        public Criteria andPubassNameIsNotNull() {
            addCriterion("pubass_name is not null");
            return (Criteria) this;
        }

        public Criteria andPubassNameEqualTo(String value) {
            addCriterion("pubass_name =", value, "pubassName");
            return (Criteria) this;
        }

        public Criteria andPubassNameNotEqualTo(String value) {
            addCriterion("pubass_name <>", value, "pubassName");
            return (Criteria) this;
        }

        public Criteria andPubassNameGreaterThan(String value) {
            addCriterion("pubass_name >", value, "pubassName");
            return (Criteria) this;
        }

        public Criteria andPubassNameGreaterThanOrEqualTo(String value) {
            addCriterion("pubass_name >=", value, "pubassName");
            return (Criteria) this;
        }

        public Criteria andPubassNameLessThan(String value) {
            addCriterion("pubass_name <", value, "pubassName");
            return (Criteria) this;
        }

        public Criteria andPubassNameLessThanOrEqualTo(String value) {
            addCriterion("pubass_name <=", value, "pubassName");
            return (Criteria) this;
        }

        public Criteria andPubassNameLike(String value) {
            addCriterion("pubass_name like", value, "pubassName");
            return (Criteria) this;
        }

        public Criteria andPubassNameNotLike(String value) {
            addCriterion("pubass_name not like", value, "pubassName");
            return (Criteria) this;
        }

        public Criteria andPubassNameIn(List<String> values) {
            addCriterion("pubass_name in", values, "pubassName");
            return (Criteria) this;
        }

        public Criteria andPubassNameNotIn(List<String> values) {
            addCriterion("pubass_name not in", values, "pubassName");
            return (Criteria) this;
        }

        public Criteria andPubassNameBetween(String value1, String value2) {
            addCriterion("pubass_name between", value1, value2, "pubassName");
            return (Criteria) this;
        }

        public Criteria andPubassNameNotBetween(String value1, String value2) {
            addCriterion("pubass_name not between", value1, value2, "pubassName");
            return (Criteria) this;
        }

        public Criteria andPubassTypeIsNull() {
            addCriterion("pubass_type is null");
            return (Criteria) this;
        }

        public Criteria andPubassTypeIsNotNull() {
            addCriterion("pubass_type is not null");
            return (Criteria) this;
        }

        public Criteria andPubassTypeEqualTo(String value) {
            addCriterion("pubass_type =", value, "pubassType");
            return (Criteria) this;
        }

        public Criteria andPubassTypeNotEqualTo(String value) {
            addCriterion("pubass_type <>", value, "pubassType");
            return (Criteria) this;
        }

        public Criteria andPubassTypeGreaterThan(String value) {
            addCriterion("pubass_type >", value, "pubassType");
            return (Criteria) this;
        }

        public Criteria andPubassTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pubass_type >=", value, "pubassType");
            return (Criteria) this;
        }

        public Criteria andPubassTypeLessThan(String value) {
            addCriterion("pubass_type <", value, "pubassType");
            return (Criteria) this;
        }

        public Criteria andPubassTypeLessThanOrEqualTo(String value) {
            addCriterion("pubass_type <=", value, "pubassType");
            return (Criteria) this;
        }

        public Criteria andPubassTypeLike(String value) {
            addCriterion("pubass_type like", value, "pubassType");
            return (Criteria) this;
        }

        public Criteria andPubassTypeNotLike(String value) {
            addCriterion("pubass_type not like", value, "pubassType");
            return (Criteria) this;
        }

        public Criteria andPubassTypeIn(List<String> values) {
            addCriterion("pubass_type in", values, "pubassType");
            return (Criteria) this;
        }

        public Criteria andPubassTypeNotIn(List<String> values) {
            addCriterion("pubass_type not in", values, "pubassType");
            return (Criteria) this;
        }

        public Criteria andPubassTypeBetween(String value1, String value2) {
            addCriterion("pubass_type between", value1, value2, "pubassType");
            return (Criteria) this;
        }

        public Criteria andPubassTypeNotBetween(String value1, String value2) {
            addCriterion("pubass_type not between", value1, value2, "pubassType");
            return (Criteria) this;
        }

        public Criteria andPubassPriceIsNull() {
            addCriterion("pubass_price is null");
            return (Criteria) this;
        }

        public Criteria andPubassPriceIsNotNull() {
            addCriterion("pubass_price is not null");
            return (Criteria) this;
        }

        public Criteria andPubassPriceEqualTo(BigDecimal value) {
            addCriterion("pubass_price =", value, "pubassPrice");
            return (Criteria) this;
        }

        public Criteria andPubassPriceNotEqualTo(BigDecimal value) {
            addCriterion("pubass_price <>", value, "pubassPrice");
            return (Criteria) this;
        }

        public Criteria andPubassPriceGreaterThan(BigDecimal value) {
            addCriterion("pubass_price >", value, "pubassPrice");
            return (Criteria) this;
        }

        public Criteria andPubassPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pubass_price >=", value, "pubassPrice");
            return (Criteria) this;
        }

        public Criteria andPubassPriceLessThan(BigDecimal value) {
            addCriterion("pubass_price <", value, "pubassPrice");
            return (Criteria) this;
        }

        public Criteria andPubassPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pubass_price <=", value, "pubassPrice");
            return (Criteria) this;
        }

        public Criteria andPubassPriceIn(List<BigDecimal> values) {
            addCriterion("pubass_price in", values, "pubassPrice");
            return (Criteria) this;
        }

        public Criteria andPubassPriceNotIn(List<BigDecimal> values) {
            addCriterion("pubass_price not in", values, "pubassPrice");
            return (Criteria) this;
        }

        public Criteria andPubassPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pubass_price between", value1, value2, "pubassPrice");
            return (Criteria) this;
        }

        public Criteria andPubassPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pubass_price not between", value1, value2, "pubassPrice");
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

        public Criteria andDepartIdEqualTo(String value) {
            addCriterion("depart_id =", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotEqualTo(String value) {
            addCriterion("depart_id <>", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThan(String value) {
            addCriterion("depart_id >", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdGreaterThanOrEqualTo(String value) {
            addCriterion("depart_id >=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThan(String value) {
            addCriterion("depart_id <", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLessThanOrEqualTo(String value) {
            addCriterion("depart_id <=", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdLike(String value) {
            addCriterion("depart_id like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotLike(String value) {
            addCriterion("depart_id not like", value, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdIn(List<String> values) {
            addCriterion("depart_id in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotIn(List<String> values) {
            addCriterion("depart_id not in", values, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdBetween(String value1, String value2) {
            addCriterion("depart_id between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andDepartIdNotBetween(String value1, String value2) {
            addCriterion("depart_id not between", value1, value2, "departId");
            return (Criteria) this;
        }

        public Criteria andPubassTimeIsNull() {
            addCriterion("pubass_time is null");
            return (Criteria) this;
        }

        public Criteria andPubassTimeIsNotNull() {
            addCriterion("pubass_time is not null");
            return (Criteria) this;
        }

        public Criteria andPubassTimeEqualTo(Timestamp value) {
            addCriterion("pubass_time =", value, "pubassTime");
            return (Criteria) this;
        }

        public Criteria andPubassTimeNotEqualTo(Timestamp value) {
            addCriterion("pubass_time <>", value, "pubassTime");
            return (Criteria) this;
        }

        public Criteria andPubassTimeGreaterThan(Timestamp value) {
            addCriterion("pubass_time >", value, "pubassTime");
            return (Criteria) this;
        }

        public Criteria andPubassTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("pubass_time >=", value, "pubassTime");
            return (Criteria) this;
        }

        public Criteria andPubassTimeLessThan(Timestamp value) {
            addCriterion("pubass_time <", value, "pubassTime");
            return (Criteria) this;
        }

        public Criteria andPubassTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("pubass_time <=", value, "pubassTime");
            return (Criteria) this;
        }

        public Criteria andPubassTimeIn(List<Timestamp> values) {
            addCriterion("pubass_time in", values, "pubassTime");
            return (Criteria) this;
        }

        public Criteria andPubassTimeNotIn(List<Timestamp> values) {
            addCriterion("pubass_time not in", values, "pubassTime");
            return (Criteria) this;
        }

        public Criteria andPubassTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("pubass_time between", value1, value2, "pubassTime");
            return (Criteria) this;
        }

        public Criteria andPubassTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("pubass_time not between", value1, value2, "pubassTime");
            return (Criteria) this;
        }

        public Criteria andPubassCountIsNull() {
            addCriterion("pubass_count is null");
            return (Criteria) this;
        }

        public Criteria andPubassCountIsNotNull() {
            addCriterion("pubass_count is not null");
            return (Criteria) this;
        }

        public Criteria andPubassCountEqualTo(Integer value) {
            addCriterion("pubass_count =", value, "pubassCount");
            return (Criteria) this;
        }

        public Criteria andPubassCountNotEqualTo(Integer value) {
            addCriterion("pubass_count <>", value, "pubassCount");
            return (Criteria) this;
        }

        public Criteria andPubassCountGreaterThan(Integer value) {
            addCriterion("pubass_count >", value, "pubassCount");
            return (Criteria) this;
        }

        public Criteria andPubassCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pubass_count >=", value, "pubassCount");
            return (Criteria) this;
        }

        public Criteria andPubassCountLessThan(Integer value) {
            addCriterion("pubass_count <", value, "pubassCount");
            return (Criteria) this;
        }

        public Criteria andPubassCountLessThanOrEqualTo(Integer value) {
            addCriterion("pubass_count <=", value, "pubassCount");
            return (Criteria) this;
        }

        public Criteria andPubassCountIn(List<Integer> values) {
            addCriterion("pubass_count in", values, "pubassCount");
            return (Criteria) this;
        }

        public Criteria andPubassCountNotIn(List<Integer> values) {
            addCriterion("pubass_count not in", values, "pubassCount");
            return (Criteria) this;
        }

        public Criteria andPubassCountBetween(Integer value1, Integer value2) {
            addCriterion("pubass_count between", value1, value2, "pubassCount");
            return (Criteria) this;
        }

        public Criteria andPubassCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pubass_count not between", value1, value2, "pubassCount");
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