package com.simon.amsler.clashOfClansWisdom.homeVillage.baseLayouts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HVBaseLayoutsRepository extends JpaRepository<HVBaseLayoutsData, Long> {

    public List<HVBaseLayoutsData> findByName(String name);
}
