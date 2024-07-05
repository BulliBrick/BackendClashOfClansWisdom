package com.simon.amsler.clashOfClansWisdom.homeVillage.clanCastleTroops;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.Type;


import java.util.ArrayList;
import java.util.List;


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

    //Creates extra table to store troops, need to find out how to store arraylist in single column or how to access it in another table

    @Column
    @JsonProperty("thlvl")
    private Long thlvl;

    @Column
    private String description;

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
