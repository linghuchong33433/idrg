package com.fartecx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MediaEntityQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public MediaEntityQuery() {
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

        public Criteria andBriefIsNull() {
            addCriterion("brief is null");
            return (Criteria) this;
        }

        public Criteria andBriefIsNotNull() {
            addCriterion("brief is not null");
            return (Criteria) this;
        }

        public Criteria andBriefEqualTo(String value) {
            addCriterion("brief =", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotEqualTo(String value) {
            addCriterion("brief <>", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThan(String value) {
            addCriterion("brief >", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefGreaterThanOrEqualTo(String value) {
            addCriterion("brief >=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThan(String value) {
            addCriterion("brief <", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLessThanOrEqualTo(String value) {
            addCriterion("brief <=", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefLike(String value) {
            addCriterion("brief like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotLike(String value) {
            addCriterion("brief not like", value, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefIn(List<String> values) {
            addCriterion("brief in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotIn(List<String> values) {
            addCriterion("brief not in", values, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefBetween(String value1, String value2) {
            addCriterion("brief between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andBriefNotBetween(String value1, String value2) {
            addCriterion("brief not between", value1, value2, "brief");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIsNull() {
            addCriterion("createPerson is null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIsNotNull() {
            addCriterion("createPerson is not null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonEqualTo(String value) {
            addCriterion("createPerson =", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotEqualTo(String value) {
            addCriterion("createPerson <>", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonGreaterThan(String value) {
            addCriterion("createPerson >", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("createPerson >=", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLessThan(String value) {
            addCriterion("createPerson <", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLessThanOrEqualTo(String value) {
            addCriterion("createPerson <=", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLike(String value) {
            addCriterion("createPerson like", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotLike(String value) {
            addCriterion("createPerson not like", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIn(List<String> values) {
            addCriterion("createPerson in", values, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotIn(List<String> values) {
            addCriterion("createPerson not in", values, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonBetween(String value1, String value2) {
            addCriterion("createPerson between", value1, value2, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotBetween(String value1, String value2) {
            addCriterion("createPerson not between", value1, value2, "createperson");
            return (Criteria) this;
        }

        public Criteria andUploaddateIsNull() {
            addCriterion("uploadDate is null");
            return (Criteria) this;
        }

        public Criteria andUploaddateIsNotNull() {
            addCriterion("uploadDate is not null");
            return (Criteria) this;
        }

        public Criteria andUploaddateEqualTo(Date value) {
            addCriterion("uploadDate =", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateNotEqualTo(Date value) {
            addCriterion("uploadDate <>", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateGreaterThan(Date value) {
            addCriterion("uploadDate >", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateGreaterThanOrEqualTo(Date value) {
            addCriterion("uploadDate >=", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateLessThan(Date value) {
            addCriterion("uploadDate <", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateLessThanOrEqualTo(Date value) {
            addCriterion("uploadDate <=", value, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateIn(List<Date> values) {
            addCriterion("uploadDate in", values, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateNotIn(List<Date> values) {
            addCriterion("uploadDate not in", values, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateBetween(Date value1, Date value2) {
            addCriterion("uploadDate between", value1, value2, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andUploaddateNotBetween(Date value1, Date value2) {
            addCriterion("uploadDate not between", value1, value2, "uploaddate");
            return (Criteria) this;
        }

        public Criteria andShoworderIsNull() {
            addCriterion("showOrder is null");
            return (Criteria) this;
        }

        public Criteria andShoworderIsNotNull() {
            addCriterion("showOrder is not null");
            return (Criteria) this;
        }

        public Criteria andShoworderEqualTo(Integer value) {
            addCriterion("showOrder =", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotEqualTo(Integer value) {
            addCriterion("showOrder <>", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderGreaterThan(Integer value) {
            addCriterion("showOrder >", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderGreaterThanOrEqualTo(Integer value) {
            addCriterion("showOrder >=", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderLessThan(Integer value) {
            addCriterion("showOrder <", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderLessThanOrEqualTo(Integer value) {
            addCriterion("showOrder <=", value, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderIn(List<Integer> values) {
            addCriterion("showOrder in", values, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotIn(List<Integer> values) {
            addCriterion("showOrder not in", values, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderBetween(Integer value1, Integer value2) {
            addCriterion("showOrder between", value1, value2, "showorder");
            return (Criteria) this;
        }

        public Criteria andShoworderNotBetween(Integer value1, Integer value2) {
            addCriterion("showOrder not between", value1, value2, "showorder");
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