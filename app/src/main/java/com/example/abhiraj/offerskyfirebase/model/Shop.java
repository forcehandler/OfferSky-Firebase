package com.example.abhiraj.offerskyfirebase.model;

import java.util.List;

/**
 * Created by Abhiraj on 12-03-2017.
 */

public class Shop {

    private String key;
    private String phone;
    private String email;
    private String location;
    private List<Coupon> mCoupons;
    private List<String> mCategories;
    private String name;
    private String shopImageURL;
    private String brandImageURL;

    // TODO: Add list of search tags


    public Shop(String key, List<Coupon> coupons, String name, String email, String phone, String location, List<String> categories, String shopImageURL, String brandImageURL) {
        this.key = key;
        mCoupons = coupons;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.location = location;
        mCategories = categories;
        this.shopImageURL = shopImageURL;
        this.brandImageURL = brandImageURL;
    }

    public Shop(){

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Coupon> getCoupons() {
        return mCoupons;
    }

    public void setCoupons(List<Coupon> coupons) {
        mCoupons = coupons;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<String> getCategories() {
        return mCategories;
    }

    public void setCategories(List<String> categories) {
        mCategories = categories;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getShopImageURL() {
        return shopImageURL;
    }

    public void setShopImageURL(String shopImageURL) {
        this.shopImageURL = shopImageURL;
    }

    public String getBrandImageURL() {
        return brandImageURL;
    }

    public void setBrandImageURL(String brandImageURL) {
        this.brandImageURL = brandImageURL;
    }
}