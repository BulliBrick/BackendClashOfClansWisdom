package com.simon.amsler.clashOfClansWisdom.homeVillage.attackStrategies;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
@Entity
public class HVAttackData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("thlvl")
    private Long THLvl;

    @JsonProperty("armycomp")
    @Length(max = 1000)
    private String armycomp;

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

    public HVAttackData(Long id, Long THLvl, String armycomp, String description, String guide, String name) {
        this.id = id;
        this.THLvl = THLvl;
        this.armycomp = armycomp;
        this.description = description;
        this.guide = guide;
        this.name = name;
    }

    public HVAttackData(Long THLvl, String armycomp, String description, String guide, String name) {
        this.THLvl = THLvl;
        this.armycomp = armycomp;
        this.description = description;
        this.guide = guide;
        this.name = name;
    }

}
