package com.simon.amsler.clashOfClansWisdom.homeVillage.baseLayouts;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class HVBaseLayoutsService {

    private HVBaseLayoutsRepository HVBaseLayoutsRepository;

    public HVBaseLayoutsService(HVBaseLayoutsRepository repository) { this.HVBaseLayoutsRepository = repository;}
    
    
    public List<HVBaseLayoutsData> findAll() {
        return HVBaseLayoutsRepository.findAll();
    }

    public Optional<HVBaseLayoutsData> findById(long id) {
        return HVBaseLayoutsRepository.findById(id);
    }

    public List<HVBaseLayoutsData> findByName(String name) {
        return HVBaseLayoutsRepository.findByName(name);
    }

    public HVBaseLayoutsData insert(HVBaseLayoutsData data){
        return HVBaseLayoutsRepository.save(data);
    }

    public HVBaseLayoutsData save(HVBaseLayoutsData data, Long id){
        return HVBaseLayoutsRepository.findById(id)
                .map(hvBaseLayoutsOrig -> {
                    hvBaseLayoutsOrig.setName(data.getName());
                    hvBaseLayoutsOrig.setThlvl(data.getThlvl());
                    hvBaseLayoutsOrig.setDescription(data.getDescription());
                    hvBaseLayoutsOrig.setBasetype(data.getBasetype());
                    hvBaseLayoutsOrig.setAntistars(data.getAntistars());
                    return HVBaseLayoutsRepository.save(hvBaseLayoutsOrig);
                })
                .orElseGet(() -> HVBaseLayoutsRepository.save(data));
    }

    public void deleteById(Long id) {
        HVBaseLayoutsRepository.deleteById((Long) id);

    }
}

