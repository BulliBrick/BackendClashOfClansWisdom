package com.simon.amsler.clashOfClansWisdom.homeVillage.clanCastleTroops;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;



@Entity
@Data
public class HVClanCastleTroopsData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @JsonProperty("name")
    private String name;

    @Column
    @JsonProperty("troops")
    private String troops;

    @Column
    @JsonProperty("thlvl")
    private Long thlvl;

    @Column
    private String description;

    // maybe change troops to list, spells not needed as this is defensive troops

    public HVClanCastleTroopsData() {
    }

    public HVClanCastleTroopsData(Long id, String name, String troops, Long thlvl, String description) {
        this.id = id;
        this.name = name;
        this.troops = troops;
        this.thlvl = thlvl;
        this.description = description;
    }

    public HVClanCastleTroopsData(String name, String troops, Long thlvl, String description) {
        this.name = name;
        this.troops = troops;
        this.thlvl = thlvl;
        this.description = description;
    }

}
