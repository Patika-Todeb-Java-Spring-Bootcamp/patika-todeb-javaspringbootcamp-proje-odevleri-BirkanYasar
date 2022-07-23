package com.usaleappbyasar.userstuffsaleapplication.repository;

import com.usaleappbyasar.userstuffsaleapplication.model.Advertisement;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AdvertisementRepository {

    private List<Advertisement> adList = new ArrayList<>();

    {
        adList.add(new Advertisement("Car for sale" ,null,"2016 Toyota Corolla",
                "2300 Oracle Way, Austin, Texas, U.S.",null,8000.0,1000,
                null)); //Resource 1

        adList.add(new Advertisement("Wood working desk",null,"a clean used table",
                "1065 La Avenida Mountain View CA US",null,250,1001,null)); //resource 2
    }

    public List<Advertisement> findAll() {
        return adList;
    }

}
