package com.simon.amsler.clashOfClansWisdom.builderBase.baseLayouts;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.validator.constraints.Length;


@Entity
@Data
public class BBBaseLayoutsData {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
