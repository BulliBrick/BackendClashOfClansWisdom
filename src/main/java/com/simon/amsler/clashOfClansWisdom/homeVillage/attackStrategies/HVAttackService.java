package com.simon.amsler.clashOfClansWisdom.homeVillage.attackStrategies;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class HVAttackService {

    private HVAttackRepository HVAttackRepository;

    private HVAttackRepositoryTroops troopsRepository;

    private HVAttackRepositorySpells spellsRepository;

    public HVAttackService(HVAttackRepository repository) {
        this.HVAttackRepository = repository;
    }

    public List<HVAttackData> findAll() {
        return HVAttackRepository.findAll();
    }

    public Optional<HVAttackData> findById(long id) {
        return HVAttackRepository.findById(id);
    }

    public List<HVAttackData> findByName(String name) {
        return HVAttackRepository.findByName(name);
    }

/*
    public HVAttackData insert(HVAttackData data){
        return HVAttackRepository.save(data);
    }
*/

    public HVAttackData save(HVAttackData data, Long id){
        return HVAttackRepository.findById(id)
                .map(hvAttackOrig -> {
                    hvAttackOrig.setName(data.getName());
                    hvAttackOrig.setSpells(data.getSpells());
                    hvAttackOrig.setTroops(data.getTroops());
                    hvAttackOrig.setDescription(data.getDescription());
                    hvAttackOrig.setGuide(data.getGuide());
                    hvAttackOrig.setThlvl(data.getThlvl());
                    return HVAttackRepository.save(hvAttackOrig);
                })
                .orElseGet(() -> HVAttackRepository.save(data));
    }

    public void deleteById(Long id) {
        HVAttackRepository.deleteById((Long) id);

    }


    public HVAttackData insert(HVAttackData data) {
       Set<HVAttackDataTroops> troops = data.getTroops();

       Set<HVAttackDataSpells> spells = data.getSpells();

       HVAttackData hvAttackData = new HVAttackData(null, data.getThlvl(), troops, spells, data.getDescription(), data.getGuide(), data.getName());
      return HVAttackRepository.save(hvAttackData);
    }

}
