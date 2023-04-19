package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "regions")
@NoArgsConstructor
@Data
public class Region extends BaseEntity{

    @Column(length = 20)
    private String region;

    @Column(length = 20)
    private String country;

    @OneToOne(mappedBy = "region")
    private Employee employee;

    public Region(String region, String country) {
        this.region = region;
        this.country = country;
    }
}
