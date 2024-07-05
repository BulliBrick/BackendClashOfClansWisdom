package com.simon.amsler.clashOfClansWisdom.homeVillage.clanCastleTroops;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HVClanCastleTroopsRepository extends JpaRepository<HVClanCastleTroopsData, Long> {

    public List<HVClanCastleTroopsData> findByName(String name);

}
