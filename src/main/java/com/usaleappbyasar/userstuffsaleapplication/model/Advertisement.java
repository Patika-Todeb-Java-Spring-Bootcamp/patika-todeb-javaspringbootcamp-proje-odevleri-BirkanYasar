package com.usaleappbyasar.userstuffsaleapplication.model;

import java.time.LocalDate;

public class Advertisement {

    private String adTitle;
    private Type adType;
    private String adDescription;
    private LocalDate PublishDate; // publish date of Ad.
    private double price;
    private int adNO; // advert id no.
    private int visitor;    // count of visitor.
    private int favoritiesCount; // the number of people who added the ad to their favourites.
    private User adUser;    // Publisher.


}
