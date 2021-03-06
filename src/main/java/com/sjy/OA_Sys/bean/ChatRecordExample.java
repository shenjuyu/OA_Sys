package com.sjy.OA_Sys.bean;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ChatRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChatRecordExample() {
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

        public Criteria andChatTimeSendIsNull() {
            addCriterion("chat_time_send is null");
            return (Criteria) this;
        }

        public Criteria andChatTimeSendIsNotNull() {
            addCriterion("chat_time_send is not null");
            return (Criteria) this;
        }

        public Criteria andChatTimeSendEqualTo(Timestamp value) {
            addCriterion("chat_time_send =", value, "chatTimeSend");
            return (Criteria) this;
        }

        public Criteria andChatTimeSendNotEqualTo(Timestamp value) {
            addCriterion("chat_time_send <>", value, "chatTimeSend");
            return (Criteria) this;
        }

        public Criteria andChatTimeSendGreaterThan(Timestamp value) {
            addCriterion("chat_time_send >", value, "chatTimeSend");
            return (Criteria) this;
        }

        public Criteria andChatTimeSendGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("chat_time_send >=", value, "chatTimeSend");
            return (Criteria) this;
        }

        public Criteria andChatTimeSendLessThan(Timestamp value) {
            addCriterion("chat_time_send <", value, "chatTimeSend");
            return (Criteria) this;
        }

        public Criteria andChatTimeSendLessThanOrEqualTo(Timestamp value) {
            addCriterion("chat_time_send <=", value, "chatTimeSend");
            return (Criteria) this;
        }

        public Criteria andChatTimeSendIn(List<Timestamp> values) {
            addCriterion("chat_time_send in", values, "chatTimeSend");
            return (Criteria) this;
        }

        public Criteria andChatTimeSendNotIn(List<Timestamp> values) {
            addCriterion("chat_time_send not in", values, "chatTimeSend");
            return (Criteria) this;
        }

        public Criteria andChatTimeSendBetween(Timestamp value1, Timestamp value2) {
            addCriterion("chat_time_send between", value1, value2, "chatTimeSend");
            return (Criteria) this;
        }

        public Criteria andChatTimeSendNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("chat_time_send not between", value1, value2, "chatTimeSend");
            return (Criteria) this;
        }

        public Criteria andChatSenderIsNull() {
            addCriterion("chat_sender is null");
            return (Criteria) this;
        }

        public Criteria andChatSenderIsNotNull() {
            addCriterion("chat_sender is not null");
            return (Criteria) this;
        }

        public Criteria andChatSenderEqualTo(String value) {
            addCriterion("chat_sender =", value, "chatSender");
            return (Criteria) this;
        }

        public Criteria andChatSenderNotEqualTo(String value) {
            addCriterion("chat_sender <>", value, "chatSender");
            return (Criteria) this;
        }

        public Criteria andChatSenderGreaterThan(String value) {
            addCriterion("chat_sender >", value, "chatSender");
            return (Criteria) this;
        }

        public Criteria andChatSenderGreaterThanOrEqualTo(String value) {
            addCriterion("chat_sender >=", value, "chatSender");
            return (Criteria) this;
        }

        public Criteria andChatSenderLessThan(String value) {
            addCriterion("chat_sender <", value, "chatSender");
            return (Criteria) this;
        }

        public Criteria andChatSenderLessThanOrEqualTo(String value) {
            addCriterion("chat_sender <=", value, "chatSender");
            return (Criteria) this;
        }

        public Criteria andChatSenderLike(String value) {
            addCriterion("chat_sender like", value, "chatSender");
            return (Criteria) this;
        }

        public Criteria andChatSenderNotLike(String value) {
            addCriterion("chat_sender not like", value, "chatSender");
            return (Criteria) this;
        }

        public Criteria andChatSenderIn(List<String> values) {
            addCriterion("chat_sender in", values, "chatSender");
            return (Criteria) this;
        }

        public Criteria andChatSenderNotIn(List<String> values) {
            addCriterion("chat_sender not in", values, "chatSender");
            return (Criteria) this;
        }

        public Criteria andChatSenderBetween(String value1, String value2) {
            addCriterion("chat_sender between", value1, value2, "chatSender");
            return (Criteria) this;
        }

        public Criteria andChatSenderNotBetween(String value1, String value2) {
            addCriterion("chat_sender not between", value1, value2, "chatSender");
            return (Criteria) this;
        }

        public Criteria andChatReceiveIsNull() {
            addCriterion("chat_receive is null");
            return (Criteria) this;
        }

        public Criteria andChatReceiveIsNotNull() {
            addCriterion("chat_receive is not null");
            return (Criteria) this;
        }

        public Criteria andChatReceiveEqualTo(String value) {
            addCriterion("chat_receive =", value, "chatReceive");
            return (Criteria) this;
        }

        public Criteria andChatReceiveNotEqualTo(String value) {
            addCriterion("chat_receive <>", value, "chatReceive");
            return (Criteria) this;
        }

        public Criteria andChatReceiveGreaterThan(String value) {
            addCriterion("chat_receive >", value, "chatReceive");
            return (Criteria) this;
        }

        public Criteria andChatReceiveGreaterThanOrEqualTo(String value) {
            addCriterion("chat_receive >=", value, "chatReceive");
            return (Criteria) this;
        }

        public Criteria andChatReceiveLessThan(String value) {
            addCriterion("chat_receive <", value, "chatReceive");
            return (Criteria) this;
        }

        public Criteria andChatReceiveLessThanOrEqualTo(String value) {
            addCriterion("chat_receive <=", value, "chatReceive");
            return (Criteria) this;
        }

        public Criteria andChatReceiveLike(String value) {
            addCriterion("chat_receive like", value, "chatReceive");
            return (Criteria) this;
        }

        public Criteria andChatReceiveNotLike(String value) {
            addCriterion("chat_receive not like", value, "chatReceive");
            return (Criteria) this;
        }

        public Criteria andChatReceiveIn(List<String> values) {
            addCriterion("chat_receive in", values, "chatReceive");
            return (Criteria) this;
        }

        public Criteria andChatReceiveNotIn(List<String> values) {
            addCriterion("chat_receive not in", values, "chatReceive");
            return (Criteria) this;
        }

        public Criteria andChatReceiveBetween(String value1, String value2) {
            addCriterion("chat_receive between", value1, value2, "chatReceive");
            return (Criteria) this;
        }

        public Criteria andChatReceiveNotBetween(String value1, String value2) {
            addCriterion("chat_receive not between", value1, value2, "chatReceive");
            return (Criteria) this;
        }

        public Criteria andIsGroupIsNull() {
            addCriterion("is_group is null");
            return (Criteria) this;
        }

        public Criteria andIsGroupIsNotNull() {
            addCriterion("is_group is not null");
            return (Criteria) this;
        }

        public Criteria andIsGroupEqualTo(Integer value) {
            addCriterion("is_group =", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotEqualTo(Integer value) {
            addCriterion("is_group <>", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupGreaterThan(Integer value) {
            addCriterion("is_group >", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_group >=", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupLessThan(Integer value) {
            addCriterion("is_group <", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupLessThanOrEqualTo(Integer value) {
            addCriterion("is_group <=", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupIn(List<Integer> values) {
            addCriterion("is_group in", values, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotIn(List<Integer> values) {
            addCriterion("is_group not in", values, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupBetween(Integer value1, Integer value2) {
            addCriterion("is_group between", value1, value2, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("is_group not between", value1, value2, "isGroup");
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