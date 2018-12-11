package com.fartecx.pojo;

import java.util.ArrayList;
import java.util.List;

public class YearStatisticEntityQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public YearStatisticEntityQuery() {
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

        public Criteria andGeoIsNull() {
            addCriterion("geo is null");
            return (Criteria) this;
        }

        public Criteria andGeoIsNotNull() {
            addCriterion("geo is not null");
            return (Criteria) this;
        }

        public Criteria andGeoEqualTo(String value) {
            addCriterion("geo =", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoNotEqualTo(String value) {
            addCriterion("geo <>", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoGreaterThan(String value) {
            addCriterion("geo >", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoGreaterThanOrEqualTo(String value) {
            addCriterion("geo >=", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoLessThan(String value) {
            addCriterion("geo <", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoLessThanOrEqualTo(String value) {
            addCriterion("geo <=", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoLike(String value) {
            addCriterion("geo like", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoNotLike(String value) {
            addCriterion("geo not like", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoIn(List<String> values) {
            addCriterion("geo in", values, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoNotIn(List<String> values) {
            addCriterion("geo not in", values, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoBetween(String value1, String value2) {
            addCriterion("geo between", value1, value2, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoNotBetween(String value1, String value2) {
            addCriterion("geo not between", value1, value2, "geo");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andChanliangIsNull() {
            addCriterion("chanliang is null");
            return (Criteria) this;
        }

        public Criteria andChanliangIsNotNull() {
            addCriterion("chanliang is not null");
            return (Criteria) this;
        }

        public Criteria andChanliangEqualTo(Double value) {
            addCriterion("chanliang =", value, "chanliang");
            return (Criteria) this;
        }

        public Criteria andChanliangNotEqualTo(Double value) {
            addCriterion("chanliang <>", value, "chanliang");
            return (Criteria) this;
        }

        public Criteria andChanliangGreaterThan(Double value) {
            addCriterion("chanliang >", value, "chanliang");
            return (Criteria) this;
        }

        public Criteria andChanliangGreaterThanOrEqualTo(Double value) {
            addCriterion("chanliang >=", value, "chanliang");
            return (Criteria) this;
        }

        public Criteria andChanliangLessThan(Double value) {
            addCriterion("chanliang <", value, "chanliang");
            return (Criteria) this;
        }

        public Criteria andChanliangLessThanOrEqualTo(Double value) {
            addCriterion("chanliang <=", value, "chanliang");
            return (Criteria) this;
        }

        public Criteria andChanliangIn(List<Double> values) {
            addCriterion("chanliang in", values, "chanliang");
            return (Criteria) this;
        }

        public Criteria andChanliangNotIn(List<Double> values) {
            addCriterion("chanliang not in", values, "chanliang");
            return (Criteria) this;
        }

        public Criteria andChanliangBetween(Double value1, Double value2) {
            addCriterion("chanliang between", value1, value2, "chanliang");
            return (Criteria) this;
        }

        public Criteria andChanliangNotBetween(Double value1, Double value2) {
            addCriterion("chanliang not between", value1, value2, "chanliang");
            return (Criteria) this;
        }

        public Criteria andChanzhiIsNull() {
            addCriterion("chanzhi is null");
            return (Criteria) this;
        }

        public Criteria andChanzhiIsNotNull() {
            addCriterion("chanzhi is not null");
            return (Criteria) this;
        }

        public Criteria andChanzhiEqualTo(Double value) {
            addCriterion("chanzhi =", value, "chanzhi");
            return (Criteria) this;
        }

        public Criteria andChanzhiNotEqualTo(Double value) {
            addCriterion("chanzhi <>", value, "chanzhi");
            return (Criteria) this;
        }

        public Criteria andChanzhiGreaterThan(Double value) {
            addCriterion("chanzhi >", value, "chanzhi");
            return (Criteria) this;
        }

        public Criteria andChanzhiGreaterThanOrEqualTo(Double value) {
            addCriterion("chanzhi >=", value, "chanzhi");
            return (Criteria) this;
        }

        public Criteria andChanzhiLessThan(Double value) {
            addCriterion("chanzhi <", value, "chanzhi");
            return (Criteria) this;
        }

        public Criteria andChanzhiLessThanOrEqualTo(Double value) {
            addCriterion("chanzhi <=", value, "chanzhi");
            return (Criteria) this;
        }

        public Criteria andChanzhiIn(List<Double> values) {
            addCriterion("chanzhi in", values, "chanzhi");
            return (Criteria) this;
        }

        public Criteria andChanzhiNotIn(List<Double> values) {
            addCriterion("chanzhi not in", values, "chanzhi");
            return (Criteria) this;
        }

        public Criteria andChanzhiBetween(Double value1, Double value2) {
            addCriterion("chanzhi between", value1, value2, "chanzhi");
            return (Criteria) this;
        }

        public Criteria andChanzhiNotBetween(Double value1, Double value2) {
            addCriterion("chanzhi not between", value1, value2, "chanzhi");
            return (Criteria) this;
        }

        public Criteria andJiageIsNull() {
            addCriterion("jiage is null");
            return (Criteria) this;
        }

        public Criteria andJiageIsNotNull() {
            addCriterion("jiage is not null");
            return (Criteria) this;
        }

        public Criteria andJiageEqualTo(Double value) {
            addCriterion("jiage =", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageNotEqualTo(Double value) {
            addCriterion("jiage <>", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageGreaterThan(Double value) {
            addCriterion("jiage >", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageGreaterThanOrEqualTo(Double value) {
            addCriterion("jiage >=", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageLessThan(Double value) {
            addCriterion("jiage <", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageLessThanOrEqualTo(Double value) {
            addCriterion("jiage <=", value, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageIn(List<Double> values) {
            addCriterion("jiage in", values, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageNotIn(List<Double> values) {
            addCriterion("jiage not in", values, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageBetween(Double value1, Double value2) {
            addCriterion("jiage between", value1, value2, "jiage");
            return (Criteria) this;
        }

        public Criteria andJiageNotBetween(Double value1, Double value2) {
            addCriterion("jiage not between", value1, value2, "jiage");
            return (Criteria) this;
        }

        public Criteria andJinkouIsNull() {
            addCriterion("jinkou is null");
            return (Criteria) this;
        }

        public Criteria andJinkouIsNotNull() {
            addCriterion("jinkou is not null");
            return (Criteria) this;
        }

        public Criteria andJinkouEqualTo(Double value) {
            addCriterion("jinkou =", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouNotEqualTo(Double value) {
            addCriterion("jinkou <>", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouGreaterThan(Double value) {
            addCriterion("jinkou >", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouGreaterThanOrEqualTo(Double value) {
            addCriterion("jinkou >=", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouLessThan(Double value) {
            addCriterion("jinkou <", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouLessThanOrEqualTo(Double value) {
            addCriterion("jinkou <=", value, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouIn(List<Double> values) {
            addCriterion("jinkou in", values, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouNotIn(List<Double> values) {
            addCriterion("jinkou not in", values, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouBetween(Double value1, Double value2) {
            addCriterion("jinkou between", value1, value2, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJinkouNotBetween(Double value1, Double value2) {
            addCriterion("jinkou not between", value1, value2, "jinkou");
            return (Criteria) this;
        }

        public Criteria andJkchanzhiIsNull() {
            addCriterion("jkchanzhi is null");
            return (Criteria) this;
        }

        public Criteria andJkchanzhiIsNotNull() {
            addCriterion("jkchanzhi is not null");
            return (Criteria) this;
        }

        public Criteria andJkchanzhiEqualTo(Double value) {
            addCriterion("jkchanzhi =", value, "jkchanzhi");
            return (Criteria) this;
        }

        public Criteria andJkchanzhiNotEqualTo(Double value) {
            addCriterion("jkchanzhi <>", value, "jkchanzhi");
            return (Criteria) this;
        }

        public Criteria andJkchanzhiGreaterThan(Double value) {
            addCriterion("jkchanzhi >", value, "jkchanzhi");
            return (Criteria) this;
        }

        public Criteria andJkchanzhiGreaterThanOrEqualTo(Double value) {
            addCriterion("jkchanzhi >=", value, "jkchanzhi");
            return (Criteria) this;
        }

        public Criteria andJkchanzhiLessThan(Double value) {
            addCriterion("jkchanzhi <", value, "jkchanzhi");
            return (Criteria) this;
        }

        public Criteria andJkchanzhiLessThanOrEqualTo(Double value) {
            addCriterion("jkchanzhi <=", value, "jkchanzhi");
            return (Criteria) this;
        }

        public Criteria andJkchanzhiIn(List<Double> values) {
            addCriterion("jkchanzhi in", values, "jkchanzhi");
            return (Criteria) this;
        }

        public Criteria andJkchanzhiNotIn(List<Double> values) {
            addCriterion("jkchanzhi not in", values, "jkchanzhi");
            return (Criteria) this;
        }

        public Criteria andJkchanzhiBetween(Double value1, Double value2) {
            addCriterion("jkchanzhi between", value1, value2, "jkchanzhi");
            return (Criteria) this;
        }

        public Criteria andJkchanzhiNotBetween(Double value1, Double value2) {
            addCriterion("jkchanzhi not between", value1, value2, "jkchanzhi");
            return (Criteria) this;
        }

        public Criteria andChukouIsNull() {
            addCriterion("chukou is null");
            return (Criteria) this;
        }

        public Criteria andChukouIsNotNull() {
            addCriterion("chukou is not null");
            return (Criteria) this;
        }

        public Criteria andChukouEqualTo(Double value) {
            addCriterion("chukou =", value, "chukou");
            return (Criteria) this;
        }

        public Criteria andChukouNotEqualTo(Double value) {
            addCriterion("chukou <>", value, "chukou");
            return (Criteria) this;
        }

        public Criteria andChukouGreaterThan(Double value) {
            addCriterion("chukou >", value, "chukou");
            return (Criteria) this;
        }

        public Criteria andChukouGreaterThanOrEqualTo(Double value) {
            addCriterion("chukou >=", value, "chukou");
            return (Criteria) this;
        }

        public Criteria andChukouLessThan(Double value) {
            addCriterion("chukou <", value, "chukou");
            return (Criteria) this;
        }

        public Criteria andChukouLessThanOrEqualTo(Double value) {
            addCriterion("chukou <=", value, "chukou");
            return (Criteria) this;
        }

        public Criteria andChukouIn(List<Double> values) {
            addCriterion("chukou in", values, "chukou");
            return (Criteria) this;
        }

        public Criteria andChukouNotIn(List<Double> values) {
            addCriterion("chukou not in", values, "chukou");
            return (Criteria) this;
        }

        public Criteria andChukouBetween(Double value1, Double value2) {
            addCriterion("chukou between", value1, value2, "chukou");
            return (Criteria) this;
        }

        public Criteria andChukouNotBetween(Double value1, Double value2) {
            addCriterion("chukou not between", value1, value2, "chukou");
            return (Criteria) this;
        }

        public Criteria andCkchanzhiIsNull() {
            addCriterion("ckchanzhi is null");
            return (Criteria) this;
        }

        public Criteria andCkchanzhiIsNotNull() {
            addCriterion("ckchanzhi is not null");
            return (Criteria) this;
        }

        public Criteria andCkchanzhiEqualTo(Double value) {
            addCriterion("ckchanzhi =", value, "ckchanzhi");
            return (Criteria) this;
        }

        public Criteria andCkchanzhiNotEqualTo(Double value) {
            addCriterion("ckchanzhi <>", value, "ckchanzhi");
            return (Criteria) this;
        }

        public Criteria andCkchanzhiGreaterThan(Double value) {
            addCriterion("ckchanzhi >", value, "ckchanzhi");
            return (Criteria) this;
        }

        public Criteria andCkchanzhiGreaterThanOrEqualTo(Double value) {
            addCriterion("ckchanzhi >=", value, "ckchanzhi");
            return (Criteria) this;
        }

        public Criteria andCkchanzhiLessThan(Double value) {
            addCriterion("ckchanzhi <", value, "ckchanzhi");
            return (Criteria) this;
        }

        public Criteria andCkchanzhiLessThanOrEqualTo(Double value) {
            addCriterion("ckchanzhi <=", value, "ckchanzhi");
            return (Criteria) this;
        }

        public Criteria andCkchanzhiIn(List<Double> values) {
            addCriterion("ckchanzhi in", values, "ckchanzhi");
            return (Criteria) this;
        }

        public Criteria andCkchanzhiNotIn(List<Double> values) {
            addCriterion("ckchanzhi not in", values, "ckchanzhi");
            return (Criteria) this;
        }

        public Criteria andCkchanzhiBetween(Double value1, Double value2) {
            addCriterion("ckchanzhi between", value1, value2, "ckchanzhi");
            return (Criteria) this;
        }

        public Criteria andCkchanzhiNotBetween(Double value1, Double value2) {
            addCriterion("ckchanzhi not between", value1, value2, "ckchanzhi");
            return (Criteria) this;
        }

        public Criteria andXiaofeiIsNull() {
            addCriterion("xiaofei is null");
            return (Criteria) this;
        }

        public Criteria andXiaofeiIsNotNull() {
            addCriterion("xiaofei is not null");
            return (Criteria) this;
        }

        public Criteria andXiaofeiEqualTo(Double value) {
            addCriterion("xiaofei =", value, "xiaofei");
            return (Criteria) this;
        }

        public Criteria andXiaofeiNotEqualTo(Double value) {
            addCriterion("xiaofei <>", value, "xiaofei");
            return (Criteria) this;
        }

        public Criteria andXiaofeiGreaterThan(Double value) {
            addCriterion("xiaofei >", value, "xiaofei");
            return (Criteria) this;
        }

        public Criteria andXiaofeiGreaterThanOrEqualTo(Double value) {
            addCriterion("xiaofei >=", value, "xiaofei");
            return (Criteria) this;
        }

        public Criteria andXiaofeiLessThan(Double value) {
            addCriterion("xiaofei <", value, "xiaofei");
            return (Criteria) this;
        }

        public Criteria andXiaofeiLessThanOrEqualTo(Double value) {
            addCriterion("xiaofei <=", value, "xiaofei");
            return (Criteria) this;
        }

        public Criteria andXiaofeiIn(List<Double> values) {
            addCriterion("xiaofei in", values, "xiaofei");
            return (Criteria) this;
        }

        public Criteria andXiaofeiNotIn(List<Double> values) {
            addCriterion("xiaofei not in", values, "xiaofei");
            return (Criteria) this;
        }

        public Criteria andXiaofeiBetween(Double value1, Double value2) {
            addCriterion("xiaofei between", value1, value2, "xiaofei");
            return (Criteria) this;
        }

        public Criteria andXiaofeiNotBetween(Double value1, Double value2) {
            addCriterion("xiaofei not between", value1, value2, "xiaofei");
            return (Criteria) this;
        }

        public Criteria andMaolilvIsNull() {
            addCriterion("maolilv is null");
            return (Criteria) this;
        }

        public Criteria andMaolilvIsNotNull() {
            addCriterion("maolilv is not null");
            return (Criteria) this;
        }

        public Criteria andMaolilvEqualTo(Double value) {
            addCriterion("maolilv =", value, "maolilv");
            return (Criteria) this;
        }

        public Criteria andMaolilvNotEqualTo(Double value) {
            addCriterion("maolilv <>", value, "maolilv");
            return (Criteria) this;
        }

        public Criteria andMaolilvGreaterThan(Double value) {
            addCriterion("maolilv >", value, "maolilv");
            return (Criteria) this;
        }

        public Criteria andMaolilvGreaterThanOrEqualTo(Double value) {
            addCriterion("maolilv >=", value, "maolilv");
            return (Criteria) this;
        }

        public Criteria andMaolilvLessThan(Double value) {
            addCriterion("maolilv <", value, "maolilv");
            return (Criteria) this;
        }

        public Criteria andMaolilvLessThanOrEqualTo(Double value) {
            addCriterion("maolilv <=", value, "maolilv");
            return (Criteria) this;
        }

        public Criteria andMaolilvIn(List<Double> values) {
            addCriterion("maolilv in", values, "maolilv");
            return (Criteria) this;
        }

        public Criteria andMaolilvNotIn(List<Double> values) {
            addCriterion("maolilv not in", values, "maolilv");
            return (Criteria) this;
        }

        public Criteria andMaolilvBetween(Double value1, Double value2) {
            addCriterion("maolilv between", value1, value2, "maolilv");
            return (Criteria) this;
        }

        public Criteria andMaolilvNotBetween(Double value1, Double value2) {
            addCriterion("maolilv not between", value1, value2, "maolilv");
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