package com.dioeverisqa.api_cities.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "City")
@Table(name = "cidade")
public class City {

    @Id
    private Long id;
    @Column(name = "nome")
    private String name;
    private Integer uf;
    private Integer ibge;
    //private lat_lon
    //private latitude
    //private longitude
    private Integer cod_tom;
}
