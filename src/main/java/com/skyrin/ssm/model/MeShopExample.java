package com.skyrin.ssm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeShopExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNull() {
            addCriterion("shop_address is null");
            return (Criteria) this;
        }

        public Criteria andShopAddressIsNotNull() {
            addCriterion("shop_address is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddressEqualTo(String value) {
            addCriterion("shop_address =", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotEqualTo(String value) {
            addCriterion("shop_address <>", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThan(String value) {
            addCriterion("shop_address >", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shop_address >=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThan(String value) {
            addCriterion("shop_address <", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLessThanOrEqualTo(String value) {
            addCriterion("shop_address <=", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressLike(String value) {
            addCriterion("shop_address like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotLike(String value) {
            addCriterion("shop_address not like", value, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressIn(List<String> values) {
            addCriterion("shop_address in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotIn(List<String> values) {
            addCriterion("shop_address not in", values, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressBetween(String value1, String value2) {
            addCriterion("shop_address between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopAddressNotBetween(String value1, String value2) {
            addCriterion("shop_address not between", value1, value2, "shopAddress");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopTimeIsNull() {
            addCriterion("shop_time is null");
            return (Criteria) this;
        }

        public Criteria andShopTimeIsNotNull() {
            addCriterion("shop_time is not null");
            return (Criteria) this;
        }

        public Criteria andShopTimeEqualTo(String value) {
            addCriterion("shop_time =", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeNotEqualTo(String value) {
            addCriterion("shop_time <>", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeGreaterThan(String value) {
            addCriterion("shop_time >", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_time >=", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeLessThan(String value) {
            addCriterion("shop_time <", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeLessThanOrEqualTo(String value) {
            addCriterion("shop_time <=", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeLike(String value) {
            addCriterion("shop_time like", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeNotLike(String value) {
            addCriterion("shop_time not like", value, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeIn(List<String> values) {
            addCriterion("shop_time in", values, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeNotIn(List<String> values) {
            addCriterion("shop_time not in", values, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeBetween(String value1, String value2) {
            addCriterion("shop_time between", value1, value2, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopTimeNotBetween(String value1, String value2) {
            addCriterion("shop_time not between", value1, value2, "shopTime");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNull() {
            addCriterion("shop_phone is null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIsNotNull() {
            addCriterion("shop_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShopPhoneEqualTo(String value) {
            addCriterion("shop_phone =", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotEqualTo(String value) {
            addCriterion("shop_phone <>", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThan(String value) {
            addCriterion("shop_phone >", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("shop_phone >=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThan(String value) {
            addCriterion("shop_phone <", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLessThanOrEqualTo(String value) {
            addCriterion("shop_phone <=", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneLike(String value) {
            addCriterion("shop_phone like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotLike(String value) {
            addCriterion("shop_phone not like", value, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneIn(List<String> values) {
            addCriterion("shop_phone in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotIn(List<String> values) {
            addCriterion("shop_phone not in", values, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneBetween(String value1, String value2) {
            addCriterion("shop_phone between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopPhoneNotBetween(String value1, String value2) {
            addCriterion("shop_phone not between", value1, value2, "shopPhone");
            return (Criteria) this;
        }

        public Criteria andShopImageIsNull() {
            addCriterion("shop_image is null");
            return (Criteria) this;
        }

        public Criteria andShopImageIsNotNull() {
            addCriterion("shop_image is not null");
            return (Criteria) this;
        }

        public Criteria andShopImageEqualTo(String value) {
            addCriterion("shop_image =", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotEqualTo(String value) {
            addCriterion("shop_image <>", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageGreaterThan(String value) {
            addCriterion("shop_image >", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageGreaterThanOrEqualTo(String value) {
            addCriterion("shop_image >=", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageLessThan(String value) {
            addCriterion("shop_image <", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageLessThanOrEqualTo(String value) {
            addCriterion("shop_image <=", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageLike(String value) {
            addCriterion("shop_image like", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotLike(String value) {
            addCriterion("shop_image not like", value, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageIn(List<String> values) {
            addCriterion("shop_image in", values, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotIn(List<String> values) {
            addCriterion("shop_image not in", values, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageBetween(String value1, String value2) {
            addCriterion("shop_image between", value1, value2, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopImageNotBetween(String value1, String value2) {
            addCriterion("shop_image not between", value1, value2, "shopImage");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeIsNull() {
            addCriterion("shop_longitude is null");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeIsNotNull() {
            addCriterion("shop_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeEqualTo(String value) {
            addCriterion("shop_longitude =", value, "shopLongitude");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeNotEqualTo(String value) {
            addCriterion("shop_longitude <>", value, "shopLongitude");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeGreaterThan(String value) {
            addCriterion("shop_longitude >", value, "shopLongitude");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_longitude >=", value, "shopLongitude");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeLessThan(String value) {
            addCriterion("shop_longitude <", value, "shopLongitude");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeLessThanOrEqualTo(String value) {
            addCriterion("shop_longitude <=", value, "shopLongitude");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeLike(String value) {
            addCriterion("shop_longitude like", value, "shopLongitude");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeNotLike(String value) {
            addCriterion("shop_longitude not like", value, "shopLongitude");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeIn(List<String> values) {
            addCriterion("shop_longitude in", values, "shopLongitude");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeNotIn(List<String> values) {
            addCriterion("shop_longitude not in", values, "shopLongitude");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeBetween(String value1, String value2) {
            addCriterion("shop_longitude between", value1, value2, "shopLongitude");
            return (Criteria) this;
        }

        public Criteria andShopLongitudeNotBetween(String value1, String value2) {
            addCriterion("shop_longitude not between", value1, value2, "shopLongitude");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeIsNull() {
            addCriterion("shop_latitude is null");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeIsNotNull() {
            addCriterion("shop_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeEqualTo(String value) {
            addCriterion("shop_latitude =", value, "shopLatitude");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeNotEqualTo(String value) {
            addCriterion("shop_latitude <>", value, "shopLatitude");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeGreaterThan(String value) {
            addCriterion("shop_latitude >", value, "shopLatitude");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_latitude >=", value, "shopLatitude");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeLessThan(String value) {
            addCriterion("shop_latitude <", value, "shopLatitude");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeLessThanOrEqualTo(String value) {
            addCriterion("shop_latitude <=", value, "shopLatitude");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeLike(String value) {
            addCriterion("shop_latitude like", value, "shopLatitude");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeNotLike(String value) {
            addCriterion("shop_latitude not like", value, "shopLatitude");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeIn(List<String> values) {
            addCriterion("shop_latitude in", values, "shopLatitude");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeNotIn(List<String> values) {
            addCriterion("shop_latitude not in", values, "shopLatitude");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeBetween(String value1, String value2) {
            addCriterion("shop_latitude between", value1, value2, "shopLatitude");
            return (Criteria) this;
        }

        public Criteria andShopLatitudeNotBetween(String value1, String value2) {
            addCriterion("shop_latitude not between", value1, value2, "shopLatitude");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNull() {
            addCriterion("shop_type is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("shop_type is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(String value) {
            addCriterion("shop_type =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(String value) {
            addCriterion("shop_type <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(String value) {
            addCriterion("shop_type >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_type >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(String value) {
            addCriterion("shop_type <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(String value) {
            addCriterion("shop_type <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLike(String value) {
            addCriterion("shop_type like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotLike(String value) {
            addCriterion("shop_type not like", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<String> values) {
            addCriterion("shop_type in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<String> values) {
            addCriterion("shop_type not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(String value1, String value2) {
            addCriterion("shop_type between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(String value1, String value2) {
            addCriterion("shop_type not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopDescIsNull() {
            addCriterion("shop_desc is null");
            return (Criteria) this;
        }

        public Criteria andShopDescIsNotNull() {
            addCriterion("shop_desc is not null");
            return (Criteria) this;
        }

        public Criteria andShopDescEqualTo(String value) {
            addCriterion("shop_desc =", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotEqualTo(String value) {
            addCriterion("shop_desc <>", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescGreaterThan(String value) {
            addCriterion("shop_desc >", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescGreaterThanOrEqualTo(String value) {
            addCriterion("shop_desc >=", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLessThan(String value) {
            addCriterion("shop_desc <", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLessThanOrEqualTo(String value) {
            addCriterion("shop_desc <=", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescLike(String value) {
            addCriterion("shop_desc like", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotLike(String value) {
            addCriterion("shop_desc not like", value, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescIn(List<String> values) {
            addCriterion("shop_desc in", values, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotIn(List<String> values) {
            addCriterion("shop_desc not in", values, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescBetween(String value1, String value2) {
            addCriterion("shop_desc between", value1, value2, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopDescNotBetween(String value1, String value2) {
            addCriterion("shop_desc not between", value1, value2, "shopDesc");
            return (Criteria) this;
        }

        public Criteria andShopSpendIsNull() {
            addCriterion("shop_spend is null");
            return (Criteria) this;
        }

        public Criteria andShopSpendIsNotNull() {
            addCriterion("shop_spend is not null");
            return (Criteria) this;
        }

        public Criteria andShopSpendEqualTo(String value) {
            addCriterion("shop_spend =", value, "shopSpend");
            return (Criteria) this;
        }

        public Criteria andShopSpendNotEqualTo(String value) {
            addCriterion("shop_spend <>", value, "shopSpend");
            return (Criteria) this;
        }

        public Criteria andShopSpendGreaterThan(String value) {
            addCriterion("shop_spend >", value, "shopSpend");
            return (Criteria) this;
        }

        public Criteria andShopSpendGreaterThanOrEqualTo(String value) {
            addCriterion("shop_spend >=", value, "shopSpend");
            return (Criteria) this;
        }

        public Criteria andShopSpendLessThan(String value) {
            addCriterion("shop_spend <", value, "shopSpend");
            return (Criteria) this;
        }

        public Criteria andShopSpendLessThanOrEqualTo(String value) {
            addCriterion("shop_spend <=", value, "shopSpend");
            return (Criteria) this;
        }

        public Criteria andShopSpendLike(String value) {
            addCriterion("shop_spend like", value, "shopSpend");
            return (Criteria) this;
        }

        public Criteria andShopSpendNotLike(String value) {
            addCriterion("shop_spend not like", value, "shopSpend");
            return (Criteria) this;
        }

        public Criteria andShopSpendIn(List<String> values) {
            addCriterion("shop_spend in", values, "shopSpend");
            return (Criteria) this;
        }

        public Criteria andShopSpendNotIn(List<String> values) {
            addCriterion("shop_spend not in", values, "shopSpend");
            return (Criteria) this;
        }

        public Criteria andShopSpendBetween(String value1, String value2) {
            addCriterion("shop_spend between", value1, value2, "shopSpend");
            return (Criteria) this;
        }

        public Criteria andShopSpendNotBetween(String value1, String value2) {
            addCriterion("shop_spend not between", value1, value2, "shopSpend");
            return (Criteria) this;
        }

        public Criteria andShopCreateTimeIsNull() {
            addCriterion("shop_create_time is null");
            return (Criteria) this;
        }

        public Criteria andShopCreateTimeIsNotNull() {
            addCriterion("shop_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andShopCreateTimeEqualTo(Date value) {
            addCriterion("shop_create_time =", value, "shopCreateTime");
            return (Criteria) this;
        }

        public Criteria andShopCreateTimeNotEqualTo(Date value) {
            addCriterion("shop_create_time <>", value, "shopCreateTime");
            return (Criteria) this;
        }

        public Criteria andShopCreateTimeGreaterThan(Date value) {
            addCriterion("shop_create_time >", value, "shopCreateTime");
            return (Criteria) this;
        }

        public Criteria andShopCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("shop_create_time >=", value, "shopCreateTime");
            return (Criteria) this;
        }

        public Criteria andShopCreateTimeLessThan(Date value) {
            addCriterion("shop_create_time <", value, "shopCreateTime");
            return (Criteria) this;
        }

        public Criteria andShopCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("shop_create_time <=", value, "shopCreateTime");
            return (Criteria) this;
        }

        public Criteria andShopCreateTimeIn(List<Date> values) {
            addCriterion("shop_create_time in", values, "shopCreateTime");
            return (Criteria) this;
        }

        public Criteria andShopCreateTimeNotIn(List<Date> values) {
            addCriterion("shop_create_time not in", values, "shopCreateTime");
            return (Criteria) this;
        }

        public Criteria andShopCreateTimeBetween(Date value1, Date value2) {
            addCriterion("shop_create_time between", value1, value2, "shopCreateTime");
            return (Criteria) this;
        }

        public Criteria andShopCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("shop_create_time not between", value1, value2, "shopCreateTime");
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