package com.simon.amsler.clashOfClansWisdom.homeVillage.attackStrategies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HVAttackRepositoryTroops extends JpaRepository<HVAttackDataTroops, Long> {


}
