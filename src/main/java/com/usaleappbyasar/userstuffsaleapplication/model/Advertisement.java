package com.usaleappbyasar.userstuffsaleapplication.model;

import java.time.LocalDate;

public class Advertisement {

    private String adTitle;
    private Type adType;
    private String adDescription;
    private LocalDate PublishDate; //ilanın yayınlanma tarihi.
    private double price;
    private int adNO; //ilan id no.
    private int visitor;    //ilanı ziyaret eden ziyaretci sayisi.
    private int favoritiesCount; // ilanı favorilerine ekleyen kişi sayısı.
    private User adUser;    //ilanı yayınlayan kişi


}
