package com.skyrin.ssm.model;

import java.util.Date;

public class MeShop {
    private Integer shopId;

    private String shopAddress;

    private String shopName;

    private String shopTime;

    private String shopPhone;

    private String shopImage;

    private String shopLongitude;

    private String shopLatitude;

    private String shopType;

    private String shopDesc;

    private String shopSpend;

    private Date shopCreateTime;

    public MeShop(Integer shopId, String shopAddress, String shopName, String shopTime, String shopPhone, String shopImage, String shopLongitude, String shopLatitude, String shopType, String shopDesc, String shopSpend, Date shopCreateTime) {
        this.shopId = shopId;
        this.shopAddress = shopAddress;
        this.shopName = shopName;
        this.shopTime = shopTime;
        this.shopPhone = shopPhone;
        this.shopImage = shopImage;
        this.shopLongitude = shopLongitude;
        this.shopLatitude = shopLatitude;
        this.shopType = shopType;
        this.shopDesc = shopDesc;
        this.shopSpend = shopSpend;
        this.shopCreateTime = shopCreateTime;
    }

    public MeShop() {
        super();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress == null ? null : shopAddress.trim();
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopTime() {
        return shopTime;
    }

    public void setShopTime(String shopTime) {
        this.shopTime = shopTime == null ? null : shopTime.trim();
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone == null ? null : shopPhone.trim();
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage == null ? null : shopImage.trim();
    }

    public String getShopLongitude() {
        return shopLongitude;
    }

    public void setShopLongitude(String shopLongitude) {
        this.shopLongitude = shopLongitude == null ? null : shopLongitude.trim();
    }

    public String getShopLatitude() {
        return shopLatitude;
    }

    public void setShopLatitude(String shopLatitude) {
        this.shopLatitude = shopLatitude == null ? null : shopLatitude.trim();
    }

    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType == null ? null : shopType.trim();
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc == null ? null : shopDesc.trim();
    }

    public String getShopSpend() {
        return shopSpend;
    }

    public void setShopSpend(String shopSpend) {
        this.shopSpend = shopSpend == null ? null : shopSpend.trim();
    }

    public Date getShopCreateTime() {
        return shopCreateTime;
    }

    public void setShopCreateTime(Date shopCreateTime) {
        this.shopCreateTime = shopCreateTime;
    }
}