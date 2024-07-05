package com.simon.amsler.clashOfClansWisdom.clanCapital.baseLayouts.barbarianCamp;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BCBaseLayoutsData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
