package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andGruopIsNull() {
            addCriterion("gruop is null");
            return (Criteria) this;
        }

        public Criteria andGruopIsNotNull() {
            addCriterion("gruop is not null");
            return (Criteria) this;
        }

        public Criteria andGruopEqualTo(String value) {
            addCriterion("gruop =", value, "gruop");
            return (Criteria) this;
        }

        public Criteria andGruopNotEqualTo(String value) {
            addCriterion("gruop <>", value, "gruop");
            return (Criteria) this;
        }

        public Criteria andGruopGreaterThan(String value) {
            addCriterion("gruop >", value, "gruop");
            return (Criteria) this;
        }

        public Criteria andGruopGreaterThanOrEqualTo(String value) {
            addCriterion("gruop >=", value, "gruop");
            return (Criteria) this;
        }

        public Criteria andGruopLessThan(String value) {
            addCriterion("gruop <", value, "gruop");
            return (Criteria) this;
        }

        public Criteria andGruopLessThanOrEqualTo(String value) {
            addCriterion("gruop <=", value, "gruop");
            return (Criteria) this;
        }

        public Criteria andGruopLike(String value) {
            addCriterion("gruop like", value, "gruop");
            return (Criteria) this;
        }

        public Criteria andGruopNotLike(String value) {
            addCriterion("gruop not like", value, "gruop");
            return (Criteria) this;
        }

        public Criteria andGruopIn(List<String> values) {
            addCriterion("gruop in", values, "gruop");
            return (Criteria) this;
        }

        public Criteria andGruopNotIn(List<String> values) {
            addCriterion("gruop not in", values, "gruop");
            return (Criteria) this;
        }

        public Criteria andGruopBetween(String value1, String value2) {
            addCriterion("gruop between", value1, value2, "gruop");
            return (Criteria) this;
        }

        public Criteria andGruopNotBetween(String value1, String value2) {
            addCriterion("gruop not between", value1, value2, "gruop");
            return (Criteria) this;
        }

        public Criteria andDoneIsNull() {
            addCriterion("done is null");
            return (Criteria) this;
        }

        public Criteria andDoneIsNotNull() {
            addCriterion("done is not null");
            return (Criteria) this;
        }

        public Criteria andDoneEqualTo(Integer value) {
            addCriterion("done =", value, "done");
            return (Criteria) this;
        }

        public Criteria andDoneNotEqualTo(Integer value) {
            addCriterion("done <>", value, "done");
            return (Criteria) this;
        }

        public Criteria andDoneGreaterThan(Integer value) {
            addCriterion("done >", value, "done");
            return (Criteria) this;
        }

        public Criteria andDoneGreaterThanOrEqualTo(Integer value) {
            addCriterion("done >=", value, "done");
            return (Criteria) this;
        }

        public Criteria andDoneLessThan(Integer value) {
            addCriterion("done <", value, "done");
            return (Criteria) this;
        }

        public Criteria andDoneLessThanOrEqualTo(Integer value) {
            addCriterion("done <=", value, "done");
            return (Criteria) this;
        }

        public Criteria andDoneIn(List<Integer> values) {
            addCriterion("done in", values, "done");
            return (Criteria) this;
        }

        public Criteria andDoneNotIn(List<Integer> values) {
            addCriterion("done not in", values, "done");
            return (Criteria) this;
        }

        public Criteria andDoneBetween(Integer value1, Integer value2) {
            addCriterion("done between", value1, value2, "done");
            return (Criteria) this;
        }

        public Criteria andDoneNotBetween(Integer value1, Integer value2) {
            addCriterion("done not between", value1, value2, "done");
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