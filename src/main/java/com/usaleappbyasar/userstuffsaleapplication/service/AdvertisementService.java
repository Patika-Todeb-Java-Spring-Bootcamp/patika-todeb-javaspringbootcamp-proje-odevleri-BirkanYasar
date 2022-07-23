package com.usaleappbyasar.userstuffsaleapplication.service;

import com.usaleappbyasar.userstuffsaleapplication.model.Advertisement;
import com.usaleappbyasar.userstuffsaleapplication.repository.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdvertisementService {
    @Autowired
    private AdvertisementRepository advertisementRepository;

   //constructor injection
   public AdvertisementService(AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }

   /*  Setter injection
   public void setAdvertisementRepository(AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }*/

    public List<Advertisement> getAllAds() {
        List<Advertisement> allAds = advertisementRepository.findAll();
        return allAds;
    }
}
