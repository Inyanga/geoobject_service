package com.jobtest.geoobject.entities;


import lombok.Data;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "geoobjects")
@Data
public class Geoobject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "lat", nullable = false)
    private Float lat;
    @Column(name = "lng", nullable = false)
    private Float lng;

}
