package com.jobtest.geoobject.repository;

import com.jobtest.geoobject.entities.Geoobject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Geoobject,Long> {
}
