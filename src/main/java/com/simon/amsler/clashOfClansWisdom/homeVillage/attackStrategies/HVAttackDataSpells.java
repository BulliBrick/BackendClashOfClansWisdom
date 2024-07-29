package com.simon.amsler.clashOfClansWisdom.homeVillage.attackStrategies;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class HVAttackDataSpells {

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

    @ManyToMany (mappedBy = "spells")
    private List<HVAttackData> hvAttackData = new ArrayList<>();

}
