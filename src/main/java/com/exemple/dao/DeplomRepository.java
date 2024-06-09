package com.exemple.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.entities.Deplom;

public interface DeplomRepository extends JpaRepository<Deplom, Long> {
	Page<Deplom> findByNameContains(String kw, Pageable pageable);
}
