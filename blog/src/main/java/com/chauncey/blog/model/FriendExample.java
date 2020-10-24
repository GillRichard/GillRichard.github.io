package com.chauncey.blog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FriendExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBlogaddressIsNull() {
            addCriterion("blogaddress is null");
            return (Criteria) this;
        }

        public Criteria andBlogaddressIsNotNull() {
            addCriterion("blogaddress is not null");
            return (Criteria) this;
        }

        public Criteria andBlogaddressEqualTo(String value) {
            addCriterion("blogaddress =", value, "blogaddress");
            return (Criteria) this;
        }

        public Criteria andBlogaddressNotEqualTo(String value) {
            addCriterion("blogaddress <>", value, "blogaddress");
            return (Criteria) this;
        }

        public Criteria andBlogaddressGreaterThan(String value) {
            addCriterion("blogaddress >", value, "blogaddress");
            return (Criteria) this;
        }

        public Criteria andBlogaddressGreaterThanOrEqualTo(String value) {
            addCriterion("blogaddress >=", value, "blogaddress");
            return (Criteria) this;
        }

        public Criteria andBlogaddressLessThan(String value) {
            addCriterion("blogaddress <", value, "blogaddress");
            return (Criteria) this;
        }

        public Criteria andBlogaddressLessThanOrEqualTo(String value) {
            addCriterion("blogaddress <=", value, "blogaddress");
            return (Criteria) this;
        }

        public Criteria andBlogaddressLike(String value) {
            addCriterion("blogaddress like", value, "blogaddress");
            return (Criteria) this;
        }

        public Criteria andBlogaddressNotLike(String value) {
            addCriterion("blogaddress not like", value, "blogaddress");
            return (Criteria) this;
        }

        public Criteria andBlogaddressIn(List<String> values) {
            addCriterion("blogaddress in", values, "blogaddress");
            return (Criteria) this;
        }

        public Criteria andBlogaddressNotIn(List<String> values) {
            addCriterion("blogaddress not in", values, "blogaddress");
            return (Criteria) this;
        }

        public Criteria andBlogaddressBetween(String value1, String value2) {
            addCriterion("blogaddress between", value1, value2, "blogaddress");
            return (Criteria) this;
        }

        public Criteria andBlogaddressNotBetween(String value1, String value2) {
            addCriterion("blogaddress not between", value1, value2, "blogaddress");
            return (Criteria) this;
        }

        public Criteria andBlognameIsNull() {
            addCriterion("blogname is null");
            return (Criteria) this;
        }

        public Criteria andBlognameIsNotNull() {
            addCriterion("blogname is not null");
            return (Criteria) this;
        }

        public Criteria andBlognameEqualTo(String value) {
            addCriterion("blogname =", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameNotEqualTo(String value) {
            addCriterion("blogname <>", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameGreaterThan(String value) {
            addCriterion("blogname >", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameGreaterThanOrEqualTo(String value) {
            addCriterion("blogname >=", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameLessThan(String value) {
            addCriterion("blogname <", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameLessThanOrEqualTo(String value) {
            addCriterion("blogname <=", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameLike(String value) {
            addCriterion("blogname like", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameNotLike(String value) {
            addCriterion("blogname not like", value, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameIn(List<String> values) {
            addCriterion("blogname in", values, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameNotIn(List<String> values) {
            addCriterion("blogname not in", values, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameBetween(String value1, String value2) {
            addCriterion("blogname between", value1, value2, "blogname");
            return (Criteria) this;
        }

        public Criteria andBlognameNotBetween(String value1, String value2) {
            addCriterion("blogname not between", value1, value2, "blogname");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPictureaddressIsNull() {
            addCriterion("pictureaddress is null");
            return (Criteria) this;
        }

        public Criteria andPictureaddressIsNotNull() {
            addCriterion("pictureaddress is not null");
            return (Criteria) this;
        }

        public Criteria andPictureaddressEqualTo(String value) {
            addCriterion("pictureaddress =", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressNotEqualTo(String value) {
            addCriterion("pictureaddress <>", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressGreaterThan(String value) {
            addCriterion("pictureaddress >", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressGreaterThanOrEqualTo(String value) {
            addCriterion("pictureaddress >=", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressLessThan(String value) {
            addCriterion("pictureaddress <", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressLessThanOrEqualTo(String value) {
            addCriterion("pictureaddress <=", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressLike(String value) {
            addCriterion("pictureaddress like", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressNotLike(String value) {
            addCriterion("pictureaddress not like", value, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressIn(List<String> values) {
            addCriterion("pictureaddress in", values, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressNotIn(List<String> values) {
            addCriterion("pictureaddress not in", values, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressBetween(String value1, String value2) {
            addCriterion("pictureaddress between", value1, value2, "pictureaddress");
            return (Criteria) this;
        }

        public Criteria andPictureaddressNotBetween(String value1, String value2) {
            addCriterion("pictureaddress not between", value1, value2, "pictureaddress");
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