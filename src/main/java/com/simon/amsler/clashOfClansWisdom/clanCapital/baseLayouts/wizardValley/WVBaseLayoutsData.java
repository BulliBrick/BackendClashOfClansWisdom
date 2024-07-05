package com.simon.amsler.clashOfClansWisdom.clanCapital.baseLayouts.wizardValley;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class WVBaseLayoutsData {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
