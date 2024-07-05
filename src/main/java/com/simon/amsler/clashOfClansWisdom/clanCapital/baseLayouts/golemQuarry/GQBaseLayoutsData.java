package com.simon.amsler.clashOfClansWisdom.clanCapital.baseLayouts.golemQuarry;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class GQBaseLayoutsData {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
