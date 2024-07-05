package com.simon.amsler.clashOfClansWisdom.homeVillage.baseLayouts;


import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@SecurityRequirement(name = "bearerAuth")
public class HVBaseLayoutsController {

    private final HVBaseLayoutsService hvBaseLayoutsService;

    public HVBaseLayoutsController(HVBaseLayoutsService hvBaseLayoutsService) {
        this.hvBaseLayoutsService = hvBaseLayoutsService;
    }

    @GetMapping("/api/hv/baseLayouts")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<List<HVBaseLayoutsData>> hvBaseLayouts() {
        return new ResponseEntity<>(hvBaseLayoutsService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/api/hv/baseLayouts/{id}")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<Optional<HVBaseLayoutsData>> hvBaseLayoutsById(@PathVariable Long id) {
        return new ResponseEntity<>(hvBaseLayoutsService.findById(id), HttpStatus.OK);
    }

    @PostMapping("/api/hv/baseLayouts")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<HVBaseLayoutsData> hvBaseLayoutCreate(@RequestBody HVBaseLayoutsData hvBaseLayoutData) {
        return new ResponseEntity<>(hvBaseLayoutsService.insert(hvBaseLayoutData), HttpStatus.CREATED);
    }

    @PutMapping("/api/hv/baseLayouts/{id}")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<HVBaseLayoutsData> hvBaseLayoutUpdate(@RequestBody HVBaseLayoutsData hvBaseLayoutData, @PathVariable Long id) {
        return new ResponseEntity<>(hvBaseLayoutsService.save(hvBaseLayoutData, id), HttpStatus.OK);
    }

    @DeleteMapping("/api/hv/baseLayouts/{id}")
    @PreAuthorize("hasRole('admin')")
    ResponseEntity<Void> hvBaseLayoutDelete(@PathVariable Long id) {
        hvBaseLayoutsService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
