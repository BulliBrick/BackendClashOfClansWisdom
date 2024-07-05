package com.simon.amsler.clashOfClansWisdom.clanCapital.baseLayouts.capitalPeak;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CPBaseLayoutsData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
