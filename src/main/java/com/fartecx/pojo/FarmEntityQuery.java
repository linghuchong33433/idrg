package com.fartecx.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FarmEntityQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected String fields;

    public FarmEntityQuery() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("position like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("position not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andZoomIsNull() {
            addCriterion("zoom is null");
            return (Criteria) this;
        }

        public Criteria andZoomIsNotNull() {
            addCriterion("zoom is not null");
            return (Criteria) this;
        }

        public Criteria andZoomEqualTo(Integer value) {
            addCriterion("zoom =", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomNotEqualTo(Integer value) {
            addCriterion("zoom <>", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomGreaterThan(Integer value) {
            addCriterion("zoom >", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomGreaterThanOrEqualTo(Integer value) {
            addCriterion("zoom >=", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomLessThan(Integer value) {
            addCriterion("zoom <", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomLessThanOrEqualTo(Integer value) {
            addCriterion("zoom <=", value, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomIn(List<Integer> values) {
            addCriterion("zoom in", values, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomNotIn(List<Integer> values) {
            addCriterion("zoom not in", values, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomBetween(Integer value1, Integer value2) {
            addCriterion("zoom between", value1, value2, "zoom");
            return (Criteria) this;
        }

        public Criteria andZoomNotBetween(Integer value1, Integer value2) {
            addCriterion("zoom not between", value1, value2, "zoom");
            return (Criteria) this;
        }

        public Criteria andGeojsonIsNull() {
            addCriterion("geojson is null");
            return (Criteria) this;
        }

        public Criteria andGeojsonIsNotNull() {
            addCriterion("geojson is not null");
            return (Criteria) this;
        }

        public Criteria andGeojsonEqualTo(String value) {
            addCriterion("geojson =", value, "geojson");
            return (Criteria) this;
        }

        public Criteria andGeojsonNotEqualTo(String value) {
            addCriterion("geojson <>", value, "geojson");
            return (Criteria) this;
        }

        public Criteria andGeojsonGreaterThan(String value) {
            addCriterion("geojson >", value, "geojson");
            return (Criteria) this;
        }

        public Criteria andGeojsonGreaterThanOrEqualTo(String value) {
            addCriterion("geojson >=", value, "geojson");
            return (Criteria) this;
        }

        public Criteria andGeojsonLessThan(String value) {
            addCriterion("geojson <", value, "geojson");
            return (Criteria) this;
        }

        public Criteria andGeojsonLessThanOrEqualTo(String value) {
            addCriterion("geojson <=", value, "geojson");
            return (Criteria) this;
        }

        public Criteria andGeojsonLike(String value) {
            addCriterion("geojson like", value, "geojson");
            return (Criteria) this;
        }

        public Criteria andGeojsonNotLike(String value) {
            addCriterion("geojson not like", value, "geojson");
            return (Criteria) this;
        }

        public Criteria andGeojsonIn(List<String> values) {
            addCriterion("geojson in", values, "geojson");
            return (Criteria) this;
        }

        public Criteria andGeojsonNotIn(List<String> values) {
            addCriterion("geojson not in", values, "geojson");
            return (Criteria) this;
        }

        public Criteria andGeojsonBetween(String value1, String value2) {
            addCriterion("geojson between", value1, value2, "geojson");
            return (Criteria) this;
        }

        public Criteria andGeojsonNotBetween(String value1, String value2) {
            addCriterion("geojson not between", value1, value2, "geojson");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("modifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("modifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("modifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("modifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("modifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("modifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("modifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("modifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("modifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNull() {
            addCriterion("owner is null");
            return (Criteria) this;
        }

        public Criteria andOwnerIsNotNull() {
            addCriterion("owner is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerEqualTo(String value) {
            addCriterion("owner =", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotEqualTo(String value) {
            addCriterion("owner <>", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThan(String value) {
            addCriterion("owner >", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerGreaterThanOrEqualTo(String value) {
            addCriterion("owner >=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThan(String value) {
            addCriterion("owner <", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLessThanOrEqualTo(String value) {
            addCriterion("owner <=", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerLike(String value) {
            addCriterion("owner like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotLike(String value) {
            addCriterion("owner not like", value, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerIn(List<String> values) {
            addCriterion("owner in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotIn(List<String> values) {
            addCriterion("owner not in", values, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerBetween(String value1, String value2) {
            addCriterion("owner between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andOwnerNotBetween(String value1, String value2) {
            addCriterion("owner not between", value1, value2, "owner");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
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

        public Criteria andContactpersonIsNull() {
            addCriterion("contactPerson is null");
            return (Criteria) this;
        }

        public Criteria andContactpersonIsNotNull() {
            addCriterion("contactPerson is not null");
            return (Criteria) this;
        }

        public Criteria andContactpersonEqualTo(String value) {
            addCriterion("contactPerson =", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotEqualTo(String value) {
            addCriterion("contactPerson <>", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonGreaterThan(String value) {
            addCriterion("contactPerson >", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonGreaterThanOrEqualTo(String value) {
            addCriterion("contactPerson >=", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLessThan(String value) {
            addCriterion("contactPerson <", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLessThanOrEqualTo(String value) {
            addCriterion("contactPerson <=", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonLike(String value) {
            addCriterion("contactPerson like", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotLike(String value) {
            addCriterion("contactPerson not like", value, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonIn(List<String> values) {
            addCriterion("contactPerson in", values, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotIn(List<String> values) {
            addCriterion("contactPerson not in", values, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonBetween(String value1, String value2) {
            addCriterion("contactPerson between", value1, value2, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactpersonNotBetween(String value1, String value2) {
            addCriterion("contactPerson not between", value1, value2, "contactperson");
            return (Criteria) this;
        }

        public Criteria andContactphoneIsNull() {
            addCriterion("contactPhone is null");
            return (Criteria) this;
        }

        public Criteria andContactphoneIsNotNull() {
            addCriterion("contactPhone is not null");
            return (Criteria) this;
        }

        public Criteria andContactphoneEqualTo(String value) {
            addCriterion("contactPhone =", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotEqualTo(String value) {
            addCriterion("contactPhone <>", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneGreaterThan(String value) {
            addCriterion("contactPhone >", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneGreaterThanOrEqualTo(String value) {
            addCriterion("contactPhone >=", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLessThan(String value) {
            addCriterion("contactPhone <", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLessThanOrEqualTo(String value) {
            addCriterion("contactPhone <=", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneLike(String value) {
            addCriterion("contactPhone like", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotLike(String value) {
            addCriterion("contactPhone not like", value, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneIn(List<String> values) {
            addCriterion("contactPhone in", values, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotIn(List<String> values) {
            addCriterion("contactPhone not in", values, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneBetween(String value1, String value2) {
            addCriterion("contactPhone between", value1, value2, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactphoneNotBetween(String value1, String value2) {
            addCriterion("contactPhone not between", value1, value2, "contactphone");
            return (Criteria) this;
        }

        public Criteria andContactaddrIsNull() {
            addCriterion("contactAddr is null");
            return (Criteria) this;
        }

        public Criteria andContactaddrIsNotNull() {
            addCriterion("contactAddr is not null");
            return (Criteria) this;
        }

        public Criteria andContactaddrEqualTo(String value) {
            addCriterion("contactAddr =", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrNotEqualTo(String value) {
            addCriterion("contactAddr <>", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrGreaterThan(String value) {
            addCriterion("contactAddr >", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrGreaterThanOrEqualTo(String value) {
            addCriterion("contactAddr >=", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrLessThan(String value) {
            addCriterion("contactAddr <", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrLessThanOrEqualTo(String value) {
            addCriterion("contactAddr <=", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrLike(String value) {
            addCriterion("contactAddr like", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrNotLike(String value) {
            addCriterion("contactAddr not like", value, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrIn(List<String> values) {
            addCriterion("contactAddr in", values, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrNotIn(List<String> values) {
            addCriterion("contactAddr not in", values, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrBetween(String value1, String value2) {
            addCriterion("contactAddr between", value1, value2, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andContactaddrNotBetween(String value1, String value2) {
            addCriterion("contactAddr not between", value1, value2, "contactaddr");
            return (Criteria) this;
        }

        public Criteria andDescstrIsNull() {
            addCriterion("descStr is null");
            return (Criteria) this;
        }

        public Criteria andDescstrIsNotNull() {
            addCriterion("descStr is not null");
            return (Criteria) this;
        }

        public Criteria andDescstrEqualTo(String value) {
            addCriterion("descStr =", value, "descstr");
            return (Criteria) this;
        }

        public Criteria andDescstrNotEqualTo(String value) {
            addCriterion("descStr <>", value, "descstr");
            return (Criteria) this;
        }

        public Criteria andDescstrGreaterThan(String value) {
            addCriterion("descStr >", value, "descstr");
            return (Criteria) this;
        }

        public Criteria andDescstrGreaterThanOrEqualTo(String value) {
            addCriterion("descStr >=", value, "descstr");
            return (Criteria) this;
        }

        public Criteria andDescstrLessThan(String value) {
            addCriterion("descStr <", value, "descstr");
            return (Criteria) this;
        }

        public Criteria andDescstrLessThanOrEqualTo(String value) {
            addCriterion("descStr <=", value, "descstr");
            return (Criteria) this;
        }

        public Criteria andDescstrLike(String value) {
            addCriterion("descStr like", value, "descstr");
            return (Criteria) this;
        }

        public Criteria andDescstrNotLike(String value) {
            addCriterion("descStr not like", value, "descstr");
            return (Criteria) this;
        }

        public Criteria andDescstrIn(List<String> values) {
            addCriterion("descStr in", values, "descstr");
            return (Criteria) this;
        }

        public Criteria andDescstrNotIn(List<String> values) {
            addCriterion("descStr not in", values, "descstr");
            return (Criteria) this;
        }

        public Criteria andDescstrBetween(String value1, String value2) {
            addCriterion("descStr between", value1, value2, "descstr");
            return (Criteria) this;
        }

        public Criteria andDescstrNotBetween(String value1, String value2) {
            addCriterion("descStr not between", value1, value2, "descstr");
            return (Criteria) this;
        }

        public Criteria andBlIsNull() {
            addCriterion("bl is null");
            return (Criteria) this;
        }

        public Criteria andBlIsNotNull() {
            addCriterion("bl is not null");
            return (Criteria) this;
        }

        public Criteria andBlEqualTo(String value) {
            addCriterion("bl =", value, "bl");
            return (Criteria) this;
        }

        public Criteria andBlNotEqualTo(String value) {
            addCriterion("bl <>", value, "bl");
            return (Criteria) this;
        }

        public Criteria andBlGreaterThan(String value) {
            addCriterion("bl >", value, "bl");
            return (Criteria) this;
        }

        public Criteria andBlGreaterThanOrEqualTo(String value) {
            addCriterion("bl >=", value, "bl");
            return (Criteria) this;
        }

        public Criteria andBlLessThan(String value) {
            addCriterion("bl <", value, "bl");
            return (Criteria) this;
        }

        public Criteria andBlLessThanOrEqualTo(String value) {
            addCriterion("bl <=", value, "bl");
            return (Criteria) this;
        }

        public Criteria andBlLike(String value) {
            addCriterion("bl like", value, "bl");
            return (Criteria) this;
        }

        public Criteria andBlNotLike(String value) {
            addCriterion("bl not like", value, "bl");
            return (Criteria) this;
        }

        public Criteria andBlIn(List<String> values) {
            addCriterion("bl in", values, "bl");
            return (Criteria) this;
        }

        public Criteria andBlNotIn(List<String> values) {
            addCriterion("bl not in", values, "bl");
            return (Criteria) this;
        }

        public Criteria andBlBetween(String value1, String value2) {
            addCriterion("bl between", value1, value2, "bl");
            return (Criteria) this;
        }

        public Criteria andBlNotBetween(String value1, String value2) {
            addCriterion("bl not between", value1, value2, "bl");
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