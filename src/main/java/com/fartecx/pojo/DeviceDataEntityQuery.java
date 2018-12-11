package com.fartecx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeviceDataEntityQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public DeviceDataEntityQuery() {
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

        public Criteria andDataidIsNull() {
            addCriterion("dataid is null");
            return (Criteria) this;
        }

        public Criteria andDataidIsNotNull() {
            addCriterion("dataid is not null");
            return (Criteria) this;
        }

        public Criteria andDataidEqualTo(String value) {
            addCriterion("dataid =", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotEqualTo(String value) {
            addCriterion("dataid <>", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThan(String value) {
            addCriterion("dataid >", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidGreaterThanOrEqualTo(String value) {
            addCriterion("dataid >=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThan(String value) {
            addCriterion("dataid <", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLessThanOrEqualTo(String value) {
            addCriterion("dataid <=", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidLike(String value) {
            addCriterion("dataid like", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotLike(String value) {
            addCriterion("dataid not like", value, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidIn(List<String> values) {
            addCriterion("dataid in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotIn(List<String> values) {
            addCriterion("dataid not in", values, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidBetween(String value1, String value2) {
            addCriterion("dataid between", value1, value2, "dataid");
            return (Criteria) this;
        }

        public Criteria andDataidNotBetween(String value1, String value2) {
            addCriterion("dataid not between", value1, value2, "dataid");
            return (Criteria) this;
        }

        public Criteria andTIsNull() {
            addCriterion("t is null");
            return (Criteria) this;
        }

        public Criteria andTIsNotNull() {
            addCriterion("t is not null");
            return (Criteria) this;
        }

        public Criteria andTEqualTo(Date value) {
            addCriterion("t =", value, "t");
            return (Criteria) this;
        }

        public Criteria andTNotEqualTo(Date value) {
            addCriterion("t <>", value, "t");
            return (Criteria) this;
        }

        public Criteria andTGreaterThan(Date value) {
            addCriterion("t >", value, "t");
            return (Criteria) this;
        }

        public Criteria andTGreaterThanOrEqualTo(Date value) {
            addCriterion("t >=", value, "t");
            return (Criteria) this;
        }

        public Criteria andTLessThan(Date value) {
            addCriterion("t <", value, "t");
            return (Criteria) this;
        }

        public Criteria andTLessThanOrEqualTo(Date value) {
            addCriterion("t <=", value, "t");
            return (Criteria) this;
        }

        public Criteria andTIn(List<Date> values) {
            addCriterion("t in", values, "t");
            return (Criteria) this;
        }

        public Criteria andTNotIn(List<Date> values) {
            addCriterion("t not in", values, "t");
            return (Criteria) this;
        }

        public Criteria andTBetween(Date value1, Date value2) {
            addCriterion("t between", value1, value2, "t");
            return (Criteria) this;
        }

        public Criteria andTNotBetween(Date value1, Date value2) {
            addCriterion("t not between", value1, value2, "t");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNull() {
            addCriterion("device is null");
            return (Criteria) this;
        }

        public Criteria andDeviceIsNotNull() {
            addCriterion("device is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceEqualTo(String value) {
            addCriterion("device =", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotEqualTo(String value) {
            addCriterion("device <>", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThan(String value) {
            addCriterion("device >", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("device >=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThan(String value) {
            addCriterion("device <", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLessThanOrEqualTo(String value) {
            addCriterion("device <=", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceLike(String value) {
            addCriterion("device like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotLike(String value) {
            addCriterion("device not like", value, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceIn(List<String> values) {
            addCriterion("device in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotIn(List<String> values) {
            addCriterion("device not in", values, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceBetween(String value1, String value2) {
            addCriterion("device between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andDeviceNotBetween(String value1, String value2) {
            addCriterion("device not between", value1, value2, "device");
            return (Criteria) this;
        }

        public Criteria andTempIsNull() {
            addCriterion("temp is null");
            return (Criteria) this;
        }

        public Criteria andTempIsNotNull() {
            addCriterion("temp is not null");
            return (Criteria) this;
        }

        public Criteria andTempEqualTo(Double value) {
            addCriterion("temp =", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotEqualTo(Double value) {
            addCriterion("temp <>", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThan(Double value) {
            addCriterion("temp >", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempGreaterThanOrEqualTo(Double value) {
            addCriterion("temp >=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThan(Double value) {
            addCriterion("temp <", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempLessThanOrEqualTo(Double value) {
            addCriterion("temp <=", value, "temp");
            return (Criteria) this;
        }

        public Criteria andTempIn(List<Double> values) {
            addCriterion("temp in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotIn(List<Double> values) {
            addCriterion("temp not in", values, "temp");
            return (Criteria) this;
        }

        public Criteria andTempBetween(Double value1, Double value2) {
            addCriterion("temp between", value1, value2, "temp");
            return (Criteria) this;
        }

        public Criteria andTempNotBetween(Double value1, Double value2) {
            addCriterion("temp not between", value1, value2, "temp");
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