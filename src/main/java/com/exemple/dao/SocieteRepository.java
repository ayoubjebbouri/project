package com.exemple.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.entities.Societe;

public interface SocieteRepository extends JpaRepository<Societe, Long> {
	Page<Societe> findByDescriptionContains(String kw, Pageable pageable);
	Page<Societe> findByIDSocieteContains(String kw, Pageable pageable);
	Page<Societe> findByCityContains(String kw, Pageable pageable);
}
