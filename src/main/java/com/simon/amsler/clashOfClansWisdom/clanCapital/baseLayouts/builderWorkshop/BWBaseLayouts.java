package com.simon.amsler.clashOfClansWisdom.clanCapital.baseLayouts.builderWorkshop;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class BWBaseLayouts {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
