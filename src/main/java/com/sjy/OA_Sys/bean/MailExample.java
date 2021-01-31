package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class MailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MailExample() {
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

        public Criteria andMailIdIsNull() {
            addCriterion("mail_id is null");
            return (Criteria) this;
        }

        public Criteria andMailIdIsNotNull() {
            addCriterion("mail_id is not null");
            return (Criteria) this;
        }

        public Criteria andMailIdEqualTo(String value) {
            addCriterion("mail_id =", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdNotEqualTo(String value) {
            addCriterion("mail_id <>", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdGreaterThan(String value) {
            addCriterion("mail_id >", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdGreaterThanOrEqualTo(String value) {
            addCriterion("mail_id >=", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdLessThan(String value) {
            addCriterion("mail_id <", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdLessThanOrEqualTo(String value) {
            addCriterion("mail_id <=", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdLike(String value) {
            addCriterion("mail_id like", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdNotLike(String value) {
            addCriterion("mail_id not like", value, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdIn(List<String> values) {
            addCriterion("mail_id in", values, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdNotIn(List<String> values) {
            addCriterion("mail_id not in", values, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdBetween(String value1, String value2) {
            addCriterion("mail_id between", value1, value2, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailIdNotBetween(String value1, String value2) {
            addCriterion("mail_id not between", value1, value2, "mailId");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendIsNull() {
            addCriterion("mail_staff_send is null");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendIsNotNull() {
            addCriterion("mail_staff_send is not null");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendEqualTo(String value) {
            addCriterion("mail_staff_send =", value, "mailStaffSend");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendNotEqualTo(String value) {
            addCriterion("mail_staff_send <>", value, "mailStaffSend");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendGreaterThan(String value) {
            addCriterion("mail_staff_send >", value, "mailStaffSend");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendGreaterThanOrEqualTo(String value) {
            addCriterion("mail_staff_send >=", value, "mailStaffSend");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendLessThan(String value) {
            addCriterion("mail_staff_send <", value, "mailStaffSend");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendLessThanOrEqualTo(String value) {
            addCriterion("mail_staff_send <=", value, "mailStaffSend");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendLike(String value) {
            addCriterion("mail_staff_send like", value, "mailStaffSend");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendNotLike(String value) {
            addCriterion("mail_staff_send not like", value, "mailStaffSend");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendIn(List<String> values) {
            addCriterion("mail_staff_send in", values, "mailStaffSend");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendNotIn(List<String> values) {
            addCriterion("mail_staff_send not in", values, "mailStaffSend");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendBetween(String value1, String value2) {
            addCriterion("mail_staff_send between", value1, value2, "mailStaffSend");
            return (Criteria) this;
        }

        public Criteria andMailStaffSendNotBetween(String value1, String value2) {
            addCriterion("mail_staff_send not between", value1, value2, "mailStaffSend");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeIsNull() {
            addCriterion("mail_staff_addressee is null");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeIsNotNull() {
            addCriterion("mail_staff_addressee is not null");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeEqualTo(String value) {
            addCriterion("mail_staff_addressee =", value, "mailStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeNotEqualTo(String value) {
            addCriterion("mail_staff_addressee <>", value, "mailStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeGreaterThan(String value) {
            addCriterion("mail_staff_addressee >", value, "mailStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeGreaterThanOrEqualTo(String value) {
            addCriterion("mail_staff_addressee >=", value, "mailStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeLessThan(String value) {
            addCriterion("mail_staff_addressee <", value, "mailStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeLessThanOrEqualTo(String value) {
            addCriterion("mail_staff_addressee <=", value, "mailStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeLike(String value) {
            addCriterion("mail_staff_addressee like", value, "mailStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeNotLike(String value) {
            addCriterion("mail_staff_addressee not like", value, "mailStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeIn(List<String> values) {
            addCriterion("mail_staff_addressee in", values, "mailStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeNotIn(List<String> values) {
            addCriterion("mail_staff_addressee not in", values, "mailStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeBetween(String value1, String value2) {
            addCriterion("mail_staff_addressee between", value1, value2, "mailStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andMailStaffAddresseeNotBetween(String value1, String value2) {
            addCriterion("mail_staff_addressee not between", value1, value2, "mailStaffAddressee");
            return (Criteria) this;
        }

        public Criteria andMailTitleIsNull() {
            addCriterion("mail_title is null");
            return (Criteria) this;
        }

        public Criteria andMailTitleIsNotNull() {
            addCriterion("mail_title is not null");
            return (Criteria) this;
        }

        public Criteria andMailTitleEqualTo(String value) {
            addCriterion("mail_title =", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleNotEqualTo(String value) {
            addCriterion("mail_title <>", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleGreaterThan(String value) {
            addCriterion("mail_title >", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleGreaterThanOrEqualTo(String value) {
            addCriterion("mail_title >=", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleLessThan(String value) {
            addCriterion("mail_title <", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleLessThanOrEqualTo(String value) {
            addCriterion("mail_title <=", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleLike(String value) {
            addCriterion("mail_title like", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleNotLike(String value) {
            addCriterion("mail_title not like", value, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleIn(List<String> values) {
            addCriterion("mail_title in", values, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleNotIn(List<String> values) {
            addCriterion("mail_title not in", values, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleBetween(String value1, String value2) {
            addCriterion("mail_title between", value1, value2, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTitleNotBetween(String value1, String value2) {
            addCriterion("mail_title not between", value1, value2, "mailTitle");
            return (Criteria) this;
        }

        public Criteria andMailTimeSendIsNull() {
            addCriterion("mail_time_send is null");
            return (Criteria) this;
        }

        public Criteria andMailTimeSendIsNotNull() {
            addCriterion("mail_time_send is not null");
            return (Criteria) this;
        }

        public Criteria andMailTimeSendEqualTo(Timestamp value) {
            addCriterion("mail_time_send =", value, "mailTimeSend");
            return (Criteria) this;
        }

        public Criteria andMailTimeSendNotEqualTo(Timestamp value) {
            addCriterion("mail_time_send <>", value, "mailTimeSend");
            return (Criteria) this;
        }

        public Criteria andMailTimeSendGreaterThan(Timestamp value) {
            addCriterion("mail_time_send >", value, "mailTimeSend");
            return (Criteria) this;
        }

        public Criteria andMailTimeSendGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("mail_time_send >=", value, "mailTimeSend");
            return (Criteria) this;
        }

        public Criteria andMailTimeSendLessThan(Timestamp value) {
            addCriterion("mail_time_send <", value, "mailTimeSend");
            return (Criteria) this;
        }

        public Criteria andMailTimeSendLessThanOrEqualTo(Timestamp value) {
            addCriterion("mail_time_send <=", value, "mailTimeSend");
            return (Criteria) this;
        }

        public Criteria andMailTimeSendIn(List<Timestamp> values) {
            addCriterion("mail_time_send in", values, "mailTimeSend");
            return (Criteria) this;
        }

        public Criteria andMailTimeSendNotIn(List<Timestamp> values) {
            addCriterion("mail_time_send not in", values, "mailTimeSend");
            return (Criteria) this;
        }

        public Criteria andMailTimeSendBetween(Timestamp value1, Timestamp value2) {
            addCriterion("mail_time_send between", value1, value2, "mailTimeSend");
            return (Criteria) this;
        }

        public Criteria andMailTimeSendNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("mail_time_send not between", value1, value2, "mailTimeSend");
            return (Criteria) this;
        }

        public Criteria andMailSituationIsNull() {
            addCriterion("mail_situation is null");
            return (Criteria) this;
        }

        public Criteria andMailSituationIsNotNull() {
            addCriterion("mail_situation is not null");
            return (Criteria) this;
        }

        public Criteria andMailSituationEqualTo(Integer value) {
            addCriterion("mail_situation =", value, "mailSituation");
            return (Criteria) this;
        }

        public Criteria andMailSituationNotEqualTo(Integer value) {
            addCriterion("mail_situation <>", value, "mailSituation");
            return (Criteria) this;
        }

        public Criteria andMailSituationGreaterThan(Integer value) {
            addCriterion("mail_situation >", value, "mailSituation");
            return (Criteria) this;
        }

        public Criteria andMailSituationGreaterThanOrEqualTo(Integer value) {
            addCriterion("mail_situation >=", value, "mailSituation");
            return (Criteria) this;
        }

        public Criteria andMailSituationLessThan(Integer value) {
            addCriterion("mail_situation <", value, "mailSituation");
            return (Criteria) this;
        }

        public Criteria andMailSituationLessThanOrEqualTo(Integer value) {
            addCriterion("mail_situation <=", value, "mailSituation");
            return (Criteria) this;
        }

        public Criteria andMailSituationIn(List<Integer> values) {
            addCriterion("mail_situation in", values, "mailSituation");
            return (Criteria) this;
        }

        public Criteria andMailSituationNotIn(List<Integer> values) {
            addCriterion("mail_situation not in", values, "mailSituation");
            return (Criteria) this;
        }

        public Criteria andMailSituationBetween(Integer value1, Integer value2) {
            addCriterion("mail_situation between", value1, value2, "mailSituation");
            return (Criteria) this;
        }

        public Criteria andMailSituationNotBetween(Integer value1, Integer value2) {
            addCriterion("mail_situation not between", value1, value2, "mailSituation");
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