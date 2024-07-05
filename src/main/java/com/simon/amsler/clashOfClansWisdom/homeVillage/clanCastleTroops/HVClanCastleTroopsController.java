package com.simon.amsler.clashOfClansWisdom.homeVillage.clanCastleTroops;


import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.*;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@SecurityRequirement(name = "bearerAuth")
public class HVClanCastleTroopsController {

    private final HVClanCastleTroopsService hvClanCastleTroopsService;

    public HVClanCastleTroopsController(HVClanCastleTroopsService hvClanCastleTroopsService) {
        this.hvClanCastleTroopsService = hvClanCastleTroopsService;
    }

    @GetMapping("/api/hv/clanCastleTroops")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<List<HVClanCastleTroopsData>> hvClanCastleTroops() {
        return new ResponseEntity<>(hvClanCastleTroopsService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/api/hv/clanCastleTroops/{id}")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<Optional<HVClanCastleTroopsData>> hvClanCastleTroopsById(@PathVariable Long id) {
        return new ResponseEntity<>(hvClanCastleTroopsService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/api/hv/clanCastleTroops")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<HVClanCastleTroopsData> hvClanCastleTroopsCreate(@RequestBody HVClanCastleTroopsData hvClanCastleTroopsData) {
        return new ResponseEntity<>(hvClanCastleTroopsService.insert(hvClanCastleTroopsData), HttpStatus.CREATED);
    }

    @PutMapping("/api/hv/clanCastleTroops/{id}")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<HVClanCastleTroopsData> hvClanCastleTroopsUpdate(@RequestBody HVClanCastleTroopsData hvClanCastleTroopsData, @PathVariable Long id) {
        return new ResponseEntity<>(hvClanCastleTroopsService.save(hvClanCastleTroopsData, id), HttpStatus.OK);
    }

    @DeleteMapping("/api/hv/clanCastleTroops/{id}")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<Void> hvClanCastleTroopsDelete(@PathVariable Long id) {
        hvClanCastleTroopsService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
