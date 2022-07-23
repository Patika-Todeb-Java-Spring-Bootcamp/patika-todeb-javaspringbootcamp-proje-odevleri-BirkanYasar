package com.usaleappbyasar.userstuffsaleapplication.model;


import java.time.LocalDate;
public class Advertisement {

    private String adTitle;
    private String adType;
    private String adDescription;
    private String Adress; // advert adress.
    private LocalDate PublishDate; // publish date of Ad.
    private double price;
    private int adNO = 1; // advert id no.
    private int visitor;    // count of visitor.
    private int favoritiesCount = 0; // the number of people who added the ad to their favourites.
    private User adUser;    // Publisher.

    public Advertisement(String adTitle, String adType, String adDescription, String adress,
                         LocalDate publishDate, double price,
                         int favoritiesCount, User adUser) {

        this.adTitle = adTitle;
        this.adType = adType;
        this.adDescription = adDescription;
        Adress = adress;
        PublishDate = publishDate;
        this.price = price;
        this.adNO = adNO++;
        this.visitor = visitor++;
        this.favoritiesCount = favoritiesCount;
        this.adUser = adUser;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

   /* public Type getAdType() {
        return adType;
    }

    public void setAdType(Type adType) {
        this.adType = adType;
    }*/

    public String getAdDescription() {
        return adDescription;
    }

    public void setAdDescription(String adDescription) {
        this.adDescription = adDescription;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public LocalDate getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(LocalDate publishDate) {
        PublishDate = publishDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAdNO() {
        return adNO;
    }

    public int getVisitor() {
        return visitor;
    }

    public void setVisitor(int visitor) {
        this.visitor = visitor;
    }

    public int getFavoritiesCount() {
        return favoritiesCount;
    }

    public void setFavoritiesCount(int favoritiesCount) {
        this.favoritiesCount = favoritiesCount;
    }

    public User getAdUser() {
        return adUser;
    }

    public void setAdUser(User adUser) {
        this.adUser = adUser;
    }
}


