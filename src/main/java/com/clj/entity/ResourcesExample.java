package com.clj.entity;

import java.util.ArrayList;
import java.util.List;

public class ResourcesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourcesExample() {
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

        public Criteria andResourcesIdIsNull() {
            addCriterion("resources_id is null");
            return (Criteria) this;
        }

        public Criteria andResourcesIdIsNotNull() {
            addCriterion("resources_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesIdEqualTo(Integer value) {
            addCriterion("resources_id =", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdNotEqualTo(Integer value) {
            addCriterion("resources_id <>", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdGreaterThan(Integer value) {
            addCriterion("resources_id >", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resources_id >=", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdLessThan(Integer value) {
            addCriterion("resources_id <", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdLessThanOrEqualTo(Integer value) {
            addCriterion("resources_id <=", value, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdIn(List<Integer> values) {
            addCriterion("resources_id in", values, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdNotIn(List<Integer> values) {
            addCriterion("resources_id not in", values, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdBetween(Integer value1, Integer value2) {
            addCriterion("resources_id between", value1, value2, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andResourcesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resources_id not between", value1, value2, "resourcesId");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameIsNull() {
            addCriterion("jurisdiction_name is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameIsNotNull() {
            addCriterion("jurisdiction_name is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameEqualTo(String value) {
            addCriterion("jurisdiction_name =", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameNotEqualTo(String value) {
            addCriterion("jurisdiction_name <>", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameGreaterThan(String value) {
            addCriterion("jurisdiction_name >", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameGreaterThanOrEqualTo(String value) {
            addCriterion("jurisdiction_name >=", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameLessThan(String value) {
            addCriterion("jurisdiction_name <", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameLessThanOrEqualTo(String value) {
            addCriterion("jurisdiction_name <=", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameLike(String value) {
            addCriterion("jurisdiction_name like", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameNotLike(String value) {
            addCriterion("jurisdiction_name not like", value, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameIn(List<String> values) {
            addCriterion("jurisdiction_name in", values, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameNotIn(List<String> values) {
            addCriterion("jurisdiction_name not in", values, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameBetween(String value1, String value2) {
            addCriterion("jurisdiction_name between", value1, value2, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNameNotBetween(String value1, String value2) {
            addCriterion("jurisdiction_name not between", value1, value2, "jurisdictionName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameIsNull() {
            addCriterion("resources_name is null");
            return (Criteria) this;
        }

        public Criteria andResourcesNameIsNotNull() {
            addCriterion("resources_name is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesNameEqualTo(String value) {
            addCriterion("resources_name =", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameNotEqualTo(String value) {
            addCriterion("resources_name <>", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameGreaterThan(String value) {
            addCriterion("resources_name >", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameGreaterThanOrEqualTo(String value) {
            addCriterion("resources_name >=", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameLessThan(String value) {
            addCriterion("resources_name <", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameLessThanOrEqualTo(String value) {
            addCriterion("resources_name <=", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameLike(String value) {
            addCriterion("resources_name like", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameNotLike(String value) {
            addCriterion("resources_name not like", value, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameIn(List<String> values) {
            addCriterion("resources_name in", values, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameNotIn(List<String> values) {
            addCriterion("resources_name not in", values, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameBetween(String value1, String value2) {
            addCriterion("resources_name between", value1, value2, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesNameNotBetween(String value1, String value2) {
            addCriterion("resources_name not between", value1, value2, "resourcesName");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlIsNull() {
            addCriterion("resources_url is null");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlIsNotNull() {
            addCriterion("resources_url is not null");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlEqualTo(String value) {
            addCriterion("resources_url =", value, "resourcesUrl");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlNotEqualTo(String value) {
            addCriterion("resources_url <>", value, "resourcesUrl");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlGreaterThan(String value) {
            addCriterion("resources_url >", value, "resourcesUrl");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlGreaterThanOrEqualTo(String value) {
            addCriterion("resources_url >=", value, "resourcesUrl");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlLessThan(String value) {
            addCriterion("resources_url <", value, "resourcesUrl");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlLessThanOrEqualTo(String value) {
            addCriterion("resources_url <=", value, "resourcesUrl");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlLike(String value) {
            addCriterion("resources_url like", value, "resourcesUrl");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlNotLike(String value) {
            addCriterion("resources_url not like", value, "resourcesUrl");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlIn(List<String> values) {
            addCriterion("resources_url in", values, "resourcesUrl");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlNotIn(List<String> values) {
            addCriterion("resources_url not in", values, "resourcesUrl");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlBetween(String value1, String value2) {
            addCriterion("resources_url between", value1, value2, "resourcesUrl");
            return (Criteria) this;
        }

        public Criteria andResourcesUrlNotBetween(String value1, String value2) {
            addCriterion("resources_url not between", value1, value2, "resourcesUrl");
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