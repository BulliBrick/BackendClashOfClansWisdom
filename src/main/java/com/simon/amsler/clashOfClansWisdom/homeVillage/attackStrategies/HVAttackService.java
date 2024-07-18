package com.simon.amsler.clashOfClansWisdom.homeVillage.attackStrategies;

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class HVAttackService {

    private HVAttackRepository HVAttackRepository;

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

    public HVAttackData insert(HVAttackData data){
        return HVAttackRepository.save(data);
    }

    public HVAttackData save(HVAttackData data, Long id){
        return HVAttackRepository.findById(id)
                .map(hvAttackOrig -> {
                    hvAttackOrig.setName(data.getName());
                    hvAttackOrig.setSpells(data.getSpells());
                    hvAttackOrig.setTroops(data.getTroops());
                    hvAttackOrig.setDescription(data.getDescription());
                    hvAttackOrig.setGuide(data.getGuide());
                    hvAttackOrig.setTHLvl(data.getTHLvl());
                    return HVAttackRepository.save(hvAttackOrig);
                })
                .orElseGet(() -> HVAttackRepository.save(data));
    }

    public void deleteById(Long id) {
        HVAttackRepository.deleteById((Long) id);

    }
}
