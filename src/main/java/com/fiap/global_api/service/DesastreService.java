package com.fiap.global_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fiap.global_api.dto.DesastreRequestCreate;
import com.fiap.global_api.dto.DesastreRequestUpdate;
import com.fiap.global_api.model.Desastre;
import com.fiap.global_api.repository.DesastreRepository;

@Service
public class DesastreService {
    @Autowired
    private DesastreRepository desastreRepository;

    public Optional<Desastre> update(Long id,
            DesastreRequestUpdate dto) {
        return desastreRepository.findById(id)
                .map(desastre -> {
                    desastre.setNomeDesastre(dto.getNomeDesastre());
                    desastre.setRegiao(dto.getRegiao());
                    desastre.setRisco(dto.getRisco());
                    return desastreRepository.save(desastre);
                });

    }

    public Desastre save(DesastreRequestCreate dto) {

        Desastre desastre = new Desastre();
        desastre.setNomeDesastre(dto.getNomeDesastre());
        desastre.setRegiao(dto.getRegiao());
        desastre.setRisco(dto.getRisco());

        return desastreRepository.save(desastre);
    }

    public List<Desastre> findAll() {
        return desastreRepository.findAll();
    }

    public Optional<Desastre> findById(Long id) {
        return desastreRepository.findById(id);
    }

    public boolean deleteById(Long id) {
        if (desastreRepository.existsById(id)) {
            desastreRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
