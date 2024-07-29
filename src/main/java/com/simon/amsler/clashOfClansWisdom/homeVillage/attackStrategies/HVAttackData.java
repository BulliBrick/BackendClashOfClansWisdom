package com.simon.amsler.clashOfClansWisdom.homeVillage.attackStrategies;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.*;

@Data
@Entity
public class HVAttackData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("thlvl")
    private Long thlvl;

    /*
    *@JsonProperty("armycomp")
    *@Length(max = 1000)
    *private String armycomp;
    */



    @JsonProperty("troops")
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "hvtroops_attack",
            joinColumns = @JoinColumn(name = "hvattackdata_id"),
            inverseJoinColumns = @JoinColumn(name = "hvattackdatatroops_id")
    )
    private Set<HVAttackDataTroops> troops = new HashSet<>();




    @JsonProperty("spells")
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
        name = "hvspells_attack",
        joinColumns = @JoinColumn(name = "hvattackdata_id"),
        inverseJoinColumns = @JoinColumn(name = "hvattackdataspells_id")
    )
    private Set<HVAttackDataSpells> spells = new HashSet<>();


//Set to not assing same troop/spell twice
    // add selection of hero equipment selected for attack (substitutions for epic equipment)

    @JsonProperty("description")
    @Length(max = 1000)
    private String description;

    @JsonProperty("guide")
    @Length(max = 1000)
    private String guide;

    @JsonProperty("name")
    @Length(max = 1000)
    private String name;


    public HVAttackData() {
    }

    public HVAttackData(Long id, Long thlvl, Set<HVAttackDataTroops> troops, Set<HVAttackDataSpells> spells, String description, String guide, String name) {
        this.id = id;
        this.thlvl = thlvl;
        this.troops = troops;
        this.spells = spells;
        this.description = description;
        this.guide = guide;
        this.name = name;
    }

    public HVAttackData(Long thlvl, Set<HVAttackDataTroops> troops, Set<HVAttackDataSpells> spells, String description, String guide, String name) {
        this.thlvl = thlvl;
        this.troops = troops;
        this.spells = spells;
        this.description = description;
        this.guide = guide;
        this.name = name;
    }


}

