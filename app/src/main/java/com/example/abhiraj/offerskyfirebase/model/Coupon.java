package com.example.abhiraj.offerskyfirebase.model;

/**
 * Created by Abhiraj on 12-03-2017.
 */

public class Coupon {

    private String key;
    private String brand;
    private String description;
    private String shopURL;
    private String code;
    private String category;
    private String price;
    private String photoURL;

    public Coupon(){}

    public Coupon(String key, String brand, String description, String shopURL, String code, String category, String price, String photoURL)
    {
        this.key = key;
        this.brand = brand;
        this.description = description;
        this.shopURL = shopURL;
        this.code = code;
        this.category = category;
        this.price = price;
        this.photoURL = photoURL;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null)
            this.brand = " ";
        else
            this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if(description == null)
            this.description = " ";
        else
            this.description = description;
    }

    public String getShopURL() {
        return shopURL;
    }

    public void setShopURL(String shopURL) {
        if(shopURL.trim().isEmpty())
            this.shopURL = "empty";
        else
            this.shopURL = shopURL;
    }

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        if(photoURL.trim().isEmpty())
            this.photoURL = "empty";
        else
            this.photoURL = photoURL;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        if(price == null)
            this.price = " ";
        else
            this.price = price;
    }
}