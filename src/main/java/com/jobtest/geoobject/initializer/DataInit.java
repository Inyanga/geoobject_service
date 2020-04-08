package com.jobtest.geoobject.initializer;


import com.jobtest.geoobject.entities.Geoobject;
import com.jobtest.geoobject.repository.DataRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
public class DataInit implements CommandLineRunner {

    private final DataRepository repository;

    public DataInit(DataRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        if (repository.count() == 0) {
            int maxEntities = 1000;
            Random random = new Random();
            ArrayList<Geoobject> list = new ArrayList<>();
            for (int i = 0; i < maxEntities; i++) {
                Geoobject geoobject = new Geoobject();
                geoobject.setLat((random.nextFloat() * 180.0f) - 90.0f);
                geoobject.setLng((random.nextFloat() * 360.0f) - 180.0f);
                list.add(geoobject);
            }
            repository.saveAll(list);
            System.out.println("Data generated and saved");
        }
    }
}
