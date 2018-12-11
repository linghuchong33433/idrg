package com.fartecx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExpertServiceLogEntityQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public ExpertServiceLogEntityQuery() {
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

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andQIsNull() {
            addCriterion("q is null");
            return (Criteria) this;
        }

        public Criteria andQIsNotNull() {
            addCriterion("q is not null");
            return (Criteria) this;
        }

        public Criteria andQEqualTo(String value) {
            addCriterion("q =", value, "q");
            return (Criteria) this;
        }

        public Criteria andQNotEqualTo(String value) {
            addCriterion("q <>", value, "q");
            return (Criteria) this;
        }

        public Criteria andQGreaterThan(String value) {
            addCriterion("q >", value, "q");
            return (Criteria) this;
        }

        public Criteria andQGreaterThanOrEqualTo(String value) {
            addCriterion("q >=", value, "q");
            return (Criteria) this;
        }

        public Criteria andQLessThan(String value) {
            addCriterion("q <", value, "q");
            return (Criteria) this;
        }

        public Criteria andQLessThanOrEqualTo(String value) {
            addCriterion("q <=", value, "q");
            return (Criteria) this;
        }

        public Criteria andQLike(String value) {
            addCriterion("q like", value, "q");
            return (Criteria) this;
        }

        public Criteria andQNotLike(String value) {
            addCriterion("q not like", value, "q");
            return (Criteria) this;
        }

        public Criteria andQIn(List<String> values) {
            addCriterion("q in", values, "q");
            return (Criteria) this;
        }

        public Criteria andQNotIn(List<String> values) {
            addCriterion("q not in", values, "q");
            return (Criteria) this;
        }

        public Criteria andQBetween(String value1, String value2) {
            addCriterion("q between", value1, value2, "q");
            return (Criteria) this;
        }

        public Criteria andQNotBetween(String value1, String value2) {
            addCriterion("q not between", value1, value2, "q");
            return (Criteria) this;
        }

        public Criteria andAIsNull() {
            addCriterion("a is null");
            return (Criteria) this;
        }

        public Criteria andAIsNotNull() {
            addCriterion("a is not null");
            return (Criteria) this;
        }

        public Criteria andAEqualTo(String value) {
            addCriterion("a =", value, "a");
            return (Criteria) this;
        }

        public Criteria andANotEqualTo(String value) {
            addCriterion("a <>", value, "a");
            return (Criteria) this;
        }

        public Criteria andAGreaterThan(String value) {
            addCriterion("a >", value, "a");
            return (Criteria) this;
        }

        public Criteria andAGreaterThanOrEqualTo(String value) {
            addCriterion("a >=", value, "a");
            return (Criteria) this;
        }

        public Criteria andALessThan(String value) {
            addCriterion("a <", value, "a");
            return (Criteria) this;
        }

        public Criteria andALessThanOrEqualTo(String value) {
            addCriterion("a <=", value, "a");
            return (Criteria) this;
        }

        public Criteria andALike(String value) {
            addCriterion("a like", value, "a");
            return (Criteria) this;
        }

        public Criteria andANotLike(String value) {
            addCriterion("a not like", value, "a");
            return (Criteria) this;
        }

        public Criteria andAIn(List<String> values) {
            addCriterion("a in", values, "a");
            return (Criteria) this;
        }

        public Criteria andANotIn(List<String> values) {
            addCriterion("a not in", values, "a");
            return (Criteria) this;
        }

        public Criteria andABetween(String value1, String value2) {
            addCriterion("a between", value1, value2, "a");
            return (Criteria) this;
        }

        public Criteria andANotBetween(String value1, String value2) {
            addCriterion("a not between", value1, value2, "a");
            return (Criteria) this;
        }

        public Criteria andStartIsNull() {
            addCriterion("start is null");
            return (Criteria) this;
        }

        public Criteria andStartIsNotNull() {
            addCriterion("start is not null");
            return (Criteria) this;
        }

        public Criteria andStartEqualTo(Date value) {
            addCriterion("start =", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotEqualTo(Date value) {
            addCriterion("start <>", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThan(Date value) {
            addCriterion("start >", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartGreaterThanOrEqualTo(Date value) {
            addCriterion("start >=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThan(Date value) {
            addCriterion("start <", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartLessThanOrEqualTo(Date value) {
            addCriterion("start <=", value, "start");
            return (Criteria) this;
        }

        public Criteria andStartIn(List<Date> values) {
            addCriterion("start in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotIn(List<Date> values) {
            addCriterion("start not in", values, "start");
            return (Criteria) this;
        }

        public Criteria andStartBetween(Date value1, Date value2) {
            addCriterion("start between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andStartNotBetween(Date value1, Date value2) {
            addCriterion("start not between", value1, value2, "start");
            return (Criteria) this;
        }

        public Criteria andFinishIsNull() {
            addCriterion("finish is null");
            return (Criteria) this;
        }

        public Criteria andFinishIsNotNull() {
            addCriterion("finish is not null");
            return (Criteria) this;
        }

        public Criteria andFinishEqualTo(Date value) {
            addCriterion("finish =", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotEqualTo(Date value) {
            addCriterion("finish <>", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishGreaterThan(Date value) {
            addCriterion("finish >", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishGreaterThanOrEqualTo(Date value) {
            addCriterion("finish >=", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishLessThan(Date value) {
            addCriterion("finish <", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishLessThanOrEqualTo(Date value) {
            addCriterion("finish <=", value, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishIn(List<Date> values) {
            addCriterion("finish in", values, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotIn(List<Date> values) {
            addCriterion("finish not in", values, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishBetween(Date value1, Date value2) {
            addCriterion("finish between", value1, value2, "finish");
            return (Criteria) this;
        }

        public Criteria andFinishNotBetween(Date value1, Date value2) {
            addCriterion("finish not between", value1, value2, "finish");
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