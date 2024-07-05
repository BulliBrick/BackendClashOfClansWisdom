package com.simon.amsler.clashOfClansWisdom.homeVillage.clanCastleTroops;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HVClanCastleTroopsService {

    private HVClanCastleTroopsRepository hvClanCastleTroopsRepository;

    public HVClanCastleTroopsService(HVClanCastleTroopsRepository repository) {
        this.hvClanCastleTroopsRepository = repository;
    }

    public List<HVClanCastleTroopsData> findAll() {
        return hvClanCastleTroopsRepository.findAll();
    }

    public Optional<HVClanCastleTroopsData> findById(long id) {
        return hvClanCastleTroopsRepository.findById(id);
    }

    public List<HVClanCastleTroopsData> findByName(String name) {
        return hvClanCastleTroopsRepository.findByName(name);
    }

    public HVClanCastleTroopsData insert(HVClanCastleTroopsData data) {
        return hvClanCastleTroopsRepository.save(data);
    }

    public HVClanCastleTroopsData save(HVClanCastleTroopsData data, Long id) {
        return hvClanCastleTroopsRepository.findById(id)
                .map(hvClanCastleTroopsOrig -> {
                    hvClanCastleTroopsOrig.setName(data.getName());
                    hvClanCastleTroopsOrig.setThlvl(data.getThlvl());
                    hvClanCastleTroopsOrig.setDescription(data.getDescription());
                    hvClanCastleTroopsOrig.setTroops(data.getTroops());
                   return hvClanCastleTroopsRepository.save(hvClanCastleTroopsOrig);
                })
                .orElseGet(() -> hvClanCastleTroopsRepository.save(data));
    }

    public void deleteById(Long id) {
        hvClanCastleTroopsRepository.deleteById((Long) id);
    }

}
