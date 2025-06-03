package com.fiap.global_api.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fiap.global_api.dto.DesastreRequestCreate;
import com.fiap.global_api.dto.DesastreRequestUpdate;
import com.fiap.global_api.dto.ResponseDesastre;
import com.fiap.global_api.service.DesastreService;

@RestController
@RequestMapping("desastre")
public class DesastreController {

    @Autowired
    public DesastreService desastreService;

    @GetMapping
    public ResponseEntity<List<ResponseDesastre>> findAll() {
        return ResponseEntity.ok(desastreService
                .findAll()
                .stream()
                .map(desastre -> new ResponseDesastre().toDto(desastre))
                .collect(Collectors.toList()));
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDesastre> findById(@PathVariable Long id) {
        return desastreService.findById(id)
                .map(desastre -> ResponseEntity.ok(new ResponseDesastre().toDto(desastre)))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ResponseDesastre>
    create(@RequestBody DesastreRequestCreate dto) {

    return ResponseEntity.status(201).body(
    new ResponseDesastre().toDto(
        desastreService.save(dto)
        )
    );
    }

    @PutMapping("{id}")
    public ResponseEntity<ResponseDesastre> update(
            @PathVariable Long id,
            @RequestBody DesastreRequestUpdate dto) {

        return desastreService.update(id, dto)
                .map(desastre -> ResponseEntity.ok(new ResponseDesastre().toDto(desastre)))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        boolean result = desastreService.deleteById(id);

        if (result) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
