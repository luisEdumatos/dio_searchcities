package com.dioeverisqa.api_cities.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Status")
@Table(name = "estado")
public class State {

    @Id
    private Long id;
    @Column(name = "nome")
    private String name;
    private String uf;
    private Integer ibge;
    @ManyToOne
    @JoinColumn(name = "pais", referencedColumnName = "id")
    private Country country;
 //   @Type(type = "jsonb")
 //   @Basic(fetch = FetchType.LAZY)
//    @Column(name = "ddd", columnDefinition = "jsonb")
//    private List<Integer> ddd;

}
