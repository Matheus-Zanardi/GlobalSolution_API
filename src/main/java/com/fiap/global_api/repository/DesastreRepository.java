package com.fiap.global_api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.global_api.model.Desastre;

@Repository
public interface DesastreRepository
        extends JpaRepository<Desastre, Long> {

}
