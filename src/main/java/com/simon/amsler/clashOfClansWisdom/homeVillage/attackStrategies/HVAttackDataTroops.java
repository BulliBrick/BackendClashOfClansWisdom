package com.simon.amsler.clashOfClansWisdom.homeVillage.attackStrategies;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

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

    @JsonProperty("hvattackdata")
    @ManyToMany(mappedBy = "troops")
    private Set<HVAttackData> hvAttackData;


    public HVAttackDataTroops() {
    }

    public HVAttackDataTroops(Long id, String name, String housingSpace, Integer amount, Boolean supertroop, Set<HVAttackData> hvAttackData) {
        this.id = id;
        this.name = name;
        this.housingSpace = housingSpace;
        this.amount = amount;
        this.supertroop = supertroop;
        this.hvAttackData = hvAttackData;
    }

    public HVAttackDataTroops(String name, String housingSpace, Integer amount, Boolean supertroop, Set<HVAttackData> hvAttackData) {
        this.name = name;
        this.housingSpace = housingSpace;
        this.amount = amount;
        this.supertroop = supertroop;
        this.hvAttackData = hvAttackData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHousingSpace() {
        return housingSpace;
    }

    public void setHousingSpace(String housingSpace) {
        this.housingSpace = housingSpace;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Boolean getSupertroop() {
        return supertroop;
    }

    public void setSupertroop(Boolean supertroop) {
        this.supertroop = supertroop;
    }

    public Set<HVAttackData> getHvAttackData() {
        return hvAttackData;
    }

    public void setHvAttackData(Set<HVAttackData> hvAttackData) {
        this.hvAttackData = hvAttackData;
    }
}
