package com.simon.amsler.clashOfClansWisdom.homeVillage.baseLayouts;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
@Entity
public class HVBaseLayoutsData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("thlvl")
    private Long thlvl;

    @JsonProperty("name")
    @Length(max = 1000)
    private String name;

    @JsonProperty("description")
    @Length(max = 1000)
    private String description;

    @JsonProperty("basetype")
    @Length(max = 1000)
    private String basetype;

    @JsonProperty("antistars")
    private Long antistars;




    public HVBaseLayoutsData() {
    }

    public HVBaseLayoutsData(Long id, Long thlvl, String name, String description, String basetype, Long antistars) {
        this.id = id;
        this.thlvl = thlvl;
        this.name = name;
        this.description = description;
        this.basetype = basetype;
        this.antistars = antistars;
    }

    public HVBaseLayoutsData(Long thlvl, String name, String description, String basetype, Long antistars) {
        this.thlvl = thlvl;
        this.name = name;
        this.description = description;
        this.basetype = basetype;
        this.antistars = antistars;
    }
}
