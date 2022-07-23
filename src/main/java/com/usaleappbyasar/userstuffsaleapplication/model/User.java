package com.usaleappbyasar.userstuffsaleapplication.model;

import java.time.LocalDate;
import java.util.List;

public class User {

    private String userName;
    private String userSurname;
    private String location;
    private LocalDate SignedDate;   //kullanıcının profili olusturma tarihi.
    private String email;
    private String password;
    private int userNO; // kullanıcı numarası
    private int advertQuantity; // kullanıcının sahip olduğu ilan adedi.
    private List<Advertisement> favorities; //kullanıcının favori ilanlari.


}
