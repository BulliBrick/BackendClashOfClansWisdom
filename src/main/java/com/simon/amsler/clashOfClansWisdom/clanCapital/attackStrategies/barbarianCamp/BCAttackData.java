package com.simon.amsler.clashOfClansWisdom.clanCapital.attackStrategies.barbarianCamp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;


@Entity
@Data
public class BCAttackData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
