package com.usaleappbyasar.userstuffsaleapplication.service;

import com.usaleappbyasar.userstuffsaleapplication.repository.AdvertisementRepository;
import org.springframework.stereotype.Service;

@Service
public class AdvertisementService {

    private AdvertisementRepository advertisementRepository;

   /*  constructor injection
   public AdvertisementService(AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }*/

   /*  Setter injection
   public void setAdvertisementRepository(AdvertisementRepository advertisementRepository) {
        this.advertisementRepository = advertisementRepository;
    }*/
}
