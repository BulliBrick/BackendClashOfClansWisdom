package com.simon.amsler.clashOfClansWisdom.homeVillage.attackStrategies;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface HVAttackRepository extends JpaRepository<HVAttackData, Long> {

    public List<HVAttackData> findByName(String name);
}
