package com.simon.amsler.clashOfClansWisdom.clanCapital.baseLayouts.dragonCliffs;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class DCBaseLayoutsData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
