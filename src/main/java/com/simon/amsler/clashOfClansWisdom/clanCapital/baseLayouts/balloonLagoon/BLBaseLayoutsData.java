package com.simon.amsler.clashOfClansWisdom.clanCapital.baseLayouts.balloonLagoon;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class BLBaseLayoutsData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
