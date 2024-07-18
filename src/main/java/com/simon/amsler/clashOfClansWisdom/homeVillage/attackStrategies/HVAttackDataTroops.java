package com.simon.amsler.clashOfClansWisdom.homeVillage.attackStrategies;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class HVAttackDataTroops {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("housing_space")
    private String housingSpace;

    @JsonProperty("amount")
    private Integer amount;

    @JsonProperty("supertroop")
    private Boolean supertroop;


    @ManyToMany(mappedBy = "troops")
    private List<HVAttackData> hvAttackData;

}
