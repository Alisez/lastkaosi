package com.maven.po;

import java.util.ArrayList;
import java.util.List;

public class OrderdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderdetailExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrdersidIsNull() {
            addCriterion("ORDERSID is null");
            return (Criteria) this;
        }

        public Criteria andOrdersidIsNotNull() {
            addCriterion("ORDERSID is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersidEqualTo(Integer value) {
            addCriterion("ORDERSID =", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotEqualTo(Integer value) {
            addCriterion("ORDERSID <>", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThan(Integer value) {
            addCriterion("ORDERSID >", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDERSID >=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThan(Integer value) {
            addCriterion("ORDERSID <", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidLessThanOrEqualTo(Integer value) {
            addCriterion("ORDERSID <=", value, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidIn(List<Integer> values) {
            addCriterion("ORDERSID in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotIn(List<Integer> values) {
            addCriterion("ORDERSID not in", values, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidBetween(Integer value1, Integer value2) {
            addCriterion("ORDERSID between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andOrdersidNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDERSID not between", value1, value2, "ordersid");
            return (Criteria) this;
        }

        public Criteria andItemsidIsNull() {
            addCriterion("ITEMSID is null");
            return (Criteria) this;
        }

        public Criteria andItemsidIsNotNull() {
            addCriterion("ITEMSID is not null");
            return (Criteria) this;
        }

        public Criteria andItemsidEqualTo(Integer value) {
            addCriterion("ITEMSID =", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidNotEqualTo(Integer value) {
            addCriterion("ITEMSID <>", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidGreaterThan(Integer value) {
            addCriterion("ITEMSID >", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEMSID >=", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidLessThan(Integer value) {
            addCriterion("ITEMSID <", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidLessThanOrEqualTo(Integer value) {
            addCriterion("ITEMSID <=", value, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidIn(List<Integer> values) {
            addCriterion("ITEMSID in", values, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidNotIn(List<Integer> values) {
            addCriterion("ITEMSID not in", values, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidBetween(Integer value1, Integer value2) {
            addCriterion("ITEMSID between", value1, value2, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsidNotBetween(Integer value1, Integer value2) {
            addCriterion("ITEMSID not between", value1, value2, "itemsid");
            return (Criteria) this;
        }

        public Criteria andItemsnumIsNull() {
            addCriterion("ITEMSNUM is null");
            return (Criteria) this;
        }

        public Criteria andItemsnumIsNotNull() {
            addCriterion("ITEMSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andItemsnumEqualTo(Integer value) {
            addCriterion("ITEMSNUM =", value, "itemsnum");
            return (Criteria) this;
        }

        public Criteria andItemsnumNotEqualTo(Integer value) {
            addCriterion("ITEMSNUM <>", value, "itemsnum");
            return (Criteria) this;
        }

        public Criteria andItemsnumGreaterThan(Integer value) {
            addCriterion("ITEMSNUM >", value, "itemsnum");
            return (Criteria) this;
        }

        public Criteria andItemsnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEMSNUM >=", value, "itemsnum");
            return (Criteria) this;
        }

        public Criteria andItemsnumLessThan(Integer value) {
            addCriterion("ITEMSNUM <", value, "itemsnum");
            return (Criteria) this;
        }

        public Criteria andItemsnumLessThanOrEqualTo(Integer value) {
            addCriterion("ITEMSNUM <=", value, "itemsnum");
            return (Criteria) this;
        }

        public Criteria andItemsnumIn(List<Integer> values) {
            addCriterion("ITEMSNUM in", values, "itemsnum");
            return (Criteria) this;
        }

        public Criteria andItemsnumNotIn(List<Integer> values) {
            addCriterion("ITEMSNUM not in", values, "itemsnum");
            return (Criteria) this;
        }

        public Criteria andItemsnumBetween(Integer value1, Integer value2) {
            addCriterion("ITEMSNUM between", value1, value2, "itemsnum");
            return (Criteria) this;
        }

        public Criteria andItemsnumNotBetween(Integer value1, Integer value2) {
            addCriterion("ITEMSNUM not between", value1, value2, "itemsnum");
            return (Criteria) this;
        }

        public Criteria andItemsIsNull() {
            addCriterion("ITEMS is null");
            return (Criteria) this;
        }

        public Criteria andItemsIsNotNull() {
            addCriterion("ITEMS is not null");
            return (Criteria) this;
        }

        public Criteria andItemsEqualTo(Integer value) {
            addCriterion("ITEMS =", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotEqualTo(Integer value) {
            addCriterion("ITEMS <>", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsGreaterThan(Integer value) {
            addCriterion("ITEMS >", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ITEMS >=", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLessThan(Integer value) {
            addCriterion("ITEMS <", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsLessThanOrEqualTo(Integer value) {
            addCriterion("ITEMS <=", value, "items");
            return (Criteria) this;
        }

        public Criteria andItemsIn(List<Integer> values) {
            addCriterion("ITEMS in", values, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotIn(List<Integer> values) {
            addCriterion("ITEMS not in", values, "items");
            return (Criteria) this;
        }

        public Criteria andItemsBetween(Integer value1, Integer value2) {
            addCriterion("ITEMS between", value1, value2, "items");
            return (Criteria) this;
        }

        public Criteria andItemsNotBetween(Integer value1, Integer value2) {
            addCriterion("ITEMS not between", value1, value2, "items");
            return (Criteria) this;
        }

        public Criteria andIdxIsNull() {
            addCriterion("idx is null");
            return (Criteria) this;
        }

        public Criteria andIdxIsNotNull() {
            addCriterion("idx is not null");
            return (Criteria) this;
        }

        public Criteria andIdxEqualTo(Integer value) {
            addCriterion("idx =", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotEqualTo(Integer value) {
            addCriterion("idx <>", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThan(Integer value) {
            addCriterion("idx >", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("idx >=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThan(Integer value) {
            addCriterion("idx <", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThanOrEqualTo(Integer value) {
            addCriterion("idx <=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxIn(List<Integer> values) {
            addCriterion("idx in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotIn(List<Integer> values) {
            addCriterion("idx not in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxBetween(Integer value1, Integer value2) {
            addCriterion("idx between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("idx not between", value1, value2, "idx");
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