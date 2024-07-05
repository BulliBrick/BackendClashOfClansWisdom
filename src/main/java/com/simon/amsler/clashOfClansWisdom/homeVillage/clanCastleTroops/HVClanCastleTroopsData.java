package com.simon.amsler.clashOfClansWisdom.homeVillage.clanCastleTroops;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class HVClanCastleTroopsData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
