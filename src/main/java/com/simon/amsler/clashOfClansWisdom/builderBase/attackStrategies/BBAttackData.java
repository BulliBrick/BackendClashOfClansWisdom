package com.simon.amsler.clashOfClansWisdom.builderBase.attackStrategies;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;


@Entity
@Data
public class BBAttackData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



}
