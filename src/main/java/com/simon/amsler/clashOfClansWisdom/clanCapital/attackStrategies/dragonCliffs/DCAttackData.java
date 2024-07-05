package com.simon.amsler.clashOfClansWisdom.clanCapital.attackStrategies.dragonCliffs;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class DCAttackData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
