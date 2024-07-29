package com.simon.amsler.clashOfClansWisdom.homeVillage.attackStrategies;



import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@SecurityRequirement(name = "bearerAuth")
public class HVAttackController {


    private final HVAttackService hvAttackService;
    private final HVAttackServiceTroops hvAttackServiceTroops;
    public HVAttackController(HVAttackService hvAttackService, HVAttackServiceTroops hvAttackServiceTroops) {
        this.hvAttackService = hvAttackService;
        this.hvAttackServiceTroops = hvAttackServiceTroops;
    }



    @GetMapping("/api/hv/attackStrats")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<List<HVAttackData>> hvAttackStrats(){
        return new ResponseEntity<>(hvAttackService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/api/hv/attackStrats/{id}")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<Optional<HVAttackData>> hvAttackStratsById(@PathVariable Long id) {
        return new ResponseEntity<>(hvAttackService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/api/hv/attackStrats/troops")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<List<HVAttackDataTroops>> hvAttackTroops(){
        return new ResponseEntity<>(hvAttackServiceTroops.findAll(), HttpStatus.OK);
    }

    @GetMapping("/api/hv/attackStrats/troops/{id}")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<Optional<HVAttackDataTroops>> hvAttackTroopsById(@PathVariable Long id) {
        return new ResponseEntity<>(hvAttackServiceTroops.findById(id), HttpStatus.OK);
    }



    @PostMapping("/api/hv/attackStrats")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<HVAttackData> hvAttackCreate(@RequestBody HVAttackData hvAttackData) {
        return new ResponseEntity<>(hvAttackService.insert(hvAttackData), HttpStatus.CREATED);
    }

    @PostMapping("/api/hv/attackStrats/troops")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<HVAttackDataTroops> hvAttackTroopsCreate(@RequestBody HVAttackDataTroops hvAttackDataTroops) {
        return new ResponseEntity<>(hvAttackServiceTroops.insert(hvAttackDataTroops), HttpStatus.CREATED);
    }



    @PutMapping("/api/hv/attackStrats/{id}")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<HVAttackData> hvAttackUpdate(@RequestBody HVAttackData hvAttackData, @PathVariable Long id) {
        return new ResponseEntity<>(hvAttackService.save(hvAttackData, id), HttpStatus.OK);
    }

    @PutMapping("/api/hv/attackStrats/troops/{id}")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<HVAttackDataTroops> hvAttackTroopsUpdate(@RequestBody HVAttackDataTroops hvAttackDataTroops, @PathVariable Long id) {
        return new ResponseEntity<>(hvAttackServiceTroops.save(hvAttackDataTroops, id), HttpStatus.OK);
    }


    @DeleteMapping("/api/hv/attackStrats/{id}")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<Void> hvAttackDelete(@PathVariable Long id) {
        hvAttackService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/api/hv/attackStrats/troops/{id}")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<Void> hvAttackTroopsDelete(@PathVariable Long id) {
        hvAttackServiceTroops.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}