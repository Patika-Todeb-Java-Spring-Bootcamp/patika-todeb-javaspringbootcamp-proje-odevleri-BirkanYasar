package com.usaleappbyasar.userstuffsaleapplication.controller;

import com.usaleappbyasar.userstuffsaleapplication.model.Advertisement;
import com.usaleappbyasar.userstuffsaleapplication.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class AdvController {

    @Autowired
    private AdvertisementService advertisementService;

    @GetMapping("/api/adverts/all")
    public ResponseEntity getAllAdverts(){
        List<Advertisement> allAdverts = advertisementService.getAllAds();
        return ResponseEntity.ok(allAdverts);
    }

}
