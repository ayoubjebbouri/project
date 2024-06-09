package com.exemple.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.entities.Postulation;

public interface PostulationRepository extends JpaRepository<Postulation, Long> {
	Page<Postulation> findByIDOfferContains(String kw, Pageable pageable);

}
