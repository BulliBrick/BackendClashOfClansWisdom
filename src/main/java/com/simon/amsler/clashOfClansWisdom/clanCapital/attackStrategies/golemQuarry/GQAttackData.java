package com.simon.amsler.clashOfClansWisdom.clanCapital.attackStrategies.golemQuarry;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class GQAttackData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
