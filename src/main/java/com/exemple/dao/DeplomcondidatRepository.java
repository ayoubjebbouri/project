package com.exemple.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.entities.Deplomcondidat;

public interface DeplomcondidatRepository extends JpaRepository<Deplomcondidat, Long> {
	Page<Deplomcondidat> findByIDCondidatContains(String kw, Pageable pageable);

}
