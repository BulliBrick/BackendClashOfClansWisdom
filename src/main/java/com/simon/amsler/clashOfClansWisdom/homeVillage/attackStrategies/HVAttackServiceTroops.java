package com.simon.amsler.clashOfClansWisdom.homeVillage.attackStrategies;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class HVAttackServiceTroops {

    private HVAttackRepositoryTroops troopsRepository;

    private HVAttackRepositorySpells spellsRepository;

    public HVAttackServiceTroops(HVAttackRepositoryTroops repository) {
        this.troopsRepository = repository;
    }

    public List<HVAttackDataTroops> findAll() {
        return troopsRepository.findAll();
    }

    public Optional<HVAttackDataTroops> findById(long id) {
        return troopsRepository.findById(id);
    }




    public HVAttackDataTroops insert(HVAttackDataTroops data){
        return troopsRepository.save(data);
    }

    public HVAttackDataTroops save(HVAttackDataTroops data, Long id){
        return troopsRepository.findById(id)
                .map(hvAttackOrigTroops -> {
                    hvAttackOrigTroops.setName(data.getName());
                    hvAttackOrigTroops.setHousingSpace(data.getHousingSpace());
                    hvAttackOrigTroops.setSupertroop(data.getSupertroop());
                    hvAttackOrigTroops.setHvAttackData(data.getHvAttackData());
                    return troopsRepository.save(hvAttackOrigTroops);
                })
                .orElseGet(() -> troopsRepository.save(data));
    }

    public void deleteById(Long id) {
        troopsRepository.deleteById((Long) id);

    }




}
