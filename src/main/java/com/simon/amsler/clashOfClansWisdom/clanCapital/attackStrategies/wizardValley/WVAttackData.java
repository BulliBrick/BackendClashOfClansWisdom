package com.simon.amsler.clashOfClansWisdom.clanCapital.attackStrategies.wizardValley;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class WVAttackData {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
